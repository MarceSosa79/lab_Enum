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
    for (MenuOptions )
}
}
