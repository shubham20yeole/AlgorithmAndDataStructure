package LinkList;

public class a_DoublyLinkedList  {
	int n;
	Node head;
	Node tail;

	public a_DoublyLinkedList() {
		int item;
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}

	public class Node{
		Node pre;
		Node next;
		int item;
	}
	public void add(int data){
		Node last = tail.pre;
		Node x = new Node();
		x.item = data;
		x.next = tail;
		x.pre = last;
		tail.pre = x;
		last.next = x;
		n++;
	}
	public int getSize(){return n;}
	
	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.item+" ");
			printNode = printNode.next;
		}
//		System.out.println(", Head: "+head.item+", tail: "+tail.item);

	}
	public static void main(String[] args) {
		a_DoublyLinkedList dd = new a_DoublyLinkedList();
		dd.add(1);
		dd.add(2);
		dd.add(2);
		dd.print();
	}


}
