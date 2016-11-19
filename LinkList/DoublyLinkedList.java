package LinkList;

public class DoublyLinkedList  {
	int n;
	Node head;
	Node tail;

	public DoublyLinkedList() {
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
	public boolean palindrome(int size){
		boolean result=false;
		Node temp = head.next;
		Node temp2 = tail.pre;
		int r = size/2;
		int l = size - r;
//		System.out.println(r+", "+l);

		while(r!=0 && l!=0){
			if(temp.item == temp2.item) result = true;
			else{
				result = false;
				break;
			}
			temp=temp.next;
			temp2=temp2.pre;
			r--;
			l--;
		}
		return result;
	}
	public static void main(String[] args) {
		DoublyLinkedList dd = new DoublyLinkedList();
		dd.add(1);
		dd.add(2);
		dd.add(2);
		dd.print();
		System.out.println(dd.palindrome(dd.getSize()));
	}


}
