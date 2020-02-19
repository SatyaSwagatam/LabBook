//Program to simulate traffic light
package com.cg.iter;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a colour-");
		String signal = sc.nextLine();
		switch (signal) {
		case "Red":
		case "red":
			System.out.println("Stop");
			break;
		case "Yellow":
		case "yellow":
			System.out.println("Ready");
			break;
		case "Green":
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid entry");
			break;

		}

	}
}
