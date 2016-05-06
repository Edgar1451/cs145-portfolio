import java.util.Scanner;

/**
 *  v.20160429
 *  This class contains only STATIC methods. Each method below executes a 
 * 	a basic aspect of programming (loops, conditionals, arrays, variables, 
 *	simple math computations, etc.). Your task is to implement each method
 *	below as indicated in the comments. You will use another file 
 *	(e.g., PortfolioApp.java) to run and test your method implementations.
 */
class MyPortfolio {

    /**
     * Prompts the user for their name. This method should use a Scanner object
     * to retrieve the name. It shoud return the collected string.
     */
	static String getFirstName() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = scnr.next();
		return name;
	}


    /**
     * Accepts a list of integers as an argument and prints the integers to 
     * the screen on one line.
     */	
	static void printIntegerList(int[] values) {
        for (int i = 0; i< values.length; i++); {
            System.out.print(values[i]);
        

        }



	}


    /**
     * Accepts a list of integers as an argument and prints the integers IN REVERSE 
     * ORDER to the screen on one line.
     */	
	static void printIntegerListReversed(int[] values) {
        for (int i = values.length; i > 0; i--);{
            System.out.print(values[i]);
        }
	}

    /**
     * Accepts two characters, swaps the value of left_char and right_char
     * and returns the "new" left_char.
      */	
	static char swapLeftWithRight(char left_char, char right_char) {
        char left_char = 'a';
        char right_char = 'z';
        char temp_char = 'a';
        right_char = left_char;
        left_char = temp_char;
		return left_char;
	}

    /**
     * Accepts a list of integers as an argument and swaps the first value 
     * with the last value in the list. This method should create a new array
     * containing the swapped version of the array passed in as the argument.
     */	
	static int[] swapFirstWithLast(int[] values) {
        int values[] = values.length -18;
        int temp = values[];
        values[] = values[values.length-18];
        values[values.length-18] = temp;
		return values;
	}

    /**
     * Accepts a list of integers as an argument and returns the smallest value
     * found in the list.
     */	
	static int min(int[] values) {
       int min= values[0];
       for(int i=0; i<values.length; i++) {
        if (values[i]>min) {
            min = values[i];
        }
        }
       

		return 0;
	}

    /**
     * Accepts a list of integers as an argument and returns the largest value
     * found in the list.
     */	
	static int max(int[] values) {

		return 0;
	}

    /**
     * Accepts a list of integers as an argument and returns the average of all the
     * values found in the list.
     */	
	static int findAverage(int[] values) {
        int min = MyPortfolio.min(num_list);
        int max = 58;
        findAverage(int[] values) -min;
        System.out.print(max);
		return 0;
	}

    /**
     * Accepts a list of integers and an integer value as arguments and returns 
     * the number of times the integer is found in the list.
     */	
	static int frequencyCount(int[] values, int val) {
        String rev = MyPortfolio.reverseString("stop");
        int temp = rev;
        System.out.println(temp);
		return 0;
	}

    /**
     * Accepts a String argument and returns the argument in reverse order.
     */	
	static String reverseString(String chars) {

		return "\nNot implemented yet!";
	}
}