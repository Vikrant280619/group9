package method;

public class NonstaticMethod {

	public static void main(String[] args) {
		NonstaticMethod tt=new NonstaticMethod();
		tt.test();
		calculation cc=new calculation();
		cc.test1();

	}
   public void test()
   {
	   System.out.println("test method");
   }
}
