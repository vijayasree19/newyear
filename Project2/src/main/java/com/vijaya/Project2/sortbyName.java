package com.vijaya.Project2;

import java.util.Comparator;
public class sortbyName implements Comparator<sweet> {
      
	public int compare(sweet g1,sweet g2) {
		return g1.name.compareTo(g2.name);
	}
}
