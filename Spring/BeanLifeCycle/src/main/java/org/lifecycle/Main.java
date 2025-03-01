package org.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Loads the Spring application context from the XML configuration file `config.xml`
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config.xml"});

        // Retrieves the bean named `veh1` from the Spring container and casts it to the `Vehicle` type
        Vehicle veh1 = (Vehicle) context.getBean("veh1");

        System.out.println(veh1);

        // Registers a shutdown hook to ensure that Spring cleans up resources when the application is stopped
        context.registerShutdownHook();
    }
}
