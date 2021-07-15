/* Kevin Sims
   This program is designed to check the strength of a
   password given by the user based on five criteria for strength.
   It will then tell the user if the password is valid or invalid
   based on that criteria.
*/
import java.util.*;

class PasswordKS{
   public static void main(String [] args){
      //objects
      Scanner kb = new Scanner(System.in);

      
      //introduction and user input
      greeting();
      String userPassword = kb.nextLine();
      
      //password check methods
      boolean check1 = passwordLength(userPassword);
      boolean check2= passwordLower(userPassword);
      boolean check3 = passwordUpper(userPassword);
      boolean check4 = passwordDigit(userPassword);
      boolean check5 = passwordSpecial(userPassword);
      
      //result check and print
      if(check1&&check2&&check3&&check4&&check5){
         System.out.println("Dang, that's a strong password.");
      } else if(check1==false){
         System.out.println("Weak password. Must be at least 8 characters.");
      } else if(check2==false){
         System.out.println("Weak password. Must contain a lowercase letter.");
      } else if(check3==false){
         System.out.println("Weak password. Must contain an uppercase letter.");
      } else if(check4==false){
         System.out.println("Weak password. Must contain a number.");
      } else if(check5==false){
         System.out.println("Weak password. Must contain a special character.");
      }
   }
   
   //greeting method
   public static void greeting(){
      Scanner scan = new Scanner(System.in);
      System.out.println("This program will check the strength of your password. A strong password must include:\n\nAt least eight characters\nAt least one uppercase letter\nAt least one lowercase letter\nAt least one number\nAt least one special character\n\nCheck the strength of your password here:");
   }
   
   //password length check method
   public static boolean passwordLength(String phrase){
      String password = new String(phrase);
      boolean flag1 = false, strong = true;
      if(password.length()>=8){
         flag1 = true;
      } else{
         flag1 = false;
         strong = false;
      }
      return strong;
   }
   
   //password lowercase check method
   public static boolean passwordLower(String phrase){
      String password = new String(phrase);
      boolean flag2 = false, strong = false;
      for(int i=0; i<password.length(); i++){
         char letter = password.charAt(i);
         if(Character.isLowerCase(letter)){
            flag2 = true;
            strong = true;
         } else{
            flag2 = false;
         }
      }
      return strong;
   }

   //password uppercase check method
   public static boolean passwordUpper(String phrase){
      String password = new String(phrase);
      boolean flag3 = false, strong = false;
      for(int i=0; i<password.length(); i++){
         char letter = password.charAt(i);
         if(Character.isUpperCase(letter)){
            flag3 = true;
            strong = true;
         } else{
            flag3 = false;
         }
      }
      return strong;
   }

   //password digit check method
   public static boolean passwordDigit(String phrase){
      String password = new String(phrase);
      boolean flag4 = false, strong = false;
      for(int i=0; i<password.length(); i++){
         char letter = password.charAt(i);
         if(Character.isDigit(letter)){
            flag4 = true;
            strong = true;
         } else{
            flag4 = false;
         }
      }
      return strong;
   }
   
   //password special character check method
   public static boolean passwordSpecial(String phrase){
      String password = new String(phrase);
      boolean flag5 = false, strong = false;
      for(int i=0; i<password.length(); i++){
         char letter = password.charAt(i);
         if((int)letter>=32&&(int)letter<=47){
            flag5 = true;
            strong = true;
         } else if((int)letter>=58&&(int)letter<=64){
            flag5 = true;
            strong = true;
         } else if((int)letter>=91&&(int)letter<=95){
            flag5 = true;
            strong = true;
         } else{
            flag5 = false;
         }
      }
      return strong;
   }
}