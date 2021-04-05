package com.class23;

public class Azizi {
	
		void marry() {
			System.out.println("My boy will marry the girl that me and my wife will " + " choose for him");
		}
		
		public static void main(String[] args) {
			Son1 son1 = new Son1();
			son1.marry();
			Son2 son2 = new Son2();
			son2.marry();
		}
	}
		class Son1 extends Azizi {
		}
		class Son2 {
			void marry() {
				System.out.println(" i want to marry Taylor Swift");
			}
		
	}
	
