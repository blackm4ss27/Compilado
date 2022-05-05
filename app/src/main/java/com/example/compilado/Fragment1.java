package com.example.compilado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //declaracion de variables
    private View view;
    private EditText txtnro1,txtnro2;
    private TextView tvResultado;
    private Button btnSuma,btnResta,btnMult,btnDiv,btnLimpiar,btnPotencia,btnRaiz,btnPorcentaje,btnFactorial;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false);
        View view=inflater.inflate(R.layout.fragment_1,container,false);
        txtnro1=view.findViewById(R.id.etNro1);
        txtnro2=view.findViewById(R.id.etNro2);
        btnSuma=view.findViewById(R.id.btnSumar);
        btnResta=view.findViewById(R.id.btnRestar);
        btnMult=view.findViewById(R.id.btnMultuplicar);
        btnDiv=view.findViewById(R.id.btnDividir);
        btnLimpiar=view.findViewById(R.id.btnLimpiar);
        tvResultado=view.findViewById(R.id.tvResultado);
        btnPotencia = view.findViewById(R.id.btnPotenciar);
        btnRaiz = view.findViewById(R.id.btnRaices);
        btnPorcentaje = view.findViewById(R.id.btnPorcentajes);
        btnFactorial = view.findViewById(R.id.btnFactoriales);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                txtnro1.setText("");
                txtnro2.setText("");
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1=Double.parseDouble(txtnro1.getText().toString());
                double numero2=Double.parseDouble(txtnro2.getText().toString());
                double suma=numero1+numero2;
                tvResultado.setText("La suma es: "+Double.toString(suma));
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1=Double.parseDouble(txtnro1.getText().toString());
                double numero2=Double.parseDouble(txtnro2.getText().toString());
                double resta=numero1-numero2;
                tvResultado.setText("La resta es: "+Double.toString(resta));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1=Double.parseDouble(txtnro1.getText().toString());
                double numero2=Double.parseDouble(txtnro2.getText().toString());
                double division=numero1/numero2;
                tvResultado.setText("La división es: "+Double.toString(division));
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1=Double.parseDouble(txtnro1.getText().toString());
                double numero2=Double.parseDouble(txtnro2.getText().toString());
                double multiplicacion=numero1*numero2;
                tvResultado.setText("El producto es: "+ multiplicacion);
            }
        });
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnro1.getText().toString());
                double numero2 = Double.parseDouble(txtnro2.getText().toString());
                double aux = 1;
                if (numero2==0){
                    double resultado = 1;
                }
                else{
                    while (numero2 > 0){
                        aux = aux * numero1;
                        numero2--;
                    }
                }
                double resultado = aux;
                tvResultado.setText("La potencia es: "+Double.toString(resultado));
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnro1.getText().toString());
                double resultado = Math.sqrt(numero1);
                tvResultado.setText("La raíz es: "+Double.toString(resultado));
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnro1.getText().toString());
                double resultado = numero1 / 100;
                tvResultado.setText("El porcentaje es: "+Double.toString(resultado));
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnro1.getText().toString());
                int cont = 1;
                double aux = 1;
                while (cont <= numero1){
                    aux = aux * cont;
                    cont++;
                }
                double resultado = aux;
                tvResultado.setText("El factorial es: "+Double.toString(resultado));
            }
        });

        return view;
    }
}