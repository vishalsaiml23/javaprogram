package LINKED_LIST;
import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SINGLY_LIST {
 Node head = null;
 // Insert at the end
 
 void insert(int data) {
	 Node newNode = new Node(data);
	 if(head == null) {
		 head = newNode;
	 }else {
		 Node temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 temp.next = newNode;
	 }
	 System.out.println("Node insert successfully");
 }
 
 //Delete a nod
  void delete(int key){
	  if(head == null) {
		  System.out.println("List is empty");
		  return;
	  }
	  if(head.data == key) {
		  head = head.next;
		  System.out.println("Node delete successfully.");
		  return;
	  }
	  Node temp = head;
	  Node prev = null;
	  while(temp != null && temp.data != key) {
		  prev = temp;
		  temp = temp.next;
	  }
	  if(temp == null) {
		  System.out.println("Node not found");
	  }else {
		  prev.next = temp.next;
		  System.out.println("Node delete successfully");
	  }
  }
  
  //Search a node
  
  void search(int key) {
	  Node temp = head;
	  int position = 1;
	  
	  while (temp != null) {
		  if(temp.data == key) {
			  System.out.println("Element found at position "+position);
			  return;
		  }
		  temp = temp.next;
		  position++;
	  }
	  System.out.println("Element not found");
  }
  
  // Traverse the list
  
  void traverse() {
	  if  (head == null) {
		  System.out.println("List is empty");
		  return;
	  }
	  Node temp = head;
	  
	  System.out.println("Linked List:");
	  while(temp != null) {
		  System.out.println(temp.data+"");
		  temp = temp.next;
	  }
	  System.out.println();
  }
  
  // Main method
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  SINGLY_LIST list = new SINGLY_LIST();
	  int choice,value;
	  do {
		  System.out.println("\n=====Singly Linked List Menu======");
		  System.out.println("1. Insert");
		  System.out.println("2. Delete");
		  System.out.println("3. Search");
		  System.out.println("4. Traverse");
		  System.out.println("5. Exit");
		  System.out.print("Enter your choice : ");
		  choice =sc.nextInt();
		 
		  switch(choice) {
		  case 1:
			  System.out.print("Enter element to insert : ");
			  value = sc.nextInt();
			  list.insert(value);
			  break;
			  
		  case 2:
			  System.out.print("Enter element to delete : ");
			  value=sc.nextInt();
			  list.delete(value);
			  break;
			  
		  case 3:
			  System.out.print("Enter element to search : ");
			  value=sc.nextInt();
			  list.search(value);
			  break;
			  
		  case 4:
			  list.traverse();
			  break;
			 
		  case 5:
			  System.out.println("Exiting the program...");
			  break;
			  
		  default:
			  System.out.println("Invalid choice. Please try again");
		  }}
	  while(choice!=5);
	  
	  sc.close();
	  
	  }
}
