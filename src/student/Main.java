package student;

public class Main {


    public static void main(String[] args) {


        Student student = new Student();//-------> @Studentmfkld3123 []
        student.setIme("Marko");
        student.setPrezime("Markovic");

        student.godine = 20;

        Student student1 = new Student();
        student1.setIme("Zika");
        student1.setPrezime("Petrovic");

        student1.godine = 21;

        Student student2 = new Student("Petar", "Petrovic", 19);

        Student student3 = new Student("John", "Smith");

        student3.godine = 18;

        Student.godine = 30;

        String ime1 = student1.getIme();
//
//        System.out.println(student.getIme());
//        System.out.println(ime1);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }






}