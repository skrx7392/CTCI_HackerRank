package dataStructures;

import java.util.*;

public class MakingAnagrams {
	
	public void makingAnagrams() {
		Scanner sc = new Scanner(System.in);
		char[] line1 = sc.nextLine().toCharArray();
		char[] line2 = sc.nextLine().toCharArray();
		sc.close();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		if(line1.length>line2.length) {
			hm = createHashMap(line1);
			System.out.println(countDifference(hm, line2));
		}	
		else {
			hm = createHashMap(line2);
			System.out.println(countDifference(hm, line1));
		}	
	}
	
	private HashMap<Character, Integer> createHashMap(char[] line) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c: line) {
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}
			else {
				int count = hm.get(c);
				hm.replace(c, count, count+1);
			}
		}
		return hm;
	}
	
	private int countDifference(HashMap<Character, Integer> hm, char[] line) {
		int count = 0;
		for(char c:line) {
			if(!hm.containsKey(c))
				count++;
			else {
				int temp = hm.get(c);
				if(temp!=1)
					hm.replace(c, temp, temp-1);
				else
					hm.remove(c);
			}
		}
		for(char c:hm.keySet())
			count+=hm.get(c);
		return count;
	}
}
