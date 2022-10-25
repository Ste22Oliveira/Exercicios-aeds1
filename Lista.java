/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2410;

/**
 *
 * @author 0044725
 */
public class Lista {
    static int item[];
    static int primeiro , ultimo ;
    
    
    //Criar uma lista vazia
    public static void Lista(int tam ){
        item=new int[tam];
        primeiro =0;
        ultimo=primeiro;
        
    }
    //Insere um elemento no final da lista
    public static void insere(int x){
        if(ultimo>=item.length){
            System.out.println("Erro: lista esta cheia");
            return;
        }
        else{
            item[ultimo]=x;
            ultimo=ultimo+1;
        }
        
    }
    //Testa se ha elementos no vetor 'item' e retornar true(ou false)
    public static boolean vazia(){
        return(primeiro==ultimo);
        
    }
    //Imprime os elementos da lista do primeiro ate  (ultimo-1 )
    public static void imprime (){
        for(int i = primeiro; i <ultimo; i++)
            System.out.println(item[i]);
        
    }
    //Pesquisa Insere mais um elemento no final da lista 
    public static  Object pesquisa(int chave){
        
    }
    //Buscar um elemento igual a chave da lista. Se existir retorna o elemento
    public static Object retira(int chave){
        
    }
    //Retorna o 1° elemento da lista,se esta nao estiver vazia
    public static Object retiraPrimeiro(){
        
        
    }
    
           
}
