/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDateTime;
import java.util.Comparator;

/**
 * @author iaw26509397
 *
 */
public class ITVDateComparator implements Comparator<ITV> {

	/**
	 * 
	 */
	public ITVDateComparator() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getFecha().compareTo(itv2.getFecha());
	}
}
