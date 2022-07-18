package com.qspider.typecasting;

class amazonpay{
	void pay(String servicename) {
		System.out.println("pay to this service");
	}
	void pay(int cost) {
		System.out.println("cost of service");
	}
	void pay(boolean paidornot) {
		System.out.println("amount paid");
	}
	void pay(long mobileno) {
		
		System.out.println("enter no which u want");
	}
}

public class mainclass2 {

	public static void main(String[] args) {
	
		amazonpay res=new amazonpay();
		res.pay(56654645678l);
	}

}
