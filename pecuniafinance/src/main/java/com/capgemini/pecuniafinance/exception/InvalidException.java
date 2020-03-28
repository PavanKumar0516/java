package com.capgemini.pecuniafinance.exception;

public class InvalidException extends Exception {
   public InvalidException(String msg) {
	   System.err.println(msg);
   }
}
