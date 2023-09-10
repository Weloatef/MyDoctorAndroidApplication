package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disease {
    public String Name;
    public Boolean Infectious;
    public List<String> SymptomsD =new ArrayList<>();
    public String Severity;
    public Medicine M;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getInfectious() {
        return Infectious;
    }

    public void setInfectious(Boolean infectious) {
        Infectious = infectious;
    }

    public List<String> getSymptomsD() {
        return SymptomsD;
    }

    public void setSymptomsD(List<String> symptomsD) {
        SymptomsD = symptomsD;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public Medicine getM() {
        return M;
    }

    public void setM(Medicine m) {
        M = m;
    }




    public boolean Checking(List<String> TEST){
        int cnt=0;
        for(int i=0;i<SymptomsD.size();i++){
            for(int z=0;z<TEST.size();z++){
                if(SymptomsD.get(i).equals(TEST.get(z)))
                    cnt++;

            }
        }
        return cnt >= 3;


    }
    public Disease(){}
    public Disease(String Name,boolean type,List<String> LIST,String Severity,Medicine MM)
    {
        SymptomsD = new ArrayList<>(LIST);
        this.Name = Name;
        Infectious = type;
        this.Severity = Severity;
        M=new Medicine(MM);
    }
    public Disease(Disease D)
    {
        this.Name=D.Name;
        this.Infectious=D.Infectious;
        this.SymptomsD=D.SymptomsD;
        SymptomsD=new ArrayList<>(D.SymptomsD);
    }


    @Override
    public String toString() {
        return "The Disease= " + Name + "\n" +
                "Infectious= " + Infectious + "\n" +
                "Severity= " + Severity + "\n" +
                M.toString();
    }
}
