public class Point {
    private int x;
    private int y;
    private int z;
    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void getInformation() {
        System.out.println(x + " " + y + " " + z );
    }
}
