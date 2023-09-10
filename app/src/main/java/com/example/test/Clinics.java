package com.example.test;

import java.util.List;

public class Clinics implements payment
{
    private String name;
    private String Country;
    private String City;

    private List<Doctor> availableDoctors;
    private String AppointmentDate;
    private int avalaibleDocIndex=0;
    public Clinics(){}


    public Clinics(String name, String country, String city, List<Doctor> availableDoctors, Boolean aPrivate) {
        this.name = name;
        Country = country;
        City = city;

        this.availableDoctors = availableDoctors;

        Private = aPrivate;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }



    public List<Doctor> getAvailableDoctors() {
        return availableDoctors;
    }

    public void setAvailableDoctors(List<Doctor> availableDoctors) {
        this.availableDoctors = availableDoctors;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        AppointmentDate = appointmentDate;
    }

    public Boolean getPrivate() {
        return Private;
    }

    public void setPrivate(Boolean aPrivate) {
        Private = aPrivate;
    }

    Boolean Private;
    final static int openingTime = 9;
    final static int closingTime = 22;

    public void availableDoc(List<Doctor> availableDoctors)
    {

        for(int i=0; i< availableDoctors.size(); i++) {
            if (availableDoctors.get(i).available == true)
            {
                availableDoctors.add(availableDoctors.get(i)); // adds from the list of doctors
                                                            //to the new list of avail docs
            }
        }
    }

    public String displayInfo()
    {
        return "Name: "+name+ "\nLocation: "+ Country +"\nType: "+
                "\nOpening Time: "+ openingTime + "\nClosing Time: "+ closingTime;
    }


    String ScheduleAppointment(String Doc, String Date, int Time, String location,
                               boolean Emergency)
    {
        String r = "";
        while(Emergency == false)
        {
            if(openingTime<=Time && Time<=closingTime){
        for(int i =0; i<availableDoctors.size(); i++)
        {
            if(Doc != availableDoctors.get(i).toString())
                r= "Not available";
            else r=  "Doctor has been scheduled at"+location+Date+Time;
        }}
        else r = "Time entered is out of working hours";
        }
        r = "Doctor has been scheduled at"+location+ "at"+Date+"at"+Time;
        return r;
    }


    @Override
    public void calcCost()
    {
        for(int i=0;i< availableDoctors.size();i++) {
            if (Private) {
                availableDoctors.get(i).payment += 500;
            } else {
                availableDoctors.get(i).payment += 50;
            }
        }
    }


    public int getIndexDoc(){
        for(int i=0;i<MainActivity3.LDoctors.size();i++){
            if(MainActivity3.LDoctors.get(i).prescription.equals(MainActivity.Users.get(MainActivity.cnt).Medicines.get(0).name)){
                return i;

            }



        }
        return 0;

    }
    @Override
    public String toString() {
        return "Clinic= " + name + "\n" +
                "Country= " + Country + "\n" +
                "City= " + City + "\n" +
                "available doctors:\n " + availableDoctors.get(getIndexDoc()).toString()
                + "\n" +
                "private= " + Private + "\n" +
                "Opening Time= " + openingTime + "\n" +
                "Closing Time= " + closingTime + "\n";
    }
}
