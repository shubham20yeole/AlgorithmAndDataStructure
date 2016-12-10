package LinkList;

import LinkList.b_LinkedList_Palindrome_check_.Node;

public class f_LinkedList_sorting {
	Node head;
	Node tail;
	int n;

	public f_LinkedList_sorting() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;

	}
	private class Node{
		private Node next;
		private Node prev;
		private int data;
	}
	public void add(int data){
		Node last = tail.prev;
		Node x = new Node();
		x.data = data;
		x.next = tail;
		x.prev = last;
		tail.prev = x;
		last.next = x;
		n++;
	}
	public int getSize(){ return n;}
	
	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.next;
		}

	}
	public static void main(String[] args) {
		f_LinkedList_sorting dd = new f_LinkedList_sorting();
		dd.add(1);
		dd.add(2);
		dd.add(66);
		dd.add(3);
		dd.add(2);
		dd.add(11);
		dd.print();
	}

}
