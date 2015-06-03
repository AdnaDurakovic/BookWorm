package com.example.adna.bookworm;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Adna on 02/06/2015.
 */


public class menu1_Fragment extends Fragment {
    // Database Helper
    DataBaseHelper db;
    GridView gridView;

    GridView gv;
    Context context;
    ArrayList bookTitles, bookImages;
    //public static String [] prgmNameList;={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
    //public static int [] prgmImages={R.drawable.images,R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5,R.drawable.images6,R.drawable.images7,R.drawable.images8};


    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu1_layout,container,false);

        GridView gridview = (GridView) rootview.findViewById(R.id.booksList);
        gridview.setAdapter(new ImageAdapter(this.getActivity()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(menu1_Fragment.this.getActivity(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

        return rootview;
    }

}
