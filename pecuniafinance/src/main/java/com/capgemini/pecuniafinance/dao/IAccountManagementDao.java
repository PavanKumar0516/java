package com.capgemini.pecuniafinance.dao;

import com.capgemini.pecuniafinance.bean.AccountDetails;

public interface IAccountManagementDao {
	public boolean updateCustomerDetails(AccountDetails account);
	public boolean accountType(AccountDetails account);
	public AccountDetails closeAccount(AccountDetails account);
}
