import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class linkedlist {
	public static Node tail = null;
	public static Node push(Node head,int data) {
		Node newNode = new Node(data);
		if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
		return head;
	}
	
	 public static Node deleteNode(Node head,Node del)
	    {
		 Node temp = head;
	        
		    // If node to be deleted is head node
		 	if (head == del) {
	            head = del.next;
	            tail.next = head;
	        }
	  
	        // Traverse list till not found
	        // delete node
	        else {
	        while (temp.next != del) {
	            temp = temp.next;
	        }
	  
	        // Copy address of node
	        temp.next = del.next;
	        }
	  
	      return head;
	    }
	
	public static Node deleteoddNodes(Node head)
    {
        Node ptr = head;
        int c = 0;
        // Traverse list till the end
        // if the node is odd then delete it
        do {
            // If node is odd
            if (ptr.data % 2 == 1) {
               head = deleteNode(head,ptr);
               c++;
            }
  
            // point to next node
            if(c==1)
            {
            	ptr = head.next;
            	
            }
            else {
            	 ptr = ptr.next;
            }
           
        } while (ptr != head);
        return head;
    }

	public static void display(Node head) {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    } 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Node head = null;
		for(int i=0;i<n;i++)
		{
			int j = s.nextInt();
			head = push(head,j);
		}
		head = deleteoddNodes(head);
		display(head);

	}

}
