package com.dash.sukirti.fetchrewards.Storage;

import com.dash.sukirti.fetchrewards.Model.TransactionRecord;

import java.sql.Timestamp;
import java.util.PriorityQueue;

//TODO make this class singleton
public class StoreRecords {
    PriorityQueue<TransactionRecord> recordHeap;

    public StoreRecords(){
        recordHeap = new PriorityQueue<>((TransactionRecord record1, TransactionRecord record2) ->
                Long.compare(record1.getFormattedTime(), record2.getFormattedTime()));
    }

    public void storeTransactionRecords(TransactionRecord record){
        recordHeap.add(record);
    }

    public String printRecords(){
        StringBuilder sb = new StringBuilder();
        while(!recordHeap.isEmpty()){
            sb.append(recordHeap.poll());
        }

        return sb.toString();
    }
}
