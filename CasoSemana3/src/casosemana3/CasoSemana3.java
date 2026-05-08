/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casosemana3;

public class CasoSemana3 {

    public static void main(String[] args) {

        Producto p1 = new Producto();
        p1.setCodigo(Producto.generar_codigo());
        p1.verDatos();

        Producto p2 = new Producto("Laptop", "Tecnologia");
        p2.setCodigo(Producto.generar_codigo());
        p2.verDatos();

    }

}