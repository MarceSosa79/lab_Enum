import java.util.Scanner;
import enums.MenuOptions;
import enums.Team;

public class annualTable {
public static void main(String[] args) throws Exception  {
    Scanner sc = new Scanner(System.in);
    MenuOptions choice;
    do{
        MenuOptions.printMenu();
        try {
            choice = MenuOptions.fromOrdinal(Integer.parseInt(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Seleccion invalida.");
            choice = null;
            continue;
        } 
        switch (choice) {
            case FINAL_SCORE -> {
                System.out.println("Las posiciones finales son: ");
                for (Team t : Team.values()) {
                    System.out.println();
                    System.out.printf("%d) %s %d.", t.ordinal() + 1, t.name(), t.getPoints());
                }   System.out.println();
            } 
            case TEAM_SCORE -> {
                System.out.println("Que equipo quiere consultar? ");
                String teamSelected = sc.nextLine(); 
                try {
                    Team x = Team.valueOf(teamSelected);
                    System.out.println("Puntos de: " + x.name() + " " + x.getPoints());
                } catch (Exception e) {
                    System.out.println("Seleccion invalida.");
                    choice = null;
                    continue;
        } 
            } 
        }
    }while (choice != MenuOptions.EXIT);

    sc.close();
}
}