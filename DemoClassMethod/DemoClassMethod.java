/*
    This code shows the basic setup of a Java Program
    It asks the user for input and checks it in a if loop to return a message to the user
*/

import java.util.Scanner; //importing the Scanner class

//class declaration for DemoClassMethod
class DemoClassMethod {

    //method declaration for myMethod()
    public static void myMethod() {

        //Asks user to input their dog's name, a if statement checks for a few cases before returning a else statement
        

        System.out.println("Tell me your dog's name:");
        

        Scanner myObj = null; //initialize a Scanner object, uses my imported class from line 6
        try {
            myObj = new Scanner(System.in);
            String name;
            String duncan = "Duncan";
            String chester = "Chester";
            name = myObj.nextLine();
            System.out.println(name);

            if (name.equals(duncan)) {
                System.out.println("Me too!");
            } else if (name.equals(chester)) {
                System.out.println("That was my first dog's name! Is he a good boy too? :D");
            } else {
                System.out.println(name + ", huh? That's a different name!");
            }
        }
        finally {
            if(myObj!=null)
            myObj.close();
        }
    }

    public static void main (String args[]) {
        myMethod();
    }


}