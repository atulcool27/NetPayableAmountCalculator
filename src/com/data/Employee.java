package com.data;

import java.util.Scanner;

public class Employee {
	
	
	private float percentageDiscount;
	private float flatDiscount;
	private Scanner sc;


	public Employee() {
		sc = new Scanner(System.in);
	}
	
	
	
	

	public void generateEmployeeInvoice() {
		
		float groceries = getGroceries();
		float non_groceries = getNonGroceries();
		
		float discount = getDiscount(groceries,non_groceries);
		
		generateInvoice(groceries,non_groceries,discount);
		
		
	}
	
	
	
	
	private void generateInvoice(float groceries, float non_groceries, float discount) {
		System.out.println(" Your FINAL INVOICE AMOUNT : "+(groceries+non_groceries-discount));
	}
	

	public float getGroceries() {
		System.out.println("Enter Amount(Rs) of Groceries Bought : ");
		return sc.nextFloat();
	}
	
	
	public float getNonGroceries() {
		System.out.println("Enter Amount(Rs) of Non-Groceries Bought : ");
		return sc.nextFloat();
	}
	
	
	public float getDiscount(float groceries, float non_groceries) {
		float total = groceries + non_groceries;

		flatDiscount = (int) (total / 100) * 9;

		percentageDiscount = non_groceries * 0.3f;

		System.out.println(" Your Total(MRP) Amount is : " + total);

		if (flatDiscount > percentageDiscount) {
			System.out.println(" Your flat Discount is : " + flatDiscount);
			return flatDiscount;
		} else {
			System.out.println(" Your total Discount is : " + percentageDiscount);
			return percentageDiscount;
		}
	}
	

}
