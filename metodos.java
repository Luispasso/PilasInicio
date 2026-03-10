import java.util.Scanner;
import java.util.Stack;

public class metodos {
    
    Scanner sc = new Scanner(System.in);
    public int ValidarEntero(Scanner sc)
    {
        
        while (!sc.hasNextInt()) {
            System.out.println("POR FAVOR DIGITE UN CARACTER NUMERICO");
            sc.nextLine();
        }
        
        return sc.nextInt();
    }

    public double ValidarDecimal(Scanner sc)
    {
        
        while (!sc.hasNextInt(0)) {
            System.out.println("POR FAVOR DIGITE UN CARACTER NUMERICO");
            sc.nextLine();
        }
        
        return sc.nextInt();
    }


    public int ValidarRango(int n1, int n2, int opc)
    {
        while (opc < n1 || opc > n2) {
            System.out.println("POR FAVOR INGRESE UNA OPCION ENTRE " + n1 + " y " + n2);
        }
        
        return opc;
    }


    public Stack<Integer> Registrar(Stack<Integer> p)
    {
        boolean continuar = true;
        int numero = 0, opc = 0;
        int n1 = 1, n2 = 2;
        while (continuar) {
            System.out.println("INGRESE EL NUMERO");
            numero = ValidarEntero(sc);
            p.push(numero);
            System.out.println("DESEA AGREGAR MAS REGISTROS 1 = SI 2 = NO");
            opc = ValidarEntero(sc);
            opc = ValidarRango(n1, n2, opc);
            
            if(opc == 0)
                continuar = false;
            
        }

        return p; 
    }

    public void mostar(Stack<Integer> p)
    {
        System.out.println(p);
    }
}
