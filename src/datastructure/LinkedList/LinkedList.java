package datastructure.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	Node head;

	public void insertAtStart(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			node.next = temp;
			head = node;

		}

	}

	public void insertAtLast(int data) {
		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void reverseList() {
		Node previous = null;
		Node current = head;
		Node nextNode = null;

		while (current != null) {
			nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		head = previous;

	}

	public void findMiddleElement(Node headNode) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			System.out.println("in loop");
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("test");
		System.out.println(slow.data);
	}

	/// 1 2 3
	public void deleteNodeFromLinkedList(Node node) {
		if (node != null && node.next != null) {
			node.data = node.next.data;
			node.next = node.next.next;
		}

	}

	public void removeDuplicateValue() {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}else {
				temp =temp.next;
			}
		}
		System.out.println(head);
	}
	
public	boolean hasCycle(Node tt) {
        Set<Node> nodeSet = new HashSet<Node>();
        Node temp = head;
        while(temp != null){
            if(! nodeSet.add(temp))
            { return true;}
            
            temp =temp.next;
        }
        return false;

    }

}
