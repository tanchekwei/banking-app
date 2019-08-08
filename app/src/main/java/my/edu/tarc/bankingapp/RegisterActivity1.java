package my.edu.tarc.bankingapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerCountry, spinnerCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register1);

        getSupportActionBar().setTitle("Register"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        HorizontalStepView stepView = (HorizontalStepView) findViewById(R.id.step_view);
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("Login\nDetail", Step.State.COMPLETED));
        stepList.add(new Step("Personal\n  Detail", Step.State.CURRENT));
        stepList.add(new Step("Emergency\n  Contact"));

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
        spinnerCountry = (Spinner) findViewById(R.id.spinnerState);

        spinnerCity = (Spinner) findViewById(R.id.spinnerBranch);

        spinnerCountry.setOnItemSelectedListener(this);
    }

    public void next(final View view) {
        Intent intent = new Intent(view.getContext(), RegisterActivity2.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onItemSelected(AdapterView<?> parent, View arg1, int pos,

                               long arg3) {

        parent.getItemAtPosition(pos);

        if (pos == 0) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.empty,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 1) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.kedah_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 2) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.kedah_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 3) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.kuala_lumpu_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 4) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.malacca_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 5) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.ns_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 6) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.pahang_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 7) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.penang_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 8) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.perak_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 9) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.perlis_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 10) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.sabah_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 11) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.sarawak_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 12) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.selangor_state,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        } else if (pos == 13) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.terengganu_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        }else if (pos == 14) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.kelantan_branch,

                            android.R.layout.simple_spinner_item);

            spinnerCity.setAdapter(adapter);

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
