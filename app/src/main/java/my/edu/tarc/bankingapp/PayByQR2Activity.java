package my.edu.tarc.bankingapp;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PayByQR2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_by_qr2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(PayByQRActivity.EXTRA_ACCNO);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.tvAccNo);
        textView.setText(message);
    }
}
