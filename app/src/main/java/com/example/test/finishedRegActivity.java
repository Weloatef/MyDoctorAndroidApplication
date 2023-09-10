package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finishedRegActivity extends AppCompatActivity {

    TextView weightTxt;
    Button logoutBTN, ContBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_reg);

        weightTxt = (TextView) findViewById(R.id.weightCalc);
        logoutBTN = (Button)findViewById(R.id.logoutB);
        ContBTN = (Button) findViewById(R.id.Cont);

        Bundle incomingMessages = getIntent().getExtras();
        String nameE = "";
        float weightS;
        float heightS;
        if(incomingMessages!=null)
        {
            nameE = incomingMessages.getString("name");
            weightS = incomingMessages.getFloat("weight");
            heightS = incomingMessages.getFloat("height");

            String over_under_weight = "";
            if(weightS> (heightS-100))
            {
                if(weightS-40>(heightS-100))
                    over_under_weight = "OBESE";
                else if(weightS-30>(heightS-100))
                    over_under_weight = "EXTREMELY OVERWEIGHT";
                else if(weightS-20>(heightS-100))
                    over_under_weight = "OVERWEIGHT";
                else if(weightS-10>(heightS-100))
                    over_under_weight = "SLIGHTLY OVERWEIGHT";
                else if(weightS-5>(heightS-100))
                    over_under_weight = "A LITTLE OVERWEIGHT";
                else over_under_weight = "OF A HEALTHY WEIGHT";
            }
            else if(weightS<(heightS-100)) {
                if (weightS + 30 < (heightS - 100))
                    over_under_weight = "EXTREMELY UNDERWEIGHT";
                else if (weightS + 20 < (heightS - 100))
                    over_under_weight = "UNDERWEIGHT";
                else if (weightS + 10 < (heightS - 100))
                    over_under_weight = "SLIGHTLY UNDERWEIGHT";
                else if (weightS + 5 < (heightS - 100))
                    over_under_weight = "MILDLY UNDERWEIGHT";
                else over_under_weight = "OF A HEALTHY WEIGHT";
            }

            weightTxt.setText(nameE+",  Based On Our Precise Calculations We Found Out That You Are "+ over_under_weight);
        }


    }

    public void lO(View V)
    {
        Intent I = new Intent(this, MainActivity.class);
        startActivity(I);
    }

    public void CO(View V)
    {
        Intent I2 = new Intent(this, choosing.class);
        startActivity(I2);
    }
}




