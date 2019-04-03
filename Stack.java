
class Stack
{
	private int[] stk;
	private int pos;

	public Stack()
	{
		stk = new int[5];
		pos = -1;
	}


	public int push(int data)
	{
		if(pos < 4)
		{
			stk[++pos] = data;
			return 1;
		}
		return -1;
	}

	public int pop()
	{
		if(pos > -1)
		{
			int data = stk[pos--];
			return 1;
		}

		return -1;
	}

}