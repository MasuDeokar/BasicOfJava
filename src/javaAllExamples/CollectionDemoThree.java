package javaAllExamples;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemoThree {

	public static void main(String[] args) {

		        int a[] = { 4, 5, 5, 5, 6, 6, 9, 4, 4 };
		        
		        Map<Integer, Integer> frequencyMap = new HashMap<>();
		        
		        for (int num : a) {
		            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		        }
		        
		        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
		            if (entry.getValue() == 1) {
		                System.out.println("Unique number is:- " + entry.getKey());
		            }
		        }
		    }
		}


	
