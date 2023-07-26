package basic;

public class WrapperDemo {

	public static void main (String args[]) {
		
		
		int i = 5;
		System.out.println(i);
		
		Integer ij = new Integer(5);
		System.out.println(ij.intValue());
		      // wrapper class
		
		
		
		
		
		
		
		String str = "4550";
		
		//int num = str;  not possible
		
		int num = Integer.parseInt(str);
		
		System.out.println(num);
	}
}
