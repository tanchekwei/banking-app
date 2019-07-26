package my.edu.tarc.bankingapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class PayByAccountNumber3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_by_account_number3);


        getSupportActionBar().setTitle("Pay to Other Account"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout3);
        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(PayByAccountNumber3Activity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_save_favourite, null);

                Button buttonSave = (Button) mView.findViewById(R.id.buttonYes);
                Button buttonNo = (Button) mView.findViewById(R.id.buttonNo);

                buttonSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "Saved Successfully.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                });

                buttonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);

                    }
                });


                View customTitleView = getLayoutInflater().inflate(R.layout.dialog_header, null);
                TextView title = (TextView) customTitleView.findViewById(R.id.title);
                title.setText("Save to Favourite Account?");

                mBuilder.setCustomTitle(customTitleView);
                mBuilder.setView(mView);
//                mBuilder.setTitle("Save to Favourite Account?");
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });


        HorizontalStepView stepView = (HorizontalStepView) findViewById(R.id.step_view);
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("Beneficiary\n    Details", Step.State.COMPLETED));
        stepList.add(new Step("Validation", Step.State.COMPLETED));
        stepList.add(new Step("Completed", Step.State.COMPLETED));

        stepView.setSteps(stepList).setTextSize(13)
                .setCompletedLineColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator完成线的颜色
                .setNotCompletedLineColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator未完成线的颜色
                .setCurrentStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsViewIndicator未完成线的颜色
                .setCompletedStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsView text完成线的颜色
                .setNotCompletedStepTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.black))//set StepsView text未完成线的颜色
                .setNotCompletedStepIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.ic_radio_button_unchecked_blue_24dp))//设置StepsViewIndicator DefaultIcon
                .setCompletedStepIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.ic_check_circle_green_24dp))
                .setLineLength(60)
        ;
    }

    public void complete(final View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
