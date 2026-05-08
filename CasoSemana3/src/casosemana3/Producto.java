/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casosemana3;

/**
 *
 * @author USUARIO
 */
public class Producto {
    
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private String marca;
    private String codigo;
    private static int ultimo_correlativo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getUltimo_correlativo() {
        return ultimo_correlativo;
    }

    public static void setUltimo_correlativo(int ultimo_correlativo) {
        Producto.ultimo_correlativo = ultimo_correlativo;
    }

    public Producto() {
    }

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public static String generar_codigo() {
        ultimo_correlativo = ultimo_correlativo + 1;
        String codigo_generado = String.format("P%05d", ultimo_correlativo);
        return codigo_generado;
    }

    public void verDatos() {
        System.out.println("Producto: NOMBRE: " + this.nombre +
                " CATEGORIA: " + this.categoria +
                " PRECIO: " + this.precio +
                " STOCK: " + this.stock +
                " MARCA: " + this.marca +
                " CODIGO: " + this.codigo);
    }
    
}
