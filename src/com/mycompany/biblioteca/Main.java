package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
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
}

