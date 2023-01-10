package exercise_2;

/**
 * Write a program, which outputs all numbers from 1 to 100 with the following rule:
 * <ul>
 *     <li>If the number is multiple of 3: print "Fizz"</li>
 *     <li>If the number is multiple of 5: print "Buzz"</li>
 *     <li>If the number is multiple of 3 and 5: print "FizzBuzz"</li>
 *     <li>Otherwise print the number </li>
 * </ul>
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

