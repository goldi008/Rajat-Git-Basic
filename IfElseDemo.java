import java.util.Scanner;

class IfElseDemo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age: ");
		int age = in.nextInt();
		
		if (age>=60){
			System.out.println("You are a senior citizen!");
		}

		else if(age>18){
			System.out.println("You are eligible to vote!");
		}
		
	    else{
	    	System.out.println("You are not an eligible voter!");
	    }

	}
}