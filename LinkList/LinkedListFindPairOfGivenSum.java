package LinkList;


public class LinkedListFindPairOfGivenSum {
	
	Node head;
	Node tail;
	int n;
	public LinkedListFindPairOfGivenSum() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}
	class Node{
		Node next;
		Node pre;
		int item;
	}
	public void add(int item){
		Node last = tail.pre;
		Node x = new Node();
		x.item = item;
		x.pre = last;
		x.next = tail;
		tail.pre = x;
		last.next = x;
		n++;
	}
	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.item+" ");
			printNode = printNode.next;
		}
	}
	public void result(int sum){
		String[] result = new String[100];
		Node o = head.next;
		
		int count = 0;
		while(o!=tail){
			int first = o.item;
			Node i = o.next;
			while(i!=tail){
				int second = i.item;
				if((first+second)==sum){
					result[count] = first+" "+second; 
					count++;
				}
				i=i.next;
			}
			o=o.next;
		}
		for(int i = 0;i<result.length;i++){
			if(result[i]!=null) System.out.print("\nR: "+result[i]);

		}
		
	}
	public static void main(String[] args) {
		LinkedListFindPairOfGivenSum dd = new LinkedListFindPairOfGivenSum();
		dd.add(3);
		dd.add(6);
		dd.add(7);
		dd.add(8);
		dd.add(9);
		dd.add(10);
		dd.add(11);
		
		dd.print();
		dd.result(17);
	}
}
