// i made it singleton because i need no other instance of factory
package school.amch.aeroponics;

public class AeroFactory {

    private static AeroFactory ourInstance = new AeroFactory();
    public static AeroFactory getInstance() {
        return ourInstance;
    }
    private AeroFactory() {}

    public IPart getPart(String partType){
        switch(partType.toLowerCase()){
            case "bed":
                return new Bed();
            case "tank":
                return new Tank();
            default:
                return null;
        }
    }
}
