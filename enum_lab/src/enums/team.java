package enums;

public enum team{
        NACIONAL(50),
        PEÑAROL(47),
        LIVERPOOL(43),
        JUVENTUD(40),
        DEFENSOR(39);
    
    int points;

    team(int points) {
        this.points = points;
    }
}
