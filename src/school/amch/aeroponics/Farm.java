package school.amch.aeroponics;

import java.util.ArrayList;
import java.util.List;

public class Farm extends Observer {
    private AeroFactory factory;
    private int numberOfBeds;
    private int numberOfTanks;
    private List<Bed> bedList;
    private List<Tank> tankList;

    public Farm() {}

    public Farm(Menu menu){
        this();
        this.menu=menu;
        this.menu.attach(this);
    }

    public void farmSetup(int beds, int tanks){
        factory = AeroFactory.getInstance();
        numberOfBeds = beds;
        numberOfTanks = tanks;

        bedList = new ArrayList<>();
        tankList = new ArrayList<>();

        for(int i = 0; i<numberOfBeds; i++)
            bedList.add((Bed)factory.getPart("bed"));
        for(int i = 0; i<numberOfTanks; i++)
            tankList.add((Tank)factory.getPart("tank"));
    }

    private void showInfo(){
        System.out.println("Number of beds: " + numberOfBeds);
        System.out.println("Number of tanks: " + numberOfTanks);
    }

    private void startFarm(Part.State state){
        for( Tank tank : tankList){
            tank.state = state;
            System.out.println("Tank "+tank.getId()+": "+tank.state);
        }
        for( Bed bed : bedList) {
            bed.state = state;
            if(state== Part.State.STOP){
            }
            System.out.println("Bed "+bed.getId()+": "+bed.state);
        }
    }

    @Override
    public void update() {
        int option = menu.getState();
        switch(option){
            case 0:
                System.exit(0);
            case 1:
                showInfo();
                break;
            case 2:
                startFarm(Part.State.RUNNING);
                break;
            case 3:
                startFarm(Part.State.STOP);
                break;
            default:
                break;
        }
    }
}
