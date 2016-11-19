package LinkList;

public class LinkList {

	Node head;
	Node tail;

	class Node{
		int data;
		Node next;
		Node pre;
		Node(int data) {
			this.data = data;
		}

	}

	public void add(int data){

		Node newNode = new Node(data);

		if(head ==  null && tail == null){
			head = tail = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}

	public void print(){
		Node printNode = head;
		while (printNode != null)
		{
			System.out.print(printNode.data+" ");
			printNode = printNode.next;
		}
		System.out.println(", Head: "+head.data+", tail: "+tail.data);
	}

	public static void main(String[] args) {
		LinkList ll=new LinkList();
		ll.add(1);
		ll.add(22);
		ll.add(33);
		ll.add(45);
		ll.add(44);
		ll.add(45);
		ll.add(55);
		ll.add(66);
		ll.add(12);
		ll.print();
	}

}
