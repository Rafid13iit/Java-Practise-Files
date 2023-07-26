package Main;

import Main.obj_parameter;

public class obj_parameter_application {
	
	public static void main(String[] args) {
		
		obj_parameter object1 = new obj_parameter(100, 88);
		obj_parameter object2 = new obj_parameter(100, 10);
		obj_parameter object3 = new obj_parameter(100, 10);
		
		
		System.out.println("\"Object1 = Object2\" this statement is " +object1.compare(object2));
		System.out.println("\"Object1 = Object3\" this statement is " +object1.compare(object3));
		System.out.println("\"Object2 = Object3\" this statement is " +object2.compare(object3));
	}
}