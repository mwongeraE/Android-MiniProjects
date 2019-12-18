package com.mwongera.newsfeed;

import android.icu.text.IDNA;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Feed {
    @SerializedName("category")
    @Expose
    private String heading;

    @SerializedName("data")
    @Expose
    private List<IDNA.Info> infoList;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<IDNA.Info> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<IDNA.Info> infoList) {
        this.infoList = infoList;
    }
}

/*
@SerializedName annotation belongs to gson class and
used to read json file variable and bind it to the model variable.
 */

/*
@Expose is used to make the variable readable to the gson
 */