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
public class ShoppingFragment extends Fragment {
    public ShoppingFragment() {
        // Required empty public constructor
    }

    public static ShoppingFragment newInstance() {
        ShoppingFragment fragment = new ShoppingFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);
        final ArrayList<Result> result = new ArrayList<Result>();

        result.add(new Result(R.drawable.img_shopping_hotorget, R.string.str_shopping_name_hotorget, R.string.str_shopping_addr_hotorget, R.string.str_shopping_phone_hotorget));
        result.add(new Result(R.drawable.img_shopping_nk, R.string.str_shopping_name_nk, R.string.str_shopping_addr_nk, R.string.str_shopping_phone_nk));
        result.add(new Result(R.drawable.img_shopping_sturegallerian, R.string.str_shopping_name_sturegallerian, R.string.str_shopping_addr_sturegallerian, R.string.str_shopping_phone_sturegallerian));
        result.add(new Result(R.drawable.img_shopping_ostermalm, R.string.str_shopping_name_ostermalm, R.string.str_shopping_addr_ostermalm, R.string.str_shopping_phone_ostermalm));
        result.add(new Result(R.drawable.img_shopping_mood, R.string.str_shopping_name_mood, R.string.str_shopping_addr_mood, R.string.str_shopping_phone_mood));
        result.add(new Result(R.drawable.img_shopping_sqob, R.string.str_shopping_name_sqob, R.string.str_shopping_addr_sqob, R.string.str_shopping_phone_sqob));
        result.add(new Result(R.drawable.img_shopping_kulturhuset, R.string.str_shopping_name_kulturhuset, R.string.str_shopping_addr_kulturhuset, R.string.str_shopping_phone_kulturhuset));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryshopping);
        ListView listView = (ListView) rootView.findViewById(R.id.result_list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
