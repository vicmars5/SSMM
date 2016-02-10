import java.util.Scanner;

public class Euclides {

	public static void main(String[] args){
		short filas = 1024;
		short posFila = 0;

		int numeroA, numeroB;

		int dividendo[]=new int[filas];
		int divisor[]=new int[filas];
		int residuo[]=new int[filas];
		int cociente[]=new int[filas];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("	Algoritmo de euclides");

		System.out.println("Valor del numero mayor: ");
		numeroA=sc.nextInt();
		sc.nextLine();

		System.out.println("Valor del numero menor: ");
		numeroB=sc.nextInt();
		sc.nextLine();
		System.out.println("\n\n");

		if(numeroA<numeroB){
			int numero;
			numero=numeroA;
			numeroA=numeroB;
			numeroB=numero;
		}

		divisor[0]=numeroA;
		residuo[0]=numeroB;

		do{
			posFila++;
			dividendo[posFila] = divisor[posFila - 1];
			divisor[posFila] = residuo[posFila - 1];

			cociente[posFila] = dividendo[posFila] / divisor[posFila];
			residuo[posFila] = dividendo[posFila] % divisor[posFila];

			System.out.println(dividendo[posFila] + "= " + divisor[posFila] +
					"(" + cociente[posFila] + ")+" + residuo[posFila]);

		}while(residuo[posFila]!=0);

		System.out.println("\nMCD (" + numeroA + " , " + numeroB +") = " + residuo[posFila-1]);

		if(residuo[posFila-1] == 1){
			while(--posFila >= 0){
				System.out.println(residuo[posFila] + "=(" + dividendo[posFila] + ") + ("
				 + (cociente[posFila]*(-1)) + ")(" + divisor[posFila] + ")");
			}
		}
	}

}