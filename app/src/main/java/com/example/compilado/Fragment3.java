package com.example.compilado;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //declaracion de variables
    private View view;
    private ImageButton btnInternet;

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
        //return inflater.inflate(R.layout.fragment_3, container, false);
        View view=inflater.inflate(R.layout.fragment_3,container,false);
        btnInternet = view.findViewById(R.id.imbInternet);

        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarIntento();
            }
        });
        return view;
    }

    public void mostrarIntento(){
        Intent navigate = new Intent(Fragment3.this.getActivity(), AcWeb1.class);
        startActivity(navigate);
    }

    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    //implementar un metodo
    /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super .onViewCreated(view, savedInstanceState);
        //crear referencia a los botones
        EditText web = view.findViewById(R.id.txtWeb);
        Button buscar = view.findViewById(R.id.btnBuscar);


        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamado al fragmento de navegacion
                Log.d("SitioWeb", web.getText().toString());
                Navigation.findNavController(v).navigate(R.id.fragment3a);
            }
        });
    }*/
}