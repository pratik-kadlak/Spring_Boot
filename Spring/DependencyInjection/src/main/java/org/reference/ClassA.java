package org.reference;

public class ClassA {
    private String aVar;
    private ClassB B;

    public void setaVar(String aVar){
        this.aVar = aVar;
    }

    public void setB(ClassB B){
        this.B = B;
    }

    public String getaVar(){
        return this.aVar;
    }

    public ClassB getB(){
        return this.B;
    }

    public ClassA(String aVar, ClassB B){
        this.aVar = aVar;
        this.B = B;
    }

    public ClassA(){
        super();
    }

    @Override
    public String toString(){
        return "ClassA [ aVar: " + aVar + " B: " + B + " ]";
    }

}
