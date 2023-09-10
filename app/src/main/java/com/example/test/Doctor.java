package com.example.test;

import java.util.ArrayList;

public class Doctor extends Person implements payment
{
    String prescription;
    String Speciality;
    int YearsOfExp;
    int payment;

    boolean available;

    public int getYearsOfExp() {
        return YearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        YearsOfExp = yearsOfExp;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }


    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }



    public Doctor()
    {
    }

    public Doctor(String presc,  int yrsofexp,  boolean avail)
    {
        super();
        this.prescription = presc;
        this.YearsOfExp = yrsofexp;


        this.available = avail;
    }

    public String displayInfo()
    {
        return prescription+Speciality+YearsOfExp+payment;
    }

    @Override
    public void calcCost() {
        for(int i=1; i<YearsOfExp; i++)
        {
            payment += 100;
        }

    }


    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Gender= " + Gender + "\n" +
                "Mail= " + mail + "\n" +
                "Phone Number= " + phone_number + "\n" +
                "Years of experience= " + YearsOfExp + "\n" +
                "Payment= " + payment  ;
    }
}
