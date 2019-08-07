public class JavaDataTypes {
    public static void main(String[] args) {
        //Examples for a numeric whole number
        byte myByte = 50;
        short myShort = 22445;
        int myInt = 500000;
        long myLong = 873499849546656L;

        //Printing these to console
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);

        //Example for a negative whole number
        long myNegativeLong = -23;
        System.out.println(myNegativeLong);
        
        //True/false data type boolean examples from line 20 to 34
        boolean checkSame = true;
        if (myByte != myInt) {
            System.out.println(checkSame);
        } 

        boolean checkSize = false;
        int first = 5;
        int second = 9;
        if (second < first) {
           //do nothing, we won't get here in this code because 5 is not more than 9
        } else {
            System.out.println(checkSize);
        }

        //Numeric fractional numbers; float and decimal

        //Example to show that float cannot handle more than 6-7 decimal digits, lines 39-40
        //Float example is called 'small' because it can handle less decimal digits

        // float mySmallDecimal = 65.545454545454;
        // System.out.println(mySmallDecimal);

        //Example to show doubles can handle more decimal digits, thus is preferable in most cases
        double myDecimal = 65.545454545454;
        System.out.println(myDecimal);

        //Single character data type
        char myCharacter = 'y';
        System.out.println(myCharacter);
        
        //Sequence of characters, string example
        String myString = "Back to the Future";
        System.out.println(myString);
    } 

}