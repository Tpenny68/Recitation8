public class Circle {
    private Point location;
    private double radius;

    public Circle() {
        this.location = new Point(0, 0);
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.location = new Point(0, 0);
        this.radius = radius;
    }

    public Circle(Point location, double radius) {
        this.location = new Point(location);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getLocation() {
        return new Point(location);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setLocation(Point location) {
        this.location = new Point(location);
    }

    public boolean contains(Point p) {
        return location.distanceTo(p) <= radius;
    }

    public boolean intersects(Circle aCircle) {
        double distance = this.location.distanceTo(aCircle.getLocation());
        return distance <= (this.radius + aCircle.getRadius());
    }

    @Override
    public String toString() {
        return "Circle/loc=" + location + ",radius=" + radius;
    }
}