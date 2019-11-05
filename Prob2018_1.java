package cscclub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob2018_1
    {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);//"C:\\Users\\chanc\\OneDrive\\Desktop\\test2.txt"
        
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            String [] array = new String[n];
            for(int i = 0; i < n;i++){
                array[i] = sc.next();
            }
            if(!checkLat(array)){
                System.out.println("No");
            }else{
                System.out.println(checkReduce(array));
            }
        }
        
        
    }
    public static boolean checkLat(String[] array){
        //line
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                for(int k = j+1; k < array.length; k++){
                    if(array[i].charAt(j) == array[i].charAt(k)){
                        return false;
                    }
                }
            }
        }
        //col
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                for(int k = j+1; k < array.length; k++){
                    if(array[j].charAt(i) == array[k].charAt(i)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static String checkReduce(String[] array){
        for(int i = 0; i < array.length; i++){
            int value = array[0].charAt(i);
            int value1 = array[i].charAt(0);
                if(value>=48 && value<=57){
                    value-=48;
                }else if(value>=65 && value<= 90){
                    value-=55;
                }
                if(value1>=48 && value1<=57){
                    value1-=48;
                }else if(value1>=65 && value1<= 90){
                    value1-=55;
                }
                if(value!=i || value1!=i){
                    return "Not Reduced";
                }
        }
        return "Reduced";
    }
}
