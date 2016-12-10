
//Remove Duplicates from a Linked List

//Given an unsorted linked list, and without using a temporary buffer, write a method that will delete any duplicates from the linked list. 

package LinkList;

import java.util.HashMap;

public class e_linkedList_RemoveDublicate {

	Node head;
	Node tail;
	int n;

	public e_linkedList_RemoveDublicate() {
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
		while (printNode != null)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.next;
		}
		System.out.println();
	}
	private void removeDuplicateByHashMap() {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Node cn = head.next;
		Node pn = head;
		
		while(cn!=null){
			if(hm.containsKey(cn.data)){
				pn.next = cn.next;
				cn = cn.next;
			}else{
				hm.put(cn.data, 1);
				pn = cn;
				cn = cn.next;
			}
		}
	}
	public void removeDuplicate(){
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;

		/* Pick elements one by one */
		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			/* Compare the picked element with rest of the elements */
			while (ptr2.next != null) {

				/* If duplicate then delete it */
				if (ptr1.data == ptr2.next.data) {

					/* sequence of steps is important here */
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				} else /* This is tricky */ {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	public static void main(String[] args) {
		e_linkedList_RemoveDublicate dd = new e_linkedList_RemoveDublicate();
		dd.add(1);
		dd.add(2);
		dd.add(7);
		dd.add(4);
		dd.add(5);
		dd.add(6);
		dd.add(7);
		dd.add(7);
		dd.add(9);
		dd.add(10);
		System.out.print("Original order: ");dd.print();
		//		dd.removeDuplicate();
		//		System.out.print("Removed duplic: ");dd.print();
		dd.removeDuplicateByHashMap();
		System.out.print("Removed duplic: ");dd.print();
	}
}
