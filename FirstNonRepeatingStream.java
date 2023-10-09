package q2;

import java.util.*;
import java.util.Map.Entry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

//logic put  characters, count=0 in hashmap if character appears again increase count
// make a linkedlist to store all coming characters
// add first non repeating till now into a queue
// if character appears for another time and is placed first in queue remove it along
// with linkedlist's first element ( at head) 
// if the updated head of linkedlist has a count >0 in hashmap remove it 
// queue has first non repeating character 

//hasmap Complexity: get/put/containsKey() operations are O(1) in average case
// LinkedList insert element E at front	O(1)

public class FirstNonRepeatingStream {
	HashMap<Character, Integer> list;
	LinkedList<Character> index;
	Queue<Character> queue;

	FirstNonRepeatingStream()// Constructor that initializes the data structure.
	{
		list = new HashMap<>();
		index = new LinkedList<>();
		queue = new LinkedList<>();
	}

	void add(char c)// Add a character to the stream.
	{
		Character p = c;
		if (p == null) {
			System.out.print("add operation : Character is null");

		} else {
			if (list.containsKey(p)) {
				list.put(p, list.get(p) + 1);

				if (queue.peek() == p) {
					queue.remove();
					index.removeFirst();

				}
				if (!index.isEmpty()) {
					if (list.get(index.getFirst()) != 0) {
						index.removeFirst();

					}
					if (queue.isEmpty()) {
						queue.add(index.getFirst());
					}
				}

			} else {
				list.put(p, 0);
				index.add(p);
				if (index.size() == 1) {
					queue.add(p);
				}

			}
		}
	}

	char getFirstNonRepeating()// : Retrieve the first non-repeating character from
	// the stream. Return '-' if no such character exists
	{
		if (queue.isEmpty()) {
			return '-';
		}

		return queue.peek();
	}
}

 
 
