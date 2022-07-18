package com.qspider.typecasting;

class adharcard {
	private int age;
	private String name;
	private long adnum;
	adharcard(int age,String name,long adnum){
		this.age=age;
		this.name=name;
		this.adnum=adnum;
	}
	
	public String getname() {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		return name;
	}
	public int getage() {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		return age;
	}
	public long getadnum() {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		return adnum;
	}
	public void setname(String str) {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		name=str;
	}
	public void setadnum(long b) {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		adnum=b;
	}
	public void setage(int a) {
		System.out.println("genarate the otp");
		System.out.println("verify the otp");
		age=a;
	}
}


public class goverment {

	public static void main(String[] args) {
	
		adharcard res= new adharcard(24,"ketan",43535345345l);
		System.out.println("age="+res.getage());
		System.out.println("name="+res.getname());
		System.out.println("adnum="+res.getadnum());
		res.setname("ketan2");
	    res.setadnum(76374324628l);
	    res.setage(45);
	    System.out.println("age="+res.getage());
		System.out.println("name="+res.getname());
		System.out.println("adnum="+res.getadnum());
	}

}
