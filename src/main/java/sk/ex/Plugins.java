package sk.ex;

import java.util.List;

public interface Plugins {
    String getVersion();
    String getName();
    Core[] getCore();
    List<String> getSupportedVersion();
    List<String> getClassPlugins();
}
