package ClassJAVA;

public class MainStack {
	
	public static void main (String[] args) {
		
		Stack fixStack = new FixedStack(5);
		
		fixStack.push(5);
		fixStack.push(8);
		fixStack.push(11);
		fixStack.push(16);
		fixStack.push(20);
		fixStack.push(25);
		
		fixStack.clear();
		
		Stack dynamicStack = new DynamicStack();
		
		dynamicStack.clear();
	}

}
