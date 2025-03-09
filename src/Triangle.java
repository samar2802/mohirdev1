public class Triangle {
    private double katet1;
    private double katet2;
    public void setKatet1(double katet1) {
        this.katet1 = katet1;
    }

    public void setKatet2(double katet2) {
        this.katet2 = katet2;
    }

    public double yuza() {
        return katet1 * katet2 * 0.5;
    }
    public double yuza(int katet1, int katet2) {
        return katet1 * katet2 * 0.5;
    }
    public double yuza(long katet1, long katet2) {
        return katet1 * katet2 * 0.5;
    }
    public double yuza(float katet1, float katet2) {
        return katet1 * katet2 * 0.5;
    }
    public double perimetr() {
        return katet1 + katet2 + Math.sqrt(katet1 * katet1 + katet2 * katet2) ;
    }
    public double perimetr(int katet1, int katet2) {
        return katet1 + katet2 + Math.sqrt(katet1 * katet1 + katet2 * katet2) ;
    }
    public double perimetr(long katet1, long katet2) {
        return katet1 + katet2 + Math.sqrt(katet1 * katet1 + katet2 * katet2) ;
    }
    public double perimetr(float katet1, float katet2) {
        return katet1 + katet2 + Math.sqrt(katet1 * katet1 + katet2 * katet2) ;
    }

    @Override
    public String toString() {
        return "Yuza: " + yuza() + " Perimetr: " + perimetr();
    }
}
