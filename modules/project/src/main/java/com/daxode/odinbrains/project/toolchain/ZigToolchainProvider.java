/*
 * Copyright 2023-2024 FalsePattern
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.daxode.odinbrains.project.toolchain;

import com.intellij.openapi.extensions.ExtensionPointName;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.Objects;

public interface ZigToolchainProvider {
    ExtensionPointName<ZigToolchainProvider> EXTENSION_POINT_NAME =
            ExtensionPointName.create("com.daxode.odinbrains.toolchainProvider");

    static @Nullable AbstractZigToolchain findToolchain(Path homePath) {
        return EXTENSION_POINT_NAME.getExtensionList()
                                   .stream()
                                   .map(it -> it.getToolchain(homePath))
                                   .filter(Objects::nonNull)
                                   .findFirst()
                                   .orElse(null);
    }

    @Nullable AbstractZigToolchain getToolchain(Path homePath);
}
