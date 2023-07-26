package ClassJAVA;

public class FixedStack implements Stack {
	
	private int[] stack;
	
	public FixedStack (int size) {
		this.stack = new int[size];
	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		stack[stack.length-1] = item;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
