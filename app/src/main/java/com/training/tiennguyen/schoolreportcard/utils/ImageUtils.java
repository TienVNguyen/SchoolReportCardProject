/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.schoolreportcard.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.training.tiennguyen.schoolreportcard.R;

/**
 * ImageUtils
 *
 * @author TienNguyen
 */
public class ImageUtils {
    /**
     * setImage
     *
     * @param activity     activity
     * @param imageValue   imageValue
     * @param targetWidth  targetWidth
     * @param targetHeight targetHeight
     * @param imageView    imageView
     */
    public static void setImage(Context activity, String imageValue,
                                int targetWidth, int targetHeight, final ImageView imageView, final ProgressBar progressBar) {
        Picasso.with(activity)
                .load(imageValue)
                .resize(targetWidth, targetHeight)
                .centerCrop()
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        progressBar.setVisibility(View.GONE);
                        imageView.setImageBitmap(bitmap);
                        imageView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {
                        progressBar.setVisibility(View.GONE);
                        imageView.setImageResource(R.drawable.android_default_image);
                        imageView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {
                        progressBar.setVisibility(View.VISIBLE);
                        imageView.setVisibility(View.GONE);
                    }
                });
    }
}
