/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Treino {
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Exercicio> treino;
    private String nome;

    public Treino(ArrayList<Exercicio> treino) {
        this.treino = treino;
    }

    public ArrayList<Exercicio> getTreino() {
        return treino;
    }

    public void setTreino(ArrayList<Exercicio> treino) {
        this.treino = treino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
