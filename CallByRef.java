public class CallByRef{
	public static void main(String[] args) {
		
		int a =20, b =30;
		ArgumentPass ap = new ArgumentPass(a,b);
		System.out.println(ap.x +" "+ap.y);
		ArgumentPass temp = ap.meth2();
		System.out.println(ap.x +" "+ap.y);
		System.out.println(temp.x+" "+temp.y);
	}
}