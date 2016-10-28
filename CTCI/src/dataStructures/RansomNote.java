package dataStructures;

import java.util.*;

public class RansomNote {
	
	public void ransomNote() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		String[] str1 = sc.nextLine().split(" ");
		String[] str2 = sc.nextLine().split(" ");
		sc.close();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String str : str1) {
			if(!hm.containsKey(str))
				hm.put(str, 1);
			else {
				int count = hm.get(str);
				hm.replace(str, count, count+1);
			}
		}
		boolean res = true;
		for(String str:str2) {
			if(!hm.containsKey(str))
				res = false;
			else {
				int count = hm.get(str);
				if(count==1)
					hm.remove(str);
				else
					hm.replace(str, count, count-1);
			}
		}
		if(res)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
