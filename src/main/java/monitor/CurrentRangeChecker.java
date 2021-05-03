package monitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Class to monitor currentRange
 *
 */
public class CurrentRangeChecker {

	public List<CurrentRange> checkRange(List<Integer> currentReadingList) {
		// sort reading list in ascending order
		Collections.sort(currentReadingList);
		List<CurrentRange> modelList = new ArrayList<>();
		Iterator<Integer> readingListIterator = currentReadingList.iterator();

		CurrentRange model = new CurrentRange();
		Integer currentReading = readingListIterator.next();
		while (readingListIterator.hasNext()) {
			Integer nextReading = readingListIterator.next();
			model.getRangeList().add(currentReading);

			// check for sequence
			if (nextReading - currentReading == 1) {
				modelList.add(model);
				model = new CurrentRange();
			}
			currentReading = nextReading;
		}
		return modelList;
	}

}
