
package com.example;

public class ScopeTest {
    
    public static void main(String[] args) {
        int i = 0;
        System.out.print("-");
        for(i = 64; i >0; i=i/2 ){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("-");
        for(int j = 0; j<=5; j++){
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.print("-");
        for(int j = 5; j>=0; j--){
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.print("-");
        for(int k = 2; k<=64; k=k*2){
            System.out.print(k +" ");
        }
    }  
}
