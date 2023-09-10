package com.example.test;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    String[] Symptomss = {"• Runny nose","• a sore throat","• headaches","• muscle aches","• coughs","• sneezing","• a raised temperature","• pressure in your ears and face","• loss of taste and smell","• Eye irritation","• Stuffy nose","• Puffy, watery eyes","• Inflamed, itchy nose and throat","• watery, loose stools","• frequent bowel movements","• cramping or pain in the abdomen, nausea, bloating"
            ,"• possibly fever or bloody stools",". fever",". tiredness",". loss of taste or smell",". sore throat",". headache",". aches and pains",". a rash on skin, or discolouration of fingers or toes",". red or irritated eyes","• Blood vessel disease, such as coronary artery disease"," Heart rhythm problems (arrhythmias)","• Heart defects you're born with ","• Heart valve disease","• Disease of the heart muscle","• Fatigue","• Lump or area of thickening","• Weight changes, including unintended loss or gain","• Skin changes, such as yellowing","• Changes in bowel or bladder habits","• Persistent cough or trouble breathing","• Difficulty swallowing","• Persistent indigestion or discomfort after eating","• Persistent, unexplained muscle or joint pain","• Unexplained bleeding or bruising","• forget about recent conversations or events","• misplace items","• forget the names of places and objects","• have trouble thinking of the right word","• show poor judgement","• ask questions repetitively","• become less flexible","• Urinate (pee) a lot, often at night","• Are very thirsty","• Lose weight without trying","• Are very hungry","• Have blurry vision","• Have numb or tingling hands or feet","• Have very dry skin"};
    Disease D1,D2,D3,D4,D5,D6,D7,D8;
    String[]S1={"• Runny nose","• a sore throat","• headaches","• muscle aches","• coughs","• sneezing","• a raised temperature","• pressure in your ears and face","• loss of taste and smell"};
    String[]S2={"• Eye irritation","• Stuffy nose","• Puffy, watery eyes","• Inflamed, itchy nose and throat"};
    String[]S3={"• watery, loose stools","• frequent bowel movements","• cramping or pain in the abdomen, nausea, bloating","• possibly fever or bloody stools"};
    String[]S4={". fever",". tiredness",". loss of taste or smell",". sore throat",". headache",". aches and pains",". a rash on skin, or discolouration of fingers or toes",". red or irritated eyes"};
    String[]S5={"• Blood vessel disease, such as coronary artery disease"," Heart rhythm problems (arrhythmias)","• Heart defects you're born with ","• Heart valve disease","• Disease of the heart muscle"};
    String[]S6={"• Fatigue","• Lump or area of thickening","• Weight changes, including unintended loss or gain","• Skin changes, such as yellowing","• Changes in bowel or bladder habits","• Persistent cough or trouble breathing","• Difficulty swallowing","• Persistent indigestion or discomfort after eating","• Persistent, unexplained muscle or joint pain","• Unexplained bleeding or bruising"};
    String[]S7={"• Poor Memory","• Forgetting about recent events","• forget the names of places and objects","• have trouble thinking of the right word","• show poor judgement","• ask questions repetitively","• become less flexible"};
    String[]S8={"• Urinate (pee) a lot, often at night","• Frequent feeling of thirst","• Loss of weight","• Frequent feeling of hunger","• Have blurry vision","• Have numb or tingling hands or feet","• Have very dry skin"};
    List<String> Cold=new ArrayList<>();
    List<String> Allegry=new ArrayList<>();
    List<String> Diarrhea=new ArrayList<>();
    List<String> Coronavirus=new ArrayList<>();
    List<String> Heart_disease=new ArrayList<>();
    List<String> Cancer=new ArrayList<>();
    List<String>  Alzehimer=new ArrayList<>();
    List<String> Diabetes =new ArrayList<>();
    Medicine M1,M2,M3,M4,M5,M6,M7,M8;
    Doctor Doc1,Doc2,Doc3,Doc4,Doc5,Doc6,Doc7,Doc8;
    Clinics C1,C2,C3;

    static List<String> Symptoms=new ArrayList<>();
   static List<Doctor> LDoctors=new ArrayList<>();
    List<Clinics> Clinics_Data=new ArrayList<>();

   static List<String> SymptomsOfUser =new ArrayList<>();

    TextView T;
    ArrayAdapter adap;
    ListView Listv;
    Button Add;
    Button CheckupBT;
    int old=-1;
    int cnt=0;
    int xml;
    int POS=0;
    boolean IS=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        Collections.addAll(Symptoms,Symptomss);
        Collections.addAll(Cold,S1);
        Collections.addAll(Allegry,S2);
        Collections.addAll(Diarrhea,S3);
        Collections.addAll(Coronavirus,S4);
        Collections.addAll(Heart_disease,S5);
        Collections.addAll(Cancer,S6);
        Collections.addAll(Alzehimer,S7);
        Collections.addAll(Diabetes,S8);
        M1=new Medicine("Comtrex","2 caplets every 6 hours");
        M2=new Medicine("Telfast ","180mg once daily");
        M3=new Medicine("Loperamide","6-8 mg daily");
        M4=new Medicine("Unknown","Unknown");
        M5=new Medicine("Clonidine","0.1 milligram (mg) two times a day");
        M6=new Medicine("Unknown","Unknown");
        M7=new Medicine("Donepezil","A dose of 10 mg once a day\n");
        M8=new Medicine("Amaryl","1 mg or 2 mg once daily");

        D1=new Disease("Cold",true,Cold,"Mild",M1);
        D2=new Disease("Allegry",true,Allegry,"Mild",M2);
        D3=new Disease("Diarrhea",false,Diarrhea,"Mild",M3);
        D4=new Disease("Coronavirus",true,Coronavirus,"Mild",M4);
        D5=new Disease("Heart_disease",true,Heart_disease,"Critical",M5);
        D6=new Disease("Cancer",true,Cancer,"Critical",M6);
        D7=new Disease("Alzehimer",true,Alzehimer,"Mild",M7);
        D8=new Disease("Diabetes",true,Diabetes,"Mild",M8);
        MainActivity.Disease_Data.add(D1);
        MainActivity.Disease_Data.add(D2);
        MainActivity.Disease_Data.add(D3);
        MainActivity.Disease_Data.add(D4);
        MainActivity.Disease_Data.add(D5);
        MainActivity.Disease_Data.add(D6);
        MainActivity.Disease_Data.add(D7);
        MainActivity.Disease_Data.add(D8);
        Doc1=new Doctor("Comptrex",5,true);
        Doc1.name="Mohamed Ali";Doc1.age="31";Doc1.Gender="Male";Doc1.mail="Mohamed.ali6@gmail.com";Doc1.phone_number="01157485977";
        Doc1.calcCost();
        Doc2=new Doctor("Telfast",10,true);
        Doc2.name="Samer Ahmed";Doc2.age="44";Doc2.Gender="Male";Doc2.mail="Samer_ahmed@gmail.com";Doc2.phone_number="010564722234";
        Doc2.calcCost();
        Doc3=new Doctor("Loperamide",15,true);
        Doc3.name="Layla Atef";Doc3.age="28";Doc3.Gender="Female";Doc3.mail="Layllla-Aaatef@gmail.com";Doc3.phone_number="01245674743";
        Doc3.calcCost();
        Doc4=new Doctor("Unknown",7,true);
        Doc4.name="khaled awad";Doc4.age="66";Doc4.Gender="Male";Doc4.mail="Khalooda88@gmail.com";Doc4.phone_number="01047576834";
        Doc4.calcCost();
        Doc5=new Doctor("Clonidine",20,true);
        Doc5.name="Shahenda amir";Doc5.age="52";Doc5.Gender="Female";Doc5.mail="Shahenda.amir342@gmail.com";Doc5.phone_number="01172626789";
        Doc5.calcCost();
        Doc6=new Doctor("Unknown",20,true);
        Doc6.name="Paula Rezk";Doc6.age="32";Doc6.Gender="Male";Doc6.mail="Paula.rezk10@gmail.com";Doc6.phone_number="01027467532";
        Doc6.calcCost();
        Doc7=new Doctor("Donepezil",9,true);
        Doc7.name="Mirna Ahmed";Doc7.age="28";Doc7.Gender="Female";Doc7.mail="Mirnaa.Ahmed3@gmail.com";Doc7.phone_number="010574856371";
        Doc7.calcCost();
        Doc8=new Doctor("Amaryl",13,true);
        Doc8.name="Sylvia Anter";Doc8.age="29";Doc8.Gender="Female";Doc8.mail="Sylviia-Anteer@gmail.com";Doc8.phone_number="01276890121";
        Doc8.calcCost();
        LDoctors.add(Doc1);
        LDoctors.add(Doc2);
        LDoctors.add(Doc3);
        LDoctors.add(Doc4);
        LDoctors.add(Doc5);
        LDoctors.add(Doc6);
        LDoctors.add(Doc7);
        LDoctors.add(Doc8);

        C1=new Clinics("Medica Care","Egypt","ELmo2atem",LDoctors,true);
        C1.calcCost();
        C2=new Clinics("Sehha","Egypt","Sheraton",LDoctors,false);
        C2.calcCost();
        C3=new Clinics("Degla Medical Center","Egypt","Nasr City",LDoctors,true);
        C3.calcCost();
        Clinics_Data.add(C1);
        Clinics_Data.add(C2);
        Clinics_Data.add(C3);
        Add=(Button)findViewById(R.id.Chekcup);
        CheckupBT=(Button)findViewById(R.id.CheckPBt);

        Listv=(ListView) findViewById(R.id.list);
        T=(TextView)findViewById(R.id.textView4);
        xml= com.google.android.material.R.layout.support_simple_spinner_dropdown_item;
        adap=new ArrayAdapter(MainActivity3.this,xml, Symptoms);
        Listv.setAdapter(adap);
        Listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


              Listv.setSelector(R.color.teal_200);
              POS=position;
              IS=true;




            }

        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(IS){
                Saving(POS);
                Listv.setSelector(R.color.white);
                    IS=false;}

                else{
                    if(cnt!=5)
                    T.setText("Please select Symptom");
                    else
                        T.setText("You have reached max amount of Symptoms pls go to hospital");
                }

            }
        });
        CheckupBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Checking();

            }
        });




    }

    public void Saving(int Position){

        if(cnt<5){
        SymptomsOfUser.add((String)adap.getItem(Position));
        T.setText(SymptomsOfUser.get(cnt));
        adap.remove(adap.getItem(Position));
        cnt++;
        }
    }
    public void Checking(){
        MainActivity.Users.get(MainActivity.cnt).SymptomsP=new ArrayList<>(SymptomsOfUser);
        MainActivity.Users.get(MainActivity.cnt).addDisease(SymptomsOfUser,MainActivity.Disease_Data);
        MainActivity.Users.get(MainActivity.cnt).Matching(Clinics_Data);
        Intent I= new Intent(this,LastActivity.class);
        startActivity(I);

    }

}