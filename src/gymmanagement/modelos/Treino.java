/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import gymmanagement.controladores.ControladorPrincipal;
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
    private ArrayList<Exercicio> exercicios;
    
    private String nome;

    public Treino(String nome, ArrayList<Exercicio> exercicios) {
        this.nome = nome;
        this.exercicios = new ArrayList<Exercicio>(exercicios);
        ControladorPrincipal.getInstance().contadorEntidades++;
        this.id = ControladorPrincipal.getInstance().contadorEntidades;
    }

    @Override
    public int getID() {
        return this.id;
    }
    
    public boolean add(Exercicio exercicio) {
        return this.exercicios.add(exercicio);
    }

    public boolean remove(Exercicio exercicio) {
        return this.exercicios.remove(exercicio);
    }

    public boolean estaVazio() {
        return this.exercicios.isEmpty();
    }

    public int tamanho() {
        return this.exercicios.size();
    }
    
    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
