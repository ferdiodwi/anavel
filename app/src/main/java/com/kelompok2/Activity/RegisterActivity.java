package com.kelompok2.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kelompok2.anavel.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    EditText edtBirthdate, edtFullName, edtUsername, edtEmail, edtPassword, edtPhone, edtAddress ;
    Spinner spinner;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;
    TextView btnLoginRegister;
    Button btnRegister;

    private EditText mViewUser, mViewPassword, mViewRepassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mViewUser = findViewById(R.id.et_emailSignup);
        mViewPassword = findViewById(R.id.et_passwordSignup);
        mViewRepassword = findViewById(R.id.et_passwordSignup2);

        mViewRepassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
                    razia();
                    return true;
                }
                return false;
            }
        });

        findViewById(R.id.button_signupSignup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                razia();
            }
        });


        findViewById(R.id.button_signupSignup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }



    private void razia() {
        mViewUser.setError(null);
        mViewPassword.setError(null);
        mViewRepassword.setError(null);
        View fokus = null;
        boolean cancel = false;

        String user = mViewUser.getText().toString();
        String password = mViewPassword.getText().toString();
        String repassword = mViewRepassword.getText().toString();

        if (TextUtils.isEmpty(user)) {
            mViewUser.setError("This field is required");
            fokus = mViewUser;
            cancel = true;
        } else if (cekUser(user)) {
            mViewUser.setError("This Username is already exist");
            fokus = mViewUser;
            cancel = true;
        }

        if (TextUtils.isEmpty(password)) {
            mViewPassword.setError("This field is required");
            fokus = mViewPassword;
            cancel = true;
        } else if (!cekPassword(password, repassword)) {
            mViewRepassword.setError("This password is incorrect");
            fokus = mViewRepassword;
            cancel = true;
        }

        if (cancel) {
            fokus.requestFocus();
        } else {
            preference.setRegisteredUser(getBaseContext(), user);
            preference.setRegisteredPass(getBaseContext(), password);
            finish();
        }
    }

    private boolean cekPassword(String password, String repassword) {
        return password.equals(repassword);
    }

    private boolean cekUser(String user) {
        return user.equals(preference.getRegisteredUser(getBaseContext()));
    }
}

//        findViewById
//        dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
//        btnLoginRegister = findViewById(R.id.button_signupSignup);
//        btnRegister = findViewById(R.id.btn_register_register);



//        edtBirthdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showDateDialog();
//            }
//        });
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Select gender");
//        arrayList.add("Laki-Laki");
//        arrayList.add("Perempuan");
//        ArrayAdapter<String> adapter =
//                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
//        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
//        spinner.setAdapter(adapter);
//
//        DatePickerDialog datePickerDialog;
//        SimpleDateFormat dateFormatter;


//        btnLoginRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent login = new Intent(RegisterActivity.this, LoginActivity.class);
//                startActivity(login);
//                finish();
//            }
//        });


//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
//                startActivity(register);
//            }
//        });





//    private void showDateDialog() {
//        Calendar calendar = Calendar.getInstance();
//
//        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
//                Calendar newDate = Calendar.getInstance();
//                newDate.set(year, month, dayOfMonth);
//                edtBirthdate.setText(dateFormatter.format(newDate.getTime()));
//            }
//        },calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
//        datePickerDialog.show();
//
//    }
