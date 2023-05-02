public enum SolarSys {
    Mercury(1, 0.0, 2439.5, null),
    Venus(2, 50.0, 6050.0, Mercury),
    Earth(3, 42.0, 6380.0, Venus),
    Mars(4, 78.0, 3358.5, Earth),
    Jupiter(5, 550.5, 71492.0, Mars),
    Saturn(6, 648.5, 60450.0, Jupiter),
    Uranus(7, 1443.0, 25560.0, Saturn),
    Neptune(8, 1630.0, 24765.0, Uranus),
    Pluto(9, 1450.0, 1150.5, Neptune);
    private final Integer orderFromSun;
    public final Double distanceFromThePreviousPlanet;
    private final Double distanceToTheSun;
    private final Double radius;
    private final SolarSys previousPlanet;

    SolarSys(Integer orderFromSun, Double distanceFromThePreviousPlanet, Double radius, SolarSys previousPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromThePreviousPlanet = distanceFromThePreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceToTheSun = previousPlanet == null ? 58.0 : previousPlanet.getDistanceToTheSun() + distanceFromThePreviousPlanet;
    }

    public Integer getOrderFromSun() {
        return orderFromSun;
    }

    public Double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public Double getRadius() {
        return radius;
    }

    public SolarSys getPreviousPlanet() {
        return previousPlanet;
    }

    public Double getDistanceFromThePreviousPlanet() {
        return distanceFromThePreviousPlanet;
    }
}
