
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para demonstrar o princípio do Encapsulamento
 * @author Expression Samuel is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Conta {
    private int numeroConta;
    private int senha;
    private float saldo;
    
    //CONSTRUTOR DA CLASSE
    public Conta(int numeroConta, int senha, float saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public void adicionarSaldo(float valor){
        setSaldo(getSaldo() + valor); //  setar(buscar saldo + valor)
    }
    public void retirarSaldo(float valor){
        int pwd;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
        
        if(pwd == getSenha()){
            setSaldo(getSaldo()- valor);
            JOptionPane.showMessageDialog(null, "Novo Saldo: " + getSaldo());
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha Errada!");
            JOptionPane.showMessageDialog(null,"Saldo: " + getSaldo());
        }       
    }
    //Método para trocar a senha
    public void trocarSenha(){
        int pwd;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
        
        if(pwd == getSenha()){
            int novaSenha1, novaSenha2;
            novaSenha1 = Integer.parseInt(JOptionPane.showInputDialog("Novo Senha: "));
            novaSenha2 = Integer.parseInt(JOptionPane.showInputDialog("Confirme a Nova Senha: "));       
                if(novaSenha1 == novaSenha2){
                    setSenha(novaSenha1);
                    JOptionPane.showMessageDialog(null, "SENHA ALTERADA COM SUCESSO!");
                }else{
                    JOptionPane.showMessageDialog(null, "As senhas são diferentes");
                    JOptionPane.showMessageDialog(null, "Senha NÃO ALTERADA!");
                }
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha Errada!");
            JOptionPane.showMessageDialog(null,"Senha NÃO alterada!");

            //JOptionPane.showMessageDialog(null,"Saldo: " + getSaldo());
        } 
    }
    
    //MÉTODOS ACESSORES - GETTERS
    public int getNumeroConta(){
        return numeroConta;
    }
    public int getSenha(){
        return senha;
    }
    public float getSaldo(){
        return saldo;
    }
    
    //MÉTODOS SETTERS
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setSenha(int senha){
        this.senha = senha;
    } 
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
}


