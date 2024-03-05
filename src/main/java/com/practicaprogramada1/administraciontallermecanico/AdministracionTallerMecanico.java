package com.practicaprogramada1.administraciontallermecanico;

import ListaCircular.ListaCircular;
import Pila.Pila;
import java.util.Scanner;


public class AdministracionTallerMecanico {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ListaCircular listaEmpleados = new ListaCircular();
        Pila listaServicios = new Pila();

            int opcion;
            do {
                System.out.println("Menú Principal:");
                System.out.println("1. Almacenar empleados");
                System.out.println("2. Almacenar servicios");
                System.out.println("3. Manejo de órdenes");
                System.out.println("4. Imprimir facturas");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        menuEmpleados(scanner, listaEmpleados);
                        break;
                    case 2:
                        menuServicios(scanner, listaServicios);
                        break;
                    case 3:
                        // Implementar manejo de órdenes
                        break;
                    case 4:
                        // Implementar imprimir facturas
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 5);
        }

        public static void menuEmpleados(Scanner scanner, ListaCircular listaEmpleados) {
            int opcion;
            do {
                System.out.println("Menú de Empleados:");
                System.out.println("1. Almacenar nuevo empleado");
                System.out.println("2. Buscar empleado por ID");
                System.out.println("3. Eliminar un empleado");
                System.out.println("4. Imprimir lista de empleados");
                System.out.println("5. Volver al menú principal");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Implementar almacenar nuevo empleado
                        break;
                    case 2:
                        // Implementar buscar empleado por ID
                        break;
                    case 3:
                        // Implementar eliminar un empleado
                        break;
                    case 4:
                        // Implementar imprimir lista de empleados
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 5);
        }

        public static void menuServicios(Scanner scanner, Pila listaServicios) {
            int opcion;
            do {
                System.out.println("Menú de Servicios:");
                System.out.println("1. Almacenar nuevo servicio");
                System.out.println("2. Buscar servicio por ID");
                System.out.println("3. Eliminar un servicio");
                System.out.println("4. Imprimir lista de servicios");
                System.out.println("5. Volver al menú principal");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Implementar almacenar nuevo servicio
                        break;
                    case 2:
                        // Implementar buscar servicio por ID
                        break;
                    case 3:
                        // Implementar eliminar un servicio
                        break;
                    case 4:
                        // Implementar imprimir lista de servicios
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 5);
        }
    }
