package com.dash.sukirti.fetchrewards.Model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class TransactionRecord {
    private String payer;
    private int points;
    private String timestamp;

    public TransactionRecord(String payer, int points, String timestamp) {
        this.payer = payer;
        this.points = points;
        this.timestamp = timestamp;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getFormattedTime(){
        Date date = new Date();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = sdf.parse(getTimestamp());
            //String formattedTime = output.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date.getTime();

    }

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "payer='" + payer + '\'' +
                ", points=" + points +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

}
