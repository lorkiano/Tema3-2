package com.example.tema3_2;

import android.app.Activity;
import android.os.Bundle;
import android.service.controls.Control;

import androidx.annotation.Nullable;

public class AccesoActivity extends Activity {
    private ControlLogin controldelogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceso_example);

        //controldelogin = (ControlLogin)findViewById(R.id);
        controldelogin.setOnLoginListener(new OnLoginListener(){
            @Override
            public void onLogin(String usuario, String password){
                //se valida si coinciden los usuarios
                if (usuario.equals("UCAM") && password.equals("1234"))
                    controldelogin.setMensaje("Acceso concedido");
                else
                    controldelogin.setMensaje("No tiene acceso");
            }
        });
    }
}
