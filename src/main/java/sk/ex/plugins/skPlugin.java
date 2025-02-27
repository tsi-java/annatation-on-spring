package sk.ex.plugins;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sk.ex.Core;
import sk.ex.Plugins;
import sk.ex.core.bukkit;
import sk.ex.core.paper;

import java.util.ArrayList;
import java.util.List;

import static sk.ex.main.AllVersion;


@Component("skysetplugin")
public class skPlugin implements Plugins {
    private String Version = "1.21";
    private String Name = "skPlugin";
    private Core[] Cores = new Core[2];
    private List<String> SupportedCore = new ArrayList<>();
    private List<String> SupportedVersion = new ArrayList<>();
    private List<String> ClassPlugins = new ArrayList<>();


    public skPlugin() {
        Init();
        Name = "SkySet";
    }

    private void Init() {
        ClassPlugins.add("CommandExecutor");
        ClassPlugins.add("CustomItem");
        ClassPlugins.add("ColorWorks");
        ClassPlugins.add("Main");
        ClassPlugins.add("TimeSleep");
        ClassPlugins.add("SkillWork");
        ClassPlugins.add("ClassWork");
        ClassPlugins.add("EntityWork");
        ClassPlugins.add("BossEntity");
        ClassPlugins.add("TextureWork");
        ClassPlugins.add("EventUpdater");
        Cores[0] = new bukkit();
        Cores[1] = new paper();
        for (Integer i=1;i<(AllVersion.size()-AllVersion.indexOf(Version)+1);i++){
            SupportedVersion.add(0,AllVersion.get(AllVersion.size()-i));
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