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

        calcularDefinitivaEstudiante();
    }
    private static void calcularDefinitivaEstudiante(){
        String nombre01 = "Jose";
        double grade01estudiante01 = 3;
        double grade02estudiante01 = 3.5;
        double grade03estudiante01 = 4.5;
        double definitiva01 = (grade01estudiante01 + grade02estudiante01 + grade03estudiante01) / 3;
        System.out.println("La definitiva del estudiante "+nombre01+ " es: "+definitiva01);

        String nombre02 = "María";
        double grade01estudiante02 = 2;
        double grade02estudiante02 = 2.5;
        double grade03estudiante02 = 4.5;
        double definitiva02 = (grade01estudiante02 + grade02estudiante02 + grade03estudiante02) / 3;
        System.out.println("La definitiva del estudiante "+nombre02+ " es: "+definitiva02);

        String nombre03 = "Pepe";
        double grade01estudiante03 = 4;
        double grade02estudiante03 = 2.5;
        double grade03estudiante03 = 4.5;
        double definitiva03 = (grade01estudiante03 + grade02estudiante03 + grade03estudiante03) / 3;
        System.out.println("La definitiva del estudiante "+nombre03+ " es: "+definitiva03);
    }
}