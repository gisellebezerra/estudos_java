package Classe;

public class Usuario {

    String nome;
    String email;
    String idade;


    //Utilizado para que o Equals não assuma seu comportamento padrão;
    //Fazendo com que os objetos possam ser comparados

   
   //O método recebe um parâmetro do tipo Object, que é a classe mãe de todas as classes em JAVA, ou seja, qualquer objeto pode ser passado como parâmetro.
    public boolean equals(Object objeto){

        // Verifica se o objeto passado como argumento é uma instância da classe Usuario.
        // O operador instanceof é usado para garantir que o objeto seja realmente um Usuario (ou uma classe que herda Usuario)
        // Instanceof => é um 
        
        if(objeto instanceof Usuario){
            
            Usuario outro = (Usuario) objeto;
            
            // Se determinado objeto é da classe usuário, então compare...
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            boolean idadeIgual = outro.idade.equals(this.idade);

            //retorna o resultado da comparação caso seja True
            return nomeIgual && emailIgual && idadeIgual;
        } else {
            //Caso contrário 
            return false;
        }
       
    }

}
