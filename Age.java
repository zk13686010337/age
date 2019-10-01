import java.util.Scanner;

public class Age {
    public static void main(String[] args){
	    int MID = 21;
		int a = 0;
		
	    System.out.print("your age:");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		if ( age < MID )
		    a = 1;
		else
		    a = 2;
		
		switch(a){
		    case 1:
			    System.out.println("sister");
				break;
			case 2:
			    System.out.println("aunt");
				break;
			default:
			    System.out.println("error");
		}
	}
}