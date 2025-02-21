package org.reference;

public class ClassB {
    private String bVar;

    public void setbVar(String bVar){
        this.bVar = bVar;
    }

    public String getbVar(){
        return this.bVar;
    }

    public ClassB(String bVar) {
        this.bVar = bVar;
    }

    public ClassB(){
        super();
    }

    @Override
    public String toString(){
        return "ClassB [bVar= " + bVar + "]";
    }
}
