public class Candy {

    boolean isSour;
    int calories;
    String type;

    public void printInfo(){
        if (isSour ==true){
            System.out.println("This " + type + " sour candy is " + calories + " calories.");

        }
        else{ // isIceCream == false
            System.out.println("This " + type + " normal candy is " + calories + " calories.");


        }

        System.out.println("Candy is sour: " + isSour);
    }


}
