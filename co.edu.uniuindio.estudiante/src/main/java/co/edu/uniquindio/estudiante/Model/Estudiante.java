package co.edu.uniquindio.estudiante.Model;

public class Estudiante {
    private String name;
    private int age;
    private String mail;
    private int semester;
    private double grades01;
    private double grades02;
    private double grades03;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGrades01() {
        return grades01;
    }

    public void setGrades01(double grades01) {
        this.grades01 = grades01;
    }

    public double getGrades02() {
        return grades02;
    }

    public void setGrades02(double grades02) {
        this.grades02 = grades02;
    }

    public double getGrades03() {
        return grades03;
    }

    public void setGrades03(double grades03) {
        this.grades03 = grades03;
    }
}