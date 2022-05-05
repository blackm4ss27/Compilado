package com.example.compilado;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.content.pm.PackageManager;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //declaracion de variables
    private View view;
    private ImageButton btnFacebook, btnInstagram, btnYoutube;

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
        //return inflater.inflate(R.layout.fragment_4, container, false);
        View view=inflater.inflate(R.layout.fragment_4,container,false);
        btnFacebook = view.findViewById(R.id.imbFb);
        btnInstagram = view.findViewById(R.id.imbIg);
        btnYoutube = view.findViewById(R.id.imbYt);

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                //startActivity(Facebook);
                Uri facebook = Uri.parse("https://www.facebook.com/");
                Intent fb = new Intent(Intent.ACTION_VIEW, facebook);
                startActivity(fb);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Instagram = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                //startActivity(Instagram);
                Uri instagram = Uri.parse("https://www.instagram.com");
                Intent ig = new Intent(Intent.ACTION_VIEW, instagram);
                startActivity(ig);
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                //startActivity(Youtube);
                Uri youtube = Uri.parse("https://www.youtube.com");
                Intent yt = new Intent(Intent.ACTION_VIEW, youtube);
                startActivity(yt);
            }
        });
        return view;
    }
}