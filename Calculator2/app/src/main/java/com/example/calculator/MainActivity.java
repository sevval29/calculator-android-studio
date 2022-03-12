package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isnewop = true;
    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
EditText ed1;
TextView result;
Button button9,button8,button7,button6,button5,button4,button3,button2,button1,button0,budot,buplusminus;//ı defined all buttons textviev and edittext
Button btndivide, btnac, bumultiply,buplus,buminus,buremind,buequal,bu20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editText); //ı defined ids
        result=findViewById(R.id.result);
        button9=findViewById(R.id.bu9);
        button8=findViewById(R.id.bu8);
        button7=findViewById(R.id.bu7);
        button6=findViewById(R.id.bu6);
        button5=findViewById(R.id.bu5);
        button4=findViewById(R.id.bu4);
        button3=findViewById(R.id.bu3);
        button2=findViewById(R.id.bu2);
        button1=findViewById(R.id.bu1);
        button0=findViewById(R.id.bu0);
        budot=findViewById(R.id.budot);
        buplusminus=findViewById(R.id.buplusminus);
        btndivide=findViewById(R.id.budivide);
        btnac=findViewById(R.id.buAC);
        buminus=findViewById(R.id.buminus);
        buplus=findViewById(R.id.buplus);
        bumultiply=findViewById(R.id.bumultiply);
        buremind=findViewById(R.id.buremind);
        buequal=findViewById(R.id.buequal);
        bu20=findViewById(R.id.bu20);

        if(isnewop)
            ed1.setText(" "); //this destroy first zero
        isnewop = false;


        
        buplusminus.setOnClickListener(new View.OnClickListener() {  //I wrote this to make it work when we press the button
            @Override
            public void onClick(View v) {
                ed1.setText("-" + ed1.getText() );
            }
        });

   button1.setOnClickListener(new View.OnClickListener() { //buttonun çalışmasını sağlar 1 yazdığımızda ekrana 1 yazar
        @Override
        public void onClick(View v) {
            ed1.setText(ed1.getText() + "1");
        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText(ed1.getText() + "2");
        }
    });

        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText(ed1.getText() + "3");
        }
    });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });

        bu20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(this, "ödev1", Toast.LENGTH_SHORT).show();
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() { //when we press it deletes
            @Override
            public void onClick(View v) {
                ed1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });
        buplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) { //bu buton, bastığımızda önceki texti silmemize yarıyo
                    input1 = Float.parseFloat(ed1.getText() + "");
                    Addition = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });

        buminus.setOnClickListener(new View.OnClickListener() {//bu buton, bastığımızda önceki texti silmemize yarıyo
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) {
                    input1 = Float.parseFloat(ed1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        bumultiply.setOnClickListener(new View.OnClickListener() { //bu buton, bastığımızda önceki texti silmemize yarıyo
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) {
                    input1 = Float.parseFloat(ed1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {//bu buton, bastığımızda önceki texti silmemize yarıyo
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) {
                    input1 = Float.parseFloat(ed1.getText() + "");
                    Division = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        buremind.setOnClickListener(new View.OnClickListener() {//bu buton, bastığımızda önceki texti silmemize yarıyo
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) {
                    input1 = Float.parseFloat(ed1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        buequal.setOnClickListener(new View.OnClickListener() { //işlemleri yapıyoruz
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(ed1.getText() + "");
                }

                if (Addition) {

                    ed1.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    ed1.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    ed1.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    ed1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    ed1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });
        budot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {

                } else {
                    ed1.setText(ed1.getText() + ".");
                    decimal = true;
                }

            }
        });


}}





