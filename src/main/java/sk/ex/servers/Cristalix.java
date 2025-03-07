package sk.ex.servers;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sk.ex.Core;
import sk.ex.Plugins;
import sk.ex.core.bukkit;
import sk.ex.core.paper;
import sk.ex.core.spigot;
import sk.ex.plugins.chatPlugin;
import sk.ex.plugins.eggPlugin;
import sk.ex.plugins.sitPlugin;

import sk.ex.server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Scope("singleton")
@Component("cristalix")
public class Cristalix implements server {
    private String Name="Cristalix";
    private sk.ex.Core[] Cores = new Core[2];
    private String Version="1.12.2";
    private int online=12430;
    private int Patch=12664;
    private Plugins[] plugins = new Plugins[3];
    private String StartingMessage="подал запрос на запуск!";
    private String Core="PufferFish";
    private String DateUpdate="21.01.25";

    public Cristalix(){

    }

    @Override
    public void warning(String warn){
        System.out.println("-----------------------------------------");
        System.out.println("[Warn]: " + warn + "!");
        System.out.println("-----------------------------------------");

    }

    @PreDestroy
    private void stop(){
        System.out.println("-----------------------------------------");
        System.out.println(this.Name + "  выключен" );
        System.out.println("-----------------------------------------");
    }


    @PostConstruct
    private void init(){
        plugins[0]=new eggPlugin();
        plugins[1]=new chatPlugin();
        plugins[2]=new sitPlugin();
        Cores[0] = new bukkit();
        Cores[1] = new spigot();
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