public class halloweenFactory {

    int year;
    int temperature;

    public static void main(String[] args) {

        halloweenFactory myStore;
        myStore = new halloweenFactory(); //construct
        myStore.year = 2024;
        myStore.temperature = 22;

        System.out.println("It's halloween of " + myStore.year + "the temperature is " + myStore.temperature);
    }

    public halloweenFactory(){ //constructor method
        Candy Candy1; // declare IceCream1
        Candy1 =new Candy();
        Candy1.isSour = false;
        Candy1.type = "hazelnut chocolate";
        Candy1.calories = 200;
        Candy1.printInfo();

        Candy Candy2; // declare IceCream1
        Candy2 =new Candy();
        Candy2.isSour = true;
        Candy2.type = "nerds gummy clusters";
        Candy2.calories = 100;
        Candy2.printInfo();

        Student Student1;
        Student1 =new Student("Stitch", 20, "Rachel");
        Student1.printInfo();

    }



}
