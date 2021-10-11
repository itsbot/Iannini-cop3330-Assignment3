/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex43;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Site name: ");
        String name = sc.nextLine();
        String path = "src/main/java/ex43/website/"+name;
        File folder = new File(path);
        boolean p = folder.mkdirs();

        File index = new File(path+"/index.html");
        boolean i = index.createNewFile();

        System.out.print("Author: ");
        String author = sc.nextLine();
        BufferedWriter out = new BufferedWriter(new FileWriter(index));

        String text = "<title>"+name+"</title>\n<meta>"+author+"</meta>";
        out.write(text);
        out.close();

        System.out.print("Do you want a folder for JavaScript? ");
        String js = sc.nextLine();
        boolean j=true;
        if (js.equals("y")) {
           j = new File(path+"/"+name+"/js").mkdirs();
        }

        System.out.print("Do you want a folder for CSS? ");
        String css = sc.nextLine();
        boolean c=true;
        if (css.equals("y")) {
            c = new File(path+"/"+name+"/css").mkdirs();
        }

        if (p) {
            System.out.println("Created "+path);
        }
        if (i) {
            System.out.println("Created "+path+"/index.html");
        }
        if (j) {
            System.out.println("Created "+path+"/js");
        }
        if (c) {
            System.out.println("Created "+path+"/css");
        }


    }
}
