package com.didem.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        //m length alıcaz toplamı d olacak

        int counter = 0;
        //month is bigger than choclate size
        if(m > s.size())
            return counter;

        //if month january
        if(s.size() == 1 && m == 1)
            return 1;

        for(int i = 0; i< s.size()-1; i++){
            if(s.size() - i < m){
                return counter;
            }
            List<Integer> subList = s.subList(i, i+m);
            if(subList.size() == m){
               int sum = subList.stream().reduce(0, (a, b) -> a + b);
               System.out.println(sum);
               if(sum == d){
                   counter += 1;
               }
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> s = Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1 ,1, 2, 1, 4,1, 3, 3, 4, 2, 1);

        int d = 18;

        int m = 7;

        int result = birthday(s, d, m);


    }
}
