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
        // Obtener las notas mayores o iguales a 4
        obtenerEstudianteNotasMayor4(estudiante01, estudiante02, estudiante03);
        // Calcular la nota más alta
        double notaMasAlta = calcularNotaMayorDelCurso(estudiante01, estudiante02, estudiante03);
        System.out.println("La nota más alta del curso es: " + notaMasAlta);
        // Calcular la nota más baja
        double notaMasBaja = calcularNotaMenorCurso(estudiante01, estudiante02, estudiante03);
        System.out.println("La nota más baja del curso es: " + notaMasBaja);
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

    public static double calcularNotaMayorDelCurso(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        double maxDefinitiva = 0.0;

        if (estudiante01.getGrades01() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades01();
        }
        if (estudiante01.getGrades02() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades02();
        }
        if (estudiante01.getGrades03() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades03();
        }
        if (estudiante02.getGrades01() > maxDefinitiva) {
            maxDefinitiva = estudiante02.getGrades01();
        }
        if (estudiante02.getGrades02() > maxDefinitiva) {
            maxDefinitiva = estudiante02.getGrades02();
        }
        if (estudiante02.getGrades03() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades03();
        }
        if (estudiante03.getGrades01() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades01();
        }
        if (estudiante03.getGrades02() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades02();
        }
        if (estudiante03.getGrades03() > maxDefinitiva) {
            maxDefinitiva = estudiante01.getGrades03();
        }
        return maxDefinitiva;
    }

    public static double calcularNotaMenorCurso(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        double minDefinitiva = 0.0;

        if (estudiante01.getGrades01() >= minDefinitiva) {
            minDefinitiva = estudiante01.getGrades01();
        }
        if (estudiante01.getGrades02() <= minDefinitiva) {
            minDefinitiva = estudiante01.getGrades02();
        }
        if (estudiante01.getGrades03() <= minDefinitiva) {
            minDefinitiva = estudiante01.getGrades03();
        }
        if (estudiante02.getGrades01() <= minDefinitiva) {
            minDefinitiva = estudiante02.getGrades01();
        }
        if (estudiante02.getGrades02() <= minDefinitiva) {
            minDefinitiva = estudiante02.getGrades02();
        }
        if (estudiante02.getGrades03() <= minDefinitiva) {
            minDefinitiva = estudiante02.getGrades03();
        }
        if (estudiante03.getGrades01() <= minDefinitiva) {
            minDefinitiva = estudiante03.getGrades01();
        }
        if (estudiante03.getGrades02() <= minDefinitiva) {
            minDefinitiva = estudiante03.getGrades02();
        }
        if (estudiante03.getGrades03() <= minDefinitiva) {
            minDefinitiva = estudiante03.getGrades03();
        }
        return minDefinitiva;
    }

    private static void aprobacionCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double notaMinima = 3.0;
        double calcularEstudiantesReprobados = 0.0;
        double calcularEstudiantesAprobados = 0.0;
        if (definitivaEstudiante01 >= notaMinima){
            System.out.println("El estudiante José gana la materia.");
            calcularEstudiantesAprobados += 1;
        }else{
            System.out.println("El estudiante José no ganó la materia.");
            calcularEstudiantesReprobados += 1;
        }
        if (definitivaEstudiante02 >= notaMinima){
            System.out.println("La estudiante María gana la materia.");
            calcularEstudiantesAprobados += 1;
        }else{
            System.out.println("La estudiante María no ganó la materia.");
            calcularEstudiantesReprobados += 1;
        }
        if (definitivaEstudiante03 >= notaMinima){
            System.out.println("El estudiante Pepe gana la materia.");
            calcularEstudiantesAprobados += 1;
        }else{
            System.out.println("El estudiante Pepe no ganó la materia.");
            calcularEstudiantesReprobados += 1;
        }
        // Porcentaje de estudiantes que aprobaron el curso
        calcularPorcentajePerdieronCurso(calcularEstudiantesReprobados);
        calcularPorcentajeGanaronCurso(calcularEstudiantesAprobados);
    }

    private static void calcularPorcentajeGanaronCurso(double calcularEstudiantesAprobados) {
        double ganaron = (calcularEstudiantesAprobados * 100) / 3;
        System.out.println("El porcentaje de estudiantes que aprobaron es: " + ganaron+"%");
    }

    private static void calcularPorcentajePerdieronCurso(double calcularEstudiantesReprobados) {
        double perdieron = (calcularEstudiantesReprobados * 100) / 3;
        System.out.println("El porcentaje de estudiantes que reprobaron es: " + perdieron+"%");
    }

    private static void obtenerEstudianteNotasMayor4(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03){
        String nombre01 = "José";
        if (estudiante01.getGrades01() >= 4 && estudiante01.getGrades02() >= 4 && estudiante01.getGrades03() >= 4){
            System.out.print("El estudiante "+nombre01+" tiene todasd las notas mayores a cero.");
        }else{
            System.out.println("Todas las notas de "+nombre01+" no son mayores o iguales a cuatro.");
        }
        String nombre02 = "María";
        if (estudiante02.getGrades01() >= 4 && estudiante02.getGrades02() >= 4 && estudiante02.getGrades03() >= 4){
            System.out.print("El estudiante "+nombre02+" tiene todasd las notas mayores a cero.");
        }else{
            System.out.println("Todas las notas de "+nombre02+" no son mayores o iguales a cuatro.");
        }
        String nombre03 = "Pepe";
        if (estudiante03.getGrades01() >= 4 && estudiante03.getGrades02() >= 4 && estudiante03.getGrades03() >= 4){
            System.out.print("El estudiante "+nombre03+" tiene todasd las notas mayores a cero.");
        }else{
            System.out.println("Todas las notas de "+nombre03+" no son mayores o iguales a cuatro.");
        }
    }


}