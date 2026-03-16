public class EntradaInventario extends MovimientoInventario {

    public EntradaInventario(int idMovimiento, Producto producto, int cantidad) {

        super(idMovimiento, producto, cantidad);
    }

    @Override
    public void ejecutarMovimiento() {

        int nuevoStock = producto.getStock() + cantidad;

        producto.setStock(nuevoStock);
    }
}