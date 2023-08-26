package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.Model.Estudiante;

public class Main {
    public static void main(String[] args) {
        crearEstudiante();
    }

    private static void crearEstudiante() {
        Estudiante estudiante01 = new Estudiante();
        estudiante01.setName("José");
        estudiante01.setAge(17);
        estudiante01.setMail("juan@mail.com");
        estudiante01.setSemester(3);
        estudiante01.setGrades01(3);
        estudiante01.setGrades02(3.5);
        estudiante01.setGrades03(4.5);

        Estudiante estudiante02 = new Estudiante();
        estudiante02.setName("María");
        estudiante02.setAge(15);
        estudiante02.setMail("pepita@mail.com");
        estudiante02.setSemester(1);
        estudiante02.setGrades01(2);
        estudiante02.setGrades02(2.5);
        estudiante02.setGrades03(4.5);

        Estudiante estudiante03 = new Estudiante();
        estudiante03.setName("Pepe");
        estudiante03.setAge(20);
        estudiante03.setMail("pepe@mail.com");
        estudiante03.setSemester(4);
        estudiante03.setGrades01(4);
        estudiante03.setGrades02(2.5);
        estudiante03.setGrades03(4.5);

        // Calcular definitiva de los estudiantes
        calcularDefinitivaEstudiante(estudiante01, estudiante02, estudiante03);
        // Calcular el promedio de edades
        calcularPromedioEdad(estudiante01, estudiante02, estudiante03);
        // Calcular promedio de la nota 1 de los tres estudiantes
        calcularPromedioNota1(estudiante01, estudiante02, estudiante03);
    }

    public static void calcularDefinitivaEstudiante(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        double definitivaEstudiante01 = (estudiante01.getGrades01() + estudiante01.getGrades02() + estudiante01.getGrades03()) / 3;
        System.out.println("El promedio del estudiante José es: " + definitivaEstudiante01);

        double definitivaEstudiante02 = (estudiante02.getGrades01() + estudiante02.getGrades02() + estudiante02.getGrades03()) / 3;
        System.out.println("El promedio de la estudiante María es: " + definitivaEstudiante02);

        double definitivaEstudiante03 = (estudiante03.getGrades01() + estudiante03.getGrades02() + estudiante03.getGrades03()) / 3;
        System.out.println("El promedio del estudiante Pepe es: " + definitivaEstudiante03);

        // Calcular el promedio del curso
        calcularPromedioCurso(definitivaEstudiante01, definitivaEstudiante02, definitivaEstudiante03);
        // Calcular la nota más alta
        double notaMasAlta = calcularNotaMayorDelCurso(definitivaEstudiante01, definitivaEstudiante02, definitivaEstudiante03);
        System.out.println("La definitiva más alta del curso es: " + notaMasAlta);
        // Calcular la nota más baja
        double notaMasBaja = calcularNotaMenorCurso(definitivaEstudiante01, definitivaEstudiante02, definitivaEstudiante03);
        System.out.println("La definitiva más baja del curso es: " + notaMasBaja);
        // Determinar  si el estudiante gana o no el curso
        aprobacionCurso(definitivaEstudiante01, definitivaEstudiante02, definitivaEstudiante03);
    }

    public static void calcularPromedioCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double promedioCurso = (definitivaEstudiante01 + definitivaEstudiante02 + definitivaEstudiante03) / 3;
        System.out.println("El promedio del curso es: " + promedioCurso);
    }

    private static void calcularPromedioEdad(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        int promedioEdad = (estudiante01.getAge() + estudiante02.getAge() + estudiante03.getAge()) / 3;
        System.out.println("El promedio de edad del curso es de: " + promedioEdad);
    }

    private static void calcularPromedioNota1(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        double promedioNotaUno = (estudiante01.getGrades01() + estudiante02.getGrades01() + estudiante03.getGrades01()) / 3;
        System.out.println("El promedio de la primer nota del curso es de: " + promedioNotaUno);
    }

    public static double calcularNotaMayorDelCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double maxDefinitiva = 0.0;

        if (definitivaEstudiante01 > maxDefinitiva) {
            maxDefinitiva = definitivaEstudiante01;
        }
        if (definitivaEstudiante02 > maxDefinitiva) {
            maxDefinitiva = definitivaEstudiante02;
        }
        if (definitivaEstudiante03 > maxDefinitiva) {
            maxDefinitiva = definitivaEstudiante03;
        }
        return maxDefinitiva;
    }

    public static double calcularNotaMenorCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double minDefinitiva = 0.0;

        if (definitivaEstudiante01 >= minDefinitiva) {
            minDefinitiva = definitivaEstudiante01;
        }
        if (definitivaEstudiante02 <= minDefinitiva) {
            minDefinitiva = definitivaEstudiante02;
        }
        if (definitivaEstudiante03 <= minDefinitiva) {
            minDefinitiva = definitivaEstudiante03;
        }
        return minDefinitiva;
    }

    private static void aprobacionCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double notaMinima = 3.0;
        if (definitivaEstudiante01 >= notaMinima){
            System.out.println("El estudiante José gana la materia.");
        }else{
            System.out.println("El estudiante José no ganó la materia.");
        }
        if (definitivaEstudiante02 >= notaMinima){
            System.out.println("La estudiante María gana la materia.");
        }else{
            System.out.println("La estudiante María no ganó la materia.");
        }
        if (definitivaEstudiante03 >= notaMinima){
            System.out.println("El estudiante Pepe gana la materia.");
        }else{
            System.out.println("El estudiante Pepe no ganó la materia.");
        }
    }
}