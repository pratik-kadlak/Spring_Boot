package org.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"referenceConfig.xml"});
        ClassA A = (ClassA) context.getBean("aRef");

        System.out.println(A);
        System.out.println(A.getB().toString());
    }

}
