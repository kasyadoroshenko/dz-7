import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("dz-7-my-amazing-enum");

        System.out.println(SolarSys.values().length);
        System.out.println(SolarSys.Mars.ordinal());
        System.out.println(SolarSys.Venus.getOrderFromSun());

        System.out.println(SolarSys.Venus.getDistanceToTheSun());
        System.out.println(SolarSys.Pluto.getDistanceToTheSun());
        System.out.println(SolarSys.Jupiter.getRadius());
        System.out.println(SolarSys.Earth.getPreviousPlanet());
        System.out.println(SolarSys.Saturn.getDistanceToTheSun());
        System.out.println(SolarSys.Uranus.getDistanceToTheNextPlanet());
        System.out.println(SolarSys.Earth.getDistanceToTheNextPlanet());
    }
}