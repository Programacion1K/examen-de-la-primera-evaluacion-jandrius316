

public class Ejercicio3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				//El if es necesario para no imprimir el primer 0
				if (i == 0 && j == 0)
					System.out.print("  ");
				else
					System.out.print(i + (j*10)+ " ");
			}
			System.out.println();
		}

	}

}
