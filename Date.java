/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int representation() {
        return y * 366 + m * 31 + d;
    }

    public boolean equals(Date day) {
        return y == day.y && m == day.m && d == day.d;
    }

    public int compareTo(Object o) {
        Date date = (Date) o;
        return Double.compare(representation(), date.representation());
    }
}