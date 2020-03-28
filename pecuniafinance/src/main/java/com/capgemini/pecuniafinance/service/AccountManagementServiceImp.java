package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.AccountDetails;
import com.capgemini.pecuniafinance.bean.AccountDetails;
import com.capgemini.pecuniafinance.dao.AccountManagementDaoImp;
import com.capgemini.pecuniafinance.dao.IAccountManagementDao;

public class AccountManagementServiceImp implements IAccountManagementService {
	static AccountManagementDaoImp accountdao = new AccountManagementDaoImp();

	public boolean updateCustomerDetails(AccountDetails account) {

		return accountdao.updateCustomerDetails(account);
	}

	public boolean accountType(AccountDetails account) {

		return accountdao.accountType(account);
	}

	public AccountDetails closeAccount(AccountDetails account) {

		return accountdao.closeAccount(account);
	}

	public static boolean checkAccNumber(long accNumber) {
		return accountdao.checkAccNumber(accNumber);
	}

	// validations
	/* validation to account number */
	public static boolean validAccountNumber(AccountDetails account) {
		long accno = account.getAccNumber();
		boolean flag = false;
		String str = String.valueOf(accno);
		if (str.length() == 12) {
			flag = true;
		}
		return flag;
	}

// validating updated details
	public static boolean validName(String name) {
		boolean flag = false;
		if (name.length() > 3) {
			flag = true;
		}
		return flag;
	}

	public static boolean validMobileNumber(long phonenumber) {
		long phno = phonenumber;
		String str = String.valueOf(phno);
		return str.matches("[6-9][0-9]{9}");
	}

	public static boolean validAddressLine1(String address1) {
		return address1.matches("[a-zA-Z0-9/-]{3,}");
	}

	public static boolean validAddressLine2(String address2) {
		return address2.matches("[a-zA-Z0-9/-]{3,}");
	}

	public static boolean validAddressCity(String city) {
		return city.matches("[a-zA-Z]{3,}");
	}

	public static boolean validAddressState(String state) {
		return state.matches("[a-zA-Z]{3,}");
	}

	public static boolean validAddressCountry(String country) {
		return country.matches("[a-zA-Z]{3,}");
	}

	public static boolean validAddressPincode(int pincode) {
		boolean flag = false;
		String str = String.valueOf(pincode);
		if (str.length() == 6) {
			flag = true;
		}
		return flag;
	}

	public static boolean validAddress(String address1, String address2, String city, String state, String country,
			int pincode) {
		boolean flag = false;
		if (validAddressLine1(address1) && validAddressLine2(address2) && validAddressCity(city)
				&& validAddressState(state) && validAddressCountry(country) && validAddressPincode(pincode)) {
			flag = true;
		}
		return flag;
	}
}