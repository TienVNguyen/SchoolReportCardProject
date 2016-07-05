/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.schoolreportcard.data;

import com.training.tiennguyen.schoolreportcard.models.Card;

import java.util.ArrayList;

/**
 * CardsData<br>
 * TODO: Mockup data just for testing
 *
 * @author TienNguyen
 */
public class CardsData {
    /**
     * Prepare data
     *
     * @return List cards
     */
    public static ArrayList<Card> getCardList() {
        Card card1 = new Card();
        card1.setName("Jerry");
        card1.setImg("http://2.bp.blogspot.com/-Yt23cLJ9mGg/VH2tMukpaEI/AAAAAAAABTc/WqdFC0IDJTM/s1600/tom-and-jerry3.jpg");
        card1.setGrade(100);
        card1.setPosition(1);
        card1.setClassAttend("12A12");

        Card card2 = new Card();
        card2.setName("Tom");
        card2.setImg("http://pre08.deviantart.net/2930/th/pre/i/2014/182/a/2/tom_cat_by_1997ael-d7ougoa.png");
        card2.setGrade(95);
        card2.setPosition(2);
        card2.setClassAttend("12A12");

        Card card3 = new Card();
        card3.setName("PIC PAC");
        card3.setImg("http://static.appvn.com/a/uploads/thumbnails/102015/pac-man-bounce_icon.png");
        card3.setGrade(90);
        card3.setPosition(3);
        card3.setClassAttend("12A12");

        Card card4 = new Card();
        card4.setName("Mr.Happy");
        card4.setImg("https://crackberry.com/sites/crackberry.com/files/styles/large/public/topic_images/2013/ANDROID.png?itok=xhm7jaxS");
        card4.setGrade(60);
        card4.setPosition(5);
        card4.setClassAttend("12A12");

        Card card5 = new Card();
        card5.setName("Inuyasha");
        card5.setImg("https://s-media-cache-ak0.pinimg.com/736x/af/8f/02/af8f02e0e9fddf7bc51fa76d53d44002.jpg");
        card5.setGrade(88);
        card5.setPosition(4);
        card5.setClassAttend("12A12");

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        return cards;
    }
}
