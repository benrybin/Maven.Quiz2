package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> mylist = new ArrayList<Integer>();

        Collections.addAll(mylist,array1);
        Collections.addAll(mylist,array2);
        Integer[] answer = mylist.toArray(new Integer[0]);

        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {


        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < array1.length; i++) {

                if (array1[i] == valueToEvaluate) {
                    counter++;
                } }

            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == valueToEvaluate) {
                    counter++;
                }

            }


        return counter;
        }


    public Integer mostCommon(Integer[] array) {
        Integer count = 0;
        Integer max = 0;
        Integer answer = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 1; j <array.length-1 ; j++) {
                if(array[i]==array[j]){
                    count++;
                }

            }
            if(count>= max){
                max = count;
                answer = array[i];
            }
        }

        return answer;
    }
}
