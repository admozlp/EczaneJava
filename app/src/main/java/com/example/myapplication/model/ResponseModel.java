package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class ResponseModel {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private   String message;

    @SerializedName("rowCount")
    private int  rowCount;

    @SerializedName("data")
    private NobetciEzcaneModel veriler;

    public NobetciEzcaneModel getVeriler() {
        return veriler;
    }

    public void setVeriler(NobetciEzcaneModel veriler) {
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
