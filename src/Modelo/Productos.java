
package Modelo;


public class Productos {
    private int id;
    private String codigo;
    private String nombre;
    private int categorias;
    private String nombrecategorias;
    private int stock;
    private double precio;
    
    public Productos(){
        
    }

    public Productos(int id, String codigo, String nombre, int categorias, String nombrecategorias, int stock, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categorias = categorias;
        this.nombrecategorias = nombrecategorias;
        this.stock = stock;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategorias() {
        return categorias;
    }

    public void setCategorias(int categorias) {
        this.categorias = categorias;
    }

    public String getNombreCategorias() {
        return nombrecategorias;
    }

    public void setNombreCategorias(String nombrecategorias) {
        this.nombrecategorias = nombrecategorias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
}
