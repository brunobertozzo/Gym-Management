/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import java.sql.Date;

/**
 *
 * @author bruno
 */
public abstract class Usuario
{
    String nome;
    String sobrenome;
    int idade; 
    Date dataDeNascimento;
    int rg;
    int cpf;
    int cep;
    int telefone;    
   
    public Usuario(String nome, String sobrenome, int idade, 
                    Date dataDeNascimento, int rg, int cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.rg = rg; 
        this.cpf = cpf;
    }

    public String getNome(){ return nome + sobrenome; }

    public int getIdade(){ return idade; }

    public Date getDataNascimento(){ return dataDeNascimento; }

    public int getCep() { return cep;}

    public int getTelefone() { return telefone;}
    
    public void setCep(int newCep){ cep = newCep; }

    public void setTelefone(int telefone){ this.telefone = telefone; }

}
