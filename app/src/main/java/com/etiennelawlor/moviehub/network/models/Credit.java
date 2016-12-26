package com.etiennelawlor.moviehub.network.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by etiennelawlor on 12/16/16.
 */

public class Credit {

    // region Fields
    @SerializedName("id")
    public Integer id;
    @SerializedName("credit_id")
    public String creditId;
    // endregion

    // region Getters

    public Integer getId() {
        return id;
    }

    public String getCreditId() {
        return creditId;
    }

    // endregion

    // region Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }
    // endregion
}
