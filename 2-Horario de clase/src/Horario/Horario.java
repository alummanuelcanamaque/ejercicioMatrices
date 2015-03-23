/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Horario;

/**
 *
 * @author kaña
 */
public class Horario {
    private SesionClase[][] horario;
    private int sesionesDia, dias;
    
    public Horario(int sesionesDia, int dias){
        horario = new SesionClase[sesionesDia][dias];
        this.sesionesDia=sesionesDia;
        this.dias=dias;
    }
    
    public SesionClase getSesion(int sesionDia, int dia) {
        return horario[sesionDia][dia];
    }
    
     public void setSesionClase(int sesionDia, int dia, String asignatura, String aula, String profesorado){
         horario[sesionDia][dia]= new SesionClase(asignatura, aula, profesorado);
     }
    @Override
     public String toString(){     
         String horarioString="";
         for (int i = 0; i < sesionesDia; i++) {
             horarioString+="\nDia: "+(i+1)+"\n-"
                 + "---------\n";
             for (int j = 0; j < dias; j++) {
                 horarioString+="Sesión "+(j+1)+": ";
                 if(horario[i][j]!=null){
                     horarioString+=""+horario[i][j].toString()+"\n";
                 }else{
                     horarioString+="vacio\n";
                 }
             }
             horarioString+="\n";
         }
         return horarioString;
     }
 }
