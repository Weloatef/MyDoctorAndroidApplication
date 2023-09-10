package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person{
    public String UserN;
    public String UserP;

    public List<String> SymptomsP=new ArrayList<>();

    public List<Disease> DiseasesP =new ArrayList<>();

    public List<Medicine> Medicines=new ArrayList<>();
    public List<Clinics> ClinicsP=new ArrayList<>();
    public float height;
    public float weight;
    public String Country;
    public String City;


    public boolean checkoverweight(int w,int h)
    {
        return (h - 100)  >= w;
    }

    public Patient()
    {super();}

    //infoscreen1
    public void addData1(String n, String age, String g, String m, String phoneN){
       this.name = n;
       this.age = age;
       this.Gender = g;
       this.mail = m;
       this.phone_number = phoneN;
    }

    //infoscreen2
    public void addData2(float h, float w, String country, String city)
    {
        this.height = h;
        this.weight =w;
        this.Country = country;
        this.City = city;
    }

    public Patient(String UserN,String UserP){
    this.UserN=UserN;
    this.UserP=UserP;
    }


    public void addDisease(List<String> SymptomsOfUser,List<Disease> Disease_Data){
        for(int i=0;i<Disease_Data.size();i++){
          if(  Disease_Data.get(i).Checking(SymptomsOfUser)){
              DiseasesP.add(Disease_Data.get(i));//ba7ot el marad fe patient
              Medicines.add(Disease_Data.get(i).M);//ba7ot medicine bta3 el marad fy patient

          }
        }



}
    public void Matching(List<Clinics> Clinic_Data) {
        boolean x=true;
        for (int i = 0; i < Clinic_Data.size(); i++)
        {
            if(Clinic_Data.get(i).getCountry().equals(this.Country))
            {
                if(Clinic_Data.get(i).getCity().equals(this.City))
                {
                    ClinicsP.add(Clinic_Data.get(i));
                    x=false;
                    break;
                }
            }
        }
        if(x) {
            Clinics temp = new Clinics("There is no Available Clinics",null,null,MainActivity3.LDoctors,false);
            ClinicsP.add(temp);
        }
    }


    @Override
    public String toString() {
        return "Patient Details" + "\n" +
                "UserName= " + UserN + "\n" +
                DiseasesP.get(DiseasesP.size()-1).toString() + "\n" +
                ClinicsP.get(ClinicsP.size()-1).toString();
    }
}


