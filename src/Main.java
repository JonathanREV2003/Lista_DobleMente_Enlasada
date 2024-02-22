// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Mostrar datos
        ListaEnlasada A1 = new ListaEnlasada();

        //agregar datos al inicio
        A1.agregarInicio(1);
        A1.agregarInicio(2);
        A1.agregarInicio(3);
        A1.agregarInicio(4);
        A1.agregarInicio(5);

        System.out.println();
        System.out.println("Mostrar datos de INICIO a FIN");
        A1.mostrarDatosDeInicioAFinal();
        System.out.println();
        System.out.println("Mostrar datos de FINAL a INICIO");
        A1.mostrarDatosDeFinalAlInicio();
        System.out.println();

        System.out.println("Agregar datos al FINAL");
        A1.agregarFinal(6);
        A1.mostrarDatosDeInicioAFinal();

        System.out.println();
        System.out.println("Eliminar datos del inicio");
        A1.eliminarElementosDelInicio();
        A1.mostrarDatosDeInicioAFinal();
        System.out.println();


    }
}