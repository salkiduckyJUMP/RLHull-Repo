// Interface class example
interface Player {
    //All interface methods do not have a body
    public void playerStyle();
    public void takesDamage();
    public void victory();
    //Doesn't even let me make the method score() protected; remember no access types in interfaces
    //protected void score();
  }

  interface ShortLegs {
    public void superSlow();
  }

  //class Mario inherits methods from two different interfaces
  class Mario implements Player, ShortLegs {
    public void playerStyle() {
      // The body of playerStyle() is provided here for the Mario class
      System.out.println("Mario goes after mushrooms");
    }

    public void takesDamage() {
      System.out.println("Oof");
    }

    public void victory() {
        System.out.println("Yahoo! Mario's the winner!");
    }

    //Body of ShortLegs should be provided here for the Mario class
    public void superSlow() {
      System.out.println("He's slow.");
    }  
  }

  class Luigi implements Player {
    public void playerStyle() {
      // The body of playerStyle() is provided here for the Luigi class
      System.out.println("Luigi loves Skeleton Keys");
    }
    public void takesDamage() {
      System.out.println("Oof");
    }

    public void victory() {
        System.out.println("Yeah! Luigi's the SuperStar!");
    }
  }
  
  class MyDemo {
    public static void main(String[] args) {
      Mario myMario = new Mario(); // Create a Mario object and call on it's methods provided by the interfaces
      myMario.playerStyle();
      myMario.takesDamage();
      myMario.victory();
      myMario.superSlow();
      Luigi myLuigi = new Luigi(); //Similarly creates a Luigi object and calls on a method it inherited from Player interface
      myLuigi.victory();

      //Code below will throw an error as you cannot instantiate an abstract class or an interface!
      //Player newPlayer = new Player();
      //myPlayer.playerStyle();
    }
  }


