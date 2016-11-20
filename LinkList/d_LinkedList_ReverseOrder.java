
//Print Linked List Elements in Reverse order

//Write a program to print elements of a linked list in reverse order by using same single linked list.

//Solution: We can solve this problem without actually reversing the linked list. Using recursion we have given the below solution. This implementation will be internally using stack to store each recursive function call.

package LinkList;

import LinkList.b_LinkedList_Palindrome_check_.Node;

public class d_LinkedList_ReverseOrder {

	Node head;
	Node tail;
	int n;

	public d_LinkedList_ReverseOrder() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	private class Node{
		Node prev;
		Node next;
		int data;
	}

	public void add(int data){
		Node last = tail.prev;
		Node x = new Node();
		x.data = data;
		x.prev = last;
		x.next = tail;
		tail.prev = x;
		last.next =x;
		n++;
	}
	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.next;
		}
		System.out.println();
	}
	public void printReverse(){
		Node printNode = tail.prev;
		while (printNode != head)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.prev;
		}
		System.out.println();

	}
	public static void main(String[] args) {
		d_LinkedList_ReverseOrder dd = new d_LinkedList_ReverseOrder();
		dd.add(1);
		dd.add(2);
		dd.add(3);
		dd.add(4);
		dd.add(5);
		dd.add(6);
		dd.add(7);
		dd.add(8);
		dd.add(9);
		dd.add(10);
		System.out.print("Original order: ");dd.print();
		System.out.print("Reverse_ order: ");dd.printReverse();
	}

}
