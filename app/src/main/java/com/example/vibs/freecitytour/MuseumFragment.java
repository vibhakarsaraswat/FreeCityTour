package com.example.vibs.freecitytour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {
    public MuseumFragment() {
        // Required empty public constructor
    }

    public static MuseumFragment newInstance(){
        MuseumFragment fragment = new MuseumFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);
        final ArrayList<Result> result = new ArrayList<Result>();

        result.add(new Result(R.drawable.img_museum_nordiska, R.string.str_museum_name_nordiska, R.string.str_museum_addr_nordiska, R.string.str_museum_phone_nordiska));
        result.add(new Result(R.drawable.img_museum_fareastern, R.string.str_museum_name_fareastern, R.string.str_museum_addr_fareastern, R.string.str_museum_phone_fareastern));
        result.add(new Result(R.drawable.img_museum_hallwylska, R.string.str_museum_name_hallwylska, R.string.str_museum_addr_hallwylska, R.string.str_museum_phone_hallwylska));
        result.add(new Result(R.drawable.img_museum_moderna, R.string.str_museum_name_moderna, R.string.str_museum_addr_moderna, R.string.str_museum_phone_moderna));
        result.add(new Result(R.drawable.img_museum_thielska, R.string.str_museum_name_thielska, R.string.str_museum_addr_thielska, R.string.str_museum_phone_thielska));
        result.add(new Result(R.drawable.img_museum_ethnography, R.string.str_museum_name_ethnography, R.string.str_museum_addr_ethnography, R.string.str_museum_phone_ethnography));
        result.add(new Result(R.drawable.img_museum_vasa, R.string.str_museum_name_vasa, R.string.str_museum_addr_vasa, R.string.str_museum_phone_vasa));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categorymuseum);
        ListView listView = (ListView) rootView.findViewById(R.id.result_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
