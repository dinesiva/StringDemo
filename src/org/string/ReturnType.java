 package org.string;

public class ReturnType {
	
	static int accountOfRahul(int amount) {
		System.out.println("Amount from lender to rahul :" + amount);
		return amount+1000;
	}
	
	 static int accountOfHussian(int amount) {
		System.out.println("Amount from lender to hussian :" + amount);
		return amount+1000;
	}
	
	 static int accountOfVimal(int amount) {
		System.out.println("Amount from lender to vimal :" + amount);
		return amount+1000;
	}
	
	 static String accountOfDinesh(int amount) {
		System.out.println("Amount from lender to dinesh "+ amount);
		return "one more month";
	}
	 private int totalAmount(int accountOfRahul , int accountOfHussian , int accountOfVimal) {
		 int d = accountOfRahul + accountOfHussian + accountOfVimal;
		 return d;
	}
	 
	 private int add(int i, int j) {
		int k = i+j;
		 return k;
		}
	 private int multiply(int k) {
		 int l = k*2;
		 return l;
				 
	}
	
	public static void main(String[]args) {
		ReturnType r = new ReturnType();
		int accountOfRahul = r.accountOfRahul(10000);
		int accountOfHussian = r.accountOfHussian(10000);
		int accountOfVimal = r.accountOfVimal(10000);
		String accountOfDinesh = r.accountOfDinesh(((accountOfRahul) + (accountOfHussian) + (accountOfVimal))/2);
		
		System.out.println(accountOfDinesh);
		
		int totalAmount = r.totalAmount(11000, 11000, 11000);
		System.out.println(totalAmount);
		
		int add = r.add(100, 200);
		System.out.println(add);
		
		int multiply = r.multiply(add);
		System.out.println(multiply);
	}

	

}
