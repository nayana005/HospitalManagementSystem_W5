package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

	ArrayList<Patient> patientArrayList = new ArrayList<>();
	private HashMap<String, ArrayList<Patient>> hospitalManagementSystem = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	// Method to add Patient
	public void addPatient() {

		Hospital hospital = new Hospital();
		Patient patient = new Patient();

		System.out.println("\nFor adding a new patient enter the following details");

		// Set the value of patient detail
		System.out.println("\nEnter Name ");
		patient.setPatientName(sc.next());
		System.out.println("Enter Age ");
		patient.setPatientAge(sc.next());
		System.out.println("Enter Phone No. ");
		patient.setPatientPhoneNumber(sc.nextLong());
		System.out.println("Enter City ");
		patient.setPatientCity(sc.next());
		System.out.println("Enter State ");
		patient.setPatientState(sc.next());
		System.out.println("Select Department: \n1.ONCOLOGY \n2.NEUROLOGY \n3.CARDIOLOGY \n4.GYNOCOLOGY");
		patient.setPatientDepartment(sc.next());

		// Stored the information in patientArrayList
		patientArrayList.add(patient);

		System.out.println("Enter hospital name");
		sc.nextLine();
		String hospitalName = sc.nextLine();

		// Checking the condition the book is existed or not
		if(hospitalManagementSystem.containsKey(hospitalName)) {
			ArrayList<Patient> patientList = hospitalManagementSystem.get(hospitalName);
			hospitalManagementSystem.put(hospitalName,patientList);
			System.out.println("Patient added successfully exiting hospital");
		}

		else {
			ArrayList<Patient> patientArrayList1 = hospitalManagementSystem.get(hospitalName);
			hospitalManagementSystem.put(hospitalName, patientArrayList1);
			System.out.println(hospitalName + " Created successfully");
			System.out.println("New patient added to the " + hospitalName);
		}
	}

	public void showPatient() {
	
		if(patientArrayList.size() > 0) {
			for (int i = 0; i < patientArrayList.size(); i++) {
				System.out.println("\n"+patientArrayList);
				break;
			}
		}
		else
			System.out.println("No more Patients !");
	}
		
}

