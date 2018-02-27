package school.amch.aeroponics;

public class Bed extends Part implements IPart {
    private static int count =0;
    private int id = 0;


    public Bed() {
        id = count ++;
        state = State.STOP;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean check() {
        return false;
    }

}
