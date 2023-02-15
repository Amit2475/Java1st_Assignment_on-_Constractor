import lib.Student;
public class Main {
    public static void main(String[] args) {
        Student fahim, Minhaj, Amit;
        fahim = new Student(1,"Fahimul Haque");
        Minhaj = new Student("Minhaj");
        Amit = new Student(3, "Amit Chowdhury", "SWE");

        fahim.id=1;
        fahim.read();
        Minhaj.read();
        Amit.write();
    }
}