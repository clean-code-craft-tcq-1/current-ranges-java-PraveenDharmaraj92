package monitor;

import java.util.ArrayList;
import java.util.List;

public class CurrentRange {

	private List<Integer> rangeList = new ArrayList<>();

	private int numOfUniqueReadings;

	public List<Integer> getRangeList() {
		return rangeList;
	}

	public void setRangeList(List<Integer> rangeList) {
		this.rangeList = rangeList;
	}

	public int getNumOfUniqueReadings() {
		return numOfUniqueReadings;
	}

	public void setNumOfUniqueReadings(int numOfUniqueReadings) {
		this.numOfUniqueReadings = numOfUniqueReadings;
	}

}
