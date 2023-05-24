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
        System.out.print("Input quantity of numbers : ");
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("result[" + i + "] : " );
            int t = in.nextInt();
            result.add(t);
        }
        int closest = 0;
        if (!result.isEmpty()) {
            closest = Math.abs(result.get(0));
            for (Integer element : result) {
                if (Math.abs(element) < closest) closest = element;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
        in.close();
    }
}


