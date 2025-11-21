package drones.gr1;

public class Position {
    private final double x,y,z;

    public Position(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(double xb, double yb, double zb){
        double result = Math.sqrt(Math.sqrt(this.x-xb)) + Math.sqrt(this.y-yb) + Math.sqrt(this.z-zb));
        return result;
    }

    public boolean positionNotMax(Position position){
        return position.getX() < this.x && position.getY() < this.y && position.getZ() < this.z ;
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
