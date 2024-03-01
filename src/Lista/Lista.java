package Lista;

import java.util.Scanner;

public class Lista {
    Nodo head, p, q;
    Scanner leer = new Scanner(System.in);

    public Lista() {
        head = null;
    }

    public void crear() {
        char otro;
        do {
            p = new Nodo();
            System.out.print("p(dato) = ");
            while (!leer.hasNext()) {
                System.out.println("Entrada inválida. Ingrese un solo carácter.");
                leer.next(); // Limpiar el buffer
            }
            p.dato = leer.next().charAt(0);
            if (head == null) {
                head = p;
            } else {
                q.sig = p;
                p.ant = q;
            }
            q = p;
            System.out.print("Capturar otro s/n: ");
            otro = leer.next().charAt(0);
        } while (otro == 's');
    }

    public void desplegar() {
        Nodo actual = head;
        if (actual != null) {
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.sig;
            }
        } else {
            System.out.println("Lista vacía.");
        }
        System.out.println();
    }

    public void desplegarInversa() {
        Nodo actual = q;
        if (actual != null) {
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.ant;
            }
        } else {
            System.out.println("Lista vacía.");
        }
        System.out.println();
    }

    public int tamano() {
        int total = 0;
        Nodo actual = head;
        if (actual != null) {
            while (actual != null) {
                total++;
                actual = actual.sig;
            }
        } else {
            System.out.println("Lista vacía.");
        }
        return total;
    }

    public void buscarDato() {
        if (head != null) {
            System.out.print("Ingrese el dato a buscar: ");
            while (!leer.hasNext()) {
                System.out.println("Entrada inválida. Ingrese un solo carácter.");
                leer.next(); // Limpiar el buffer
            }
            char datoBuscado = leer.next().charAt(0);
            Nodo actual = head;
            boolean encontrado = false;
            while (actual != null) {
                if (actual.dato == datoBuscado) {
                    System.out.println("El dato existe en la lista.");
                    encontrado = true;
                    break;
                }
                actual = actual.sig;
            }
            if (!encontrado) {
                System.out.println("El dato no existe en la lista.");
            }
        } else {
            System.out.println("Lista vacía.");
        }
    }

    public void buscarPorPosicion() {
        if (head != null) {
            System.out.print("Ingrese la posición del nodo a buscar: ");
            while (!leer.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                leer.next(); // Limpiar el buffer
            }
            int posicion = leer.nextInt();
            int contador = 1;
            Nodo actual = head;
            while (actual != null) {
                if (contador == posicion) {
                    System.out.println("El dato del nodo en la posición " + posicion + " es: " + actual.dato);
                    return;
                }
                actual = actual.sig;
                contador++;
            }
            System.out.println("Posición del nodo no válida.");
        } else {
            System.out.println("Lista vacía.");
        }
    }

    public void insertarAlFinal() {
        p = new Nodo();
        System.out.print("p(dato) = ");
        while (!leer.hasNext()) {
            System.out.println("Entrada inválida. Ingrese un solo carácter.");
            leer.next(); // Limpiar el buffer
        }
        p.dato = leer.next().charAt(0);
        if (head == null) {
            head = p;
        } else {
            q.sig = p;
            p.ant = q;
        }
        q = p;
    }

    public void insertarPorPosicion() {
        if (head != null) {
            System.out.print("Ingrese la posición donde desea insertar el nodo: ");
            while (!leer.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                leer.next(); // Limpiar el buffer
            }
            int posicion = leer.nextInt();
            int contador = 1;
            Nodo nuevoNodo = new Nodo();
            System.out.print("Ingrese el dato del nuevo nodo: ");
            while (!leer.hasNext()) {
                System.out.println("Entrada inválida. Ingrese un solo carácter.");
                leer.next(); // Limpiar el buffer
            }
            nuevoNodo.dato = leer.next().charAt(0);

            if (posicion == 1) {
                nuevoNodo.sig = head;
                head.ant = nuevoNodo;
                head = nuevoNodo;
            } else {
                Nodo actual = head;
                while (actual != null) {
                    if (contador == posicion - 1) {
                        nuevoNodo.sig = actual.sig;
                        if (actual.sig != null) {
                            actual.sig.ant = nuevoNodo;
                        }
                        nuevoNodo.ant = actual;
                        actual.sig = nuevoNodo;
                        break;
                    }
                    actual = actual.sig;
                    contador++;
                }
            }
        } else {
            System.out.println("Lista vacía.");
        }
    }

    public void insertarAlInicio() {
        p = new Nodo();
        System.out.print("p(dato) = ");
        while (!leer.hasNext()) {
            System.out.println("Entrada inválida. Ingrese un solo carácter.");
            leer.next(); // Limpiar el buffer
        }
        p.dato = leer.next().charAt(0);
        p.sig = head;
        if (head != null) {
            head.ant = p;
        }
        head = p;
    }

    public void eliminarAlFinal() {
        if (head != null) {
            if (head.sig == null) {
                head = null;
            } else {
                Nodo actual = head;
                while (actual.sig.sig != null) {
                    actual = actual.sig;
                }
                actual.sig = null;
                q = actual;
            }
        } else {
            System.out.println("Lista vacía.");
        }
    }


    public void eliminarPorPosicion() {
        if (head != null) {
            System.out.print("Ingrese la posición del nodo a eliminar: ");
            while (!leer.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                leer.next(); // Limpiar el buffer
            }
            int posicion = leer.nextInt();
            int contador = 1;
            if (posicion == 1) {
                if (head != null) {
                    head = head.sig;
                    if (head != null) {
                        head.ant = null;
                    }
                }
            } else {
                Nodo actual = head;
                while (actual != null) {
                    if (contador == posicion) {
                        if (actual.sig != null) {
                            actual.sig.ant = actual.ant;
                        }
                        actual.ant.sig = actual.sig;
                        break;
                    }
                    actual = actual.sig;
                    contador++;
                }
            }
        } else {
            System.out.println("Lista vacía.");
        }
    }

    public void eliminarAlInicio() {
        if (head != null) {
            head = head.sig;
            if (head != null) {
                head.ant = null;
            }
        } else {
            System.out.println("Lista vacía.");
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Crear lista");
            System.out.println("2. Desplegar lista");
            System.out.println("3. Desplegar lista inversa");
            System.out.println("4. Tamaño de la lista");
            System.out.println("5. Buscar un elemento en la lista");
            System.out.println("6. Buscar por posición un nodo");
            System.out.println("7. Insertar al final");
            System.out.println("8. Insertar en cualquier posición");
            System.out.println("9. Insertar al inicio");
            System.out.println("10. Eliminar último nodo");
            System.out.println("11. Eliminar en cualquier posición");
            System.out.println("12. Eliminar primer nodo");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next(); // Limpiar el buffer
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    lista.crear();
                    break;
                case 2:
                    lista.desplegar();
                    break;
                case 3:
                    lista.desplegarInversa();
                    break;
                case 4:
                    System.out.println("Tamaño de la lista: " + lista.tamano());
                    break;
                case 5:
                    lista.buscarDato();
                    break;
                case 6:
                    lista.buscarPorPosicion();
                    break;
                case 7:
                    lista.insertarAlFinal();
                    break;
                case 8:
                    lista.insertarPorPosicion();
                    break;
                case 9:
                    lista.insertarAlInicio();
                    break;
                case 10:
                    lista.eliminarAlFinal();
                    break;
                case 11:
                    lista.eliminarPorPosicion();
                    break;
                case 12:
                    lista.eliminarAlInicio();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
