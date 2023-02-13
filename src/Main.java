public class Main {



    public static void main(String[] args) {

        String a = "Pera";
        a.trim();
        String b = new String();

        Student student;

//        new Student().ime = "Zika";//-------> @Studentmfk2344234 [zika]
//        new Student().prezime = "Petrovic";//-------> @Studentm435435frewr
//        new Student().ispis();//-------> @Student43543rw


         student = new Student();//-------> @Studentmfkld3123 []

        student.ime = "Marko";
        student.prezime = "Markovic";
        student.godine = 20;

        Student student1 = new Student();
        student1.ime = "Zika";
        student1.prezime = "Petrovic";
        student1.godine = 21;


        Student student2 = new Student("Petar", "Petrovic", 19);

        Student student3 = new Student("John", "Smith");
        student3.godine = 19;

//        student.ispis();
//        student1.ispis();
//        student2.ispis();
//        student3.ispis();

        student.sum(40, 90);

        int n = 100;

        int suma = student.sum2(50, 50);
        System.out.println(suma);

        student.ispis();

        System.out.println(student.ispis2() + " srednje ime Pera");





    }






}