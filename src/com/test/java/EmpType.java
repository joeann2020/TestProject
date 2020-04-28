package com.test.java;

public class EmpType {

	public static final int PHARMACIST = 1; // 0001
	public static final int CASHIER = 2; // 0010
	public static final int MANAGER = 3; // 0011
	public static final int MAIL_ORDER_CLERK = 4; // 0100
	public static final int ALL_OPTS = 15; // 1111

	public static String returnJob(int flags) {
		String jobFamily = new String();
		if ((flags & PHARMACIST) == PHARMACIST)
			jobFamily = "PHARMACIST";

		if ((flags & CASHIER) == CASHIER)
			jobFamily = "CASHIER";

		if (((flags & CASHIER) == CASHIER) && ((flags & PHARMACIST) == PHARMACIST))
			jobFamily = "MANAGER";

		if ((flags & MAIL_ORDER_CLERK) == MAIL_ORDER_CLERK)
			jobFamily = "MAIL_ORDER_CLERK";

		return jobFamily;
	}

}