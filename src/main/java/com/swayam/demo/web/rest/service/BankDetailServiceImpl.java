package com.swayam.demo.web.rest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.swayam.demo.web.rest.dao.BankDetailDao;
import com.swayam.demo.web.rest.model.BankDetail;

@Service
public class BankDetailServiceImpl implements BankDetailService {

	private final BankDetailDao bankDetailDao;

	@Autowired
	public BankDetailServiceImpl(@Qualifier("bankDetailDaoImpl") BankDetailDao bankDetailDao) {
		this.bankDetailDao = bankDetailDao;
	}

	@Override
	public List<BankDetail> getBankDetails() {
		return bankDetailDao.getAllBankDetails().parallelStream().filter((BankDetail bankDetail) -> {
			return bankDetail.getMarital().equalsIgnoreCase("married");
		}).filter((BankDetail bankDetail) -> {
			return bankDetail.getEducation().equalsIgnoreCase("secondary");
		}).filter((BankDetail bankDetail) -> {
			return bankDetail.getBalance().intValue() > 10_000;
		}).collect(Collectors.toList());
	}

}
