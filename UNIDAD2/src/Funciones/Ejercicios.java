package Funciones;

import EntradaSalida.Tools;
import javax.swing.JOptionPane;


public class Ejercicios {

    /*
    1. Crea un método que imprima por pantalla un rectangulo a partir de 
    valores de base y altura, usar el caracter "-"
    2. Metodo que cuenta digitos que tienen un numero entero
    3.Imprimir los primeros 15 numeros y su factorial
    4. "" 20 valores y su valor binario
    */
    
    //ITERATIVOS

    // CUENTA DIGITOS
    public static String ctaDigitosIterativo(int dato){
    
        byte c = 0;
        do{
        
            dato/=10;
            
            c++;
        }while(dato != 0);
        
    return c + "\n";
    }
    
    // FACTORIAL 15 NUMEROS
    public static double FactorialIterativo( int n){   
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
    
    // BINARIO DE 20 VALORES
    public static String binarioIterativo(int valor){
        
        String bin =" ";
        while(valor!= 0){
            bin = valor%2 + bin;
            valor /= 2;
        }
        return bin;
    }
    
    //RECURSIVOS
    public static String Recursivas(int j, int n){
    //para enviar mensaje
        if(j <= n){
            return j +"\n" +  Recursivas(j+1, n);
        }
        else return "";
    }
    //CUADRADO
    
    //CUENTA DIGITOS
    public static byte ctaDigitosRecursivo(byte j, int n){
    //para enviar mensaje
    if(n !=0){
           n/=10;
            return  (byte) (ctaDigitosRecursivo((byte) (j+1), n));
        }
    return j;
    }
    //15 VALORES Y FACTORIAL
    public static int FactorialRecursivo( byte j, int num){   
        double fact = 0;
        
        if(num == 0 || num == 1) return 1;
       else fact=1 ;
        if( j <= num){ 
            
            return j*FactorialRecursivo((byte)(j+1), num);
        }
        
        return (int)fact;
    } 
    
    // BINARIO DE 20 VALORES

    public static String binarioRecursivo(byte j, int valor){
        
        String bin = "";
        if(j <= valor){
            binarioRecursivo((byte) (j+1), valor%2 );
            bin = valor%2 + bin;
            valor /= 2;
                return bin + binarioRecursivo((byte) (j+1), valor);
        }
        else return null;    
    }
     
    public static String DBinaRecursivo (int n){
    
        String bin ="";
        if(n !=0){
        bin = n%2 + bin;
        n/=2;
        return DBinaRecursivo(n) + bin ;  

        }
        return bin;
    }
    
    
    // 08 DE MARZO EJERCICIOS
    // ITERATIVO
    public static void ordenaBurbuja(int a[]){
        int i, j, aux;
        
        for(i= 0; i<a.length-1; i++ ){
            for(j =i+1 ; j < a.length; j++){
                if(a[i] > a[j]){
                    //intercambio
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }       
            }
        }        
    }
    public static void imprimeArray( int a[]){        
        String cad = "";
        for (int i=0; i <= a.length-1;i++){
            
            cad += "[" + i + "] = "+ a[i]+ "\n";
        }
        Tools.Imprime("Datos ordenados: \n " + cad);
    }
        
    // RECURSIVO 
    
    public static String imprimeRecursivo(int a[], int i){
    
        String cad = "";
        if(i < a.length){
            cad += "[" + i + "] = "+ a[i]+ "\n";
            return cad + imprimeRecursivo(a, i+1);
        }
        return  cad ;
    }
    
    public static void ordenaBurbuja_i(int a[], int i){
        if(i < a.length-1){
            ordenaBurbuja_j(a, i, i+1);
            ordenaBurbuja_i(a, i+1);
        }
        
    }
    
    public static void ordenaBurbuja_j(int a[], int i,int j){
        int aux = 0;
        if(j < a.length){
            
            if(a[i] > a[j]){
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
            }
            ordenaBurbuja_j(a,i, j+1);
        }
    
    }
    
    // 09 DE MARZO 
    // Imprime 10 primeros numeros pares comenzando de 2 en 2 e imprima sus respectivos valores al cubo:
    // el cubo de 2 es 8
    //el cubo de 4 es 64
    public static String Recursivo(int j, int n){
    //para enviar mensaje
        if(j <= n){
            return j +"\n" +  Recursivas(j+1, n);
        }
        else return "";
    }

    public static String numParesRecursivo(byte j, int i){
        String cad = ""; 
        if( i < 10){
            return cad += "El cubo de: "+ j + " es = " + (int)Math.pow(j, 3) + "\n" +numParesRecursivo((byte)(j+2), i+1);
        }
    return "";
    }

    public static String numPrimosRecursivo(byte j, int i){
        String cad = ""; 
        if( i < 10){
            for (int x = 2; x < i; x++) {
                if( j % 2 == 0 ){
                
                }
            }
            return cad += "El cubo de: "+ j + " es = " + (int)Math.pow(j, 3) + "\n" +numPrimosRecursivo((byte)(j+1), i+1);
        
    }    return "";

    }
    
    public static void main (String [] args){
                // JOptionPane.showMessageDialog(null, numParesRecursivo((byte)2,0 )); 
                 JOptionPane.showMessageDialog(null, numPrimosRecursivo((byte)2,0 )); 
                 
        }        

}