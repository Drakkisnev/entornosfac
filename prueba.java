package entornos;


public class prueba {

	public static void main(String[] args) {
		System.out.println("Dame un numero");
		int usernumber = Console.readInt();
		int number = usernumber;
		
		for (int i = number; i >= 0; i--) {
			System.out.print(number + "  ");
			number *= i;
		}
	}

}
