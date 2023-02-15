package lib;

public class Student {
    public int id;
    public String name;
    public String program;

    public Student(){
        System.out.println("A new student created");
    }
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Student(int id, String name, String program){
        this.id=id;
        this.name=name;
        this.program=program;
    }
    public Student(int id){
        this.id=id;
    }
    public Student(String name){
        this.name=name;
    }
    public void read(){
        System.out.println(this.name+" can read");
    }

    public void write(){
        System.out.println(this.name+" can Write");
    }
}
