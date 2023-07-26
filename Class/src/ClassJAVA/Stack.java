package ClassJAVA;

public class interface Stack {
	
	public void push (int item);
	public void pop ();
	
	public default void clear() {
		System.out.println("This is not implemented yet for " +this.toString());
	}
}
