package org.constructor;

public class Student {

    private String studentName;
    private int studentId;
    private Project proj;

    public Student(String studentName, int studentId, Project proj){
        this.studentName = studentName;
        this.studentId = studentId;
        this.proj = proj;
    }

    @Override
    public String toString(){
        return "Student [StudentName: " + studentName + " StudentId: " + studentId + " project: " + proj + "]";
    }

}
