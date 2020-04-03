package testingMaths;

public class ChallengeOne {
    public static int[] odds(int numOdds) {
        /**
         * Return an array of the first numOdds odd numbers
         * Arguments
         * numOdds - a positive integer representing the number of odd numbers to store in the array
         * Examples
         * odds(3) returns [1, 3, 5]
        */

        // ====================================
        // Do not change the code before this

        // CODE1: Write code that will create an array with the first numOdds
        //        odd numbers and return the array

    	int odd = 1;
    	int[] myOddsArray = new int[3];
    	for (int i = 0; i < myOddsArray.length; i++) {
        myOddsArray[i] = odd;
        odd += 2;
    	}

        return myOddsArray;



        // ====================================
        // Do not change the code after this
    }
    
    public int String returnSomething(){
    	String says =  "Hello";
    	return says;
    }

    public static void main(String[] args) {
        int[] theOdds = odds(3);
        // Expected output is
        // 1, 3, 5
        System.out.println(theOdds[0] + ", " + theOdds[1] + ", " + theOdds[2]);
    }
}