import java.util.Scanner;
public class Vetor {
    Scanner teclado = new Scanner(System.in);

    private int tam;
    private int vetorinterno[];
    private int valor;

    public Vetor(){
    }

    public Vetor(int tamanho) {
        this.tam = tamanho;
        this.vetorinterno = new int[this.tam];
        System.out.println("Vetor criado ");
    }
    public void zerar() {
    	for (int i = 0; i < this.vetorinterno.length; i++) {
             this.vetorinterno[i] = 0;
        }
    }
    public void inserir(int valor) {
    	for (int i = 0; i < this.vetorinterno.length; i++) {
            if(this.vetorinterno[i] == 0){
                this.vetorinterno[i] = valor;
                break;
            }
        }
    }
/*ERRO 03 ESTÁ APAGANDO DOIS JUNTOS*/
    public void apagarvalorvetor(int d) {
    	//OK funcionando
    	System.out.print("Valores armazenados: \n");
    	for (int a = 0; a < this.vetorinterno.length-1; a++) {
    		System.out.println("Vetor " +a +" valor " +vetorinterno[a]);
    	}
    		//OK funcionando para digitar
    		System.out.println("\nDigite um elemento para zerar o valor.");
    		int digita;
    		digita = teclado.nextInt();
    		
    		for (int a = digita; a <= this.vetorinterno.length-1; a++) {
    			digita = vetorinterno[a];
    			if(digita == this.vetorinterno[a]) {
            		vetorinterno[a] = 0;
            		System.out.print("Vetor " +a + " apagado \n");
            	}  	
    			
    		}    		    		          	           
    }
    public void consultar(int valor) {
        for (int c = 0; c <= this.vetorinterno.length - 1; c++) {
        	if (c == 0) {
        		System.out.println("Valor não encontrado no vetor");
        	}else {
        		if(valor == this.vetorinterno[c]) {
                    System.out.println("");
                    System.out.println("O valor " +valor + " está no vetor " + c);                  
                }
        	}
        
        }
    }
/*ERRO ESTA IMPRIMINDO TODOS 05*/
	public void consultarquantosvalores(int d) {
		for (int c = 0; c < this.vetorinterno.length-1; c++) {
			if (this.vetorinterno.length != 0) {
				System.out.println("Valores já armazenados no vetor"  +c + " valor " +vetorinterno[c]);

			}else {
				if(this.vetorinterno.length == 0) {
					System.out.print("Não existem valores nos vetores. \n");
				}
			}
			
	    }
	}    
	public void consultarlista(int d) {
		System.out.println("Lista dos valores armazenados");
		for (int c = 0; c < this.vetorinterno.length; c++) {
		System.out.println("Vetor " +c +" valor " +vetorinterno[c]);
	    }
	}

}
