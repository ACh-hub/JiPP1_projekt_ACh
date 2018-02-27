package school.amch.aeroponics;

public class Tank extends Part implements IPart {
    private static int count =0;
    private int id = 0;

    public Tank() {
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
