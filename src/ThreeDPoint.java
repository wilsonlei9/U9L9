public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }

    public String toString()
    {
        return super.toString() + ", z = " + getZ();
    }

    public boolean equals(Object o)
    {
        ThreeDPoint p = (ThreeDPoint) o;
        if (super.equals(p) && p.getZ() == this.getZ())
        {
            return true;
        }
        else {
            return false;
        }
    }
}
