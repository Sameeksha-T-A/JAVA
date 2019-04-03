public class CallByValue{
	public static void main(String[] args) {
		
		int a =20, b =30;
		ArgumentPass ap = new ArgumentPass();
		System.out.println(a +" "+b);
		ap.meth(a, b);
		System.out.println(a +" "+b);


	}
}