package TestEjercicios;

import Funciones.Ejercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class MainEjercicios {
    public static void main (String [] args){
        //ITERATIVOS ******
      // JOptionPane.showMessageDialog(null, "El número tiene esta cantidad de digítos:" + ctaDigitosIterativo(12));
      
      /*for(int num=15; num >=0; num--){
      JOptionPane.showMessageDialog(null, "Factorial de: "+num+ " es: " + (int)FactorialIterativo(num) );
      }*/
      
      
      /*for(int n=20; n >=1; n--){
      JOptionPane.showMessageDialog(null,n + " en valor binario:"+ binarioIterativo(n));
      }*/
      
      
      
      // RECURSIVOS *******
      //JOptionPane.showMessageDialog(null, "El número tiene esta cantidad de dígitos:"+ ctaDigitosRecursivo((byte)0, 20)); 
      
      /*for(int num=15; num >=0; num--){
      JOptionPane.showMessageDialog(null, "Factorial de: "+num+ " es: " + FactorialRecursivo((byte)1, num) );
      }*/
      
      /* 
      for(int n=20; n >=1; n--){
      JOptionPane.showMessageDialog(null,n + " en valor binario: "+ DBinaRecursivo(n));
      }*/
    
      
      // 08 de MARRZO
      /*
      int vec[] = {45,6,12,-45,78,35,12,11,35,8};
      Ejercicios.ordenaBurbuja(vec);
      Ejercicios.imprimeArray(vec);
      */

      int a[] = {45,6,12,-45,78,35,12,11,35,8};
      Ejercicios.ordenaBurbuja_i(a, 0);
      //Ejercicios.imprimeArray(a);
      JOptionPane.showMessageDialog(null,Ejercicios.imprimeRecursivo(a, 0));
    }
}
