public class StackImp{
	//instance variables
	private int top;
	private int stk[];

	//constructor
	StackImp(){
		stk = new int[10];
		top = -1;
	}

	public int push(int data){
		if(top<10){
			stk[++top] = data;
			return 1;
		}
		else{
			System.out.println("Full......");

		}
		return -1;
	}

	public int pop(){
		if(top>-1){
			int data = stk[top--];
			return 1;
		}

		return -1;
	}

}