package com.example.tema3_2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ControlLogin extends LinearLayout {
    private EditText textousuario;
    private EditText textopassword;
    private Button botonlogin;
    private TextView labellogin;
    private OnLoginListener onloginlistener;

    public ControlLogin(Context context){
        super(context);
        inicializar();
    }
    public ControlLogin(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    private void asignarEventos(){
        botonlogin.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                onloginlistener.onLogin(textousuario.getText().toString(), textopassword.getText().toString());
            }
        });
    }

    private void inicializar(){
        //usamos el layout control_login
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li=(LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.acceso_example, this, true);

        //obtenemos referencias
        textousuario= (EditText)findViewById(R.id.editTextNombre);
        textopassword=(EditText)findViewById(R.id.editTextPassword);
        botonlogin=(Button)findViewById(R.id.btnLogin);
        labellogin=(TextView)findViewById(R.id.textViewAcceso);

        //asociamos eventos
        asignarEventos();
    }

    public void setMensaje(String Mensaje){
        labellogin.setText(Mensaje);
    }

    public void setOnLoginListener(OnLoginListener oll){
        onloginlistener=oll;
    }
}
