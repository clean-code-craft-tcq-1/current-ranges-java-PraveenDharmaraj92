package monitor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CurrentRangeCheckerTestSuite {

	@Test
	public void givenCurrentReadingsCheckRangeReturnRange() {
		CurrentRangeChecker monitor = new CurrentRangeChecker();
		List<Integer> currentReadingList = new ArrayList<>();
		currentReadingList.add(9);
		currentReadingList.add(3);
		currentReadingList.add(1);
		currentReadingList.add(4);
		currentReadingList.add(10);
		currentReadingList.add(12);
		currentReadingList.add(11);
		currentReadingList.add(15);
		List<CurrentRange> rangeList = monitor.checkRange(currentReadingList);
		Assert.assertTrue(rangeList.size() > 0);
	}

	@Test
	public void givenEmptyCurrentReadingsCheckRangeReturnRange() {
		CurrentRangeChecker monitor = new CurrentRangeChecker();
		List<Integer> currentReadingList = new ArrayList<>();
		List<CurrentRange> rangeList = monitor.checkRange(currentReadingList);
		Assert.assertTrue(rangeList.size() > 0);
	}

}
