package com.cts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to our site.Would you like to order or repair?");

		Scanner sc = new Scanner(System.in);

		String processOption = sc.nextLine().toLowerCase().trim();

		PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();

		String productDetail;

		switch (processOption) {

		case "order": {
			System.out.println("Please provide the phone model name");
			productDetail = sc.nextLine().trim();
			phoneOrderRepair.processOrder(productDetail);
			break;
		}
		case "repair": {
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().toLowerCase();

			if (productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.processPhoneRepair(productDetail);
			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.processAccessorRepair(productDetail);
			}

			break;
		}
		default: {
			break;
		}
		}
		sc.close();
	}
}
