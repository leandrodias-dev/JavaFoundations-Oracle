/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalcularEggs;

/**
 *
 * @author Leandro Dias
 */
public class CalcularEggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Put yout code here
        calcularOvos(5, 3);
        calcularOvos(4,8);
    }    
    public static void calcularOvos(int eggsPerChicken, int chickenCount){
            int totalEggs = 0;
            
            // Segunda-feira
            totalEggs += chickenCount * eggsPerChicken;
            
            // Terça-feira ( ganha 1 galinha)
            chickenCount += 1;
            totalEggs += chickenCount * eggsPerChicken;
            
            //Quarta-feira (perde metade das galinhas)
            chickenCount /= 2;
            totalEggs += chickenCount * eggsPerChicken;
        
        System.out.println("Total de ovos coletados: " + totalEggs);
    } 
    }
    
