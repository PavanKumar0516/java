package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.AccountDetails;

public interface IAccountManagementService {
	public boolean updateCustomerDetails(AccountDetails account);
	public boolean accountType(AccountDetails account);
	public AccountDetails closeAccount(AccountDetails account);
}
