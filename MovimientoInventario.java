public abstract class MovimientoInventario {

    protected int idMovimiento;
    protected Producto producto;
    protected int cantidad;

    public MovimientoInventario(int idMovimiento, Producto producto, int cantidad) {
        this.idMovimiento = idMovimiento;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public abstract void ejecutarMovimiento() throws Exception;

}
