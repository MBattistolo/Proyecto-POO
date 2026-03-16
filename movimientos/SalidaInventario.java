public class SalidaInventario extends MovimientoInventario implements Validable {

    public SalidaInventario(int idMovimiento, Producto producto, int cantidad) {

        super(idMovimiento, producto, cantidad);
    }

    @Override
    public void validar() throws StockInsuficienteException {

        if (cantidad > producto.getStock()) {

            throw new StockInsuficienteException(
                    "Stock insuficiente para el producto: " + producto.getNombre());
        }
    }

    @Override
    public void ejecutarMovimiento() throws StockInsuficienteException {

        validar();

        int nuevoStock = producto.getStock() - cantidad;

        producto.setStock(nuevoStock);
    }
}