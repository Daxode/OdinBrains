package com.daxode.odinbrains.debugger.toolchain;

import com.intellij.openapi.util.SystemInfo;

public enum DebuggerKind {
    LLDB,
    GDB,
    MSVC;

    public static DebuggerKind defaultKind() {
        if (SystemInfo.isWindows)
            return MSVC;
        return LLDB;
    }
}
