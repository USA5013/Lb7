package edu.wmich.cs1120.MaxChen.LA7;

//public class PriorityQueue<Request>{
public class PriorityQueue<E extends Comparable<E> >{
	private Node<E> head;
	public PriorityQueue() {
		head = null;
	}
	// Determine if the priority queue is empty.
	/**
	 * @return if head is null or not
	 * test head
	 */
	 public boolean isEmpty() {
		return head == null;
	}
	// Add object received to the priority queue taking into consideration the rules governing priority.
	 /**
		 * @param data from request
		 * see who have the priority to get into the class
		 */
	 public void enqueue(E data) {
		
		Node<E> neno = new Node<E>(data);
		Node<E> temp = head;
		if (isEmpty()) {
			head = temp;
		}
		if(head == null || head.dataValue.compareTo(neno.dataValue)== 1){
			neno.nextNode = head;
			head = neno;
			
		}
		else {
			
			while(temp.nextNode != null && (temp.nextNode.dataValue.compareTo(neno.dataValue)== -1)) {
				temp = temp.nextNode;
			}
			neno.nextNode = temp.nextNode;
			temp.nextNode = neno;
		}
	}
	// Remove the object with highest priority (at the front of the queue) from the priority queue.
	 @SuppressWarnings("unchecked")
	 /**
		 * @return the request
		 * dequeue the highest priority request
		 */
	public E dequeue() {
//		if ( isEmpty()) {
//			return null;
//		}
//		E data = head.dataValue;
//		if (head == )
		if (head != null) {
		Node<E> temp = head;
		
		head = head.nextNode;
		
		return temp.getData();
		}
		else {
			return null;
		}
	 }
	
}
