public class StackDemo
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		assert(st.push(10) == 1);
		assert(st.push(20) == 1);
		assert(st.push(30) == 1);
		assert(st.push(40) == 1);
		assert(st.push(50) == 1);
		assert(st.push(60) == 1);

		assert(st.pop() == 1);
		assert(st.pop() == 1);
		assert(st.pop() == 1);
		assert(st.pop() == 1);
		assert(st.pop() == 1);
		assert(st.pop() == -1);
	
	}
}