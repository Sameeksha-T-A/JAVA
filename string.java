import java.util.Scanner;
class string
{
	public static void main(String[] args)
	{
	int length=args.length;
	char[] str=args[0].toCharArray();
	char swap;
	
	for(int i=0;i<length;i++)
	{
		for(int j=0;j<length-1;j++)
		{
			if(str.charAt(j)> str.charAt(j+1))
				{
                     swap=str[j];

                     str[j]=str[j+1];

                     str[j+1]=swap;
                 }
		}
	}
	for(int i=0;i<length;i++)
                  {
                       System.out.print(str[i]);
                  }
	}
}