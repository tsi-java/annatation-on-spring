package sk.ex.plugins;

import sk.ex.*;
import sk.ex.core.bukkit;
import sk.ex.core.paper;
import sk.ex.core.spigot;

import java.util.ArrayList;
import java.util.List;

import static sk.ex.main.AllVersion;

public class eggPlugin implements Plugins {
    private String Version = "1.16";
    private String Name = "eggPlugin";
    private Core[] Cores = new Core[3];
    private List<String> SupportedCore = new ArrayList<>();
    private List<String> SupportedVersion = new ArrayList<>();
    private List<String> ClassPlugins = new ArrayList<>();


    public eggPlugin(){
        Init();
    }

    private void Init(){
        ClassPlugins.add("eggThrower");
        ClassPlugins.add("egg");
        Cores[0] = new bukkit();
        Cores[1] = new spigot();
        Cores[2] = new paper();
        for (Integer i=1;i<(AllVersion.size()-AllVersion.indexOf(Version)+1);i++){
            SupportedVersion.add(0,AllVersion.get(AllVersion.size()-i));
        }
    }

    @Override
    public String getVersion(){
        return Version;
    }

    @Override
    public String getName(){
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
    public Core[] getCore(){
        return Cores;
    }


}