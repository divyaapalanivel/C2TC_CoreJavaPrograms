package day4;

public final class  Final {
	
	
	final int x = 100;
	
	final void print() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		Final fe = new Final();
		fe.print();
		
	}

}