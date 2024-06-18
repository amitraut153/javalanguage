
class Node{

	int data;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{

	Node head=null;

	void addNode(int data){
		Node newNode=new Node(data);
		if(head==null)
			head=newNode;
		else{
			Node temp=head;
			while(temp.next !=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	int countNode(){
		Node temp=head;
		int count=0;

		while(temp !=null){
			count++;
			temp=temp.next;
		}
		//System.out.println(count);
		return count;
	}
}
class Client{

	public static void main(String[]args){
		
		
		LinkedList ll=new LinkedList();

		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(6);
		ll.addNode(7);
		ll.addNode(8);

		int count=ll.countNode();
		System.out.println(count);
	}
}
