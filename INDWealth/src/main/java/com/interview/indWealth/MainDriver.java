package com.interview.indWealth;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Get number of Groups
		int noOfGroups = input.nextInt();
		
		int[] groupSizes = new int[noOfGroups];
		
		//Get group sizes
		for (int i = 0; i < noOfGroups; i++) {
			groupSizes[i] = input.nextInt();
		}
		
		//Get bus capacity
		int busCapacity = input.nextInt();
		
		//Get Number of rounds
		int noOfRounds = input.nextInt();
		input.close();
		
		EarningOfBusDriverFinder earningFinder = new EarningOfBusDriverFinder(noOfGroups, groupSizes, busCapacity, noOfRounds);
		
	    int earning = earningFinder.earningCalculator();
	    System.out.println("Total earning: " + earning);
	}

}
