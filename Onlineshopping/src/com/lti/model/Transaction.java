package com.lti.model;

import java.time.LocalDate;

public class Transaction {
 int TransactionId;
 LocalDate tdate;
public int getTransactionId() {
	return TransactionId;
}
public void setTransactionId(int transactionId) {
	TransactionId = transactionId;
}
public LocalDate getTdate() {
	return tdate;
}
public void setTdate(LocalDate tdate) {
	this.tdate = tdate;
}
 
}
