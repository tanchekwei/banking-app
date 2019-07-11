package my.edu.tarc.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MakePaymentSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment_selection);

        getSupportActionBar().setTitle("Make Payment"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
    }
}
