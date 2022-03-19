package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melisa = new Teacher(2, "Melisa", 700);
        Teacher engin = new Teacher(3, "Engin", 900);
        Teacher murat = new Teacher(6,"Murat",1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(engin);
        teacherList.add(murat);

        Student nebi = new Student(1, "Nebi", 15);
        Student ahmet = new Student(2, "Ahmet", 4);
        Student ali = new Student(3, "Ali", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(nebi);
        studentList.add(ahmet);
        studentList.add(ali);

        School etiyaAkademi = new School(teacherList, studentList);


        etiyaAkademi.addTeacher(murat);

        ahmet.payFees(5000);
        nebi.payFees(4000);
        ali.payFees(8000);

        System.out.println("etiyaAkademi has earned $ "+ etiyaAkademi.getTotalMoneyEarned());






        System.out.println("------Making School Pay Salary-------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("etiyaAkademi has spent for salary to "+" "+ lizzy.getName()+" " +"and now has $ "+etiyaAkademi.getTotalMoneyEarned() );

        engin.receiveSalary(engin.getSalary());
        System.out.println("etiyaAkademi has spent for salary to "+" "+ engin.getName()+" " +"and now has $ "+etiyaAkademi.getTotalMoneyEarned() );

        melisa.receiveSalary(melisa.getSalary());
        System.out.println("etiyaAkademi has spent for salary to "+" "+ melisa.getName()+" " +"and now has $ "+etiyaAkademi.getTotalMoneyEarned() );

        System.out.println(nebi);
        System.out.println(engin);
        System.out.println(murat);


    }}
