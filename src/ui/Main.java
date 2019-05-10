package ui;

import model.*;

public class Main {

	public static void main(String[] args) {
		Node n = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(5);
		Node n3 = new Node(8);
		n.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		
		List l = new List();
		l.setFirst(n);
		
		Node s = new Node(0);
		Node s1 = new Node(0);
		Node s2 = new Node(6);
		Node s3 = new Node(94);
		
		s.setNext(s1);
		s1.setNext(s2);
		s2.setNext(s3);
		
		List al = new List();
		al.setFirst(s);
		
		l.mergeRecursively(al.getFirst());
		
		System.out.println(l);
	}

}
