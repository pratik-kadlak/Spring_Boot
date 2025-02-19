package org.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionsConfig.xml");

        Student stud0 = (Student) context.getBean("stud0");
        System.out.println(stud0.getName());
        System.out.println(stud0.getCourses());
        System.out.println(stud0.getContactNos());
        System.out.println(stud0.getGrades());

        Properties dbProperties = stud0.getDbProperties();
        dbProperties.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
