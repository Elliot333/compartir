import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		String name = "abc";
		
		
		System.out.println("Plese, What your name?");
		name = keyboard.nextLine();
		System.out.println("You name is: " + name);
		
		System.out.println("Okey, My name is John");
		
		System.out.println("Guay, nos echamos un LOL?");
		
		keyboard.close();
		
		// ESTAS SON LAS NUEVAS MODIFICACIONES
		
	}

}