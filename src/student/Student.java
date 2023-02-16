package student;

public class Student extends Person{


    static int godine;

    static int counter = 0;


    //konstruktor - mehanizam za kreiranje objekta
    public Student() {
        counter++;
       //System.out.println("Pozvan prazan konstruktor!");
        System.out.println(counter);
    }

    public Student(String ime, String prezime, int godine) {
        //System.out.println("Pozvan konstruktor sa 3 parametra!");
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(String ime, String prezime) {
        //System.out.println("Pozvan konstruktor sa 2 parametra!");
        this.ime = ime;
        this.prezime = prezime;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' + " " +  godine +
                '}';
    }



}
