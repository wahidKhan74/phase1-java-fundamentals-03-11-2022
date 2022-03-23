package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Queue is a data structure which works in first in first out order.
		Queue<String> peopleQueue = new ArrayDeque<String>();

		// add elements in queue
		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("David");
		peopleQueue.add("John");
		peopleQueue.add("Carl");
		peopleQueue.add("Aria");

		System.out.println(peopleQueue);

		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		System.out.println("Head :> " + peopleQueue.element());

		// remove element from head
		String removedElem = peopleQueue.poll();
		System.out.println("Removed elem :> " + removedElem);

		// remove element from head
		String removedElem2 = peopleQueue.poll();
		System.out.println("Removed elem :> " + removedElem2);

		System.out.println(peopleQueue);

		System.out.println("---------------");
		// iteration over
		for (String person : peopleQueue) {
			System.out.println(person);
		}
	}

}
