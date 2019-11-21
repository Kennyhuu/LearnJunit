package learnJUnit;


public class SuperSecretCalculation {

    private String name;
    private boolean happy = false;

    public SuperSecretCalculation(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }
    public String getHappyMessage(){
        if(!happy) {
            throw new IllegalStateException();
        }
        return "Im Happy";
    }
    public int getFavNumber(){
        return 42;
    }
    public void waitTillHappy(){
        while(!happy){
            //do nothing
        }
    }
}
