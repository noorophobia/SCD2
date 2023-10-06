package q1;

public class ExceptionHandling extends Exception{
	ExceptionHandling(){
		
	}
	public void NegativeSizeException() {
		System.out.println("NegativeSizeException : Size less than 0");
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
	public void InavlidSizeException() {
		System.out.println("InavlidSizeException : Input is not Integer for size  ");
	}
}
