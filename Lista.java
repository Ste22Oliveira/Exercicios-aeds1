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
        for(int i = primeiro; i <ultimo; i++){
            System.out.println(item[i]);
        }
        System.out.println("*****");
        
    }
    
    //Pesquisa Insere mais um elemento no final da lista 
    /*public static  Object pesquisa(int chave){
        
    }*/
    
    
    //Buscar um elemento igual a chave da lista. Se existir retorna o elemento
    public static Object retira(int chave){
        if(vazia()){
            System.out.println("Erro! Lista vazia");
            return null ; //Elemento não encontrado(null é POO)
        }
        int p = 0;
        while(p <ultimo && item[p] !=chave)
            p++;
        
        if(p>=ultimo)
            return null ;//'it' não esta no vetor!
        //´it' foi encontrado na posição p 
        //salvam 'it' para retornar
     
        Object elem= item[p];//essa atribuição é permitida ,
                             //mais adiante iremos retornar um registro!
                      
      //Todas os demais elementos (indices de 1 á ultimo -1)
        //serãp deslocados uma posição para frente para ocupar 
        //a posição 0
        ultimo=ultimo -1;
        for(int aux=p ; aux<ultimo ; aux++)
            item[aux]= item [aux + 1 ];
        
        return elem ;
                             
    }
    
    //Retorna o 1° elemento da lista,se esta nao estiver vazia
    public static Object retiraPrimeiro(){
        if(vazia()){
            System.out.println("Erro!Lista vazia");
            return null;
        }
        
        
        //Salva o item [0] para retornar
        Object elem = item[0];
        
        
        
        //Todas os demais elementos (indices de 1 á ultimo -1)
        //serãp deslocados uma posição para frente para ocupar 
        //a posição 0
        ultimo=ultimo -1;
        for(int aux=0 ; aux<ultimo ; aux++)
            item[aux]= item [aux + 1 ];
        
        return elem ;
    }
    
           
}
