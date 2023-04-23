package Funciones;

import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class Recursivas {
    public static void funcionRecursiva(int j, int n){
        //para mostrar directo
        if(j <= n){
            System.out.println(j);
            funcionRecursiva(j+1, n);
        }
    }
    
    public static String Recursivas(int j, int n){
    //para enviar mensaje
        if(j <= n){
            return j +"\n" +  Recursivas(j+1, n);
        }
        else return "";
    }
    
    //NÚMERO MAYOR EN VERSION RECURSIVA
    
    public static int leerMayor(byte j, int mayor){
    
        if(j <= 5){
        
            int dato = Tools.leeInt("Dato:");
            
            if(dato> mayor)mayor = dato;
                return leerMayor((byte) (j+1), mayor);
            
        }
       return mayor;
    }
    
    //TABLA DE MULTIPLICAR 
    
    public static String tablaMultiplicar(byte j, int num){
        
        if(j <= 10){
        
            return (num+ " * " + j + " = " + (num*j) + "\n" + tablaMultiplicar((byte)(j+1), num));
        }
        
        return "";
    }
    
    public static int Factorial( byte j, int num){   
        double fact = 0;
        
        if(num == 0 || num == 1) return 1;
       else fact=1 ;
        if( j <= num){ 
            
            return j*Factorial((byte)(j+1), num);
        }
        
        return (int)fact;
    } 
    
    public static int sumaDivisores(int k, int dato){
    
        int suma = 0;
        if( k< dato ){
            if(dato % k == 0)
            suma+=k;
        return suma+ sumaDivisores((byte) (k+1), dato);
        }
        return suma;
    }
    
    public static String numPares(byte j, int num){
        String cad = ""; 
        if( j <= num){
            
            return cad += j + "\n" +numPares((byte)(j+2), num );
            
        }
    return "";
    }

    public static byte ctaDigitos(byte c, int dato){
    
        if( dato != 0){
        dato/=10;
        return ctaDigitos((byte)(c+1), dato);}
        
        return c;
    }
    
    // METODOS RECURSIVOS INDIRECTOS

     public static String Tabla(int j, int n){
    //para enviar mensaje
        if(j <= n){
            return tablaMultiplicar((byte)1, j) +"\n" +  Tabla(j+1, n);
        }
        else return "";
    }
    
     public static String Digitos(int j, int n){
    
        if(j <= n){
        return j + " = " +(ctaDigitos((byte) 0, j) + "\n" + Digitos(j+1, n));
        }
        else return "";    
    }
     
     public static String Recur(int j){
    //para enviar mensaje
        if(j >= 1){
            return j +  Recur(j-1);
        }
        else return "";
    }
    public static String Triangulo(int j){
    
        if(j >= 1){
        return Recur(j) +"\n" +  Triangulo(j-1);
        }
        else return "";    
        
    }
     
     public static void main (String [] args){
         
         
        //System.out.println("" + numPares((byte)2, 18) );
        //System.out.println(ctaDigitos((byte)0, 8));
        //System.out.println(sumaDivisores((byte)1, 12));
         
         //.out.println(Tabla(1,10));
         System.out.println(Triangulo(10));
         
        // int num = Tools.leeInt("Calcular el factorial de:");
        // JOptionPane.showMessageDialog(null, Factorial((byte)1, num) );
         
         //int num = Tools.leeInt("Tabla que desea:");
         //JOptionPane.showMessageDialog(null, tablaMultiplicar((byte)1, num));
         
     }
   
}
