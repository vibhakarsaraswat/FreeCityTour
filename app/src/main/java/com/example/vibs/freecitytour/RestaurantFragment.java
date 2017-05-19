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
public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.drawable.img_rest_800grader, R.string.str_rest_name_800grader, R.string.str_rest_addr_800grader, R.string.str_rest_phone_800grader));
        result.add(new Result(R.drawable.img_rest_chilimasala, R.string.str_rest_name_chilimasala, R.string.str_rest_addr_chilimasala, R.string.str_rest_phone_chilimasala));
        result.add(new Result(R.drawable.img_rest_cuminclub, R.string.str_rest_name_cuminclub, R.string.str_rest_addr_cuminclub, R.string.str_rest_phone_cuminclub));
        result.add(new Result(R.drawable.img_rest_darmedpastahornstull, R.string.str_rest_name_darmedpastahornstull, R.string.str_rest_addr_darmedpastahornstull, R.string.str_rest_phone_darmedpastahornstull));
        result.add(new Result(R.drawable.img_rest_hermans, R.string.str_rest_name_hermans, R.string.str_rest_addr_hermans, R.string.str_rest_phone_hermans));
        result.add(new Result(R.drawable.img_rest_indianstreetfood, R.string.str_rest_name_indianstreetfood, R.string.str_rest_addr_indianstreetfood, R.string.str_rest_phone_indianstreetfood));
        result.add(new Result(R.drawable.img_rest_sanktpaulspizzabutik, R.string.str_rest_name_sanktpaulspizzabutik, R.string.str_rest_addr_sanktpaulspizzabutik, R.string.str_rest_phone_sanktpaulspizzabutik));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryrestaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.result_list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
