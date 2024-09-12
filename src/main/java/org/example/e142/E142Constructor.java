package org.example.e142;


public class E142Constructor {
    public static void main(String[] args) {
        SyntaxTechnologies instance=new SyntaxTechnologies();
        instance.display();

        SyntaxTechnologies parameterized=new SyntaxTechnologies("Syntax",6,2020,"07302020");
        parameterized.display();
    }
}
class SyntaxTechnologies{
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public SyntaxTechnologies(){
        this.schoolName=null;
        this.batch=0;
        this.year=0;
        this.lastDayOfClass=null;
    }

    public SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    public void display(){
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}

