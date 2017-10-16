package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public interface Manager {
	
	/**
	 * 
	 * @return el siguiente vehículo en funcion de la fecha y hora del sistema
	 * @throws Exception
	 */
	public abstract ITV getNext() throws Exception;
	/**
	 * This method returns a sorted list according to a comparator expression
	 * 
	 * @param comparator the sorting expression
	 * @return a sorted list according to a comparator expression
	 * @throws Exception when is null
	 */
	public abstract List<ITV> sort(Comparator<ITV> comparator) throws Exception;
	/**
	 * This method returns a list of ITV's from where
	 * 
	 * @param lugar the place
	 * @return a list of ITV's from where
	 * @throws Exception when where is null
	 */
	public abstract List<ITV> from(String lugar) throws Exception;
	
	/**
	 * This method returns a list of ITVs ranging from init to fin
	 * 
	 * @param ini initial date
	 * @param fin final date
	 * @return A list with ITV's in the range
	 * @throws Exception When is empty
	 */
	public abstract List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception;
}
