package Constructor;

public class CCboth {
   int a;
   int b;
	public CCboth()
	{
	 a=100;
	 b=200;
	}
	public CCboth(int x,int y)
	{
		a=x;
		b=y;
	}
	
	
public static void main(String[] args) {
	CCboth cc=new CCboth();
	cc.add();
	CCboth cb=new CCboth(10,20);
	cb.add();
		
	}
public void add()
{
	System.out.println(a+b);
}
}
