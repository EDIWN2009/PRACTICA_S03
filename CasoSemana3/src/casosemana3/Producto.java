/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casosemana3;

/**
 *
 * @author USUARIO
 */
public final class Producto {
    
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
        try {
            if(nombre == null || nombre.equals("")) {
                throw new Exception("El nombre no puede estar vacío");
            }
            this.nombre = nombre;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        try {
            if(categoria == null || categoria.equals("")) {
                throw new Exception("La categoria no puede estar vacía");
            }
            this.categoria = categoria;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        try {
            if(precio <= 0) {
                throw new Exception("El precio debe ser mayor a 0");
            }
            this.precio = precio;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        try {
            if(stock < 0) {
                throw new Exception("El stock no puede ser negativo");
            }
            this.stock = stock;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        try {
            if(marca == null || marca.equals("")) {
                throw new Exception("La marca no puede estar vacía");
            }
            this.marca = marca;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
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
        setNombre(nombre);
        setCategoria(categoria);
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