package dataStructures;

import java.util.*;

public class BalancedBrackets {
	
	public void balancedBrackets() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		populateHashMap(hm);
		while(sc.hasNextLine()) {
			char[] str = sc.nextLine().toCharArray();
			Stack<Character> stack = new Stack<Character>();
			boolean balanced = true;
			if(str.length%2!=0)
				balanced = false;
			if(balanced) {
				for(char c:str) {
					if(hm.containsKey(c)) {
						if(!stack.isEmpty()) {
							char comp = stack.pop();
							if(comp!=hm.get(c)) {
								balanced=false;
							}
						}
						else
							balanced = false;
					}
					else
						stack.push(c);
				}
			}
			if(balanced && stack.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	
	public void populateHashMap(HashMap<Character, Character> hm) {
		hm.put('}', '{');
		hm.put(')', '(');
		hm.put(']', '[');
	}
}
