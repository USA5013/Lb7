package edu.wmich.cs1120.MaxChen.LA7;

public class Node<E> implements INode{

	public E dataValue;
	public Node<E> nextNode;
	
	Node(E dataValue){
		this.dataValue = dataValue;
	}
	Node(E dataValue, Node<E> nextNode){
		this.dataValue = dataValue;
		this.nextNode = nextNode;
	}
	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return dataValue;
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return nextNode;
	}

	@Override
	public void setNext(Node next) {
		// TODO Auto-generated method stub
		this.nextNode = next;
	}
	


}
