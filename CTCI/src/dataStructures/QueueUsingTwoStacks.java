package dataStructures;

import java.util.*;

public class QueueUsingTwoStacks {

	public void queueUsingTwoStacks() {
		ModifiedQueue<Integer> queue = new ModifiedQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(sc.hasNextLine()) {
			int op = sc.nextInt();
			if(op==1) {
				int val = sc.nextInt();
				queue.enqueue(val);
			}
			else {
				queue.dequeueOrPrint(op);
			}
		}
		sc.close();
	}	
}

class ModifiedQueue<Object> {
	Stack<Object> stack1 = new Stack<Object>();
	Stack<Object> stack2 = new Stack<Object>();
	
	public void enqueue(Object i) {
		stack1.push(i);
	}
	public void dequeueOrPrint(int op) {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if(op==2) {
			stack2.pop();
		}
		else {
			System.out.println(stack2.peek());
		}
	}
}
