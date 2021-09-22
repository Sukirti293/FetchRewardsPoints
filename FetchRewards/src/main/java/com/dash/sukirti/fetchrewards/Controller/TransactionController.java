package com.dash.sukirti.fetchrewards.Controller;

import com.dash.sukirti.fetchrewards.Model.TransactionRecord;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @PostMapping("/addTransaction")
    public void addTransactions(@RequestBody TransactionRecord record){
        System.out.println(record.toString());
    }


}
