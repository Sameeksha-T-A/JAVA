class ArgumentPass{
	
	int x,y;
	ArgumentPass()
	{
		x = 10;
		y = 10;
	}
	ArgumentPass(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public void meth(int  a, int b){
		x = a;
		y =  b;
	}

	public void meth1(ArgumentPass obj){
		x = obj.x + 10;
		y = obj.y + 10;

	}
	public ArgumentPass meth2(){
		//ArgumentPass temp = new ArgumentPass(50, 60);
		ArgumentPass temp = new ArgumentPass();
		temp.x = temp.x + 20;
		temp.y = temp.y + 20;
		return temp;
	}



}