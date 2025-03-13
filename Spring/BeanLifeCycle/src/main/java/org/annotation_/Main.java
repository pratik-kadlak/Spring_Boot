package org.annotation_;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"annotation.xml"});
        Vehicle veh3 = (Vehicle) context.getBean("veh3");

        System.out.println(veh3);
        context.registerShutdownHook();
    }

}
