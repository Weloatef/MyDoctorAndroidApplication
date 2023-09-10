

//>>>>>>>>>NOTE: TO LOGIN TO THE ADMIN ACCOUNT IN THE APP AND BE ABLE TO ADD AND REMOVE DISEASES/SYMPTOMS, USE THE USER NAME: "admin" AND PASSWORD: "admin"
package com.example.test;

import androidx.annotation.NonNull;

import com.example.test.Clinics;
import com.example.test.Disease;
import com.example.test.Doctor;
import com.example.test.Medicine;
import com.example.test.Patient;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person {

    public List<Disease> addDisease(@NonNull List<Disease> listAD, Disease d) //@NonNull is to check if the list is empty we don't have to do the function
    {   listAD.add(d);
        return listAD;
    }
    public List<Disease> removeDisease(@NonNull List<Disease> listRD, Disease d)
    {
        for(int i=0; i<listRD.size(); i++)
        {
            if(listRD.get(i)==d)
            {
                listRD.remove(i);
                break;
            }
        }

        return listRD;
    }


    public List<Doctor> addDoctor(@NonNull List<Doctor> listADoc, Doctor Doc)
    {
        listADoc.add(Doc);
        return listADoc;
    }
    public List<Doctor> removeDoctor(@NonNull List<Doctor> listRDoc, Doctor Doc)
    {
        for(int i=0; i<listRDoc.size(); i++)
        {
            if(listRDoc.get(i)==Doc)
            {
                listRDoc.remove(i);
                break;
            }
        }

        return listRDoc;
    }


    public List<Medicine> addMedicine(@NonNull List<Medicine> listAMed, Medicine Med)
    {
        listAMed.add(Med);
        return listAMed;
    }
    public List<Medicine> removeMedicine(@NonNull List<Medicine> listRMed, Medicine Med)
    {
        for(int i=0; i<listRMed.size(); i++)
        {
            if(listRMed.get(i)==Med)
            {
                listRMed.remove(i);
                break;
            }
        }

        return listRMed;
    }

    public List<Patient> addPatient(@NonNull List<Patient> listAPa, Patient Pa)
    {
        listAPa.add(Pa);
        return listAPa;
    }
    public List<Patient> removePatient(@NonNull List<Patient> listRPa, Patient Pa)
    {
        for(int i=0; i<listRPa.size(); i++)
        {
            if(listRPa.get(i)==Pa)
            {
                listRPa.remove(i);
                break;
            }
        }

        return listRPa;
    }



    public List<Clinics> addClinics(@NonNull List<Clinics> listAC, Clinics Cln)
    {
        listAC.add(Cln);
        return listAC;
    }

    public List<Clinics> removeClinics(@NonNull List<Clinics> listRC, Clinics Cln)
    {
        for(int i=0; i<listRC.size(); i++)
        {
            if(listRC.get(i)==Cln)
            {
                listRC.remove(i);
                break;
            }
        }

        return listRC;
    }

    public void INACTIVEPatient(Patient Pa, List<Patient> inactive)
    {
        int i = 0;
        while (i != 5 * 365) {
            if (i < 5 * 365)
                i++;
        }
        removePatient(inactive ,Pa);
    }

}
