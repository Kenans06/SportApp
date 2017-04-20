package com.example.gebruiker.sportapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        //Font path
        //String fontPath = "fonts/Roboto-Regular.ttf";

        // text view label
        TextView wrongPassword = (TextView) findViewById(R.id.wrongPassword);
        EditText email = (EditText) findViewById(R.id.emailInput);
        EditText password = (EditText) findViewById(R.id.passwordInput);
        final Button login = (Button) findViewById(R.id.loginNormal);
        Button loginGoogle = (Button) findViewById(R.id.loginGoogle);
        Button loginGuest = (Button) findViewById(R.id.loginGuest);
        TextView noAccount = (TextView) findViewById(R.id.noAccount);

        //Loading Font Face
        //Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        //Applying font
        //login.setTypeface(tf);
        //loginGoogle.setTypeface(tf);
        //wrongPassword.setTypeface(tf);
        //email.setTypeface(tf);
        //password.setTypeface(tf);
        //loginGuest.setTypeface(tf);
        //noAccount.setTypeface(tf);

        noAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,registration.class);
                startActivity(intent);
            }
        });

    }

}
