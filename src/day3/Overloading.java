package day3;

public class Overloading{
	
	
	//same method with different paratemeters
	int addition(int a, int b)
	{
		return a + b;
	}
	
	float addition(float a, float b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		
		Overloading mod = new Overloading();
		
		System.out.println("Addtion is: "+mod.addition(5, 10));
		System.out.println("Addtion is: "+mod.addition(5.5f, 7.7f));	
		
	}

}
