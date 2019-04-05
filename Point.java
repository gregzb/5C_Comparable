/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        Point other = (Point) otherObj;
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        return Double.compare(distance(), other.distance()); // temp: all Points are One
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }


    public double distance() {
        return Math.sqrt(Math.pow(xcor, 2) + Math.pow(ycor, 2));
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(xcor - other.xcor, 2) + Math.pow(ycor - other.ycor, 2));
    }

    public boolean equals(Point other) {
        return xcor == other.xcor && ycor == other.ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}