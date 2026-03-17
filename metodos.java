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
            opc = ValidarEntero(sc);
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
            
            if(opc == 2)
                continuar = false;
            
        }

        return p; 
    }
    public int PedirDato(int opc)
    {
        switch (opc) {
            case 1:
                 System.out.println("INGRESE EL NUMERO A MODIFICAR");
                 opc = ValidarEntero(sc);
                break;
            case 2 :
                System.out.println("INGRESE LA MODIFICACION");
                opc = ValidarEntero(sc);
                break;
            default:
                System.out.println("INGRESE EL NUMERO QUE VA A ELIMINAR");
                opc = ValidarEntero(sc);
                break;
        }
        return opc;
    }

    public Stack<Integer> Modificar(Stack<Integer> p, int num, int con)
    {
         Stack<Integer> AuxP = new Stack<>();
         int n = p.size();
         int sw = 1;
         for (int i = 0; i < n; i++) {
           if(p.peek().equals(num))
           {
            if(sw == 1)
            {
            p.pop();
            AuxP.push(PedirDato(2));
            if(con == 1)
                sw = 0;
           }
           }
           else
            AuxP.push(p.pop());
         }

         for (int i = 0; i < n; i++) {
            p.push(AuxP.pop());
         }
         System.out.println("MODIFICADO CON EXITO");
        return p;
    }

        public Stack<Integer> Elimnar(Stack<Integer> p, int num)
    {
         Stack<Integer> AuxP = new Stack<>();
         int n = p.size();
         for (int i = 0; i < n; i++) {
           if(p.peek().equals(num))
           {
            p.pop();
           }
           else
            AuxP.push(p.pop());
         }

         for (int i = 0; i < n - 1; i++) {
            p.push(AuxP.pop());
         }

         System.out.println("ELIMANADO CON EXITO ");
        return p;
    }
    
    public int repetido(Stack<Integer> p, int opc, int num)
    {
        Stack<Integer> AuxP = new Stack<>();
         int n = p.size(), con = 0;
         for (int i = 0; i < n; i++) {
           if(p.peek().equals(num))
           {
            p.pop();
            con++;
           }
           else
            AuxP.push(p.pop());
         }

         if(con == 0)
         {
              System.out.println("NUMERO NO EXISTE");
         }
        else if(opc == 3 && con > 1)
        {
            System.out.println("1. MODIFICAR EL PRIMER DATO ENCONTRADO");
            System.out.println("2. MODIFICAR TODOS LOS DATOS ");
            con = ValidarEntero(sc);
        }
        else if(opc == 4 && con > 1)
        {
            System.out.println("1. ELIMINAR EL PRIMER DATO ENCONTRADO");
            System.out.println("2. ELIMINAR TODOS LOS DATOS ");
            con = ValidarEntero(sc);
        }
        return con;
    }
   
    public void mostar(Stack<Integer> p)
    {
        System.out.println(p);
    }
}
