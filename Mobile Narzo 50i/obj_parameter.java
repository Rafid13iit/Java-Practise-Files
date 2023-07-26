package Main;

public class obj_parameter {
	
	int number1, number2;
	
	obj_parameter (int number1, int number2){
		
		this.number1 = number1;
		this.number2 = number2;
	}
	boolean compare(obj_parameter object){
		
		if (object.number1 == number1 && object.number2 == number2) return true;
		else return false;
	}
		
	
} 