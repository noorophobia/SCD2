package q1;

public class LinkedList<t> {
	Node head;
LinkedList(){
	head=null;
}
LinkedList(Node h){
	head=h;
}
 public void add(t element) {
	 if(head==null) {
		 head=new Node();
	 head.element=element;
	
 }
	 else {
		 Node temp=head;
		 Node beforetemp=new Node();
		 while(temp!=null) {
			 beforetemp=temp;
			 temp=temp.next;
		 }
		 beforetemp=new Node(element);
		 head.next=beforetemp;
		//	System.out.println( beforetemp.element);

	 }
 }
 void removeAtFirst() {
	 if(head==null) {
			System.out.println( "No element");

	 }
	 else {
		 if(head.next==null) {
			 head=null;
				System.out.println( "Removed element at head");

		 }
		 else {
			Node temp=head;
			 Node<t> beforetemp=new Node<t>();
      
          
			 while(head.next.next!=null) {
				 temp=(Node) head.element;
				 
 				 head=head.next;
			 }
				System.out.println( "Removed "+beforetemp);
   temp=head;
			 beforetemp=null;
				System.out.println( "Removed element at head");

			 
		 }
	 }
 }
 void print() {
	 Node temp=head;
	 while(temp!=null) {
		System.out.println( temp.element);
		 temp=temp.next;
	 }
 }
 
 public static void main(String args[]) {
	 LinkedList<Integer>l1=new LinkedList<Integer>();
	 l1.add(1);
	 l1.add(2);
	 l1.print();
	 l1.removeAtFirst();
	 l1.print();
 }
}
