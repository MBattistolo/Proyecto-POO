public class Main {

    public static void main(String[] args) {

        try {

            InventarioManager inventario = new InventarioManager(10,10);

            Producto p1 = new Producto(1,"Arroz",2500,50);
            Producto p2 = new Producto(2,"Leche",3000,30);

            inventario.agregarProducto(p1);
            inventario.agregarProducto(p2);
            inventario.agregarProducto(new Producto(3,"Azucar",2000,40));

            MovimientoInventario entrada =
                    new EntradaInventario(1,p1,20);

            MovimientoInventario salida =
                    new SalidaInventario(2,p2,10);
                    new SalidaInventario(5,p1,500);

            inventario.registrarMovimiento(entrada);
            inventario.registrarMovimiento(salida);


            inventario.mostrarProductos();
            inventario.buscarProducto(99);

        }

        catch(Exception e){

            System.out.println("Error: " + e.getMessage());
        }
    }
}

