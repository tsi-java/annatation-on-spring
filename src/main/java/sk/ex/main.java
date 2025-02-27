package sk.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import sk.ex.function.coreAbout;

public class main {
    private static String[] VersionList = new String[]{"1.1", "1.2", "1.3","1.4","1.5","1.6","1.7","1.8","1.8.9","1.9","1.9.10","1.10","1.11","1.12","1.12.1","1.12.2","1.13","1.14","1.15","1.16","1.16.1","1.16.4","1.16.5","1.17","1.18","1.18.2","1.19","1.20","1.20.1","1.20.4","1.21"};
    public static List<String> AllVersion;

    static {
        AllVersion = Arrays.asList(VersionList);
    }

    public static void main(String[] args){
        ClassPathXmlApplicationContext contexts = new ClassPathXmlApplicationContext("AplicationContext.xml");
        server server = contexts.getBean("skyset", sk.ex.server.class);
        server.Start();
        server.Update("30.11.27");
        server.warning("слишком поздний апдейт,время еще не пришло");
        server server2 = contexts.getBean("cristalix", sk.ex.server.class);;
        server2.Start();
        new coreAbout(server.getCores());
        contexts.close();
    }
}
