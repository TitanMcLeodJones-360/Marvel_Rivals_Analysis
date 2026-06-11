public class Hero {
    private String name;
    private String role;
    private double winRate;

    public Hero(String name, String role, double winRate) {
        this.name = name;
        this.role = role;
        this.winRate = winRate;
    }

    public double getWinRate() {
        return winRate;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
