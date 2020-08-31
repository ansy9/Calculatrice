package com.yannz.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import javax.script.ScriptException;
import  javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


public class MainActivity extends AppCompatActivity {

    Button zero,un,deux,trois,quatre,cinq,six,sept,huit,neuf,ac,egale,plus,moin,mul,div, modulo,par1,par2,cos,sin,tang,racine,virgule,effacer;
    TextView afficheur;
    int indice; //idice de laliste affichage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaration
        final ArrayList <String> affichage= new ArrayList<String>();
        final ArrayList <String> calcul= new ArrayList<String>();


        zero=(Button)findViewById(R.id.button_0);
        un=(Button)findViewById(R.id.button_1);
        deux=(Button)findViewById(R.id.button_2);
        trois=(Button)findViewById(R.id.button_3);
        quatre=(Button)findViewById(R.id.button_4);
        cinq=(Button)findViewById(R.id.button_5);
        six=(Button)findViewById(R.id.button_6);
        sept=(Button)findViewById(R.id.button_7);
        huit=(Button)findViewById(R.id.button_8);
        neuf=(Button)findViewById(R.id.button_9);
        ac=(Button)findViewById(R.id.button_ac);
        egale=(Button)findViewById(R.id.button_equal);
        plus=(Button)findViewById(R.id.button_plus);
        moin=(Button)findViewById(R.id.button_moin);
        mul=(Button)findViewById(R.id.button_mul);
        div=(Button)findViewById(R.id.button_div);
        modulo =(Button)findViewById(R.id.button_modulo);
        par1=(Button)findViewById(R.id.button_parenthese_ouvrante);
        par2=(Button)findViewById(R.id.button_parenthese_fermante);
        cos=(Button)findViewById(R.id.button_cos);
        sin=(Button)findViewById(R.id.button_sin);
        tang=(Button)findViewById(R.id.button_tan);
        racine=(Button)findViewById(R.id.button_racine);
        virgule=(Button)findViewById(R.id.button_virgule);
        effacer=(Button)findViewById(R.id.button_del);


        afficheur=(TextView)findViewById(R.id.textView1);

        indice=-1;

        //methodes
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                affichage.add("0");
                calcul.add("0");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("1");
                calcul.add("1");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());

            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("2");
                calcul.add("2");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("3");
                calcul.add("3");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("4");
                calcul.add("4");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("5");
                calcul.add("5");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("6");
                calcul.add("6");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("7");
                calcul.add("7");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("8");
                calcul.add("8");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("9");
                calcul.add("9");
                indice++;

                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.clear();
                calcul.clear();
                indice=-1;
                afficheur.setText(null);
            }
        });

        virgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add(".");
                    calcul.add(".");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        racine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("sqrt(");
                    calcul.add("Math.sqrt(");
                    indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add("+");
                    calcul.add("+");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        moin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add("-");
                    calcul.add("-");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add("X");
                    calcul.add("*");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add("/");
                    calcul.add("/");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        par1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("(");
                calcul.add("(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        par2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add(")");
                calcul.add(")");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("cos(");
                calcul.add("Math.cos(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("sin(");
                calcul.add("Math.sin(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        tang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("tan(");
                calcul.add("Math.tan(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((zero.isClickable())||(un.isClickable())||(deux.isClickable())||(trois.isClickable())||(quatre.isClickable())||(cinq.isClickable())||(six.isClickable())||(sept.isClickable())||(huit.isClickable())||(neuf.isClickable()))
                {affichage.add("mod");
                    calcul.add("%");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((afficheur.getText().equals(null)==false)&&(indice > -1))
                {
                    affichage.remove(indice);
                    calcul.remove(indice);
                    indice=indice-1;
                    afficheur.setText(null);
                    for(int i=0;i<affichage.size();i++) {

                            if (afficheur.getText().equals(null))
                                afficheur.setText(affichage.get(i).toString());
                            else
                                afficheur.setText(afficheur.getText() + affichage.get(i).toString());

                    }
                }
                else
                    {
                        indice=-1;
                        afficheur.setText("");
                    }

            }
        });


        egale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();

                for (String s : calcul) {
                    sb.append(s);
                    sb.append("");
                }
                String resultat = sb.toString();
                //afficheur.setText(resultat);



                    ScriptEngineManager mgr = new ScriptEngineManager();


                    ScriptEngine engine;
                    engine= mgr.getEngineByName("js");


                    try {
                        //Object result;
                        // result = engine.eval(resultat);
                        if(engine!=null)
                        afficheur.setText(engine.eval(resultat).toString());

                    } catch (ScriptException e) {
                        Toast.makeText(MainActivity.this, "Erreur", Toast.LENGTH_SHORT).show();
                    }


            }
        });




    }
}
