class Animal {
    public void eat() {
        System.out.println("Omnomnom");
    }

    public void speak(){
        System.out.println("Speaking!");
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("Bow wow!");
    }
}

class Assessment1 {
    public static void main(String args[]) {
    Animal animal = new Animal();
    animal.eat();
    animal.speak();
    Dog doggy = new Dog();
    doggy.eat();
    doggy.speak();
    }
}