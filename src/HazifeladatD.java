/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class HazifeladatD {
    public static void main(String[]args){
        System.out.println("Lewis Hamilton");
        System.out.println("Sebastian Vettel");
        System.out.println("Valtteri Bottas");
        int[]lewis=new int[18];
        int[]vettel=new int[18];
        int[]bottas=new int[18];
        int vegeredmenylewis=0;
        int vegeredmenyvettel=0;
        int vegeredmenybottas=0;
        int dblewis=0;
        int gyozelemlewis=0;
        int dbvettel=0;
        int gyozelemvettel=0;
        int dbbottas=0;
        int gyozelembottas=0;
        
        System.out.print("Lewis Hamilton pontjai: ");
        
        for(int i=0; i<lewis.length; i++){
            lewis[i]=(int)(Math.random()*26);
            System.out.print(lewis[i]+" ");
            if(lewis[i]==0){
                 dblewis=dblewis+1;}
            if(lewis[i]==25){
                gyozelemlewis=gyozelemlewis+1;}}
           
       System.out.println();
       System.out.println("Lewis Hamilton győzelmeinek száma: "+gyozelemlewis);
       System.out.print("Lewis Hamilton vereségeinek száma: "+dblewis);
       
        for(int l=0; l<lewis.length; l++){
              vegeredmenylewis=vegeredmenylewis+lewis[l];}
          
        System.out.println();
        System.out.println("Lewis Hamilton végeredmény: "+vegeredmenylewis);
        
        System.out.print("Sebastian Vettel pontjai: ");
        
        for(int j=0; j<vettel.length; j++){
            vettel[j]=(int)(Math.random()*26);
            System.out.print(vettel[j]+" ");
            if(vettel[j]==0){
                 dbvettel=dbvettel+1;}
            if(vettel[j]==25){
                gyozelemvettel=gyozelemvettel+1;}}
           
       System.out.println();
       System.out.println("Sebastian Vettel győzelmeinek száma: "+gyozelemvettel);
       System.out.print("Sebastian Vettel vereségeinek száma: "+dbvettel);
      
        for(int m=0; m<vettel.length; m++){
            vegeredmenyvettel=vegeredmenyvettel+vettel[m];}
       
        System.out.println();
        System.out.println("Sebastian Vettel végeredmény: "+vegeredmenyvettel);
        
        System.out.print("Valtteri Bottas pontjai: ");
        
        for(int k=0; k<bottas.length; k++){
            bottas[k]=(int)(Math.random()*26);
            System.out.print(bottas[k]+" ");
            if(bottas[k]==0){
                dbbottas=dbbottas+1;}
            if(bottas[k]==25){
                gyozelembottas=gyozelembottas+1;}}
        
        System.out.println();
        System.out.println("Valtteri Bottas győzelmeinek száma: "+dbbottas);
        System.out.println("Valtteri Bottas vereségeinek száma: "+gyozelembottas);
            
        for(int n=0; n<bottas.length; n++){
            vegeredmenybottas=vegeredmenybottas+bottas[n];}
        
        System.out.println("Valtteri Bottas végeredmény: "+vegeredmenybottas);
        
    int a=vegeredmenylewis;
    if(vegeredmenyvettel>a){
        a=vegeredmenyvettel;}
    if(vegeredmenybottas>a){
        a=vegeredmenybottas;
        System.out.println("A győztes: Valtteri Bottas");}
    if(a == vegeredmenyvettel){System.out.println("A győztes: Sebastian Vettel");}
    if(a == vegeredmenylewis) {System.out.println("A győztes: Lewis Hamilton");}
     System.out.println("A győztes pontszáma: "+a);

  }
}
  
    

        
    
    

