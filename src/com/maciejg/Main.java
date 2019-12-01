package com.maciejg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private final static String filePath  = "/home/maciej/Desktop/advent.txt";

    public static void main(String[] args) {
        Day1 day1 = new Day1();
        System.out.println(day1.part2((loadFileToList(filePath))));
    }

    public static List loadFileToList(String txt){
        List<Integer> temp = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File(txt));
            while(sc.hasNext()) {
                temp.add(Integer.parseInt(sc.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
