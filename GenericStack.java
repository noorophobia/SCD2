package q1;
import java.util.*;
public class GenericStack<T>{

 
	Node head;
	GenericStack(){
	head=null;
	}

	GenericStack(Node h){
	head=h;
     }
 
 public void push(T item)  {
	 try {
		 
	  if(item==null) {
		 throw new ExceptionHandling();
	  }
	 if(head==null) {
		 head=new Node();
	 head.element=item;
	
 }
	 else {
		 Node temp=head;
		 head=new Node(item);
		 head.next=temp;
		 
	/*	 Node temp=head;
		 Node beforetemp=new Node();
		 while(temp!=null) {
			 beforetemp=temp;
			 temp=temp.next;
		 }
		 beforetemp=new Node(item);
		 head.next=beforetemp;
		//	System.out.println( beforetemp.element);
*/
	 }}
	 catch(ExceptionHandling e) {
		 e.NullPointerException();
	 }
 }
 void pop() {
	 try {
	 if(this.isEmpty()==true) {
throw new ExceptionHandling();
	 } 
	     
 		 if(head.next==null) {
		 		System.out.println("popped:"+head.element);

			 head=null;
 
		 }
		 else {
			   head=head.next;

			 
			   
		 }
	 }
	 catch(ExceptionHandling e) {
		 e.EmptyStackException();
	 }
	 }
 
 void print() {
	 Node temp=head;
		System.out.println("Printing Stack ");

 		System.out.println(":-------------:");
 		//System.out.println(":             :");


	 while(temp!=null) {
	 		System.out.println(":      "+temp.element+"      :");
	 		System.out.println(":-------------:");

 		 temp=temp.next;
	 }
		System.out.println("\n\n\n\n\n");

 }
   public boolean isEmpty() {
	   if(head==null) {
		   return true;
	   }
	   return false;
   }
   public int size() {
	   
	   if(head==null) {
		   return 0;
	   }
	   else {
	   Node temp=head;
	   int count=0;
		 while(temp!=null) {
 			 temp=temp.next;
 			 count++;
 			 
		 }
		 return count;}
   }
   
 public static void main(String args[])throws ExceptionHandling {
	 GenericStack<Integer>l1=new GenericStack<Integer>();
		System.out.println("Enter size of stack :");
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		System.out.println("Enter Elements of stack :");
 
 		int i=0;
 
 			while(obj.hasNext()&& i<size) {
  			 try {
                 i++;

  				int element=obj.nextInt();
  				 
               l1.push(element);
 				 
 				 
 			 
		}   
		 catch(Exception e) {
  			 try {
			 throw new ExceptionHandling();}
			 catch(ExceptionHandling m) {
				 m.InavlidInputException();
			 }
			 obj.next();
		 }
  
 			}
	 l1.pop();
		System.out.println("Pushing null pointer.....");

	 l1.push(null);
		System.out.println("size"+l1.size());
l1.push(3);
l1.push(5);

  	 
	 l1.print();
	 l1.pop();
	 l1.print();
 }
}
