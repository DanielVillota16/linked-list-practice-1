package model;

public class List {

	private Node first;
	
	public List() {
		
	}
	
	public void mergeList(List al) {
		Node temp = al.getFirst();
		if(first == null) {
			first = temp;
		} else {
			Node match = first;
			while(temp != null) {
				Node toAdd = new Node(temp.getValue());
				if(temp.getValue() <= first.getValue()) {
					toAdd.setNext(first);
					first = toAdd;
				} else {
					while(match.getNext() != null && match.getNext().getValue() <= temp.getValue()) {
						match = match.getNext();
					}
					Node next = match.getNext();
					match.setNext(toAdd);
					toAdd.setNext(next);
				}
				temp = temp.getNext();
			}
		}
	}
	
	public void mergeRecursively(Node toAdd) {
		if(toAdd != null) {
			Node n = new Node(toAdd.getValue());
			if(toAdd.getValue() <= first.getValue()) {
				n.setNext(first);
				first = n;
			} else {
				Node match = first;
				while(match.getNext() != null && match.getNext().getValue() <= toAdd.getValue()) {
					match = match.getNext();
				}
				Node next = match.getNext();
				match.setNext(n);
				n.setNext(next);
			}
			mergeRecursively(toAdd.getNext());
		}
	}
	
	public String toString() {
		Node n = first;
		String s = "";
		while(n != null) {
			s+= n.getValue() + " ";
			n = n.getNext();
		}
		return s;
	}
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node f) {
		this.first = f;
	}
	
}
