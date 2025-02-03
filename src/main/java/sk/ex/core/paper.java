package sk.ex.core;

import sk.ex.Core;

public class paper implements Core {
    String name = "paper";

    @Override
    public String getName() {
        return name;
    }
}
