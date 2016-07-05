/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.schoolreportcard.models;

import com.training.tiennguyen.schoolreportcard.Constants.VariableConstants;

/**
 * Card
 *
 * @author TienNguyen
 */
public class Card {
    public String name;
    public String img;
    public int grade;
    public int position;
    public String classAttend;

    public Card() {
    }

    public Card(String name, String img, int grade, int position, String classAttend) {
        this.name = name;
        this.img = img;
        this.grade = grade;
        this.position = position;
        this.classAttend = classAttend;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ");
        builder.append(name);
        builder.append(VariableConstants.breakLine);
        builder.append("Grade: ");
        builder.append(grade);
        builder.append(VariableConstants.breakLine);
        builder.append("Position: ");
        builder.append(position);
        builder.append(VariableConstants.breakLine);
        builder.append("Class Attend: ");
        builder.append(classAttend);

        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getClassAttend() {
        return classAttend;
    }

    public void setClassAttend(String classAttend) {
        this.classAttend = classAttend;
    }
}
