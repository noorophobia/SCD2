package q1;

public class ExceptionHandling extends Exception{
	ExceptionHandling(){
		
	}
	public void EmptyStackException() {
		System.out.println("EmptyStackException : Stack is empty");
	}
	public void NullPointerException() {
		System.out.println("NullPointerException : Null Pointer ");
	}
	public void InavlidInputException() {
		System.out.println("InavlidInputException : Input does not match generic stack type   ");
	}
}
