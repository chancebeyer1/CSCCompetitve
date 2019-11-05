package cscclub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem2018_4 
    {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\chanc\\OneDrive\\Desktop\\test1.txt")));
        ArrayList<Long> numbers = new ArrayList<>();
        while(sc.hasNextLong()){
            numbers.add(sc.nextLong());
        }
        for(long n : numbers){
            System.out.println(getHalf(n));
        }
    }
    
    public static long getTotal(long n){
        long result;
        result = (long)n*(n-1)/2;
        return result;
    }
    
    public static long getHalf(long n){
        long sum = 0;
        long counter = 0;
        long half = getTotal(n);
        if(half%2==0){
            half = half/2;
        }else{
            half = half/2+1;
        }
        while(sum<half){
            counter++;
            sum += n - counter;
        }
        return counter;
    }
    }
