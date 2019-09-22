package com.interview.indWealth;

import java.util.LinkedList;
import java.util.Queue;

public class EarningOfBusDriverFinder {

	private int noOfGroups;
	private int[] groupSizes;
	private int busCapacity;
	private int noOfRounds;

	public EarningOfBusDriverFinder() {
	}

	public EarningOfBusDriverFinder(int noOfGroups, int[] groupSizes, int busCapacity, int noOfRounds) {
		this.noOfGroups = noOfGroups;
		this.groupSizes = groupSizes;
		this.busCapacity = busCapacity;
		this.noOfRounds = noOfRounds;
	}

	public int earningCalculator() {

		if (groupSizes.length == 0 || busCapacity <= 0 || noOfRounds <= 0)
			return 0;

		Queue<Integer> groupQueue = new LinkedList<Integer>();
		Queue<Integer> groupsInsideBusQueue = new LinkedList<Integer>();
		for (int groupSize : groupSizes) {
			groupQueue.offer(groupSize);
		}

		int countForRounds = 0;
		int earning = 0;
		while (countForRounds < noOfRounds) {

			int currentCapacity = 0;

			while (currentCapacity <= busCapacity) {
				Integer firstGrpSize = groupQueue.peek();

				if (firstGrpSize == null) {
					break;
				}

				if ((currentCapacity + firstGrpSize) <= busCapacity) {
					currentCapacity += firstGrpSize;
					Integer getGrpSize = groupQueue.poll();
					groupsInsideBusQueue.offer(getGrpSize);
				} else
					break;
			}

			while (!groupsInsideBusQueue.isEmpty()) {
				Integer grpSize = groupsInsideBusQueue.poll();
				groupQueue.offer(grpSize);
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

	public int[] getGroupSizes() {
		return groupSizes;
	}

	public int getNoOfRounds() {
		return noOfRounds;
	}

}
