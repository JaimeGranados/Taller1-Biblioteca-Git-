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
}

