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
package com.daxode.odinbrains.lsp.listeners;

import com.daxode.odinbrains.lsp.editor.EditorEventManager;
import com.intellij.openapi.diagnostic.Logger;

public class LSPListener {
    private Logger LOG = Logger.getInstance(LSPListener.class);
    protected EditorEventManager manager = null;
    protected boolean enabled = true;

    /**
     * Sets the manager for this listener
     *
     * @param manager The manager
     */
    public void setManager(EditorEventManager manager) {
        this.manager = manager;
    }

    /**
     * Checks if a manager is set, and logs and error if not the case
     *
     * @return true or false depending on if the manager is set
     */
    protected boolean checkEnabled() {
        if (manager == null) {
            LOG.error("Manager is null");
            return false;
        }
        return enabled;
    }

    public void disable() {
        enabled = false;
    }

    public void enable() {
        enabled = true;
    }
}
