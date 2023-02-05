public class Hero implements HavingSuperAbility{
    public int health;
    public int damage;
    public String superAbility;
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("RESPECT "+superAbilityType);
    }
}
