/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.schoolreportcard.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.training.tiennguyen.schoolreportcard.R;
import com.training.tiennguyen.schoolreportcard.models.Card;
import com.training.tiennguyen.schoolreportcard.utils.ImageUtils;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * CardAdapter
 *
 * @author TienNguyen
 */
public class CardAdapter extends ArrayAdapter<Card> {
    /**
     * Constructor
     *
     * @param context context
     * @param objects objects
     */
    public CardAdapter(Context context, ArrayList<Card> objects) {
        super(context, R.layout.activity_card_adapter, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Catching
        final ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_card_adapter, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        // Populate Data
        Card card = getItem(position);
        if (card != null) {
            holder.txtName.setText(card.getName());
            holder.txtGrade.setText(String.valueOf(card.getGrade()));
            holder.txtPosition.setText(String.valueOf(card.getPosition()));
            holder.txtClassAttend.setText(String.valueOf(card.getClassAttend()));
            ImageUtils.setImage(getContext(), card.getImg(), 400, 400, holder.imgCard, holder.pgbCard);
        }

        return convertView;
    }

    /**
     * ViewHolder
     */
    protected static class ViewHolder {
        @Bind(R.id.pgb_card)
        protected ProgressBar pgbCard;
        @Bind(R.id.img_card)
        protected ImageView imgCard;
        @Bind(R.id.txt_name)
        protected TextView txtName;
        @Bind(R.id.txt_grade)
        protected TextView txtGrade;
        @Bind(R.id.txt_position)
        protected TextView txtPosition;
        @Bind(R.id.txt_classAttend)
        protected TextView txtClassAttend;

        protected ViewHolder(View convertView) {
            ButterKnife.bind(this, convertView);
        }
    }
}
