//Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

package LinkList;

public class b_LinkedList_Palindrome_check_  {
	int n;
	Node head;
	Node tail;

	public b_LinkedList_Palindrome_check_() {
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

	}
	public boolean palindrome(int size){
		boolean result=false;
		Node temp = head.next;
		Node temp2 = tail.pre;
		int r = size/2;
		int l = size - r;

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
		b_LinkedList_Palindrome_check_ dd = new b_LinkedList_Palindrome_check_();
		dd.add(1);
		dd.add(2);
		dd.add(2);
		dd.print();
		System.out.println("\n"+dd.palindrome(dd.getSize()));
	}


}
