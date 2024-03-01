package proyectoFinal;

import java.util.Scanner;

public class Habitacion {
    private String nombre;
    private String clave;
    private int ocupacionMaxima;
    private double precioNoche;
    private boolean reservada;
    private int cantidadNoches;
    private boolean ocupada;
    private Huesped huesped;

    public Habitacion(String nombre, int ocupacionMaxima, double precioNoche) {
        this.nombre = nombre;
        this.ocupacionMaxima = ocupacionMaxima;
        this.precioNoche = precioNoche;
        this.reservada = false;
        this.ocupada = false;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getOcupacionMaxima() {
        return ocupacionMaxima;
    }

    public void setOcupacionMaxima(int ocupacionMaxima) {
        this.ocupacionMaxima = ocupacionMaxima;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public boolean reservar(Huesped huesped, int cantidadNoches) {
        if (reservada) {
            System.out.println("Esta habitación ya está reservada.");
            return false;
        } else {
            reservada = true;
            ocupada = true;
            this.huesped = huesped;
            this.cantidadNoches = cantidadNoches; 
            System.out.println("Reserva exitosa para " + huesped.getNombreHuesped() + ".");
            return true;
        }
    }

    public boolean ocupar() {
       
        if (reservada) {
            ocupada = true;
            return true;
        } else {
            System.out.println("No se puede ocupar la habitación sin reservar primero.");
            return false;
        }
    }

    public boolean desocupar() {
        
        if (ocupada) {
            ocupada = false;
            reservada = false;
            return true;
        } else {
            System.out.println("La habitación no está ocupada.");
            return false;
        }
    }
}
