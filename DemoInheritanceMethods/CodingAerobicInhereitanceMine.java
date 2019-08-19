    class Musical{  
        public void songs() {
            System.out.println("La la la...");
        } 
        protected void cast() {
            System.out.println("Characters");
        } 
        private void story() {
            System.out.println("Story");
        }
    }

    class Heathers extends Musical{  
        public void songs() {
            System.out.println("Beautiful, Fight for Me, Dead Girl Walking");
        }  
    
        public void cast() {
            System.out.println("Veronica, Heather, J.D.");
        }
    }

    class LittleShopofHorrors extends Musical{  
        public void songs() {
            System.out.println("Little Shop of Horrors, Dentist, Feed Me");
        }  
    }  

    class CodingAerobicInheritanceMine{  
        public static void main(String args[]){  
        Heathers heathers = new Heathers();  
        heathers.songs();  
        heathers.cast(); 
        //heathers.story();
    
        LittleShopofHorrors littleShop = new LittleShopofHorrors();
        littleShop.songs();
        littleShop.cast();
        }
    }  

  
