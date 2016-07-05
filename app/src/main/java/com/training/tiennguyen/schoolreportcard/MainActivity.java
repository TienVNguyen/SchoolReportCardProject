/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.schoolreportcard;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.training.tiennguyen.schoolreportcard.adapters.CardAdapter;
import com.training.tiennguyen.schoolreportcard.data.CardsData;
import com.training.tiennguyen.schoolreportcard.models.Card;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * MainActivity
 *
 * @author TienNguyen
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.lv_broadCard)
    protected ListView lvCards;
    private ArrayList<Card> cards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * Initial view(s)
     */
    private void initView() {
        ButterKnife.bind(this);

        // Populate data to list
        cards = CardsData.getCardList();
        CardAdapter arrayAdapter = new CardAdapter(this, cards);
        lvCards.setAdapter(arrayAdapter);
    }

    @OnItemClick(R.id.lv_broadCard)
    protected void onItemClickCard(int position) {
        Card card = cards.get(position);

        if (card != null) {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case DialogInterface.BUTTON_POSITIVE:
                            break;
                    }
                }
            };

            AlertDialog.Builder builderDialog = new AlertDialog.Builder(MainActivity.this);
            builderDialog.setIcon(android.R.drawable.ic_dialog_alert);
            builderDialog.setTitle(getString(R.string.dlg_title));
            builderDialog.setPositiveButton(getString(R.string.dlg_ok), onClickListener);
            builderDialog.setMessage(card.toString());
            builderDialog.show();
        }
    }
}
