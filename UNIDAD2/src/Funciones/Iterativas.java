package Funciones;

import EntradaSalida.Tools;
import static Funciones.Recursivas.sumaDivisores;
import javax.swing.JOptionPane;


public class Iterativas {
    
    // CICLO WHILE
    //diseñar un método de clase que lea un valor entero y retorne la tabla de multiplicar del número que recibe    
    public static String tablaMultiplicar(int n){
        
        String cad = "";
        byte j = 1;         //valor inicial
        
        while( j <= 10 ){    // condición 
                            //verdadero
            cad+= n + "*" + j + " = " + (n*j) + "\n"; 
            
            j++;            //incremento o decremento
        }
        return cad;
    }

    //diseñar un método de clase que lea 15 valores enteros e imprima el mayor:
    public static byte numMayor(){
        byte j = 1, dato, mayor = 0;
        
        while( j <= 15 ){
        
            dato = Tools.leeByte("Dato:");
            
            if( dato > mayor){
                mayor = dato;
            }
            j++;
        }
        
        return mayor;
    }
    
    //diseñar un método de clase que reciba como parámetro un valor entero y retorne su correspnndiente valor factorial:
    public static double Factorial( int n){   
        byte j = 1; double fact;
        
        if(n == 0 || n == 1) return 1;
        else{
            fact = 1;
        }
            while( j <= n){
            
                fact*=j;
                j++;
            }
        
        return fact;
    } 
    
    // CICLO DO WHILE
    
    //diseñar un método de clase que lea un valor entero y retorne la tabla de multiplicar del número que recibe    
    public static String tablasMultiplicarDW(int n){
        
        String cad = "";
        byte j = 1;        
        
        do{
            cad+= n + "*" + j + " = " + (n*j) + "\n"; 
            
            j++;            
        }while( j <= 10 );
        return cad;
    }

    //diseñar un método de clase que lea 15 valores enteros e imprima el mayor:
    public static byte numMayorDW(){
        byte j = 1, dato, mayor = 0;
        do{
            dato = Tools.leeByte("Dato:");
            
            if( dato > mayor){
                mayor = dato;
            }
            j++;
        }while( j <= 15 );
        
        return mayor;
    }
    
    //diseñar un método de clase que reciba como parámetro un valor entero y retorne su correspnndiente valor factorial:
    public static double FactorialDW( int n){   
        byte j = 1; double fact;
        
        
        if(n == 0 || n == 1) return 1;
        else{
            fact = 1;
        }
        
        do{
             fact*=j;
                j++;
        }while( j <= n);
        
        return fact;
    } 
    
    // CICLOS FOR
    public static String tablasFor(int n){
        
        String cad = "";
        for(byte j = 1; j<= 10; j++ ){
            cad+= n + "*" + j + " = " + (n*j) + "\n";
        }       
        return cad;
    }

    //diseñar un método de clase que lea 15 valores enteros e imprima el mayor:
    public static byte numMayorFor(){
        byte dato, mayor = 0;
        
        for( byte j = 1; j<= 15; j++){
            dato = Tools.leeByte("Dato:");
            
            if( dato > mayor){
                mayor = dato;
            }
        }
        return mayor;
    }
    
    //diseñar un método de clase que reciba como parámetro un valor entero y retorne su correspnndiente valor factorial:
    public static double FactorialFor( int n){   
        double fact;
        
        if(n == 0 || n == 1) return 1;
        else{
            fact = 1;
        }
        
        for(byte j = 1; j <= n; j++){
            fact*=j;
        }return fact;
    } 
    
    public static int sumaDivisores(int dato){
    
        int k = 1, suma = 0;
        
        do{
        
            if (dato % k == 0) suma+=k;
            
            k++;
        }while(k < dato);
        
    return suma;
    }
    
    public static String numPares(){
    
        String cad = "";
        byte k = 2; 
        
        do{
            cad += k + "\n";
            
            k+= 2;
        }while( k <= 20);
        
    return cad;
    }
    
    public static String ctaDigitos(int dato){
    
        byte c = 0;
        do{
        
            dato/=10;
            
            c++;
        }while(dato != 0);
        
    return c + "\n";
    }
    
   
     public static void main (String [] args){

    //     System.out.println(sumaDivisores(12));
         
     }

    
}
