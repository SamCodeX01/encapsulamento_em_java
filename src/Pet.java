/*
 * O encapsulamento permite que os detalhes de implementação de um objeto sejam alterados sem afetar o restante do sistema, 
tornando o código mais flexível e fácil de manter. Com isso, 
os objetos podem ser reutilizados em diferentes partes do sistema sem que haja preocupação com os detalhes de implementação.28/03/2023

Os encapsulados são produtos que geralmente se apresentam em forma de cápsula e contêm substâncias nutricionais, 
suplementos alimentares, ervas ou outros ingredientes. 
Esses produtos são amplamente utilizados por pessoas que buscam melhorar a saúde, 
perder peso, ganhar massa muscular ou tratar condições específicas.08/12/2023
 */

/**
 * Classe para demonstrar a utilização do Princípio do Encapsulamento
 * @author Expression Samuel is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

public class Pet {
    private String nome;
    private String raça;
    private int idade;
    private float peso;
    private boolean carnivoro;
    

//CONSTRUTOR DA CLASSE
    public Pet(String raça, String nome, int idade){
        this.raça = raça;
        this.nome = nome;
        this.idade = idade;
    }

    //MÉTODO COMUM PARA EXIBIR OS DADOS DE UM PET

    public void exibirDados(){
        System.out.println("Raça: " + getRaça());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
    
    //MÉTODOS ACESSORES (GET e SET) - Cada atributo da classe tem um par set e get
    
    //método que busca a informação
        public String getRaça(){
        return raça; 
    }
    
    //método que guarda a informação
      public void setRaça(String raça){
          this.raça = raça;
      }
      
      public String getNome(){
        return raça;
     }
      public void setNome(String nome){
          this.nome = nome;
      }
      
      public int getIdade(){
          return idade;
      }
      public void setIdade(int idade){
          this.idade = idade;
      }
      
      public float getPeso(){
          return peso;
      }
      public void setPeso(float peso){
          this.peso = peso;
      }
      
      public boolean isCarnivoro(){
          return carnivoro;
      }
      public void setCarnivoro(boolean carnivoro){
          this.carnivoro = carnivoro;
      }
}//FIM DA CLASSE


