package managingProgrammFlow_Overloading_Overriding;

public class HealthyBurgerFactory extends BurgerFactory {
    @Override
    public HealthyBurger createBurger(){
        return new HealthyBurger();
    }
}
