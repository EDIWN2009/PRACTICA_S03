/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casosemana3;

public class CasoSemana3 {

    public static void main(String[] args) {

        // OBJETOS PRODUCTO
        Producto p1 = new Producto();
        p1.setCodigo(Producto.generar_codigo());
        p1.verDatos();

        Producto p2 = new Producto("Laptop", "Tecnologia");
        p2.setCodigo(Producto.generar_codigo());
        p2.setPrecio(2500);
        p2.setStock(10);
        p2.setMarca("Lenovo");
        p2.verDatos();

        // OBJETOS PROVEEDOR
        Proveedor pr1 = new Proveedor();
        pr1.setCodigo(Proveedor.generar_codigo());
        pr1.verDatos();

        Proveedor pr2 = new Proveedor("Backus", "12345678901");
        pr2.setCodigo(Proveedor.generar_codigo());
        pr2.setTelefono("987654321");
        pr2.setDireccion("Lima");
        pr2.setCorreo("ventas@backus.com");
        pr2.verDatos();

    }

}