/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import gymmanagement.controladores.ControladorPrincipal;
import gymmanagement.telas.LoginUI;

/**
 *
 * @author bruno.bertozzo
 */
public class GymManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chama o metodo que inicia o sistema
        ControladorPrincipal.getInstance().boot(); 
   }
    
}
