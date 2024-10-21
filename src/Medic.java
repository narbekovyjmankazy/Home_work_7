public class Medic extends Hero{
    int healPoints = 30;

    public void increaseExperience(){
        healPoints += healPoints * 0.1;
        System.out.println(healPoints);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic излечил персонажа");
    }
}
