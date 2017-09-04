package exercises;

import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - Loops (while only)
 * - LoopAndAHalf
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here
        int input, sum, count;
        double avg;
        sum = 0;
        count = 0;
        input = sc.nextInt();
        // -- Input (and bookkeeping)
        while(input != -1) {
            sum += input;
            count += 1;
            input = sc.nextInt();
        }
        avg = sum*1.0/count;
        out.println("Sum = " + sum + " Avg = " + avg);
        // -- Process---


        // -- Output ----

    }

}
