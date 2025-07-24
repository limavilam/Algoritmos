package sena.ejercicios.guia3;

import java.util.Scanner;

public class EncuestaEmisora {

    private String nombreCompleto;
    private int identificacion;
    private String fechaNacimiento;
    private String correo;
    private String ciudadResidencia;
    private String ciudadOrigen;
    private String[][] cancionesFavoritas = new String[3][2]; // [artista, título]

    public EncuestaEmisora(String nombreCompleto, int identificacion, String fechaNacimiento, String correo,
                           String ciudadResidencia, String ciudadOrigen, String[][] cancionesFavoritas) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.ciudadResidencia = ciudadResidencia;
        this.ciudadOrigen = ciudadOrigen;
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String[][] getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(String[][] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad de residencia: " + ciudadResidencia);
        System.out.println("Ciudad de origen: " + ciudadOrigen);
        System.out.println("Canciones favoritas:");
        for (int i = 0; i < cancionesFavoritas.length; i++) {
            System.out.println("  " + (i + 1) + ". Artista: " + cancionesFavoritas[i][0] +
                    " | Título: " + cancionesFavoritas[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncuestaEmisora[] personas = new EncuestaEmisora[6];
        int contador = 0;

        while (true) {
            System.out.println("""
                Opciones:
                1. Agregar una persona.
                2. Mostrar información de una persona.
                3. Salir.
                Ingrese una opción:""");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (contador >= 6) {
                        System.out.println("Ya se ingresaron las 6 personas permitidas.");
                        break;
                    }

                    System.out.println("Ingrese el nombre completo:");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el número de identificación:");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese la fecha de nacimiento (dd/mm/aaaa):");
                    String fecha = scanner.nextLine();

                    System.out.println("Ingrese el correo electrónico:");
                    String correo = scanner.nextLine();

                    System.out.println("Ingrese la ciudad de residencia:");
                    String ciudadResidencia = scanner.nextLine();

                    System.out.println("Ingrese la ciudad de origen:");
                    String ciudadOrigen = scanner.nextLine();

                    String[][] canciones = new String[3][2];
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingrese el artista de la canción No. " + (i + 1) + ":");
                        canciones[i][0] = scanner.nextLine();
                        System.out.println("Ingrese el título de la canción No. " + (i + 1) + ":");
                        canciones[i][1] = scanner.nextLine();
                    }

                    personas[contador] = new EncuestaEmisora(nombre, id, fecha, correo, ciudadResidencia, ciudadOrigen, canciones);
                    contador++;
                    System.out.println("Persona agregada exitosamente.\n");
                    break;

                case 2:
                    System.out.println("Ingrese la posición de la persona (0 a 5):");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();

                    if (posicion >= 0 && posicion < contador && personas[posicion] != null) {
                        personas[posicion].mostrarInformacion();

                        System.out.println("Nombre completo: " + personas[posicion].getNombreCompleto());
                        System.out.println("Identificación: " + personas[posicion].getIdentificacion());
                        System.out.println("Fecha de nacimiento: " + personas[posicion].getFechaNacimiento());
                        System.out.println("Correo: " + personas[posicion].getCorreo());
                        System.out.println("Ciudad de residencia: " + personas[posicion].getCiudadResidencia());
                        System.out.println("Ciudad origen: " + personas[posicion].getCiudadOrigen());


                        String[][] cancionesFav = personas[posicion].getCancionesFavoritas();
                        for (int i = 0; i < cancionesFav.length; i++) {
                            System.out.println("  Canción No. " + (i + 1) + ": " + cancionesFav[i][0] + " - " + cancionesFav[i][1]);
                        }
                    } else {
                        System.out.println("Posición inválida o no hay persona registrada.");
                    }
                    break;

                case 3:
                    System.out.println("¡Salida exitosa!");
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
