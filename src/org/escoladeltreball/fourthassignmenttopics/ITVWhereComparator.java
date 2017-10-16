/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.util.Comparator;

/**
 * @author iaw26509397
 *
 */
public class ITVWhereComparator implements Comparator<ITV> {


	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITV itv1, ITV itv2) {

		return itv1.getLugar().compareTo(itv2.getLugar());
	}

}
