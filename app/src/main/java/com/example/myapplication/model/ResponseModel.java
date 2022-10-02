package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private   String message;

    @SerializedName("rowCount")
    private int  rowCount;

    @SerializedName("data")
    private List<NobetciEzcaneModel> veriler;

    public List<NobetciEzcaneModel> getVeriler() {
        return veriler;
    }

    public void setVeriler(List<NobetciEzcaneModel> veriler) {
        this.veriler = veriler;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message) {
        this.message = message;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
}
