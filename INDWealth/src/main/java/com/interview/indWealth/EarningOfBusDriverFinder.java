package com.interview.indWealth;

import java.util.LinkedList;
import java.util.Queue;

public class EarningOfBusDriverFinder {
	
	private int noOfGroups;
	private int[] groupSizes;
	private int busCapacity;
	private int noOfRounds;
	
	public EarningOfBusDriverFinder() {}
	
	public EarningOfBusDriverFinder(int noOfGroups, int[] groupSizes, int busCapacity, int noOfRounds) {
		super();
		this.noOfGroups = noOfGroups;
		this.groupSizes = groupSizes;
		this.busCapacity = busCapacity;
		this.noOfRounds = noOfRounds;
	}
	
	public int earningCalculator() {
		
		if (groupSizes.length == 0 || busCapacity <= 0 || noOfRounds <=0)
            return 0;

		Queue<Integer> groupQueue = new LinkedList<Integer>();
		for (int groupSize: groupSizes) {
			groupQueue.offer(groupSize);
		}
		
		int countForRounds = 0;
		int earning = 0;
		while(countForRounds < noOfGroups) {
			
			int currentCapacity = 0;
			
			while(currentCapacity <= busCapacity) {
				int firstGrpSize = groupQueue.peek();
				if ((currentCapacity + firstGrpSize) <= busCapacity) {
					currentCapacity += firstGrpSize;
					int getGrpSize = groupQueue.poll();
					groupQueue.offer(getGrpSize);
				} else break;
			}
			earning = earning + currentCapacity;
			countForRounds++;
		}
		return earning;
	}

	public void setNoOfGroups(int noOfGroups) {
		this.noOfGroups = noOfGroups;
	}

	public void setGroupSizes(int[] groupSizes) {
		this.groupSizes = groupSizes;
	}

	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}

	public void setNoOfRounds(int noOfRounds) {
		this.noOfRounds = noOfRounds;
	}	
}
