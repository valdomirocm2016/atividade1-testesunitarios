/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfila;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Valdomiro
 */
public class ExFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Fila fila = new Fila();
                Paciente pa1 = new Paciente("Maria", 25, "verde", 1);
                fila.insert(pa1);
		Paciente pa2 = new Paciente("Antonio", 30, "verde", 1);
                fila.insert(pa2);
		Paciente pa3  = new Paciente("Geraldo", 21, "vermelho", 3);
                fila.insert(pa3);
		Paciente pa4  = new Paciente("Jaque", 21, "vermelho", 3);
                fila.insert(pa4);
		Paciente pa5  = new Paciente("Valdomiro", 41, "amarelo", 2);
                fila.insert(pa5);
		Paciente pa6  = new Paciente("Jander", 18, "verde", 1);
                fila.insert(pa6);
                Paciente pa7  = new Paciente("João", 19, "amarelo", 2);
                fila.insert(pa7);
               
                /*SAIDA CORRETA: [GERALDO,JAQUE,VALDOMIRO,JOAO,MARIA,ANTONIO,JANDER]*/
                
		
		/*ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
		listaPaciente.add(pa1);
		listaPaciente.add(pa2);
		listaPaciente.add(pa3);
		listaPaciente.add(pa4);
		listaPaciente.add(pa5);
		listaPaciente.add(pa6);
                listaPaciente.add(pa7);
		
		Collections.sort(listaPaciente);*/
                
		
		System.out.println(" lista : "+fila.lista5());
        
    }
    
}
