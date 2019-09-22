package com.interview.indWealth;


import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.interview.indWealth.EarningOfBusDriverFinder;

public class EarningOfBusDriverFinderTest {
	
	private EarningOfBusDriverFinder earningFinder;
	
	@Before
	public void setUp() throws Exception {
		earningFinder = new EarningOfBusDriverFinder();
		int[] groupSizes = {2, 4, 3, 5};
		earningFinder.setNoOfGroups(4);
		earningFinder.setNoOfRounds(4);
		earningFinder.setBusCapacity(7);
		earningFinder.setGroupSizes(groupSizes);
	}
	
	@Test
	public void earningCalculatorTest1() {
		int exceptedOutput = 23;
		assertEquals(exceptedOutput, earningFinder.earningCalculator());		
	}
	
	@Test
	public void earningCalculatorTest2() {
		int[] groupSizes = {5, 6};
		earningFinder.setNoOfGroups(2);
		earningFinder.setGroupSizes(groupSizes);
		earningFinder.setBusCapacity(4);
		earningFinder.setNoOfRounds(2);
		
		int exceptedEarning  = 0;
		assertEquals(exceptedEarning, earningFinder.earningCalculator());
	}
	
	@Test
	public void earningCalculatorTest3() {
		int[] groupSizes = {};
		earningFinder.setNoOfGroups(2);
		earningFinder.setGroupSizes(groupSizes);
		earningFinder.setBusCapacity(4);
		earningFinder.setNoOfRounds(2);
		
		int exceptedEarning  = 0;
		assertEquals(exceptedEarning, earningFinder.earningCalculator());
		
		earningFinder.setBusCapacity(0);
		int exceptedEarning1  = 0;
		assertEquals(exceptedEarning1, earningFinder.earningCalculator());
		
		earningFinder.setBusCapacity(4);
		earningFinder.setNoOfGroups(0);
		int exceptedEarning2  = 0;
		assertEquals(exceptedEarning2, earningFinder.earningCalculator());
	}
	
	@After
    public void after() throws Exception {
		earningFinder = null;
	}

}
