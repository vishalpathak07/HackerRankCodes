// In this problem you have to print the largest sum among all the hourglasses in the array. 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class  hourglass2DArray{
    
    static void sum(List<List<Integer>> arr)
    {
        int i,j,sum=0,lMax=Integer.MIN;
        for(i=0; i<6; i++)
        {
             
            for(j=0; j<6; j++)
            {  
                if(i<=3 && j<=3){
                sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                  lMax=Math.max(lMax,sum);//to find Largest 
                }
            }
        }
        System.out.println(lMax);
       
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        Solution.sum(arr);
        bufferedReader.close();
    }
}
