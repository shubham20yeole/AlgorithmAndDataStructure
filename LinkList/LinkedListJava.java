package LinkList;

public class LinkedListJava {

	int n;
	Node head;
	Node tail;
	
	public LinkedListJava() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head; 
	}
	
	class Node{
		Node next;
		Node prev;
		int data;		
	}
	
	// 0 1 2 3 9 0                            9
	
	public void add(int data){
		Node last = tail.prev;
		
		Node newNode = new Node();
		
		newNode.data = data;
		
		newNode.next = tail;
		newNode.prev = last;
		
		tail.prev = newNode;
		last.next = newNode;
		
		n++;
	}
	private void insertAfter(int position, int newData) {
		Node temp = head;
		while(temp!=tail){
			
			if(temp.data == position){
				Node x = new Node();
				
				x.data = newData;
				
				x.next = temp.next;
				x.prev = temp;
				
				temp.prev = x.next;
				temp.next = x;
			}
			
			temp=temp.next;
		}
		
	}
	
	public int getSize(){return n;}
	
	
	public void print(){
		Node printNode = head;
		while(printNode!=tail.next){
			System.out.print(printNode.data+", ");
			printNode = printNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListJava ll = new LinkedListJava();
		ll.add(1);
		ll.add(2);
		ll.add(33);
		ll.add(100);
		ll.add(120);
		ll.add(150);
		ll.print();
		ll.insertAfter(33,45);
		ll.print();
	}

	
}
