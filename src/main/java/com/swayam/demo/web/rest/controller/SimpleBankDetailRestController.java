package com.swayam.demo.web.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swayam.demo.web.rest.model.BankDetail;
import com.swayam.demo.web.rest.service.BankDetailService;

@RestController
public class SimpleBankDetailRestController {

    private final BankDetailService bankDetailService;

    @Autowired
    public SimpleBankDetailRestController(BankDetailService bankDetailService) {
	this.bankDetailService = bankDetailService;
    }

    @RequestMapping(path = { "/bank-detail" }, method = { RequestMethod.GET, RequestMethod.POST })
    public List<BankDetail> getBankDetail() {
	return bankDetailService.getBankDetails();
    }

}
