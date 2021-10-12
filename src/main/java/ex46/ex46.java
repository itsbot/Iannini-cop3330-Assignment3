/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ex46 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("src/main/java/ex46/exercise46_input.txt"));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String process[] = text.split("\\s");

        for (int i=0; i< process.length; i++) {
            if(!map.containsKey(process[i])) {
                map.put(process[i],1);
            } else {
                map.put(process[i],map.get(process[i])+1);
            }
        }

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            System.out.println(each.getKey()+" "+each.getValue());
        }




    }
}
