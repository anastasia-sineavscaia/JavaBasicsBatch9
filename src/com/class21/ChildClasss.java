package com.class21;

public class ChildClasss extends Parent {
	int num1;
	int num2;
	public ChildClasss(int num1, int num2, String name) {
		super(num1, num2, name);
	}



	int average() {
		return super.add() / 2;
	}

	
}
