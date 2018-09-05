/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import gymmanagement.interfaces.IObjectID;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Treino implements Serializable, IObjectID {
    private static final long serialVersionUID = 1L;
    private int id;
    
    private ArrayList<Exercicio> treino;
    private String nome;

    public Treino(ArrayList<Exercicio> treino) {
        this.treino = treino;
    }

    @Override
    public int getID() {
        return this.id;
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
