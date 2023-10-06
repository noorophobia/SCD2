package q1;

import java.util.*;

public class q1 {
	public static int validSize() {
		int size = 0;
		Scanner obj = new Scanner(System.in);
		boolean check = false;
		while (check == false) {
			if (obj.hasNext()) {
				try {
					size = obj.nextInt();
					check = true;

				}

				catch (Exception e) {
					try {
						throw new ExceptionHandling();
					} catch (ExceptionHandling m) {
						m.InavlidSizeException();
						obj.next();
						check = false;
					}

				}
			}
		}
		return size;
	}
	public static Boolean PositiveValue(int size) {
		boolean check=false;
		try {

		 if(size<0) {
 
				throw new ExceptionHandling();


	  }
			check = true;

		 }catch (ExceptionHandling k) {
			k.NegativeSizeException();
			check = false;

		}
		return check;
	}
	
	
	public static void main(String args[]) throws ExceptionHandling {
		GenericStack<Integer> l1 = new GenericStack<Integer>();
		System.out.println("Enter size of stack :");
		Scanner obj = new Scanner(System.in);
		
		int  size = validSize();
	     while(!PositiveValue(size)) {
	      	  size = validSize();

	        }
 	
		System.out.println("Enter Elements of stack :");
		int i = 0;
		while (i < size) {
			if (obj.hasNext()) {
				try {

					int element = obj.nextInt();
					l1.push(element);
					i++;

				} catch (Exception e) {
					try {
						throw new ExceptionHandling();
					} catch (ExceptionHandling m) {
						m.InavlidInputException();
					}
					obj.next();

				}
			}
		}

		l1.pop();
		System.out.println("Size "+l1.size());
		 
		 
		while(!l1.isEmpty()) {
			l1.pop();
		}
		System.out.println("Popping Empty stack");

		l1.pop();
		System.out.println("Pushing null value.....");

		l1.push(null);
 		
	
	
	
	
	
	GenericStack<String> l2 = new GenericStack<String>();
	System.out.println("Enter size of stack :");
	  size = validSize();
     while(!PositiveValue(size)) {
   	  size = validSize();

     }
       

	 
		System.out.println("Enter Elements of stack :");

	  i = 0;

	while (i < size) {
		if (obj.hasNext()) {
			try {

				String element = obj.next();
				l2.push(element);
				i++;

			} catch (Exception e) {
				try {
					throw new ExceptionHandling();
				} catch (ExceptionHandling m) {
					m.InavlidInputException();
				}
				obj.next();

			}
		}
	}

 	System.out.println("Size "+l2.size());
	 
		
	 
	while(!l2.isEmpty()) {
		l2.pop();
	}
	System.out.println("Popping Empty stack");

	l2.pop();
	System.out.println("Pushing null value.....");

	l2.push(null);
	
	
	
	
	
	
	GenericStack<Float> l3 = new GenericStack<Float>();
	System.out.println("Enter size of stack :");
	 
	 size = validSize();
     while(!PositiveValue(size)) {
   	  size = validSize();

     }

 
		System.out.println("Enter Elements of stack :");

	  i = 0;

	while (i < size) {
		if (obj.hasNext()) {
			try {

				float element = obj.nextFloat();
				l3.push(element);
				i++;

			} catch (Exception e) {
				try {
					throw new ExceptionHandling();
				} catch (ExceptionHandling m) {
					m.InavlidInputException();
				}
				obj.next();

			}
		}
	}

 	System.out.println("Size "+l3.size());
	 
	 
	while(!l3.isEmpty()) {
		l3.pop();
	}
	System.out.println("Popping Empty stack");

	l3.pop();
	System.out.println("Pushing null value.....");

	l3.push(null);
		
	
	
	
	 

	
	
	
	
}
	
}
