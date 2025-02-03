package sk.ex.servers;

import sk.ex.Core;
import sk.ex.Plugins;
import sk.ex.core.bukkit;
import sk.ex.core.paper;
import sk.ex.core.spigot;
import sk.ex.plugins.chatPlugin;
import sk.ex.plugins.eggPlugin;
import sk.ex.plugins.sitPlugin;
import sk.ex.server;

public class Hypixel  implements server {
    private String Name="Hypixel";
    private String Version="1.8";
    private sk.ex.Core[] Cores = new Core[2];
    private int online=345403;
    private int Patch=2342;
    private Plugins[] plugins=new Plugins[3];
    private String StartingMessage="reloaded!";
    private String Core="Paper";
    private String DateUpdate="14.12.24";

    public Hypixel(){
        init();
    }

    @Override
    public void warning(String warn){
        System.out.println("-----------------------------------------");
        System.out.println("[Warn]: " + warn + "!");
        System.out.println("-----------------------------------------");

    }

    private void init(){
        plugins[0]=new eggPlugin();
        plugins[1]=new chatPlugin();
        plugins[2]=new sitPlugin();
        Cores[0] = new bukkit();
        Cores[1] = new paper();
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