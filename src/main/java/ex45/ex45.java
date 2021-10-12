/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex45;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/ex45/exercise45_output.txt");

        String text = Files.readString(Path.of("src/main/java/ex45/exercise45_input.txt"));
        System.out.println(text+"\n");
        String out = text.replaceAll("utilize", "use");
        System.out.println(out);
        fw.write(out);

        fw.close();
    }
}
