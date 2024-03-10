import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaEnlasada A1 = new ListaEnlasada();
        //agregar datos al inicio (Mensajeria entrante)
        A1.agregarInicio(1);
        A1.agregarInicio(2);
        A1.agregarInicio(3);
        A1.agregarInicio(4);
        A1.agregarInicio(5);
        A1.agregarInicio(6);
        A1.agregarInicio(7);
        A1.agregarInicio(8);
        A1.agregarInicio(9);
        A1.agregarInicio(10);

        System.out.println(" ");
        System.out.println(" Escriba el numero de la opcion que desea ejecutar");
        System.out.println(" ");

        System.out.println("Mostrar todos los datos           <1>");
        System.out.println("Mostrar datos del FINAL al INICIO <2>");
        System.out.println("Agregar nueva solicitud           <3>");
        System.out.println("Eliminar los datos del inicio     <4>");

        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                A1.mostrarDatosDeInicioAFinal();
                break;
            case 2:
                A1.mostrarDatosDeFinalAlInicio();
                break;
                case 3:

                //simulacion de agreagar una nueva solicitud de mensaje (solicitud 11)
                A1.agregarFinal(11);
                System.out.println("mensaje agregado, estas son las nuevas solicitudes");
                A1.mostrarDatosDeInicioAFinal();
                break;

                case 4:
                A1.eliminarElementosDelInicio();
                A1.mostrarDatosDeInicioAFinal();
                break;

            default:

                System.out.println("Opcion no valida");
                break;
        }


    }
}
