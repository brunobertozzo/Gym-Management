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
    private ArrayList<Exercicio> treino;

    public Treino(ArrayList<Exercicio> treino) {
        this.treino = treino;
    }

    public ArrayList<Exercicio> getTreino() {
        return treino;
    }

    public void setTreino(ArrayList<Exercicio> treino) {
        this.treino = treino;
    }
    
    
}
