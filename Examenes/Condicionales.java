package Examenes;

import java.util.Scanner;

public class Condicionales extends Object {
    static Scanner sc;

    protected static void inicializar() throws Exception{
        sc = new Scanner (System.in);
    } 

    protected static void finalizar () throws Exception {
        if (sc != null)
        sc.close();
    }

    protected static int menuAlimentacion() throws Exception {
        System.out.println("Tipo de alimento: ");
        System.out.println("1. Huevo");
        System.out.println("2. Leche");
        System.out.println("3. Pan");
        System.out.println("4. Fruta");
        System.out.println("5. Verdura");
        System.out.println("6. Otros");
        System.out.print("Opción: ");
        return Integer.parseInt(sc.nextLine());        
    }

    protected static void imprimirTicket (int opcion, int iva, int dto, String nombre, int cantidad,Double precio){
        System.out.println("Factura");
        System.out.println("________________________________________");
        System.out.printf("Articulo %31s\n", nombre);
        System.out.printf("Precio %24.2f €/unidad\n", precio);
        System.out.printf("Cantidad %31d\n", cantidad);
        System.out.printf("Total %33.2f€\n", precio*cantidad);
        double descuento = 0;

        if (opcion==2){
            descuento = -(double)dto/100*precio*cantidad;
            System.out.printf("Descuento (20%%) %23.2f€\n", descuento);
        }
        if (opcion==4 && cantidad >=3){ 
            descuento = -cantidad/3*precio;
            System.out.printf("Descuento (3x2) %24.2f€\n", descuento);
        }
        if (descuento>0){
            System.out.printf("Total con descuentos %20.2f\n", descuento);
            double total = precio * cantidad - descuento;
            double parteIva = total*(double)iva/100;
            total = total + parteIva;
            if (iva > 4)
                System.out.printf("IVA al %d%%%30.2\n", iva, parteIva);
            else 
                System.out.printf("IVA al %d%%%31.2\n", iva, parteIva);
            System.out.printf("Total con IVA %26.2f\n", total);
        }




    }

    protected static int menuPrincipal() throws Exception {
        int ret = -1;
        System.out.println("Introduzca el tipo de producto: ");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");
        System.out.print("Opción: ");
        ret = Integer.parseInt(sc.nextLine());        
        return ret;
    }

    public static void main (String [] args) throws Exception{
        int opcion = -1;

        try {
            int iva = 21;
            int dto = 0;
            inicializar();
            opcion = menuPrincipal();

            switch (opcion){
                case 1:
                    int opcionAlimentacion = menuAlimentacion();
                    switch (opcionAlimentacion) {
                        case 1:
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                            iva = 4;
                            break;
                        default:
                            iva = 10;
                    }
                case 2: 
                    dto = 20;
                    break;
                case 3: 
                    iva = 4;
                    break;                
    
            }
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            System.out.print("Precio por unidad: ");
            imprimirTicket(opcion, iva, dto, nombre, cantidad, null);
            System.out.println("Gracias por utilizar la app");
        } catch (Exception e){
            System.out.println("Ha ocurrido un error");
        }
        finalizar();
    }



}
