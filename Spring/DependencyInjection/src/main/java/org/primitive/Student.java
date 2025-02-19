package org.primitive;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    public void setStudentId(int id) {
        System.out.println("setting student id");
        this.studentId = id;
    }

    public void setStudentName(String name){
        System.out.println("setting student name");
        this.studentName = name;
    }

    public void setStudentAddress(String address){
        System.out.println("setting student address");
        this.studentAddress = address;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String getStudentAddress(){
        return this.studentAddress;
    }

    public Student(int id, String name, String address){
        super();
        this.studentId = id;
        this.studentName = name;
        this.studentAddress = address;
    }

    public Student(){
        super();
    }

    @Override
    public String toString(){
        return "Student [studentId = " + this.studentId + " studentName = " + this.studentName + " studentAddress = " + this.studentAddress + "]";
    }

}
