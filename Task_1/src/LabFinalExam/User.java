package LabFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	
	int id;
	String fullName;
	String presentAddress;
	String userName;
	
	
	@Override
	public String toString() {
		return "\nUser [id=" + id + ", fullName=" + fullName + ", presentAddress=" + presentAddress + ", userName="
				+ userName + "]";
	}

	
	
	public User() {
		//default constructor
	}
	
	public User(int id, String fullName, String presentAddress, String userName) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.presentAddress = presentAddress;
		this.userName = userName;
	}



	public static Object valueOf(User person) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
