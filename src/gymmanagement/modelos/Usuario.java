/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.controladores.ControladorPrincipal;
import gymmanagement.interfaces.IObjectID;
import java.io.Serializable;

/**
 *
 * @author bruno
 */
public abstract class Usuario implements Serializable, IObjectID {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String dataDeNascimento;
    private String rg;
    private String cpf;
    private String endereco;
    private String telefone;    

    public Usuario(String nome, String cpf, String rg, String dataDeNascimento,   
                    String telefone, String endereco) {
        ControladorPrincipal.getInstance().contadorEntidades++;
        this.id = ControladorPrincipal.getInstance().contadorEntidades;
        
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    @Override
    public int getID() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
