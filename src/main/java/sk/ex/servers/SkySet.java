package sk.ex.servers;

import sk.ex.Core;
import sk.ex.Plugins;
import sk.ex.core.bukkit;
import sk.ex.core.paper;
import sk.ex.core.spigot;
import sk.ex.plugins.chatPlugin;

import sk.ex.plugins.skPlugin;
import sk.ex.server;



public class SkySet implements server {
    private String Name="SkySet";
    private String Version="1.21";
    private int online=7548;
    private sk.ex.Core[] Cores = new Core[3];
    private int Patch=634;
    private Plugins[] plugins = new Plugins[3];
    private String StartingMessage="включен!";
    private String Core="Folia";
    private String DateUpdate="29.1.25";

    public SkySet(){
        init();
    }
    @Override
    public void warning(String warn){
        System.out.println("-----------------------------------------");
        System.out.println("[Warn]: " + warn + "!");
        System.out.println("-----------------------------------------");

    }

    private void init(){
        plugins[0]=new skPlugin();
        plugins[1]=new chatPlugin();
        plugins[2]=new skPlugin();
        Cores[0] = new bukkit();
        Cores[1] = new spigot();
        Cores[2] = new paper();
    }
    @Override
    public int getPatch() {
        return Patch;
    }
    @Override
    public void Start(){
        for (int i = 0; i < plugins.length; i++) {
            System.out.println("[info]: " + plugins[i].getName() + " запущен!");
        }
        System.out.println("-----------------------------------------");
        System.out.println(this.Name + " " + this.StartingMessage);
        System.out.println("-----------------------------------------");
    }

    @Override
    public String getName(){
        return Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String getVersion() {
        return Version;
    }

    @Override
    public void setVersion(String version) {
        this.Version = version;
    }

    @Override
    public String getDateUpdate() {
        return DateUpdate;
    }

    @Override
    public void setDateUpdate(String dateUpdate) {
        this.DateUpdate = dateUpdate;
    }

    @Override
    public void Update(String Date){
        this.Patch+=1;
        DateUpdate=Date;
    }

    @Override
    public int getOnline() {
        return online;
    }

    @Override
    public Plugins[] getPlugins() {
        return plugins;
    }

    @Override
    public String getCore() {
        return Core;
    }

    @Override
    public Core[] getCores(){
        return Cores;
    }
}
