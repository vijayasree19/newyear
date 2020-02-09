package com.vijaya.Project2;

import com.vijaya.Project2.sweet;

public class Candy extends sweet{
      Candy(String name, int weight, int cost) {
		super(name, weight, cost);
		// TODO Auto-generated constructor stub
	}

	protected String getType(){
    	  return "candy";
      }
}
