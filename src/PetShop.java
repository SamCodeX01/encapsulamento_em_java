/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para instanciar objetos encapsulados
 * @author Expression Samuel is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class PetShop {
    public static void main(String[] args){ //atalho psvm + alt
        Pet pet = new Pet("Labrador", "Marley", 3);
        Pet gato = new Pet("Siamês", "Mila", 7);
        
        pet.exibirDados();
        pet.setRaça("PitBull"); //altera o valor do atributo raça
        
        //pet.nome = "Lulu";
        
    }//FIM DO MAIN
}//FIM DA CLASSE
