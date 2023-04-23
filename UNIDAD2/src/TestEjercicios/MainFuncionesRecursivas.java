package TestEjercicios;

import Funciones.*;
import EntradaSalida.Tools;
//import static Funciones.Recursivas.*;
import javax.swing.JOptionPane;

public class MainFuncionesRecursivas {
 
    public static void main (String [] args){
        Menu1("1. Tabla de multiplicar\n2. Número msyor\n3. Factorial\n4. Salir");
        //FuncionesRecursivas.funcionRecursiva(1, 5);
        //Tools.Imprime(Recursivas.Recursivas(1, 5));
        //JOptionPane.showMessageDialog(null, Recursivas.leerMayor((byte) 1, 0));
        
        
    }
    
    public static void Menu1(String Menu){
        
        Iterativas obj = new Iterativas();
        int sel;
        do{
            sel=Tools.leeInt(Menu);
            switch(sel){
                case 1: int Mult= Tools.leeInt("¿De que numero desea saber la tabla de multiplicar?");
                        String ResultadoM= obj.tablaMultiplicar(Mult);
                        Tools.Imprime("Tabla de multiplicar del numero: " + "[" + Mult + "]" + "\n" + ResultadoM);
                        break;
                case 2: int Mayor=obj.numMayor(); 
                        Tools.Imprime("El numero mayor es: " + Mayor);
                        break; 
                case 3: int Fact= Tools.leeInt("¿De que numero desea saber su facotiral?");
                        double ResultadoF= obj.Factorial(Fact);
                        Tools.Imprime("El factorial de " + Fact + " es: " + "\n" + ResultadoF);
                        break;
                case 4: Tools.Imprime("Fin del programa"); break;
                default: Tools.Imprime("Opcion no definida, intenta de nuevo");
            }
        }
        while(sel!=4);
    }
    public static String desplegable(String Menu){
        String valores[]=Menu.split(",");
        String res=(String)JOptionPane.showInputDialog(null, "Menu","Selecciona opcion:", 
                JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
        return(res);
    }
    public static void Menu2(String Menu){
        String sel;
        do{
            sel=desplegable(Menu);
            switch(sel){
                case "Agregar": ; break;
                case "Imprimir": ; break;
                case "Salir": ; break;
            }
        }
        while(!sel.equalsIgnoreCase("Salir"));
    }
    public static String boton(String Menu){
        String valores[]=Menu.split(",");
        int n;
        n=JOptionPane.showOptionDialog(null, "Selecciona dando click", "Menu", 
                JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null ,valores, valores[0]);
        return(valores[n]);
    }
}   

