package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {


	// First one top element.
   // afterwards we remove the next one;

	public static void main(String[] args) {

	Queue<String> queue = new LinkedList<>();
			queue.add("MN");
			queue.add("CA");
			queue.add("NJ");
			queue.add("WA");
			queue.add("TX");

			System.out.println(queue.peek());
			System.out.println(queue.remove());
			System.out.println(queue.peek());

	Iterator <String> it = queue.iterator();
	while (it.hasNext()) {
			System.out.println(it);
		}




	}

	}


