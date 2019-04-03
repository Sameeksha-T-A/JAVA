/*Allow the user to enter a string and display the string
 in alphabetic order and find the length of string*/

import java.util.Scanner;

public class StringAlpha
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a string:");
      String original = sc.next();
      char[] ch = original.toCharArray();

      for(int i=0; i<ch.length-1; i++)
      {
      	for(int j=0; j<ch.length-1-i; j++)
      	{
            if(ch[j]>ch[j+1])
            {
            	char temp = ch[j];
            	ch[j] = ch[j+1];
            	ch[j+1] = temp;
            }
      	}
      }

    System.out.println(original);
    String alhaorder = new String(ch);
    System.out.println(alhaorder);
   }

}