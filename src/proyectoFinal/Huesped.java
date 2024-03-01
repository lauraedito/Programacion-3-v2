package proyectoFinal;

public class Huesped {
    private String nombreHuesped;
    private int edad;
    private String telefono;
    private String email;
    private String tipoDeMembresia;

    public Huesped(String nombreHuesped, int edad, String telefono, String email, String tipoDeMembresia) {
        this.nombreHuesped = nombreHuesped;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.tipoDeMembresia = tipoDeMembresia;
    }

 

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDeMembresia() {
        return tipoDeMembresia;
    }

    public void setTipoDeMembresia(String tipoDeMembresia) {
        this.tipoDeMembresia = tipoDeMembresia;
    }

    @Override
    public String toString() {
        return "Huesped{" +
                "nombreHuesped='" + nombreHuesped + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipoDeMembresia='" + tipoDeMembresia + '\'' +
                '}';
    }

    public double descuento(double precio) {
        if ("VIP".equals(tipoDeMembresia)) {
            return precio * 0.15;
        } else if ("Cliente frecuente".equals(tipoDeMembresia)) {
            return precio * 0.10;
        } else {
            return 0;
        }
    }
}