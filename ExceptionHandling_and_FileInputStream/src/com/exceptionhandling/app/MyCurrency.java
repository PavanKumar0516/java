package com.exceptionhandling.app;

import java.util.Currency;
import java.util.Locale;

public class MyCurrency {

	public static void main(String[] args) {
		Locale loca=Locale.getDefault();
		int amt=1000;
		Currency c=Currency.getInstance(loca);
		System.out.println(amt+" "+c.getCurrencyCode());
		System.out.println(amt+" "+c.getSymbol(loca));

	}

}
