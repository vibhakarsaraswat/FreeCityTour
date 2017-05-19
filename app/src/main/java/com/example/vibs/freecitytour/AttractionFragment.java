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
public class AttractionFragment extends Fragment {
    public AttractionFragment() {
        // Required empty public constructor
    }

    public static AttractionFragment newInstance() {
        AttractionFragment fragment = new AttractionFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.drawable.img_attr_bridges, R.string.str_attraction_bridges, R.string.str_rest_addr_bridges, R.string.str_rest_phone_bridges));
        result.add(new Result(R.drawable.img_attr_drottningholm, R.string.str_attraction_drottningholm, R.string.str_rest_addr_drottningholm, R.string.str_rest_phone_drottningholm));
        result.add(new Result(R.drawable.img_attr_riddarholmen, R.string.str_attraction_riddarholmen, R.string.str_rest_addr_riddarholmen, R.string.str_rest_phone_riddarholmen));
        result.add(new Result(R.drawable.img_attr_royaltheater, R.string.str_attraction_royaltheater, R.string.str_rest_addr_royaltheater, R.string.str_rest_phone_royaltheater));
        result.add(new Result(R.drawable.img_attr_bergianska, R.string.str_attraction_bergianska, R.string.str_rest_addr_bergianska, R.string.str_rest_phone_bergianska));
        result.add(new Result(R.drawable.img_attr_cityhall, R.string.str_attraction_cityhall, R.string.str_rest_addr_cityhall, R.string.str_rest_phone_cityhall));
        result.add(new Result(R.drawable.img_attr_kungstradgarden, R.string.str_attraction_kungstradgarden, R.string.str_rest_addr_Kungstradgarden, R.string.str_rest_phone_kungstradgarden));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryattraction);
        ListView listView = (ListView) rootView.findViewById(R.id.result_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
