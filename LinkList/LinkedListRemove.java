package LinkList;

public class LinkedListRemove {
	Node firstHead;
	class Node{
		String item;
		Node next;
		Node(String itm){
			item=itm;
			next=null;
		}
	}
	public void push(String n){
		Node freshNode=new Node(n);
		freshNode.next = firstHead;
		firstHead = freshNode;
	}
	public void insertAfter(Node previousNode,String n){
		Node freshNode=new Node(n);
		if(previousNode==null){
			System.out.println("previousNodeious Node can not be equal to null");
		}
		freshNode.next=previousNode.next;
		previousNode.next=freshNode;
	}
	
	public void printMethod()
	{
		Node printNode = firstHead;
		while (printNode != null)
		{
			System.out.print(printNode.item+" ");
			printNode = printNode.next;
		}
	}
	void remove(Node firstHeadd,String key){
		Node temp=firstHeadd,previousNode=null;
		//deleat fist node logic
		if (firstHeadd.item==key){
			firstHeadd=firstHeadd.next;
		}
		while(firstHeadd!=null && temp.item==key){//search for the key
			firstHeadd=temp.next; //deleat the mentioned node
			return;
		}
		while(temp!=null && temp.item!=key){
			previousNode=temp;
			temp=temp.next;
		}
		if(temp==null)	return;
		previousNode.next=temp.next;
	}
	public static void main(String[] args) {
		LinkedListRemove ll=new LinkedListRemove();
		ll.push(",NYC)");
		ll.push("(Pace University");
		ll.push("from");
		ll.push("Yeole");
		ll.push("Dilip");
		ll.push("Shubham");
		ll.push("is");
		ll.push("name");
		ll.push("my");
		ll.push("Hello,");
		System.out.println("\nLinked list BEFORE removal method: ");
		ll.printMethod();
		ll.remove(ll.firstHead, "from");
		ll.remove(ll.firstHead, "(Pace University");
		ll.remove(ll.firstHead, ",NYC)");
		System.out.println("\n\nLinked list AFTER removal method: ");
		ll.printMethod();


	}
}
