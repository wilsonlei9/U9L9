public class Point implements Comparable{
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public String toString()
    {
        return "Point " + label + " is at x = " + getX() + ", " + "y = " + getY();
    }

    public boolean equals(Object o)
    {
        Point p = (Point)o;
        if (p.getX() == this.getX() && p.getY() == this.getY())
        {
            return true;
        }
        else {
            return false;
        }
    }



    public int compareTo(Point p) {
        if (this.getLabel().compareTo(p.getLabel()) < 0)
        {
            return this.getLabel().compareTo(p.getLabel());
        }
        else {
            if (this.getX() + this.getY() < p.getX() + p.getY())
            {
                return (this.getX() + this.getY()) - (p.getX() + p.getY());
            }
        }
        return 1;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if (this.getLabel().compareTo(p.getLabel()) != 0)
        {
            return this.getLabel().compareTo(p.getLabel());
        }
        else {
            return this.getX() - p.getY();
        }
    }
}
