package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.Model.Estudiante;

public class Main {
    public static void main(String[] args) {
        crearEstudiante();
    }
    private static void crearEstudiante (){
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

    }
    public static void calcularDefinitivaEstudiante(Estudiante estudiante01, Estudiante estudiante02, Estudiante estudiante03) {
        double definitivaEstudiante01 = (estudiante01.getGrades01() + estudiante01.getGrades02() + estudiante01.getGrades03()) / 3;
        System.out.println("El promedio del estudiante José es: " +definitivaEstudiante01);

        double definitivaEstudiante02 = (estudiante02.getGrades01() + estudiante02.getGrades02() + estudiante02.getGrades03()) / 3;
        System.out.println("El promedio de la estudiante María es: " + definitivaEstudiante02);

        double definitivaEstudiante03 = (estudiante03.getGrades01() + estudiante03.getGrades02() + estudiante03.getGrades03()) / 3;
        System.out.println("El promedio del estudiante Pepe es: " + definitivaEstudiante03);

        //Calcular el promedio del curso
        calcularPromedioCurso(definitivaEstudiante01, definitivaEstudiante02, definitivaEstudiante03);
    }

    public static void calcularPromedioCurso(double definitivaEstudiante01, double definitivaEstudiante02, double definitivaEstudiante03) {
        double promedioCurso = (definitivaEstudiante01 + definitivaEstudiante02 + definitivaEstudiante03) / 3;
        System.out.println("El promedio del curso es: " + promedioCurso);
    }

}