package com.me.example.KalMeds.dto;

import java.util.Date;
import java.util.HashMap;

public class Order {

	private Long orderId;
	private HashMap<Long, Integer> medicineList;
	private Double amount;
	private Long customerId;
	private Date date;
	private String address;
	private String methodOfPayment;
	
}
