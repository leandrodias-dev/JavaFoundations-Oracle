/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fazendeirofred;

/**
 *
 * @author Leandro Dias
 */
public class FazendeiroFred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Leia esta história e calcule/imprima os valores
//        obrigatórios:
//        Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos
//        Na terça-feira, ele recolhe 121 ovos
//        Na quarta-feira, ele recolhe 117 ovos
            
        //Quantidade de ovos recolhidos
        int eggsMonday = 100;
        int eggsTuesday = 121;
        int eggsWednesday = 117;
        
//      −Qual é a dailyAverage (média diária) de ovos recolhidos?

        //Média diaria - dailyAverage
        double dailyAverage = (eggsMonday + eggsTuesday + eggsWednesday)/ 3.0;
        
//        Quantos ovos poderiam ser esperados em uma
//        monthlyAverage (média mensal) de 30 dias?

        //Média mensal - monthlyAverage (considerando lucro de US$ 0,18 por ovo)
        double monthlyAverage = dailyAverage * 30;
        
//        Se um ovo pode ser vendido com um lucro de US$ 0,18, qual
//        é o monthlyProfit (lucro mensal) total dos ovos?

        // Lucro mensal - monthlyProfit
        double monthlyProfit = monthlyAverage * 0.18;
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
