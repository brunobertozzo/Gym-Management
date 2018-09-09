/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordepersistencia;

import gymmanagement.interfaces.IObjectID;
import gymmanagement.modelos.Aluno;
import gymmanagement.modelos.Cargo;
import gymmanagement.modelos.Exercicio;
import gymmanagement.modelos.Funcionario;
import gymmanagement.modelos.Treino;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class PersistenciaDeDados {
    public static PersistenciaDeDados persistenciaDeDados;
    private HashMap<Integer, IObjectID> cache = new HashMap<>();
    private final String fileName = "dados.dso";
	
    public PersistenciaDeDados() { 
       load();
    }

    public static PersistenciaDeDados getInstance() {
        if (persistenciaDeDados == null) {
            persistenciaDeDados = new PersistenciaDeDados();
        }
        return persistenciaDeDados;
    }
	
    public void put(IObjectID object) {
        cache.put(object.getID(), object);
        persist();
    }
    
    public Object get(Integer id) {
        return cache.get(id);
    }

    public ArrayList<Object> getList() {
        return new ArrayList<Object>(cache.values());
    }

    public ArrayList<Cargo> getListaCargos() {
        ArrayList<Object> values = this.getList();
        ArrayList<Cargo> cargos = new ArrayList<Cargo>();
        for(Object value : values) {
            if(value instanceof Cargo) cargos.add(((Cargo) value));
        }
        return cargos;
    }
	
    public ArrayList<Aluno> getListaAlunos() {
        ArrayList<Object> values = this.getList();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        for(Object value : values) {
            if(value instanceof Aluno) alunos.add(((Aluno) value));
        }
        return alunos;
    }

    public ArrayList<Treino> getListaTreinos() {
        ArrayList<Object> values = this.getList();
        ArrayList<Treino> treinos = new ArrayList<Treino>();
        for(Object value : values) {
            if(value instanceof Treino) treinos.add(((Treino) value));
        }
        return treinos;
    }
    
    public ArrayList<Exercicio> getExercicios() {
        ArrayList<Object> values = this.getList();
        ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
        for(Object value : values) {
            if(value instanceof Exercicio) exercicios.add(((Exercicio) value));
        }
        return exercicios;
    }
    
    public ArrayList<Funcionario> getListaFuncionarios() {
        ArrayList<Object> values = this.getList();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        for(Object value : values) {
            if(value instanceof Funcionario) funcionarios.add(((Funcionario) value));
        }
        return funcionarios;
    }
	
    public ArrayList<Object> getKeys() {
        return new ArrayList<>(this.cache.keySet());
    }
	
    public void remove(Integer id) {
        cache.remove(id);
        persist();
    }

    private void persist() {
        try {
            FileOutputStream fOS = new FileOutputStream(fileName);
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(cache);

            oOS.flush();
            fOS.flush();

            oOS.close();
            fOS.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersistenciaDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void load() {
        try {
            FileInputStream fIS = new FileInputStream(fileName);
            ObjectInputStream oIS = new ObjectInputStream(fIS);

            cache = (HashMap<Integer, IObjectID>) oIS.readObject();

            oIS.close();
            fIS.close();

        } catch (FileNotFoundException ex) {
            persist();
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersistenciaDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
