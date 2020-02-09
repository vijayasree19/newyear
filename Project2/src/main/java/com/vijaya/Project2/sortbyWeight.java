package com.vijaya.Project2;

import java.util.Comparator;
public class sortbyWeight implements Comparator<sweet> {
      
	public int compare(sweet g1,sweet g2) {
		return g1.weight-g2.weight;
	}
}
