package my.edu.tarc.bankingapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class PayByAccountNumber1Activity extends AppCompatActivity {
    private EditText mEditTextAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_by_account_number1);

        getSupportActionBar().setTitle("Pay by Account Number"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        EditText editTextTAC = (EditText) findViewById(R.id.editText_amount);
        editTextTAC.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    Intent intent = new Intent(getBaseContext(), PayByAccountNumber2Activity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                return false;
            }
        });


        HorizontalStepView stepView = (HorizontalStepView) findViewById(R.id.step_view);
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("Beneficiary\n    Details", Step.State.CURRENT));
        stepList.add(new Step("Validation"));
        stepList.add(new Step("Completed"));

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


//        mEditTextAmount = findViewById(R.id.editText_amount);
//        mEditTextAmount.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!s.toString().startsWith("RM")) {
//                    mEditTextAmount.setText("RM");
//                    Selection.setSelection(mEditTextAmount.getText(), mEditTextAmount.getText().length());
//                }
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count,
//                                          int after) {
//            }
//        });


        //get the spinner from the xml.
//        Spinner dropdown = findViewById(R.id.spinner);
//create a list of items for the spinner.
//        String[] items = new String[]{"Public Bank", "Maybank", "CIMB Bank"};
////create an adapter to describe how the items are displayed, adapters are used in several places in android.
////There are multiple variations of this, but this is the basic variant.
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
////set the spinners adapter to the previously created one.
//        dropdown.setAdapter(adapter);

    }

    public void next(final View view){
        Intent intent = new Intent(view.getContext(), PayByAccountNumber2Activity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
