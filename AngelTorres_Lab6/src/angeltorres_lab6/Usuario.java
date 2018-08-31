

package angeltorres_lab6;


public class Usuario {
    
    private String nombre, password;
    private int codigo;
    

    public Usuario() {
    }

    public Usuario(String nombre, String password, int codigo) {
        this.nombre = nombre;
        this.password = password;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

}
