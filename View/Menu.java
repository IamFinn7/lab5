package View;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    protected String title;
    protected ArrayList<String> mChoice; // tao arraylist

    public Menu() {

    }

    public Menu(String title, String[] mc) {
        this.title = title;
        mChoice = new ArrayList<>();
        for (String st : mc) {
            this.mChoice.add((String) st);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < mChoice.size(); i++) {
            System.out.println((i + 1) + ". " + mChoice.get(i));
        }
        System.out.println("---------------------------------------------------------");
    }

    public int getChoice() {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selection: ");
        return sc.nextInt();
    }

    public abstract void excute(int n);

    public void run() {
        while (true) {
            int n = getChoice();
            excute(n);
            if (n > mChoice.size()) {
                System.out.println("Please enter 1 --> 5 !!\n");
            } else if (n == 5) {
                return;
            }
        }
    }
}
