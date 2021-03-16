package datastructure.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
//		ll.insertAtStart(4);
//		ll.insertAtStart(5);
//		ll.insertAtStart(6);
		ll.insertAtLast(1);
		ll.insertAtLast(2);
		ll.insertAtLast(2);
		ll.insertAtLast(3);
		ll.insertAtLast(3);
		ll.insertAtLast(3);
		
	ll.printList();
		//ll.findMiddleElement(ll.head);
		//ll.deleteNodeFromLinkedList(ll.head.next);
		System.out.println("-----------------------"+ll.hasCycle(null));
		//ll.removeDuplicateValue();
		ll.printList();
		//ll.reverseList();
	//	ll.printList();
	}
	
	
}
