public class Triangle {
    double katet1;
    double katet2;
    double gipotenuza;
    Triangle(double katet1, double katet2){
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1, 2.0) + Math.pow(katet2, 2.0));
    }
}
