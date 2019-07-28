package my.edu.tarc.bankingapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity{
    Button btnNext;
    TextView txtViewReg;
    EditText editTextUsername;
    RadioButton radioButtonYes, radioButtonNo;
    EditText editTextPw;
    TextInputLayout textInputLayoutUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnNext = findViewById(R.id.btn_next);
        txtViewReg = findViewById(R.id.textView_reg);
        editTextUsername = findViewById(R.id.editText_username);
        textInputLayoutUserID = findViewById(R.id.inputLayout_username);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();

                if(username.isEmpty() == true){
                    //Toast.makeText(getApplicationContext(), "Please enter your user ID.", Toast.LENGTH_SHORT).show();
                    textInputLayoutUserID.setError("Please enter your User ID.");
                }else{
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(LoginActivity.this);
                    final View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);
                    Button btnLogin = mView.findViewById(R.id.btn_login);

                    mBuilder.setView(mView);
                    AlertDialog dialog = mBuilder.create();
                    dialog.show();

                    radioButtonYes = mView.findViewById(R.id.radioBtn_yes);
                    radioButtonNo = mView.findViewById(R.id.radioBtn_no);
                    editTextPw = mView.findViewById(R.id.editText_password);

                    radioButtonYes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editTextPw.setFocusable(true);
                            editTextPw.setClickable(true);
                            editTextPw.setFocusableInTouchMode(true);
                        }
                    });

                    radioButtonNo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intentLogin = new Intent(v.getContext(), LoginActivity.class);
                            intentLogin.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intentLogin);
                        }
                    });

                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                    });
                }

            }



        });

        txtViewReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegisterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });




    }




//    public void login(final View view) {
//        Intent intent = new Intent(view.getContext(), MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent);
//    }
//
//    public void register(final View view) {
//        Intent intent = new Intent(view.getContext(), RegisterActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent);
//    }

    }
