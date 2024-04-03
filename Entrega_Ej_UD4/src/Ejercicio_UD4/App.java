package Ejercicio_UD4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      Empleado nuevoEmpleaedo = new Empleado();
      Scanner teclado = new Scanner(System.in);
     Empresa nuevoTrabajo= new Empresa();
      int caso;

    while (true) {
      
    
      System.out.println("Bienvenido al menu de altas\n Seleccione la opcion que desea:\n Opcion 1:Alta\t Opcion 2:Datos del empleado\t opcion3: Cadena");
      caso=teclado.nextInt();
      teclado.nextLine();
      switch (caso){
      
        case 1:
          nuevoTrabajo.nuevaEmpresa(teclado);
          nuevoEmpleaedo.nuevoTrabajador(teclado);
          
          System.out.print(nuevoEmpleaedo);
          System.out.println(nuevoTrabajo);
          break;

        case 2:
          nuevoEmpleaedo.nuevoTrabajador(teclado);
          System.out.println(nuevoEmpleaedo);
          break;
          
        case 3:
         System.out.println("Introducir los datos de la siguiente manera:45666783L&Juan&Lopez&45&Ourense%A80192727&Los hermanos S.L.&Calle Principal 5, Lugo&22");
         String frase=teclado.nextLine();
         Scanner limit = new Scanner(frase);
        limit.useDelimiter("%");
        nuevoEmpleaedo.limitador(limit.next());
        nuevoTrabajo.limitador(limit.next());
        System.out.println("Empleado: "+nuevoEmpleaedo+"\tEmpresa: " + nuevoTrabajo);
         break;
        default:
          break;
        }
      
    }
    
    }
  }
