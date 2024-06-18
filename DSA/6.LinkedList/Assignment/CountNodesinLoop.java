import java.util.*;
class Node{
	
	Node prev=null;
	int data;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{

	Node head=null;

	void addLast(int data){
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

	void addAtPos(int data,int pos){
		Node newNode=new Node(data);

		if(head ==null)
			head=newNode;
		if(pos<=0 || pos>=countNode()+2){

			System.out.println("Wrong input..");
			return;
		}
		else if(pos ==1){
			addLast(data);
		}
		else if(pos ==countNode()+1){
			addLast(data);
		}
		else{
			Node temp=head;
			while(pos-2 !=0){
				temp=temp.next;
				pos--;
			}
			newNode.prev=temp;
			newNode.next=temp.next;
			temp.next=newNode;
			temp.next.prev=newNode;
		}
	}
	int countNode(){
		int count=0;
		Node temp=head;

		while(temp !=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
}
class Client{

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		char ch;

		do{
			System.out.println("1.addLast ");
			System.out.println("2.countNode ");
			System.out.println("3.addAtPos ");

			System.out.println("Enter your choice:");
			int choice=sc.nextInt();

			switch(choice){
				case 1:{
					       System.out.println("Enter data:");
					       int data=sc.nextInt();
					       ll.addLast(data);
					}break;

				case 2:{				
						int count=ll.countNode();
						System.out.println(count);
					}break;
				case 3:{
					       System.out.println("Enter data: ");
					       int data=sc.nextInt();
					       System.out.println("Enter position to add data: ");
					       int pos=sc.nextInt();
					}break;
				default :
				       System.out.println("Wrong choice: ");
				       break;
			}
			System.out.println("Do you want to continue: ");
			ch=sc.next().charAt(0);
		}while(ch== 'Y' || ch=='y');
	}
}

