package org.interface_;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"interface.xml"});
        Vehicle veh2 = (Vehicle) context.getBean("veh2");

        System.out.println(veh2);
        context.registerShutdownHook();
    }

}
