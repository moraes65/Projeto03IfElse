/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto03ifelse;

/**
 *
 * @author aluno
 */
public class Projeto03IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        if (condicaoBoleana)
        {
        codigo;
        }
        else 
        {
        codigo;
        }
        */
        int idade = 15;
        if (idade < 18)
        {
            System.out.println("Menor Idade!");        
        }
        else {
            System.out.println("Maior Idade");
        }
        
        //operadores logicos
        // E (&&)  OU (||)
        // E (CONJUNCAO)
        // OU (DISJUNCAO)
        boolean amigoDoDono = true;
        if (idade < 18 && amigoDoDono == false)
        {
            System.out.println("Menor Idade! Entrada proibida!");        
        }
        else {
            System.out.println("Maior Idade! Pode Entrar!");
        }
        
        //OPERADOR DE NEGACAO (!)
        if (idade < 18 && !amigoDoDono)
        {
            System.out.println("Menor Idade! Entrada proibida!");        
        }
        else {
            System.out.println("Maior Idade! Pode Entrar!");
        }
        
        //OPERADOR DE IGUALDADE (==)
        int mes = 1;
        if (mes == 1){
            System.out.println("Entre de Férias!");
        }
        else{
            System.out.println("Permaneça estudando!");
        }
        
        
    }
    
}
