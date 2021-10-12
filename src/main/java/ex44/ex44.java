/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex44;
import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ex44 {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Reader in = Files.newBufferedReader(Paths.get("src/main/java/ex44/exercise44_input.json"));



            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
