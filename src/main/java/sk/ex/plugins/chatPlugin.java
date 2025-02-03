package sk.ex.plugins;

import sk.ex.Core;
import sk.ex.Plugins;
import sk.ex.core.bukkit;
import sk.ex.core.paper;

import java.util.ArrayList;
import java.util.List;

import static sk.ex.main.AllVersion;

public class chatPlugin implements Plugins {
    private String Version = "1.12.1";
    private String Name = "chatPlugin";
    private Core[] Cores = new Core[2];
    private List<String> SupportedCore = new ArrayList<>();
    private List<String> SupportedVersion = new ArrayList<>();
    private List<String> ClassPlugins = new ArrayList<>();


    public chatPlugin() {
        Init();
    }

    private void Init() {
        ClassPlugins.add("CommandExecutor");
        ClassPlugins.add("chatingMain");
        ClassPlugins.add("ColorWorks");
        ClassPlugins.add("Unicoding");
        Cores[0] = new bukkit();
        Cores[1] = new paper();
        for (Integer i = 1; i < (AllVersion.size() - AllVersion.indexOf(Version) + 1); i++) {
            SupportedVersion.add(0, AllVersion.get(AllVersion.size() - i));
        }
    }

    @Override
    public String getVersion() {
        return Version;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public List<String> getSupportedVersion() {
        return SupportedVersion;
    }

    @Override
    public List<String> getClassPlugins() {
        return ClassPlugins;
    }

    @Override
    public Core[] getCore() {
        return Cores;
    }
}