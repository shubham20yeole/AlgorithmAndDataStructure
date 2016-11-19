//Union and Intersection of two Linked Lists
//Given two Linked Lists, create union and intersection lists that contain union and intersection of the elements present in the given lists. Order of elments in output lists doesn’t matter.

//Following are simple algorithms to get union and intersection lists respectively.

//Intersection (list1, list2)
//Initialize result list as NULL. Traverse list1 and look for its each element in list2, if the element is present in list2, then add the element to result.

//Union (list1, list2):
//Initialize result list as NULL. Traverse list1 and add all of its elements to the result.
//Traverse list2. If an element of list2 is already present in result then do not insert it to result, otherwise insert.

package LinkList;


public class c_LinkedList_UnionAndIntersection {

	int n;
	Node head;
	Node tail;
	public c_LinkedList_UnionAndIntersection() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}
	private class Node{
		private Node prev;
		private Node next;
		private int data;
	}
	public void add(int data){
		Node last = tail.prev;
		Node newNode = new Node();
		newNode.data = data;
		last.next = newNode;
		tail.prev = newNode;
		newNode.next = tail;
		newNode.prev = last;
		n++;
	}
	public int getSize(){return n;}

	public void print(c_LinkedList_UnionAndIntersection linkedList){
		Node printNode = linkedList.head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.next;
		}
		System.out.println();
	}
	private static void intersection(c_LinkedList_UnionAndIntersection object_1,
			c_LinkedList_UnionAndIntersection object_2) {
		int length1 = object_1.n;
		int length2 = object_2.n;
		c_LinkedList_UnionAndIntersection result = new c_LinkedList_UnionAndIntersection();
		
		System.out.println(length1+", "+length2);
		
		
	}
	public static void main(String[] args) {
		c_LinkedList_UnionAndIntersection object_1 = new c_LinkedList_UnionAndIntersection();
		
		c_LinkedList_UnionAndIntersection object_2 = new c_LinkedList_UnionAndIntersection();
		
		object_1.add(1);		object_1.add(2);		object_1.add(3);
		object_2.add(3);		object_2.add(4);		object_2.add(5); object_2.add(88);
		
		System.out.print("1st LinkedList: "); object_1.print(object_1);
		System.out.print("2nd LinkedList: "); object_2.print(object_2);
		
		intersection(object_1, object_2);
		
		
		
	}
	
}
