package sk.ex.function;

import sk.ex.Core;


public class coreAbout {

    public coreAbout(Core[] Cores){
        String About="";
        for (int i=0; Cores.length > i;i++){
            if (Cores[i].getName()=="bukkit"){
                About += "первоначальная заготовка\n";
            }
            if (Cores[i].getName()=="paper"){
                About += "возможности папер\n";
            }
            if (Cores[i].getName()=="spigot"){
                About += "возможности спигот\n";
            }

        }
        System.out.println(About);}
}
