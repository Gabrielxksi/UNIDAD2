package Funciones;

import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class MatricesIterativas {
        public static void leerMatriz(int tabla[][]){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j]= Tools.leeInt("Inserte pos[" + i + "] [" + j+ "]:");
            }
        }
    }
    
    private static void verMatriz(int v[][]) {
        String cad ="";
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                cad+= "[" + v[i][j] + "]" + " ";
            }
        cad +="\n";
        }
        
        JOptionPane.showMessageDialog(null, "Datos en la matriz;" + cad);
    }
    
  //  public static void leeLetras(char a[][]){  }
    
    public static void main (String [] args){
         int vec[][] = new int [5][3];
         leerMatriz(vec);
         verMatriz(vec);
}

}