package sk.ex.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sk.ex.Core;

@Component("papercore")
@Scope("singleton")
public class paper implements Core {
    String name = "paper";
    @Autowired
    @Qualifier("bukkitcore")
    Core precore;


    public paper(){
    }

    @Override
    public String getName() {
        return name;
    }
}
