package my.edu.tarc.bankingapp;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PayByQR2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_by_qr2);

        getSupportActionBar().setTitle("Pay by QR Code"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        Intent intent = getIntent();
        final String msg_accno = intent.getStringExtra(PayByQRActivity.EXTRA_ACCNO);
        final String msg_recip = intent.getStringExtra(PayByQRActivity.EXTRA_RECIP);

        // Capture the layout's TextView and set the string as its text
        TextView tvAccNo = findViewById(R.id.tvAccNo);
        TextView tvRecip = findViewById(R.id.tvRecipient);
        tvAccNo.setText(msg_accno);
        tvRecip.setText(msg_recip);

//        Button btnConfirmPay = findViewById(R.id.btnConfirmPay);
//
//        btnConfirmPay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(PayByQR2Activity.this);
//                View mView = getLayoutInflater().inflate(R.layout.dialog_payment, null);
//                Button btnClose = mView.findViewById(R.id.btnOK);
//
//                TextView tvPaySuccessMsg = findViewById(R.id.tvPaySuccessMsg);
//                EditText tvAmt = findViewById(R.id.tvAmt);
//                double amt = Double.parseDouble(tvAmt.getText().toString());
//                String paySuccessMsg = String.format("Successfully transfered RM %.2f to %s (%s).", amt, msg_recip, msg_accno);
//                tvPaySuccessMsg.setText(paySuccessMsg);
//
//                mBuilder.setView(mView);
//                AlertDialog dialog = mBuilder.create();
//                dialog.show();
//
//                btnClose.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(v.getContext(), MainActivity.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(intent);
//                    }
//                });
//                finish();
//            }
//
//
//
//        });
    }

    public void sendTAC(final View view) {
        EditText editTextTAC = (EditText) findViewById(R.id.tvTAC);
        editTextTAC.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);

        Snackbar.make(view, "TAC sent to 010-656XXXX", Snackbar.LENGTH_LONG).show();
//        Toast.makeText(view.getContext(), "TAC sent!", Toast.LENGTH_LONG).show();
    }

    public void next(final View view) {
        Intent intent = new Intent(view.getContext(), PayByQR3Activity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
