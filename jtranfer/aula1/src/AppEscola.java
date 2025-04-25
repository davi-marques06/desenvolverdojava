import java.util.Scanner; // importar uma classe externa 


public class AppEscola { // PascalCasing
    // main
    // public = público
    // static = da classe
    // void = retorno vazio
    // main = principal
    // String args[] = parâramento inicial

    public static void main(String args[]){
       

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Você tem faculdade: 0-não e 1-sim");
        boolean temFaculdade = teclado.nextBoolean();
        // metódo principal
        // Classe ojbeto = new Construtor(parâmentos);
        
        Aluno aluno = new Aluno(nome,idade,temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());
        // Defasio
        /*
         * Implementar uma interface com usuário
         * Scanner.
         */
      
         if(temFaculdade == true ){
            System.out.println("Sim");
         }   
         else{
            System.out.println("Não");
         }   
         }


    }

    
