/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author iaw26509397
 *
 */
public class ITVManagerImpl extends ITVManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ITVManagerImpl(String itvFile) throws Exception {
		super(itvFile);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.fourthassignmenttopics.Manager#getNext()
	 */
	@Override
	public ITV getNext() throws Exception {
		//LocalTime, LocalDate, LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		List<ITV> itvsSortedByDate = sort(new ITVDateComparator());
		for (ITV itv : itvsSortedByDate) {
			if (now.isBefore(itv.getFecha())) {
				return itv;
			}
		}
		return null;
	}
	
	public List<ITV> sort(Comparator<ITV> comparator) throws Exception {
		List<ITV> itvsSorted = new ArrayList<>(itvs);
		Collections.sort(itvsSorted, comparator);
		return itvsSorted;
	}
	
	public List<ITV> from(String lugar) throws Exception {
		List<ITV> net = (List<ITV>) itvs.stream().filter(itv -> itv.getLugar().equals(lugar));
		return net;
	}

	@Override
	public List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		//List<ITV> itvDateIni = new Array 
		return null;
	}

}
