public class Cat {

    private String name;
    private int energy;
    private int hunger;
    private int mood;

    public Cat(String name) {
        this.name = name;
        this.energy = 100;
        this.hunger = 100;
        this.mood = 100;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", hunger=" + hunger +
                ", mood=" + mood +
                '}';
    }

    /* ADD AND REMOVE FUNCTION */
    private void addFood(){
        this.hunger = this.hunger + 10;
        if (this.hunger > 100){
            this.hunger = 100;
        }
    }

    private void redFood(){
        this.hunger = this.hunger - 10;
        if (this.hunger < 0){
            this.hunger = 0;
        }
    }

    private void addEnergy(){
        this.energy = this.energy + 10;
        if (this.energy > 100){
            this.energy = 100;
        }
    }

    private void redEnergy(){
        this.energy = this.energy - 10;
        if (this.energy < 0){
            this.energy = 0;
        }
    }

    private void addMood(){
        this.mood = this.mood + 10;
        if (this.mood > 100){
            this.mood = 100;
        }
    }

    private void redMood(){
        this.mood = this.mood - 10;
        if (this.mood < 0){
            this.mood = 0;
        }
    }

    /* FUNCTION IS */
    public Boolean isHunger(){
        return this.hunger < 40;
    }

    public Boolean isMood(){
        return this.mood >= Math.random()*100;
    }

    public Boolean isExaust(){
        return this.energy < 30;
    }

    public Boolean isEnjoy(){
        return this.energy > 80;
    }

    /* FUNCTION FEED */
    public void feed(){
        System.out.println("You try to feed your cat!");
        if (isHunger() && isMood())
        {
            addFood();
            System.out.println("Your cat accept the food!");
        }
        else
        {
            redMood();
            System.out.println("Your cat gonna bite you!");
        }
    }

    /* FUNCTION PLAY */
    public void play(){
        System.out.println("You try to play with your cat!");
        if (!isExaust() && isMood())
        {
            addMood();
            redEnergy();
            redFood();
            System.out.println("Your cat play with you");
        }
        else
        {
            redMood();
            System.out.println("Your cat don't want to play with you (and bite your knew)");
        }
    }

    /* FUNCTION WASH */
    public void wash(){
        System.out.println("You try to wash your cat!");
        if (!isEnjoy() && isMood())
        {
            this.mood = 1;
            System.out.println("You wash your cat!");
        }
        else
        {
            redEnergy();
            addMood();
        }
    }

    /* FUNCTION SLEEP */
    public void sleep(){
        if (isExaust()){
            addEnergy();
            addMood();
            redFood();
        }
    }

    /* FUNCTION MIAOU */
    public void miaou(){
        if (isMood() && Math.random()*100 > 50){
            System.out.println("MIAOU MIAOU");
        }
    }

    public void doSomething(){

    }

}
