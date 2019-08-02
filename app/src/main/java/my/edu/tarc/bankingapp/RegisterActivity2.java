package my.edu.tarc.bankingapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity2 extends AppCompatActivity {
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register2);
        btnNext = findViewById(R.id.btn_next);
        getSupportActionBar().setTitle("Register"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        HorizontalStepView stepView = (HorizontalStepView) findViewById(R.id.step_view);
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("Login\nDetail", Step.State.COMPLETED));
        stepList.add(new Step("Personal\n  Detail", Step.State.COMPLETED));
        stepList.add(new Step("Emergency\n  Contact", Step.State.CURRENT));

        stepView.setSteps(stepList).setTextSize(13)
                .setCompletedLineColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator完成线的颜色
                .setNotCompletedLineColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator未完成线的颜色
                .setCurrentStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator未完成线的颜色
                .setCompletedStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsView text完成线的颜色
                .setNotCompletedStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsView text未完成线的颜色
                .setNotCompletedStepIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.ic_radio_button_unchecked_blue_24dp))//设置StepsViewIndicator DefaultIcon
                .setCompletedStepIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.ic_check_circle_green_24dp))
                .setLineLength(50)
        ;
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(RegisterActivity2.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_register, null);
                Button btnOK = mView.findViewById(R.id.btn_OK);

                View customTitleView = getLayoutInflater().inflate(R.layout.dialog_header, null);
                TextView title = (TextView) customTitleView.findViewById(R.id.title);
                title.setText("Account created successfully");
                mBuilder.setCustomTitle(customTitleView);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                btnOK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                });
            }



        });
    }



}
