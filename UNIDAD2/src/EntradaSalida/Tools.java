package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools { 
///// LEE ENTERO 
    public static int leeInt(String msg) {
        do {
            int x;
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Int", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.err.println("Usar solo números.");
            }
        } while (true);
    }

    ///// LEE FLOTANTE 
    public static float leeFloat(String msg) {
        do {
            float x;
            try {
                x = Float.parseFloat(JOptionPane.showInputDialog(null, msg, "Float", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Usar solo números.");
            }
        } while (true);
    }

    ///// LEE BYTE 
    public static byte leeByte(String msg) {
        do {
            byte x;
            try {
                x = Byte.parseByte(JOptionPane.showInputDialog(null, msg, "Byte", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Usar solo números.");
            }
        } while (true);
    }

    //// LEE STRING 
    public static String leeString(String msg) {
        String x;
        x = (JOptionPane.showInputDialog(null, msg, "String", JOptionPane.INFORMATION_MESSAGE));
        return x;
    }
 
    //// LEE SHOR
    public static short leeShort(String msg) {
        do {
            short x;
            try {
                x = Short.parseShort(JOptionPane.showInputDialog(null, msg, "Short", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Usar solo números.");
            }
        } while (true);
    }

    //// LEE CHAR
    public static char caracter(String msg) {
        char x;
        x = JOptionPane.showInputDialog(null, msg, "Int", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        return x;
    }

    //// LEE LONG 
    public static long leeLong(String msg) {
        do {
            long x;
            try {
                x = Long.parseLong(JOptionPane.showInputDialog(null, msg, "Int", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Usar solo números.");
            }
        } while (true);
    }

    //// LEE DOUBLE
    public static double leeDouble(String msg) {
        do {
            double x;
            try {
                x = Double.parseDouble(JOptionPane.showInputDialog(null, msg, "Int", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Usar solo números.");
            }
        } while (true);
    }

    //// LEE BOOLEAN 
    public static boolean leeBoolean(String msg) {
        do {
            boolean x;
            try {
                x = Boolean.parseBoolean(JOptionPane.showInputDialog(null, msg, "Int", JOptionPane.INFORMATION_MESSAGE));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Error.");
            }
        } while (true);
    }

    public static void ErrorMsj(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error.", JOptionPane.ERROR_MESSAGE);
        
    }
    
   public static void Imprime(String msg){
       JOptionPane.showMessageDialog(null, msg, "Información", JOptionPane.INFORMATION_MESSAGE);
   
   }   
}
