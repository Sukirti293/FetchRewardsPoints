package com.dash.sukirti.fetchrewards.Controller;

import com.dash.sukirti.fetchrewards.Model.TransactionRecord;
import com.dash.sukirti.fetchrewards.Storage.StoreRecords;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
    StoreRecords storeRecords;

    public TransactionController() {
        storeRecords = new StoreRecords();

    }

    @PostMapping("/addTransaction")
    public void addTransactions(@RequestBody TransactionRecord record){
        //System.out.println(record.toString());
        storeRecords.storeTransactionRecords(record);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public String getAllTrans(){
        return storeRecords.printRecords();
    }


}
