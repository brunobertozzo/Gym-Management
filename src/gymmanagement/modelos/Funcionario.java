/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

/**
 *
 * @author bruno
 */
public class Funcionario extends Usuario {
    private String login;
    private String senha;
    private Cargo cargo;

    public Funcionario(String nome, String dataDeNascimento, String rg, String cpf, 
                String endereco, String telefone, String login, String senha, Cargo cargo) {
        super(nome, dataDeNascimento, rg, cpf, endereco, telefone);
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
