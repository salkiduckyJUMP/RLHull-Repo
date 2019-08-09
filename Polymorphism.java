    class House {
        public void houseDoor() {
          System.out.println("The house has a door");
        }
    }
    //TownHouse inherits methods/attributes from House
    class TownHouse extends House {
        public void houseDoor() {
          //Different for each type of house
          System.out.println("The town house has a sliding glass door");
        }
      }
    
      class FarmHouse extends House {
        public void houseDoor() {
          System.out.println("The farmhouse has a dutch door");
        }
      }

      class SafeHouse extends House {
          public void houseDoor() {
            System.out.println("The safe house has a concrete door");
          }
      }

    class MainClass {
        public static void main(String[] args) {
            //Create a new instance of each of my classes
                House myHouse = new House();
                House myTownHouse = new TownHouse();
                House myFarmHouse = new FarmHouse();
                House mySafeHouse = new SafeHouse();

                //Call on the method houseDoor from each of these new instances
                myHouse.houseDoor();
                myTownHouse.houseDoor();
                myFarmHouse.houseDoor();
                mySafeHouse.houseDoor();
            }
        }
