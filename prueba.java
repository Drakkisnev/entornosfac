package entornos;


public class prueba {

	public static void main(String[] args) {
		System.out.println("Give me a number");
		int usernumber = Console.readInt();
		int number = usernumber;
		int div = 2;
		System.out.print(number + "=");
		while (number != 1) {
			if (number % div == 0) {
				number = number / div;
				System.out.print(div);
				if (number!=1) {
					System.out.print("*");
				}
			}
			else {
				div++;
			}
		}
	}

}
