package ENUM;

public class ServiciosMain {
    public static void main(String[] args) {
        // Ejemplo de uso de cada servicio
        Servicios corte = Servicios.CORTE;
        Servicios unas = Servicios.UNAS;
        Servicios tinte = Servicios.TINTE;

        // Mostrar información de cada servicio
        System.out.println("Servicio: " + corte.getNombre());
        System.out.println("Descripción: " + corte.getDescripcion());
        System.out.println("Precio: $" + corte.getPrecio());
        System.out.println("Descripción personalizada: " + corte.mostrarDescripcionServicio());
        System.out.println();

        System.out.println("Servicio: " + unas.getNombre());
        System.out.println("Descripción: " + unas.getDescripcion());
        System.out.println("Precio: $" + unas.getPrecio());
        System.out.println("Descripción personalizada: " + unas.mostrarDescripcionServicio());
        System.out.println();

        System.out.println("Servicio: " + tinte.getNombre());
        System.out.println("Descripción: " + tinte.getDescripcion());
        System.out.println("Precio: $" + tinte.getPrecio());
        System.out.println("Descripción personalizada: " + tinte.mostrarDescripcionServicio());
    }
}
