package com.capgemini.pecuniafinance.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.capgemini.pecuniafinance.bean.AccountDetails;
import com.capgemini.pecuniafinance.service.AccountManagementServiceImp;
import com.capgemini.pecuniafinance.service.IAccountManagementService;

public class AccountManagementServiceTest {
	static IAccountManagementService service;
	static AccountDetails account1;
	@BeforeAll
	public static void setUp() {
		service = new AccountManagementServiceImp();
		account1 = new AccountDetails();
	}

	// negative test case change choice for positive
	@Test
	public void testUpdateCustomerDetails() {
		account1.setAccNumber(944094835101l);
		account1.setChoice(5);
		Map<Long, AccountDetails> map = new HashMap<Long, AccountDetails>();
		map.put(account1.getAccNumber(), account1);
		boolean flag = service.updateCustomerDetails(account1);
		assertFalse(flag);
	}

	// negativeTestCase change type in map for positive
	@Test
	public void testAccountType() {
		account1.setAccNumber(944094835100l);
		Map<Long, AccountDetails> map = new HashMap<Long, AccountDetails>();
		map.put(account1.getAccNumber(), account1);
		boolean flag = service.accountType(account1);
		assertFalse(flag);
	}

	@Test
	public void testCloseAccount() {
		account1.setAccNumber(944094835100l);
		Map<Long, AccountDetails> map = new HashMap<Long, AccountDetails>();
		map.put(account1.getAccNumber(), account1);
		AccountDetails testaccount = service.closeAccount(account1);
		assertEquals(testaccount, account1);
	}
	@Test
	public void testValidAddress() {
		boolean flag = AccountManagementServiceImp.validAddress("3-76/5u", "block-3", "hyderabad", "telangana", "india",
				502301);
		assertEquals(true, flag);

	}

	@Test
	public void testValidAddressAddressLine1() {
		boolean flag = AccountManagementServiceImp.validAddressLine1("3-45/5r");
		assertEquals(true, flag);
	}

	@Test
	public void testValidAddressAddressLine2() {
		boolean flag = AccountManagementServiceImp.validAddressLine2("block-35r");
		assertEquals(true, flag);
	}

	@Test
	public void testValidAddressAddressCity() {
		boolean flag = AccountManagementServiceImp.validAddressCity("kolkata");
		assertEquals(true, flag);
	}

	@Test
	public void testValidAddressState() {
		boolean flag = AccountManagementServiceImp.validAddressState("westbengal");
		assertEquals(true, flag);
	}

	@Test
	public void testValidAddressCountry() {
		boolean flag = AccountManagementServiceImp.validAddressCountry("India");
		assertEquals(true, flag);
	}

	@Test
	public void testValidAddressPincode() {
		boolean flag = AccountManagementServiceImp.validAddressPincode(512369);
		assertEquals(true, flag);
	}

}
