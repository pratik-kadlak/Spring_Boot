package org.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"primitivesConfig.xml"});
        Student stud0 = (Student) context.getBean("stud0");
        System.out.println(stud0);

        Student stud1 = (Student) context.getBean("stud1");
        System.out.println(stud1);

        Student stud2 = (Student) context.getBean("stud2");
        System.out.println(stud2);



    }
}