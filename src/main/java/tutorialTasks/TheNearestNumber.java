package tutorialTasks;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class TheNearestNumber {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = 0;
       System.out.print("Input quantity of numbers : ");
        N = in.nextInt();
        if (N < 0 || N > 10000) System.err.println("The temperature is out of the range");
        for (int i = 0; i < N; i++) {
            System.out.print("result[" + i + "] : ");
            int t = in.nextInt();
            if (t >= -273 && t <= 5526) result.add(t);
            else System.err.println("The temperature is out of the range");
        }
        int closest = 0;
        if (!result.isEmpty()) {
            closest = Math.abs(result.get(0));
            for (Integer element : result) {
                if (Math.abs(element) <= Math.abs(closest)) {
                    closest = element == closest ? Math.abs(element) : element ;
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
        in.close();
    }
}


