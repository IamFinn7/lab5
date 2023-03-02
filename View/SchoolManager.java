package View;

import java.util.Scanner;

import Controller.School;
import Model.Student;
import View.Menu;

public class SchoolManager extends Menu {
    static String[] menu = { "List all students", "Search student", "Add new student", "Sorting display", "Exit" };
    private School sch = new School();

    Scanner sc = new Scanner(System.in);

    public SchoolManager() {
        super("School Management System", menu);
    }

    @Override
    public void excute(int n) {
        System.out.println(n);

        switch (n) {
            case 1:
                sch.print();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;
            case 2:
                searchType();
                break;
            case 3:
                sch.add();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;
            case 4:

        }
    }

    private void searchType() {
        String[] menuSearch = { "Search by ID", "Search by name", "Search by average" };
        Menu m = new Menu("Student searching", menuSearch) {
            public void excute(int n) {
                switch (n) {
                    case 1:
                        sch.searchByID();
                        break;
                    case 2:
                        sch.searchByName();
                        break;
                    case 3:
                        sch.searchByAverage();
                        break;
                    default:
                        return;
                }
            }
        };
        m.run();
    }
}
