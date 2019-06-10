package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 ==0){
            return true;
        }

        return false;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for (int i = start; i <= stop; i++) {
            mylist.add(i);

        }
        Integer[] answer = mylist.toArray(new Integer[0]);


        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2]*array[array.length-1];
    }
}
