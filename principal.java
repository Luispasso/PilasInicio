import java.util.Scanner;
import java.util.Stack;
public class principal
{
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        metodos met = new metodos();
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("BIENVENIDOS A LA CLASE DE PILAS VAMOS A MIRAR UN CRUD");
        
        while (seguir) {
           System.out.println("ELIJA LA OPCIÓN DE SU PREFERENCIA ");
           System.out.println("1. LLENAR PILA");
           System.out.println("2. MOSTRAR PILA");
           System.out.println("3. MODIFICAR");
           System.out.println("4. ELIMINAR");
           System.out.println("5. SALIR");
           int n1 = 1, n2 = 5;
           int opc = met.ValidarEntero(sc);

           switch (opc) {
            case 1:
                  met.Registrar(pila);
                  break;
            case 2 : 
                 met.mostar(pila);
               break;
            case 3: 
                   int num = met.PedirDato(1);
                   pila = met.Modificar(pila, num);

                 break;
            case 4:
                   int numero= met.PedirDato(3);
                   pila = met.Elimnar(pila, numero);
                break;
                case 5:
                    seguir = false;
                    break;
            default:
                 System.out.println("OPCION INVALIDA");
                break;
           }
        }
    }
}