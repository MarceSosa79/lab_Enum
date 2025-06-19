package enums;

public enum MenuOptions {
    FINAL_SCORE ("Posiciones finales."),
    TEAM_SCORE ("Puntaje por equipo."),
    EXIT ("Salir.");

private final String description;

MenuOptions(String description) {
    this.description = description;
}

public static void printMenu() {
    System.out.println("Consulte tabla anual.");
    for (MenuOptions opt : MenuOptions.values()) {
        System.out.printf("%d) %s%n", opt.ordinal() + 1, opt.description);
    }
}
public static MenuOptions fromOrdinal(int choice) {
    if (choice < 1 || choice > values().length) throw new IllegalArgumentException();
    return values() [choice - 1]; 
}
}
