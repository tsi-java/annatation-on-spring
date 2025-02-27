package sk.ex.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sk.ex.Core;

@Component("spigotcore")
@Scope("singleton")
public class spigot implements Core {
    String name = "spigot";
    @Autowired
    @Qualifier("bukkitcore")
    private Core Precore;


    public spigot(){

    }

    @Override
    public String getName() {
        return name;
    }
}
