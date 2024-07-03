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
package com.daxode.odinbrains.lsp.contributors.label;

import com.intellij.openapi.project.Project;
import org.eclipse.lsp4j.SymbolInformation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Extension to override the default Labels for Language Server elements such as symbols and completions.
 *
 * @author gayanper
 */
public interface LSPLabelProvider {
    /**
     * Generate the symbol name for the given {@link SymbolInformation}.
     */
    @NotNull
    String symbolNameFor(@NotNull SymbolInformation symbolInformation, @NotNull Project project);

    /**
     * Generate the symbol location for the given {@link SymbolInformation}.
     */
    @Nullable
    String symbolLocationFor(@NotNull SymbolInformation symbolInformation, @NotNull Project project);

}
