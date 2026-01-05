package day1;
import java.util.Scanner;
public class practice {

	    public  String name;
	    
	    public String getName(){
	        return name;
	    };
	}
	class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        practice n = new practice();
	        n.name="divya";
	        System.out.println("Name??");
	        String name = sc.nextLine();
	       System.out.println("Hi " + name + ", I'm " + n.name);
	    }
	}


//	class Main {
//	    public static void main(String[] args) {
//	        String nam;
//	        nam="divya";
//	        Scanner sc = new Scanner(System.in);
//	        
//	        System.out.println("Name??");
//	        String name = sc.nextLine();
//	       System.out.println("Hi " + name + ", I'm " + nam);
//	    }
//	}