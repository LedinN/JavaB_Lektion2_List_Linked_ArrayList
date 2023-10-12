package com.nick.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Fixed size - arrays
        int[] scores = {0,150,500}; // Delete nor Add elements - Impossible!

        // ArrayList
        ArrayList<Integer> scoreList = new ArrayList(); // NOT-recommended // Initialsize 10

        // List + ArratList
        List<Integer> scoreList2 = new ArrayList(20);     // Recommended // Initialsize 20

        scoreList2.add(100); //Add new index with, element: 100
        scoreList2.add(200);
        scoreList2.add(300);

        System.out.println(scoreList2);





        //Initial ArrayList values
        List<Integer> testList = new ArrayList(
                Arrays.asList(0,150,500) // InitialSize = 3 BRUH
        );
        testList.add(1000);


        System.out.println(testList);



    }
}
