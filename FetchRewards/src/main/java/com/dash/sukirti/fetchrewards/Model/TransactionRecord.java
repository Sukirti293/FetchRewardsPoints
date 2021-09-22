package com.dash.sukirti.fetchrewards.Model;

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

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "payer='" + payer + '\'' +
                ", points=" + points +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
