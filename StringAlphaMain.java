/*Allow the user to enter a string and display the string
 in alphabetic order and find the length of string*/

import java.util.Scanner;

public class StringAlphaMain
{
    public static void main(String args[]) 
    {
    	AlphaOrder obj = new AlphaOrder();
      	Scanner sc = new Scanner(System.in);

      	System.out.println("Enter a string:");
      	String original = sc.next();
      	obj.alphaOrder(original);
    } 
}