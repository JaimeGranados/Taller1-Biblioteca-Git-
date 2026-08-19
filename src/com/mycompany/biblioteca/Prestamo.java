package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private String idPrestamo;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;
    private String estado; // "ACTIVO" or "DEVUELTO"

    public Prestamo(String idPrestamo, Cliente cliente, Libro libro) {
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now();
        this.estado = "ACTIVO";
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamo [id=" + idPrestamo
                + ", cliente=" + cliente.getNombre()
                + ", libro=" + libro.getTitulo()
                + ", fecha=" + fecha
                + ", estado=" + estado + "]";
    }

        static Prestamo findPrestamoById(String id) {
        for (Prestamo p : prestamos) {
            if (p.getIdPrestamo().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    static void returnPrestamo() {
        String id = readText("Loan id to return: ");
        Prestamo p = findPrestamoById(id);
        if (p == null) {
            System.out.println("Loan not found.");
            return;
        }
        if (p.getEstado().equals("DEVUELTO")) {
            System.out.println("This loan was already returned.");
            return;
        }
        p.setEstado("DEVUELTO");
        p.getLibro().setDisponible(true);
        System.out.println("Return registered successfully.");
    }
}