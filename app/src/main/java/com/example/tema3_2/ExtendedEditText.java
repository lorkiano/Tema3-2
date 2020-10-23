package com.example.tema3_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

public class ExtendedEditText extends EditText {

    private Paint p1, p2;
    private float escala;

    public ExtendedEditText(Context context) {
        super(context);
        inicializacion();
    }

    public ExtendedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializacion();
    }

    public ExtendedEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inicializacion();
    }

    private void inicializacion(){
        p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1.setColor(Color.WHITE);
        p1.setStyle(Paint.Style.FILL);

        p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p2.setColor(Color.BLACK);
        p2.setTextSize(40);
        escala = getResources().getDisplayMetrics().density;
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        //Llamamos al método de la clase base (EditText)
        super.onDraw(canvas);
        //Dibujamos el fondo negro del contador
        canvas.drawRect(this.getWidth()-40*escala,5*escala,this.getWidth()-5*escala,20*escala, p1) ;

        //Dibujamos el número de caracteres sobre el contador
        canvas.drawText("" + this.getText().toString().length(),this.getWidth()-28*escala,17*escala, p2);
    }

}
