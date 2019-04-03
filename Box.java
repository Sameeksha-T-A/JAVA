public abstract final class Box extends super implements interfaces {

		double width;
		double height;
		double depth;

		Box(){
			width = 2;
			height = 3;
			depth = 6;
		}
		Box(double width, double height, double depth){
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		Box(double len){
			width = height = depth = len;
		}

		Box(Box add){
			width = add.width;
		}
		//member method
		double getVolume(){

			return width*height*depth;
		}	
		double getVolume(double w, double h, double d){

			return width*height*depth;
		}	
		/*void setDim( double w, double h, double d)  {
			width = w;
			height = h;
			depth = d;
		}*/

}

