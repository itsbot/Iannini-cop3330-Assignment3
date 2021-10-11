/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex42;
import java.io.BufferedReader;
import java.io.FileReader;

public class ex42 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/ex42/exercise42_input.txt"));
        String line;

        System.out.format("%-10s %-10s %-10s","First", "Last", "Salary");
        System.out.print("\n");

        for (int i=0; i<29; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
        while ((line = br.readLine()) != null) {
            String[] people = line.split(",");
            System.out.format("%-12s",people[0]);
            System.out.format("%-12s",people[1]);
            System.out.format("%-12s\n",people[2]);
        }

    }
}
