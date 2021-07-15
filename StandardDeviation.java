import java.util.*;
import java.text.*;

class StandardDeviation{
   public static void main(String [] args){
      Scanner kb = new Scanner(System.in);
      DecimalFormat threePlaces = new DecimalFormat("0.000");
      
      System.out.println("If you give me a set of data, I can calculate the standard deviation.\nHow many values are in your set?");
      int size = kb.nextInt();
      kb.nextLine();
      double[] userSet = new double[size];
      for(int i=0; i<size; i++){
         System.out.println("Please enter Value " + (i+1) + ":");
         userSet[i] = kb.nextDouble();    
      }
      double stDev = findDev(userSet);
      System.out.print("You entered the values: ");
      for(double oneByOne : userSet){
         String values = new String(oneByOne + "  ");
         System.out.print(values);
      }
      System.out.println();
      System.out.println("The standard deviation is " + threePlaces.format(stDev) + ".");
   }
   public static double findDev(double[] userArray){
      double dev = 0, avg = 0, sum = 0, topSum = 0;
      for(double num : userArray){
         sum = sum + num;
      }
      avg = sum/userArray.length;
      for(int i = 0; i<userArray.length; i++){
         topSum = topSum + Math.pow((userArray[i]-Math.abs(avg)),2);
      }
      dev = Math.sqrt(topSum/userArray.length);
      return dev;
   }
}