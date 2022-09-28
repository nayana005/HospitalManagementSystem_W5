package com.bridgelabz;

import java.util.Scanner;

public class Patient {
    String patientName;
    String patientAge;
    long patientPhoneNumber;
    String patientCity;
    String patientState;
    String patientDepartment;

    Scanner sc = new Scanner(System.in);
    public enum PatientDepartment{
        ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public long getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(long patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public String getPatientDepartment() {
        return patientDepartment;
    }

    public void setPatientDepartment(String patientDepartment) {
        this.patientDepartment = patientDepartment;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", patientCity='" + patientCity + '\'' +
                ", patientState='" + patientState + '\'' +
                ", patientDepartment=" + patientDepartment +
                '}';
    }
}
