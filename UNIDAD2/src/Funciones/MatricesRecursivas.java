package Funciones;

import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class MatricesRecursivas {

    public static void leerMatrizI(int a[][], int i) {
        if (i < a.length) {
            leerMatrizJ(a, i, 0);
            leerMatrizI(a, i + 1);
        }
    }

    public static void leerMatrizJ(int a[][], int i, int j) {
        if (j < a[i].length) {
            a[i][j] = Tools.leeInt("Inserte pos[" + i + "] [" + j + "]:");
            leerMatrizJ(a, i, j + 1);
        }
    }

    public static String verMatrizI(int a[][], int i) {
        if (i < a.length) {
            return verMatrizJ(a, i, 0) + verMatrizI(a, i + 1);
        } else {
            return "";
        }
    }

    public static String verMatrizJ(int a[][], int i, int j) {
        if (j < a[0].length) {
            //return "[" + i + "]" + "[" + j+"] = "+  + verMatrizJ(a,i,j+1);
            return "[" + a[i][j] + "]" + " " + verMatrizJ(a, i, j + 1);
        } else {
            return "\n";
        }
    }

    public static void main(String[] args) {
        int vec[][] = new int[3][3];
        leerMatrizI(vec, 0);
        JOptionPane.showMessageDialog(null, verMatrizI(vec, 0));
    }
}
