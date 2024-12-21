
package com.example.project;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[] niceList = new String[names.length];
        String[] naughtyList = new String[names.length];

        for(int i = 0; i < names.length; i++) {
            int random = (int)(Math.random() * 2);
            if (random == 1) {
                naughtyList[i] = names[i];
            } else {
                niceList[i] = names[i];
            }
        }
        String[][] list = { niceList, naughtyList };


        return list;
     }

    public static void main(String[] args) {
        String[] names = {"John", "Lucy", "Test"};

        System.out.println(nameSort(names));
    }
}