package com.deu.cse.volt.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IDsearchDataDTO {
    @SerializedName("result")
    @Expose
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}