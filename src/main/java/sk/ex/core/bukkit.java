package sk.ex.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sk.ex.Core;

@Component("bukkitcore")
@Scope("singleton")
public class bukkit implements Core {
    String name = "bukkit";

    @Override
    public String getName() {
        return name;
    }
}
