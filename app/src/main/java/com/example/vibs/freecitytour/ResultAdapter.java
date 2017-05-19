package com.example.vibs.freecitytour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vibhakar.sarswat on 5/19/2017.
 */

public class ResultAdapter extends ArrayAdapter<Result> {

    private int mColorResourceId;

    public ResultAdapter(Context context, ArrayList<Result> result, int ColorResourceId) {
        super(context, 0, result);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Result currentResult = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.iv_place);
        imageView.setImageResource(currentResult.getImageOfPlaceId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.tv_name);
        nameTextView.setText(currentResult.getNameOfPlaceId());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.tv_address);
        addressTextView.setText(currentResult.getAddressOfPlaceId());

        TextView contactTextView = (TextView) listItemView.findViewById(R.id.tv_contact);
        contactTextView.setText(currentResult.getContactOfPlaceId());


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
