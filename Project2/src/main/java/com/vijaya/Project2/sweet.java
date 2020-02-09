package com.vijaya.Project2;

public abstract class sweet {
  protected abstract String getType();
  int weight,cost;
  String name;
  sweet(String name,int weight,int cost){
	  this.name=name;
	  this.weight=weight;
	  this.cost=cost;
  }
}
