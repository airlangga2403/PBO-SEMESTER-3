public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private  int attackKickPoint;

    public void hit (GameCharacter KarB){
        KarB.lifePoint=KarB.lifePoint-this.attackHitPoint;
        System.out.println(KarB.getName()+" Mukul "+ this.getName());
    }
    public void kick (GameCharacter KarB){
        KarB.lifePoint=KarB.lifePoint-this.attackKickPoint;
        System.out.println(KarB.getName()+" Nendang "+ this.getName());
    }

    public GameCharacter(String name,  int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.lifePoint = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }
}
