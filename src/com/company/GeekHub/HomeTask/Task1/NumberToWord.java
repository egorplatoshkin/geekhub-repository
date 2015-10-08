package com.company.GeekHub.HomeTask.Task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by USER on 07.10.2015.
 */
public class NumberToWord {
    Map <Integer, String> map = new HashMap<>();

    public NumberToWord() {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
    }
    public String transform(int number)
    {
        String result = null;
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            if (entry.getKey().equals(number)) {
                result = entry.getValue();
            }
        }
        return result;

    }

}
