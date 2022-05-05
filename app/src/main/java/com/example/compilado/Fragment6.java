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
 * Use the {@link Fragment6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment6 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment6.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment6 newInstance(String param1, String param2) {
        Fragment6 fragment = new Fragment6();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //declaracion de variables
    private View view;
    private EditText txtMonto;
    private TextView txtSalida;
    private Button bDS,bSD,bES,bSE, btnBorrar;

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
        //return inflater.inflate(R.layout.fragment_6, container, false);
        View view=inflater.inflate(R.layout.fragment_6,container,false);
        txtMonto = view.findViewById(R.id.etMonto);
        txtSalida = view.findViewById(R.id.tvSalida);
        bDS=view.findViewById(R.id.btnDS);
        bSD=view.findViewById(R.id.btnSD);
        bES=view.findViewById(R.id.btnES);
        bSE=view.findViewById(R.id.btnSE);

        //metodos
        bDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(txtMonto.getText().toString());
                double cds = num * 3.73;
                txtSalida.setText(num + " dólares equivalen a "+ cds + "soles");
            }
        });

        bSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(txtMonto.getText().toString());
                double csd = num * 0.27;
                txtSalida.setText(num + " soles equivalen a "+ csd + "dólares");
            }
        });

        bES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(txtMonto.getText().toString());
                double ces = num * 4.03;
                txtSalida.setText(num + " euros equivalen a "+ ces + "soles");
            }
        });

        bSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(txtMonto.getText().toString());
                double cse = num * 0.25;
                txtSalida.setText(num + " soles equivalen a "+ cse + "euros");
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMonto.setText("");
                txtSalida.setText("");
            }
        });
        return view;
    }
}