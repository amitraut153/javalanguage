
import java.util.*;
class Node{
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head=null;

	//addNode
	void addNode(int data){

		Node newNode=new Node(data);
		if(head ==null)
			head = newNode;
		else{
			Node temp=head;
			while(temp.next !=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	//printLL()
	void printLL(){
		if(head==null){
			System.out.println("LinkedList is empty");
			return;
		}
		else{
			Node temp=head;
			while(temp.next !=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	//reverseItr
	void reverseItr(){

		if(head==null){
			return;
		}

		Node prev=null;
		Node curr=head;
		Node forward=null;
		while(curr != null){
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		head=prev;
	}

	void reverseRec(Node prev,Node curr){
		
		if(curr ==null){
			head=prev;
			return;
		}else{

			Node forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		reverseRec(prev,curr);
	}
	//countNode()
	int countNode(){
		Node temp=head;
		int count=0;

		while(temp !=null){
			count++;
			temp=temp.next;

		}
		return count;
	}

	//Approach1
	
	void middleNode1(){
		int len=countNode();
		Node temp=head;

		int cnt=0;
		while(cnt<len/2){
			temp=temp.next;
			cnt++;
		}
		System.out.println(temp.data);
	}
	void middleNode2(){
		if(head==null)
			return;
	
		Node slow=head;
		Node fast=head.next;

		while(fast!=null){
			
			fast=fast.next;
			if(fast !=null){
				fast=fast.next;
			}
			
			slow=slow.next;
		}
		System.out.println(slow.data);	
	}
}

class Client{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		char ch;

		do{
			System.out.println("1.addNode");
			System.out.println("2.printLL");
			System.out.println("3.reverseItr");
			System.out.println("4.reverseRec");
			System.out.println("5.MiddleNode 1");
			System.out.println("6.MiddleNode 2");

			System.out.println("Enter Your Choice:");
			int choice=sc.nextInt();

			switch(choice){

				case 1:
					{
						System.out.println("Enter data");
						int data=sc.nextInt();
						ll.addNode(data);
					}
					break;

				case 2:
					ll.printLL();
					break;

				case 3:
					ll.reverseItr();
					break;

				case 4:
					{
						Node prev=null;

						ll.reverseRec(prev,ll.head);
					}
					break;
				case 5:
					ll.middleNode1();
					break;

				case 6:
					ll.middleNode2();
					break;

				default :
					System.out.println("Wrong choice:");
					break;
		
			}
			System.out.println("Do you want to continue:");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}	
