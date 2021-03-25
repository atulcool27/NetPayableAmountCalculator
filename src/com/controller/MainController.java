package com.controller;

import java.util.Scanner;

import com.data.Affliate;
import com.data.Customer;
import com.data.Employee;

public class MainController {

	public static void main(String[] args) {
		
		
		String user = "";
		Employee emp = null;
		Affliate affliate = null;
		Customer cust = null;
		
		
		

		boolean checkUser = true;
		Scanner sc = new Scanner(System.in);
		
		//************ Checking the identity of User *************************************************
		
		if(checkUser) {
			System.out.println("Are you an Employee of Store(Y/N): ");
			String reply = sc.next();
			if(reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("Yes")) 
			{
				checkUser=false;
				user="Employee";
				emp = new Employee();
				emp.generateEmployeeInvoice();
			}
		}
		
		if(checkUser) {
			System.out.println("Are you an affliate of Store(Y/N): ");
			String reply = sc.next();
			if(reply.equalsIgnoreCase("Y")  || reply.equalsIgnoreCase("Yes")) 
			{
				checkUser=false;
				user="Affliate";
				affliate = new Affliate();
				affliate.generateEmployeeInvoice();
			}
		}
		
		int years = 0;
		
		if(checkUser) {
			System.out.println("So you are a Customer!");
			System.out.println("Can you tell! How long are you a customer of Store (Years in Number) : ");
			years = sc.nextInt();
			{
				checkUser=false;
				user="Customer";
				cust = new Customer();
				cust.generateEmployeeInvoice(years);
			}
		}
		
		//********************************************************************************************
		
		
		
	}

}
