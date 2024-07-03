package com.daxode.odinbrains.common;

import com.intellij.openapi.application.PathManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZigPathManager {
    public static Path pluginDirInSystem() {
        return PathManager.getSystemDir().resolve("odinbrains");
    }

    public static Path tempPluginDirInSystem() {
        return Paths.get(PathManager.getTempPath()).resolve("odinbrains");
    }
}
