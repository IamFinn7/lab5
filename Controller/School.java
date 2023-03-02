package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class School extends ArrayList<Student> {

    public void add() {
        String nName, nID;
        float nAverage;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        nName = sc.nextLine();
        System.out.println("Enter ID: ");
        nID = sc.nextLine();
        System.out.println("Enter average: ");
        nAverage = sc.nextFloat();
        sc.nextLine();

        Student nStudent = new Student(nID, nName, nAverage);
        this.add(nStudent);
    }

    public void searchByID() {
        String ID;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        ID = sc.nextLine();
        boolean s = true;
        for (int i = 0; i < this.size(); i++) {
            if (ID.equals(this.get(i).getID())) {
                System.out.println(this.get(i).toString());
                s = false;
            }
        }
        if (s) {
            System.out.println("None");
        }
    }

    public void searchByName() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        boolean s = true;
        for (int i = 0; i < this.size(); i++) {
            if (name.equals(this.get(i).getName())) {
                System.out.println(this.get(i).toString());
                s = false;
            }
        }
        if (s) {
            System.out.println("None");
        }
    }

    public void searchByAverage() {
        Float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        average = sc.nextFloat();
        sc.nextLine();
        boolean s = true;
        for (int i = 0; i < this.size(); i++) {
            if (average == this.get(i).getAverage()) {
                System.out.println(this.get(i).toString());
                s = false;
            }
        }
        if (s) {
            System.out.println("None");
        }
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i).toString());
        }
    }
}
