package org.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"constructorConfig.xml"});
        Student stud0 = (Student) context.getBean("stud0");

        System.out.println(stud0);
    }

}
