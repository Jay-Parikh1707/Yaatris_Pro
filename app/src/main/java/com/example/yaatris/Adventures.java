package com.example.yaatris;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Adventures#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Adventures extends Fragment  {

    private CardView card;



    public Adventures() {
        // Required empty public constructor
    }

    public static Adventures newInstance() {
        Adventures fragment = new Adventures();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_adventures, container, false);

        String [] values =
                {"Time at Residence","Under 6 months","6-12 months","1-2 years","2-4 years","4-8 years","8-15 years","Over 15 years",};
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        card = (CardView) v.findViewById(R.id.card_view);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling EditText is empty or no method.
                openAdventure();
            }
        });

        return v;
    }

    private  void openAdventure(){
        Intent in = new Intent(getActivity(), AdventureDetails.class);
        startActivity(in);
    }


}