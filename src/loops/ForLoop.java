package loops;

public class ForLoop {

	
	public static void main(String[] args)
	{
		int b=0;
		
		
		for(int a=1;a<=100;a++)
		{b++;
			if(a%2!=0)
			{
				
		
			}
	
		}
		System.out.println(b);
	int c=1;
	while(c<=10)
	{
		System.out.println(c);
		c++;
		
		
		int d=1;
		do
		{
			System.out.println(d);
			d++;
		}
		while(d<=10);
		
	}
	
	int rows =10;
	int g=0;
	
	for (int k=1;k<=rows;k++)
	{
		
		
		for(int l=1;l<=rows-g;l++)
		
		{
			System.out.print("*");
		}
		System.out.println();
		g++;
	}
	
			
		
		
	}
}
