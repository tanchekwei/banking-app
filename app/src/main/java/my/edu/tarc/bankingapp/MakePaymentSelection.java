package my.edu.tarc.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MakePaymentSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment_selection);

        getSupportActionBar().setTitle("Make Payment"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
    }

    public void payByAccountNumber(final View view){
        Intent intent = new Intent(view.getContext(), PayByAccountNumber1Activity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void payByQR(final View view){
        Intent intent = new Intent(view.getContext(), PayByQRActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
