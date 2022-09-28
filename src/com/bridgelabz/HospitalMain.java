package com.bridgelabz;

import java.util.Scanner;

public class HospitalMain {
    
	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		System.out.println("Welcome to Hospital Mangement System Program ");
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		// While loop for showing the menu until user not want to exit
		while(!exit) {
			System.out.println("\nEnter 1. Add Patient \nEnter 2. Show Patient \nEnter 3. Exit");
			int num = sc.nextInt();

			switch (num) {

			case 1:
				hospital.addPatient();
				break;

			case 2:
				hospital.showPatient();
				break;

			case 4:
				System.out.println("Exit !");
				exit = true;
				break;

			default:
				System.out.println("Enter the correct number !");
				break;
			}
		}
	}
}