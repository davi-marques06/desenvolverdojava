import java.io.FileWriter; // Classe para escrever no arquivo 
import java.io.IOException; // Classe para tratar exceções do arquivo
import java.util.Scanner;
import java.util.


public class App {
    public static void main(String[] args) throws Exception {
        // Criação de Variáveis
        String nome; // Referência
        int opcaoTransporte;
        String meioTransporte = "";

        // classe para teclado 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==Pesquisa de Transporte Diário");
        System.out.println("Digite seu nome: ");
        nome= scanner.nextLine();
        System.out.println(nome); 

        System.out.println("Como você vai ao TrDabalho");
        System.out.println("1- Metrô ");
        System.out.println("2- Ônibus ");
        System.out.println("3- Caminhada ");
        System.out.println("4- Uber ");
        System.out.println("5- Táxi ");
        System.out.println("6- Carro ");
        System.out.println("Escolha uma opção (1-6): ");

        opcaoTransporte= scanner.nextInt(); 
        
        switch(opcaoTransporte){
            case 1: 
                meioTransporte = "Metrô";break;
            case 2: 
                meioTransporte = "Ônibus";break;
            case 3: 
                meioTransporte = "Caminhada";break;
            case 4: 
                meioTransporte = "Uber";break; 
            case 5: 
                meioTransporte = "Táxi";break;
            case 6: 
                meioTransporte = "Carro";break;       
        }

           // task de amanhã salvar os dados no arquivo
           // task no Cithub (git e github)

        System.out.println("Nome: "+nome+","+"Meio de Transporte: "+meioTransporte+"."); 

        try(FileWriter escrito = new FileWriter("dados.txt",true)){
             
             escrito.write(nome+","+meioTransporte+"\n");
             System.out.println("Dados gravados com sucesso");

        }catch(IOException e){
           System.out.println("Erro ao gravar os dados"+e.getMessage());
        }

    }
}
