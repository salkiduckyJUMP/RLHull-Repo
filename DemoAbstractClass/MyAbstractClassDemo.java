// Abstract class
abstract class Player {
    // Abstract method declared without a body
    public abstract void playerStyle();
    // Regular method, with the body provided here
    public void takesDamage() {
      System.out.println("Oof!");
    }

    public void victory() {
      System.out.println("I win!");
    }

    //I can declare a method with access modifiers in an abstract class
    protected void score() {
      System.out.println("I can't show you!");
    }
  }
  
  // Mario and Luigi are our subclasses which can inherit from only one class; in this case the abstract class Player
  class Mario extends Player {
    public void playerStyle() {
      // The body of playerStyle() is provided here
      System.out.println("Mario goes after Mushrooms");

    }

    public void victory() {
      System.out.println("Yahoo! Mario's the winner!");
    }
  }

  class Luigi extends Player {
    public void playerStyle() {
      // The body of playerStyle() is provided here
      System.out.println("Luigi loves Skeleton Keys");

    }

    public void victory() {
      System.out.println("Yeah! Luigi's the SuperStar!");
    }
  }
  
  class MyAbstractClassDemo {
    public static void main(String[] args) {
      Mario myMario = new Mario(); // Create a Mario object that inherited it's methods from the abstract class Player
      myMario.playerStyle();
      myMario.takesDamage();
      myMario.victory();
      Luigi myLuigi = new Luigi();
      myLuigi.victory();

      //Code below will throw an error as you cannot instantiate an abstract class!
      //Player newPlayer = new Player();
      //myPlayer.playerStyle();
    }
  }


