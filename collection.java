package ternaryoperator;

	import java.util.Collections;
	import java.util.HashMap;
	import java.util.Map;

	public class collection {
	    public static void main(String[] args) {
	    
	        Map<String, Integer> players = new HashMap<>();

	     
	        players.put("Rahul", 85);
	        players.put("Priya", 95);
	        players.put("Arjun", 72);
	        players.put("Sneha", 95);
	        players.put("Kiran", 88);

	      
	        System.out.println("Tournament Leaderboard");
	        for (String name : players.keySet()) {
	            System.out.println(name + ": " + players.get(name));
	        }

	        int highestScore = Collections.max(players.values());
	        System.out.println("\nHighest Score:\n" + highestScore);

	     
	        players.remove("Arjun");
	        System.out.println("\nAfter Removing Arjun:");
	        for (String name : players.keySet()) {
	            System.out.println(name + ": " + players.get(name));
	        }
	    }
	}