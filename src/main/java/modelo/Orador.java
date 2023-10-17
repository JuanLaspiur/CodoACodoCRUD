package modelo;
public class Orador {
//atributos
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String temaOratoria;
    private int estado;
    
 //contructores

    public Orador() {
    }

    public Orador(String nombre, String apellido, String mail, String temaOratoria, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.temaOratoria = temaOratoria;
        this.estado = estado;
    }

    public Orador(int id, String nombre, String apellido, String mail, String temaOratoria, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.temaOratoria = temaOratoria;
        this.estado = estado;
    }


    
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTemaOratoria() {
        return temaOratoria;
    }

    public void setTemaOratoria(String temaOratoria) {
        this.temaOratoria = temaOratoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    //otros metodos

    @Override
    public String toString() {
        return "Orador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orador other = (Orador) obj;
        return this.id == other.id;
    }
    
    
    
    

    
}
