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
public class Aluno extends Usuario {

    private Treino treino;

     public Aluno(String nome, String cpf, String rg, String dataNascimento,
                String telefone, String endereco, Treino treino) {
        super(nome, cpf, rg, dataNascimento, telefone, endereco);
        this.treino = treino;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
   
}
