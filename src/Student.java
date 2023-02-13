public class Student {

    //polja
    String ime;
    String prezime;
    int godine;

    //konstruktor - mehanizam za kreiranje objekta
    public Student() {

    }

    public Student(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }



    public void ispis(){
        System.out.println("Ime: " + ime + " Prezime: " + prezime + " godina:" + godine);
    }

    public String ispis2(){
        return "Ime: " + ime + " Prezime: " + prezime + " godina:" + godine;
    }


    public Student student(){
        return new Student();
    }

    public void sum(int a, int b){
        int sum = a + b;
        System.out.println("Zbir dva broja je: " + sum);
    }

    public int sum2(int a, int b){
        return a + b;
//        int sum = a + b;
//        return sum;
    }





}
