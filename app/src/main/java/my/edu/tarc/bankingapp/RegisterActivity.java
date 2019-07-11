package my.edu.tarc.bankingapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Register"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        HorizontalStepView stepView = (HorizontalStepView) findViewById(R.id.step_view);
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("General\n   Info", Step.State.CURRENT));
        stepList.add(new Step("Contact\n Details"));
        stepList.add(new Step("Signature"));
        stepList.add(new Step("Validation")); // State defaults to NOT_COMPLETED
        stepList.add(new Step("Completed")); // State defaults to NOT_COMPLETED

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
    }
}
