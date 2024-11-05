public class Student {

    String name;
    int nCandy;
    String costume;

    public Student(String Costume, int paramNCandy, String Name){

        costume = Costume;
        nCandy = paramNCandy;
        name = Name;

    }//constructor method



    public void printInfo() {
        System.out.println("Name of costume: " + costume);
        System.out.println("Number of candy: " + nCandy);
        System.out.println("Name of student: " + name);

    }





}
