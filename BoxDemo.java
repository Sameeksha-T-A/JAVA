public class BoxDemo{

	public static void main(String[] args) {
		
		//Box b1 = new Box(10, 20, 30);	
		Box b1 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;	

		Box b2 = new Box(10);
		//b2 = b1;
		//double vol =  b1.width * b1.height * b1.depth;
		double vol  = b1.getVolume();
		System.out.println("volume: " +vol);
		vol = b2.getVolume();
		System.out.println("volume: " +vol);
		/*//vol =  b2.width * b2.height * b2.depth;
		vol = b2.getVolume();
		System.out.println("volume: " +vol);*/
		/*b2.setDim(5, 6, 7);
		vol = b2.getVolume();
		System.out.println("volume: " +vol);*/

	}
}