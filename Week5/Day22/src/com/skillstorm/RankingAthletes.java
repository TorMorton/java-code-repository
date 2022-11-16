package com.skillstorm;

//Given an Athlete class that details the aspects of a particular athlete (name, career wins, career losses), add the implementation that allows the comparison of two distinct athletes based on their overall win percentage. You may do so using your choice of either the Comparable or Comparator interface and implementing its respective comparison method. Done correctly, a player with a career win rate of 67% should be considered "greater" than a player with a total career win rate of 50%.

//Requirements:

//    Use either the Comparable or Comparator interface to enable the comparison of Player objects
//    Successfully rank Players based upon their overall career win rate
//    Throws an exception if either Player being compared is null in value

//Bonus Challenge:

//Given what we implemented above, a player with 1 win and 0 losses has a 100% win rate and will be considered a "better" player than one with 999 career wins and 1 career loss. Alter your comparison method to only use win rate comparison if they have played over 30 games total; if not, instead compare their total number of wins as a better metric.


import java.util.Comparator;

public class RankingAthletes implements Comparator<Athlete>{

	
	
	
	@Override
	public int compare(Athlete o1, Athlete o2) {
		if (o1.getName() == null || o2.getName() == null) {
			throw new IllegalArgumentException("Please input a valid athlete.");
		} else {
			return (int)(o1.getCareerAverage() - o2.getCareerAverage());
		} 

	}
	
	

}
