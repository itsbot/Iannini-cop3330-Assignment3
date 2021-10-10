/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex41;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) throws Exception{
        File in = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(in);
        ArrayList<String> names = new ArrayList<>();

        while (sc.hasNextLine()) {
            names.add(sc.nextLine());
        }
        Collections.sort(names);
        names.forEach(System.out::println);

        FileWriter out = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        for(String s: names) {
            out.write(s + System.lineSeparator());
        }
        out.close();
    }
}
