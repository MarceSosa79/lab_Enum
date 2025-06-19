package enums;

public enum Team {
        NACIONAL(50),
        PEÑAROL(47),
        LIVERPOOL(43),
        JUVENTUD(40),
        DEFENSOR(39);
    
    int points;

    Team(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

}