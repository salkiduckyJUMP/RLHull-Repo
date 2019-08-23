interface Turn {
    default void met1(){

    }
    static void met2(){

    }
    abstract void met3();

}

class Yep extends Turn {
    met1(){
        System.out.println("I am from the default method!");
    }

    met2(){
        System.out.println("I am from the static method!");
    }

    met3(){
        System.out.println("I'm from the abstract method!");
    }
}



class FinalKeyword {


}

// 1. Create an Interface that utilizes a default, abstract, and
//   static method.
// 2. Then create a class that implements the Interface and uses a final method.
// 3. Show that the final method cannot be overridden
// 4. Show the use of all methods.


