/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casosemana3;

/**
 *
 * @author USUARIO
 */
public final class Proveedor {
    
    private String nombreEmpresa;
    private String ruc;
    private String telefono;
    private String direccion;
    private String correo;
    private String codigo;
    private static int ultimo_correlativo;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        try {
            if(nombreEmpresa == null || nombreEmpresa.equals("")) {
                throw new Exception("El nombre de la empresa no puede estar vacío");
            }
            this.nombreEmpresa = nombreEmpresa;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        try {
            if(ruc.length() != 11) {
                throw new Exception("El RUC debe tener 11 dígitos");
            }
            this.ruc = ruc;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        try {
            if(telefono.length() != 9) {
                throw new Exception("El teléfono debe tener 9 dígitos");
            }
            this.telefono = telefono;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        try {
            if(direccion == null || direccion.equals("")) {
                throw new Exception("La dirección no puede estar vacía");
            }
            this.direccion = direccion;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            if(correo == null || correo.equals("")) {
                throw new Exception("El correo no puede estar vacío");
            }
            this.correo = correo;
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
        Proveedor.ultimo_correlativo = ultimo_correlativo;
    }

    public Proveedor() {
    }

    public Proveedor(String nombreEmpresa, String ruc) {
        setNombreEmpresa(nombreEmpresa);
        setRuc(ruc);
    }

    public static String generar_codigo() {
        ultimo_correlativo = ultimo_correlativo + 1;
        String codigo_generado = String.format("PR%05d", ultimo_correlativo);
        return codigo_generado;
    }

    public void verDatos() {
        System.out.println("Proveedor: EMPRESA: " + this.nombreEmpresa +
                " RUC: " + this.ruc +
                " TELEFONO: " + this.telefono +
                " DIRECCION: " + this.direccion +
                " CORREO: " + this.correo +
                " CODIGO: " + this.codigo);
    }
}
