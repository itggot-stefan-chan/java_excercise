package exercises;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Program to exercise arrays
 * <p>
 * See:
 * - Loops (for-loop only)
 * - ArrayBasics
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays().program();
    }

    final Scanner sc = new Scanner(in);

    private void program() {
        int val;
        int []array = new int [5];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();
        out.println("Array is " + Arrays.toString(array));
        out.println("Input a value to find");
        val = sc.nextInt();
        for(int i = 0;i < array.length;i++) {
            if(array[i] == val) {
                out.println("Value " + val + " is at index " + i);
                break;
            }
            if(i == array.length - 1) {
                out.println("Value not found");
            }
        }

    }
}
