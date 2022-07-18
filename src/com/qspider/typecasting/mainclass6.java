package com.qspider.typecasting;

class giftbox{
	
	void gift() {
		System.out.println("gift wrapped");
	}
}
class gift extends giftbox{
	void tshirt() {
		System.out.println("gift contains mobile");
	}
	void tshirtcolour() {
		System.out.println("mobile colour");
	}
	
}

public class mainclass6 {

	public static void main(String[] args) {

		giftbox res= new gift();
		res.gift();
		
	}

}
