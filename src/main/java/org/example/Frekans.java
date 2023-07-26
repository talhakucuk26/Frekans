package org.example;

import java.util.HashMap;
import java.util.Map;

public class Frekans {
    public static void main(String[] args) {
        int[] array = {6, 9, 6, 8, 9, 125, 8, 1 ,130 , 130 , 125 , 1 , 5};

        Map<Integer, Integer> frekansMap = new HashMap<>();


        for (int num : array) {
            if (frekansMap.containsKey(num)) {
                frekansMap.put(num, frekansMap.get(num) + 1);
            } else {
                frekansMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frekansMap.entrySet()) {
            int sayi = entry.getKey();
            int tekrar = entry.getValue();
            System.out.println(sayi + " = " + tekrar + " kere tekrar etti.");
        }
    }
}