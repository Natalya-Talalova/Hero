import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean condition = true;
            Hero hero = null;

            while (condition){
                String[] temp = scanner.nextLine().split(" ");
                switch (temp[0]){
                    case "Create" -> {
                        switch (temp[1]){
                            case "Elf" -> {
                                hero = new Elf(temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]));
                                System.out.println("Elf " + temp[2] + " [" + hero.level + " level] is online");
                            }
                            case "Wizard" -> {
                                hero = new Wizard(temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]));
                                System.out.println("Wizard " + temp[2] + " [" + hero.level + " level] is online");
                            }
                            case "Knight" -> {
                                hero = new Knight(temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]));
                                System.out.println("Knight " + temp[2] + " [" + hero.level + " level] is online");
                            }
                        }
                    }
                    case "Action" -> {
                        System.out.println(hero.action());
                    }
                    case "End" -> {
                        System.out.println(hero.getClass() + " " + hero.username + " [" + hero.level + " level] is offline");
                        condition = false;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
