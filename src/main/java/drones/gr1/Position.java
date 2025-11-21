package drones.gr1;

public class Position {
    private final double x,y,z;

    private final double ALTITUDE_MAX = 30.0;

    public Position(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(double xb, double yb, double zb){
        double result = Math.sqrt(Math.sqrt(this.x-xb)) + Math.sqrt(this.y-yb) + Math.sqrt(this.z-zb));
        return result;
    }

    public boolean altitudeNotMax(Position position){
        return position.getZ() < ALTITUDE_MAX ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
