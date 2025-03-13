package org.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Loads the Spring application context from the XML configuration file `xml_.xml`
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"xml_.xml"});

        // Retrieves the bean named `veh1` from the Spring container and casts it to the `Vehicle` type
        Vehicle veh1 = (Vehicle) context.getBean("veh1");

//        1. Object Gets Created
//        2. Properties Get Set
//        3. init() is called
//        4. We use the object 
//        5. destroy() is called to destroy the object

        System.out.println(veh1);

        // Registers a shutdown hook to ensure that Spring cleans up resources when the application is stopped
        context.registerShutdownHook();
    }
}
