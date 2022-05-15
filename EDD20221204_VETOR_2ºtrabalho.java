import java.util.Arrays;
import java.util.Scanner;

public class EDD20221204_VETOR_2ºtrabalho {

    public static void main(String[] args) {
        int menu = 9;
        int d = 0;

        Scanner teclado = new Scanner(System.in);
        Vetor vetor = new Vetor(10);

       

        while(menu != 0) {
        	System.out.print("\nInforme a opção desejada:"
                    + "\n1 - Zera o vetor"
                    + "\n2 - Insira um valor"
                    + "\n3 - Apaga um valor do vetor"
                    + "\n4 - Consultar se valor digitado existe no vetor"
                    + "\n5 - Consulta quantos valores ocupam o vetor"
                    + "\n6 - Consulta qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor"
                    + "\n7 - Consulta qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor"
                    + "\n8 - Lista dos valores armazenados no vetor"
                    + "\n0 - Sair do sistema\n->");
            menu = teclado.nextInt();
            switch (menu) {
			    case 1:
				    System.out.print("");
				    vetor.zerar();
				    break;
                case 2:
                    System.out.print("\nOpção 2:Insira um valor\n");
                    d = teclado.nextInt();
                    vetor.inserir(d);
                    break;
                case 3:
                	vetor.apagarvalorvetor(d);
                    break;
                case 4:
                    System.out.println("Opção 4: Digite um valor para saber posição no vetor:");
                    d = teclado.nextInt();
                    vetor.consultar(d);                    
                    break;
                case 5:
                	vetor.consultarquantosvalores(d);
                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
                case 8:
                    vetor.consultarlista(d);
                    break;
                case 0:
                    System.out.println("\nOpção 0:\nPrograma fechado.\n...");
                    break;

                default:
                    System.out.println("Opção Errada");
                    break;
            }
        }
    }
}
