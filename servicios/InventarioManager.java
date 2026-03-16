public class InventarioManager {

    private Producto[] productos;
    private MovimientoInventario[] movimientos;

    private int totalProductos = 0;
    private int totalMovimientos = 0;

    public InventarioManager(int capacidadProductos, int capacidadMovimientos) {

        productos = new Producto[capacidadProductos];
        movimientos = new MovimientoInventario[capacidadMovimientos];
    }

    public void agregarProducto(Producto p) {

        productos[totalProductos] = p;
        totalProductos++;
    }

    public Producto buscarProducto(int id) throws ProductoNoEncontradoException {

        for (int i = 0; i < totalProductos; i++) {

            if (productos[i].getId() == id) {

                return productos[i];
            }
        }

        throw new ProductoNoEncontradoException("Producto no encontrado");
    }

    public void registrarMovimiento(MovimientoInventario movimiento) throws Exception {

        movimiento.ejecutarMovimiento();

        movimientos[totalMovimientos] = movimiento;

        totalMovimientos++;
    }

    public void mostrarProductos() {

        for (int i = 0; i < totalProductos; i++) {

            System.out.println(productos[i]);
        }
    }
}