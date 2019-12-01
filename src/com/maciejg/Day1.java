package com.maciejg;

import java.util.List;

public class Day1 {

    public Integer part1(List<Integer> list) {
         return list.parallelStream().mapToInt(m -> ((m/3)-2)).sum();
     }

     public Integer part2(List<Integer> list) {
        int sum = 0;
        for(Integer x : list) {
            Double moduleFuel = (double)x;
            while(Math.floor((moduleFuel / 3) - 2) > 0) {
                moduleFuel = Math.floor((moduleFuel / 3) -2);
                sum += moduleFuel;
            }
         }
        return sum;
     }
}
