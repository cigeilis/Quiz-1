import java.util.Scanner;

public class Main {
    private static Scanner t;

    public static void main(String[] args) {

        System.out.print("QUIZ N# ?");
        System.out.print("\n\n CENTRO EDUCATIVO ABC");

        String nombre;

        String apellido;

        String cedula;

        String telefono;

        int clase = -1;

        int pr1 = 0;
        int pr2 = 0;
        int pr3 = 0;

        t = new Scanner(System.in);
        String opc = "SI";

        while (opc.equals("SI")) {
            System.out.println("\n\n Seleccione el curso a matricular.");

            System.out.print("\n 1. Programacion en C++. ");

            System.out.print("\n 2. Programacion en Python. ");

            System.out.print("\n 3. Programacion en Java. ");


            while (clase < 0 || clase > 3) {
                System.out.print("\n\n Coloque el numero del curso.");
                clase = t.nextInt();

            }

            switch (clase) {
                case 1:
                    pr1 = pr1 + 1;
                    System.out.print("La seleccion fue Programacion en C++. ");
                    break;

                case 2:
                    pr2 = pr2 + 1;
                    System.out.print("La seleccion fue Programacion en Python. ");
                    break;

                case 3:
                    pr3 = pr3 + 1;
                    System.out.print("La seleccion fue Programacion en Java. ");
                    break;

                default:
                    System.out.print("El caracter ingresado es incorreto, por favor volver a intentarlo y colocar un #.");
                    break;



            }
            System.out.print("\n Colocar los datos personales del estudiante ");

            System.out.print("\n\n Introduza nombre: ");
            nombre = t.next();

            System.out.print("Introduzca apellido: ");
            apellido = t.next();

            System.out.print("Introduzca cedula: ");
            cedula = t.next();

            System.out.print("Introduzca telefono: ");
            telefono = t.next();

            System.out.println("\n Nombre completo: " + nombre + " " + apellido + "\n cedula " + cedula + "\n telefono. " + telefono + "\n el curso que matriculo: " + clase);

            System.out.print("\n desea continuar (SI/NO): ");

            opc = t.next();


        }


        System.out.println("\n Numero de estudiantes matriculado: \n\n" + "Programacion en C++:" + pr1 + "\n Programacion en Python:" + pr2 + "\n Programacion en Java:" + pr3);
    }

}