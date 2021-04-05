package com.class25;

public class KhadijaTester {

	public static void main(String[] args) {
		//It is the parent class of all the classes that can 
		/*
		 * KFather obj1=new Khadija("Khadija"); obj1.eat(); obj1.sleep();
		 * 
		 * KFather obj2=new KFather("Mirza"); obj2.eat(); obj2.sleep();
		 * 
		 * KFather obj3=new Ozoda("Ozoda"); obj3.eat(); obj3.sleep();
		 */
		KFather[] kFatherArr = { new KFather("Mirza"), new Ozoda("Ozoda"), new Khadija("Khadija") };
		executeAllMethods(kFatherArr);
	}

	static void executeAllMethods(KFather kFather, Ozoda ozoda, Khadija khadija) {
		kFather.eat();
		kFather.sleep();
		ozoda.eat();
		ozoda.sleep();
		khadija.eat();
		khadija.sleep();
	}

	static void executeAllMethods(KFather[] kFatherArr) {
		for (KFather kFather : kFatherArr) {
			kFather.sleep();
			kFather.eat();
		}
	}

}
