/*class provides a method which sort character values in 
alphabetic order*/

public class AlphaOrder{

	//member method to sort the charatcters into alphabetically
   public void alphaOrder(String str){

      char[] ch = str.toCharArray();

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

      System.out.println(str);
      String alhaorder = new String(ch);
      System.out.println(alhaorder);
   }
}