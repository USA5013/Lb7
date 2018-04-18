package edu.wmich.cs1120.MaxChen.LA7;

//public class PriorityQueue<Request>{
public class PriorityQueue<E extends Comparable<E> >{
	private Node<E> head;
	public PriorityQueue() {
		head = null;
	}
	// Determine if the priority queue is empty.
	 public boolean isEmpty() {
		return head == null;
	}
	// Add object received to the priority queue taking into consideration the rules governing priority.
	 public void enqueue(E data) {
		
		Node<E> neno = new Node<E>(data);
		Node<E> temp;
		
		if(head == null || head.dataValue.compareTo(neno.dataValue)== 1){
			neno.nextNode = head;
			head = neno;
		}
		else {
			temp = head;
			while(temp.nextNode != null && (temp.nextNode.dataValue.compareTo(neno.dataValue)== -1)) {
				temp = temp.nextNode;
			}
			neno.nextNode = temp.nextNode;
			temp.nextNode = neno;
		}
	}
	// Remove the object with highest priority (at the front of the queue) from the priority queue.
	 @SuppressWarnings("unchecked")
	public E dequeue() {
		 Node<E> temp = null;
		 Node<E> temp1 = head;
		 Node<E> temp2 = temp1;
		 while (temp1.nextNode != null) {
			 temp = temp1;
			 temp1 = temp1.nextNode;
		 }
		temp.nextNode = null;
		return (E) temp2;
	 }
	
}
