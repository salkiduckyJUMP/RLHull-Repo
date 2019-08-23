interface thing1 {
     public method1();
}

interface thing2 extends thing1 {
    public method2();
}

interface thing3 {
    public method3();
}

class Obj1 implements thing3, thing1 {
    public void method3(){
        System.out.println("Hello");
    }
    public void method1(){
        System.out.println("Helloagain");
    }
}

class Obj2 implements thing2 {
    public void method2(){
        System.out.println("Nah");
    }

    public void method1(){
        System.out.println("Nada");
    }
}

class InterfaceEx {
    public static void main (String args[]) {
        Obj1 obj1 = new Obj1();
        obj1.method3();
        obj1.method1();

        Obj2 obj2 = new Obj2();
        obj2.method2();
        obj2.method1();
    }
    
}

// Write a Java program that has the following:
// 1. Shows the use of interfaces to pass method signatures and variables
// 2. Uses multiple inheritance of the interfaces
// 3. Shows multiple interfaces being implemented in classes
// 4. Shows both class inheritance and interface being used




