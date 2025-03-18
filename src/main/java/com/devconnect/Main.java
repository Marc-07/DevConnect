package main.java.com.devconnect;


import main.java.com.devconnect.dao.UsuarioDAO;
import main.java.com.devconnect.model.Usuario;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n📌 Menú CRUD de Usuarios");
            System.out.println("1️⃣ Insertar Usuario");
            System.out.println("2️⃣ Listar Usuarios");
            System.out.println("3️⃣ Actualizar Usuario");
            System.out.println("4️⃣ Eliminar Usuario");
            System.out.println("5️⃣ Salir");
            System.out.print("👉 Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contrasena = scanner.nextLine();

                    Usuario nuevoUsuario = new Usuario(0, nombre, email, contrasena);
                    try {
                        usuarioDAO.insertar(nuevoUsuario);
                    } catch (Exception e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        List<Usuario> usuarios = usuarioDAO.listar();
                        System.out.println("\n👥 Lista de Usuarios:");
                        for (Usuario u : usuarios) {
                            System.out.println(u.getId() + " | " + u.getNombre() + " | " + u.getEmail());
                        }
                    } catch (Exception e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del usuario a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo email: ");
                    String nuevoEmail = scanner.nextLine();
                    System.out.print("Nueva contraseña: ");
                    String nuevaContrasena = scanner.nextLine();

                    Usuario usuarioActualizado = new Usuario(idActualizar, nuevoNombre, nuevoEmail, nuevaContrasena);
                    try {
                        usuarioDAO.actualizar(usuarioActualizado);
                    } catch (Exception e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el ID del usuario a eliminar: ");
                    int idEliminar = scanner.nextInt();

                    try {
                        usuarioDAO.eliminar(idEliminar);
                    } catch (Exception e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("⚠ Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
