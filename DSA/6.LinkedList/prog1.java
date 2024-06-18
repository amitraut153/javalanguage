// SinglyLinkedList

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
	
	//addFirst()
	void addFirst(int data){
		Node newNode=new Node(data);
		
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
	}
	//addLast
	void addLast(int data){

		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;

			while(temp.next != null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
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
	
	//delAtPos()
	void delAtPos(int pos){

		if(pos <=0 || pos >=countNode()+1){
			
			System.out.println("Wrong Input:");
			return;
		}
		if(pos ==1){
			//head=null;
			delFirst();
		}
		else if(pos ==countNode()){
			delLast();
		}
		else{
			Node temp=head;
			while(pos-2 !=0){
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
		}
	}
	//addAtPos()
	void addAtPos(int pos,int data){

		if(pos <=0 || pos>=countNode()+2){
			System.out.println("Wrong input");
			return;
		}
		if(pos==1){
			addFirst(data);
		}else if(pos ==countNode()+1){
			addLast(data);
		}
		else{		
	
			Node newNode=new Node(data);
			Node temp=head;

			while(pos-2 != 0){
				temp=temp.next;
				pos--;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

	//delFirst()
	
	void delFirst(){
		if(head==null){
			System.out.println("LinkedList is empty");
			return;
		}
		if(countNode()==1){
			head=null;
		}
		else{
			head=head.next;
		}
	}

	//delLast()
	void delLast(){
		if(head==null){
			System.out.println("LinkedList is empty");
		}
		if(countNode()==1){
			head=null;
		}
		else{
			Node temp=head;
			while(temp.next.next !=null){
				temp=temp.next;
			}
			temp.next=null;
		}

	}

	//printSLL()
	void printSLL(){
		
		if(head == null){
			System.out.println("Empty LinkedList");
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
}
/*
class Client{
	public static void main(String[]args){
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.printSLL();

		ll.addLast(15);
		ll.printSLL();
		
		ll.addAtPos(3,25);		
		ll.printSLL();
		
		ll.delFirst();
		ll.printSLL();
		
		ll.delLast();
		ll.printSLL();

		ll.delAtPos(2);
		ll.printSLL();
	}
}
*/
class Client{
	public static void main(String[]args){
		LinkedList ll=new LinkedList();

		char ch;
		do{

			System.out.println("Singly LinkedList");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delLast");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printSLL");
			

			System.out.println("Enter your choice: ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			switch(choice){
				case 1:{
						System.out.println("Enter How many no. of datas do you want: ");
						int num=sc.nextInt();											       
						for(int i=num; i>0; i--){
							System.out.println("Enter "+i+" position data: ");
							int data=sc.nextInt();
							ll.addFirst(data);
						}
				}
				break;

				case 2:{
					       
						System.out.println("Enter data:");
						int data=sc.nextInt();
						ll.addLast(data);
				}
				break;
				case 3:{
					       
						System.out.println("Enter data:");
						int data=sc.nextInt();
						System.out.println("Enter pos: ");
						int pos=sc.nextInt();
						ll.addAtPos(pos,data);
				}
				break;
				case 4:
					ll.delFirst();
					break;
				case 5:
					ll.delLast();
					break;
				case 6:{
						System.out.println("Enter pos to delete:");
						int pos=sc.nextInt();
						ll.delAtPos(pos);
				}
				break;
				case 7:{
					       int count=ll.countNode();
					       System.out.println(count);
				}
				break;
				case 8:
					ll.printSLL();
					break;
				default:
					System.out.println("Wrong Input");
					break;
			}
			System.out.println("Do you want to continue?");
			ch=sc.next().charAt(0);

		}while(ch =='Y' || ch=='y');
	}
}

