package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu will go here (Fase 8)
    }

        static String readText(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    static void createCliente() {
        String id = readText("Client id: ");
        String nombre = readText("Name: ");
        String telefono = readText("Phone: ");
        String email = readText("Email: ");
        clientes.add(new Cliente(id, nombre, telefono, email));
        System.out.println("Client created successfully.");
    }

        static void listCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No clients registered.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

        static Cliente findClienteById(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    static void searchCliente() {
        String id = readText("Client id to search: ");
        Cliente c = findClienteById(id);
        System.out.println(c != null ? c : "Client not found.");
    }

        static void updateCliente() {
        String id = readText("Client id to update: ");
        Cliente c = findClienteById(id);
        if (c == null) {
            System.out.println("Client not found.");
            return;
        }
        c.setNombre(readText("New name: "));
        c.setTelefono(readText("New phone: "));
        c.setEmail(readText("New email: "));
        System.out.println("Client updated.");
    }

        static void deleteCliente() {
        String id = readText("Client id to delete: ");
        Cliente c = findClienteById(id);
        if (c == null) {
            System.out.println("Client not found.");
            return;
        }
        clientes.remove(c);
        System.out.println("Client deleted.");
    }

        static void createLibro() {
        String codigo = readText("Book code: ");
        String titulo = readText("Title: ");
        String anio = readText("Publication year: ");
        String autor = readText("Author: ");
        libros.add(new Libro(codigo, titulo, anio, autor));
        System.out.println("Book created successfully.");
    }

        static void listLibro() {
        if (libros.isEmpty()) {
            System.out.println("No books registered.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

        static Libro findLibroByCodigo(String codigo) {
        for (Libro l : libros) {
            if (l.getCodigo().equalsIgnoreCase(codigo)) {
                return l;
            }
        }
        return null;
    }

    static void searchLibro() {
        String codigo = readText("Book code to search: ");
        Libro l = findLibroByCodigo(codigo);
        System.out.println(l != null ? l : "Book not found.");
    }

        static void updateLibro() {
        String codigo = readText("Book code to update: ");
        Libro l = findLibroByCodigo(codigo);
        if (l == null) {
            System.out.println("Book not found.");
            return;
        }
        l.setTitulo(readText("New title: "));
        l.setAnioPublicacion(readText("New publication year: "));
        l.setAutor(readText("New author: "));
        System.out.println("Book updated.");
    }

        static void deleteLibro() {
        String codigo = readText("Book code to delete: ");
        Libro l = findLibroByCodigo(codigo);
        if (l == null) {
            System.out.println("Book not found.");
            return;
        }
        libros.remove(l);
        System.out.println("Book deleted.");
    }
}

