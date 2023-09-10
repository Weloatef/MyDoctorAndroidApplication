package com.example.test;

public class Medicine
{
    public String name;

    public String dosage;

    public Medicine(){}

    public Medicine(String n,  String D)
    {
        this.name = n;

        this.dosage = D;
    }
    public Medicine(Medicine MM){
        this.name=MM.name;
        this.dosage=MM.dosage;
    }

    @Override
    public String toString() {
         return "The Medicine= " + name + "\n" +
                "Dosage= " + dosage ;
    }
}
