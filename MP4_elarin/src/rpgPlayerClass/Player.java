package rpgPlayerClass;

public class Player {
    private String name;
    private String status = "alive";
    private int experience;
    private double level;
    private int currentHitPoints;
    private double maxHitPoints;
    private int damagePoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
        this.level = experience / 100;
        if (this.level < 1) {
            this.level = 1;
        }
        setMaxHitPoints();
        setDamagePoints();
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        if (currentHitPoints < 0) {
            this.status = "dead";
            this.currentHitPoints = 0;
        } else {
            this.currentHitPoints = currentHitPoints;
        }
    }

    public double getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints() {
        this.maxHitPoints = this.level * 100;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints() {
        this.damagePoints = (int) (this.level * 30);
    }

    public Player(String name, int experience, int currentHitPoints) {
        this.name = name;
        setExperience(experience);
        setCurrentHitPoints(currentHitPoints);
        setMaxHitPoints();
        setDamagePoints();
    }

    public void battle(Player player) {
    	
    	setCurrentHitPoints(getCurrentHitPoints() - player.getDamagePoints());
    	
        if (getCurrentHitPoints() < 0) {
        	setCurrentHitPoints(0);
        	setStatus("dead");
        }
        
        player.setCurrentHitPoints(player.getCurrentHitPoints() - getDamagePoints());
        if (player.getCurrentHitPoints() < 0) {
            player.setCurrentHitPoints(0);
            player.setStatus("dead");
        }
        
        setExperience(getExperience() + 50);
        player.setExperience(player.getExperience() + 50);
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", status=" + status + ", experience=" + experience + ", level=" + level
                + ", currentHitPoints=" + currentHitPoints + ", maxHitPoints=" + maxHitPoints + ", damagePoints="
                + damagePoints + "]";
    }
}
