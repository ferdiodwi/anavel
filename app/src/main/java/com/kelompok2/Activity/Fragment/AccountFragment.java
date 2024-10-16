package com.kelompok2.Activity.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kelompok2.Activity.LoginActivity;
import com.kelompok2.Activity.preference;
import com.kelompok2.anavel.R;


public class AccountFragment extends Fragment {

    Button btnlogout;
    TextView txtNamaProfil;
    EditText edtEmail;




    public void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        btnlogout = (Button) view.findViewById(R.id.button_logoutMain);
        txtNamaProfil  = (TextView) view.findViewById(R.id.profile);
        edtEmail = (EditText) view.findViewById(R.id.edt_email_address);

//        txtNamaProfil.setText(preference.getLoggedInUser(getContext()));
        edtEmail.setText(preference.getLoggedInUser(getContext()));

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Hallo ini Button Logout", Toast.LENGTH_SHORT).show();
                preference.clearLoggedUser(getContext());
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                requireActivity().finish();
            }
        });

        return view;
    }
}