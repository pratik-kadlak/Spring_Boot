package org.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Student {
    private String name;
    private List<String> courses;
    private Set<String> contactNos;
    private Map<String, String> grades;
    private Properties dbProperties;

    public String getName(){
        return this.name;
    }

    public List<String> getCourses(){
        return this.courses;
    }

    public Set<String> getContactNos(){
        return this.contactNos;
    }

    public Map<String, String> getGrades(){
        return this.grades;
    }

    public Properties getDbProperties(){
        return this.dbProperties;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourses(List<String> courses){
        this.courses = courses;
    }

    public void setContactNos(Set<String> contactNos){
        this.contactNos = contactNos;
    }

    public void setGrades(Map<String, String> grades){
        this.grades = grades;
    }

    public void setDbProperties(Properties dbProperties){
        this.dbProperties = dbProperties;
    }

    public Student(String name, List<String> courses, Set<String> contactNos, Map<String, String> grades) {
        super();
        this.name = name;
        this.courses = courses;
        this.contactNos = contactNos;
        this.grades = grades;
    }

    public Student() {
        super();
    }
}
