/* encapsuçamento */
// public
// private
// protected
// package
public class Aluno { // classe

    // variáveis = atributos
    // caracteristicas
    private String nome; // atributo de tipo texto
    private int idade; // atributo de tipo número
    private boolean temFaculdade; // abrituto de tipo booleano (0 e 1)
    
    public Aluno(){ 
      
    }
    public Aluno(String nome,int idade,boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }
    public String getNome(){ //metódo para pegar nome
          return nome;
    }
    public int getIdade(){ // metódo pegar idade
        return idade;
    }
    public boolean getTemFaculdade(){ // metódo para pegar temFaculdade 
        return temFaculdade;
    }
    // classes Wrappers
    /*
     * 
     * Considerado
     * tipo primitivo x classes wrappers
     * 
     * Você tem que descobrir quantos alunos
     * tem faculdade (sim ou não -0 ou 1)
     * Como declarar um atributo booleano?
     * 2 minuto
     */
 
}
