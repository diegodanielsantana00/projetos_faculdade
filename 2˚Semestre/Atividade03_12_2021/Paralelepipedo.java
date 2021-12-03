public class Paralelepipedo implements Comparable<Paralelepipedo> {

    private double x;
    private double y;
    private double z;

    public Paralelepipedo(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Métodos GET
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    // Métodos SET
    public void cadastroXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString(Paralelepipedo pa) {
        return " X = " + pa.x + "\n Y = " + pa.y + "\n Z = " + pa.z + "\n";
    }

    public String toStringThisClasse() {
        return " X = " + this.x + "\n Y = " + this.y + "\n Z = " + this.z + "\n";
    }

    public void exibirValores(Paralelepipedo pa) {
        System.out.print(toString(pa));
    }

    public void exibirVolumeCalculado() {
        System.out.print("\nVolume do paralelepipedo = " + calculoVolume() + " Mˆ3");
    }

    public double calculoVolume() {
        double calculoController;
        calculoController = (this.x * this.y) * this.z;
        return calculoController;
    }

    public void exibirAreaTotal() {
        System.out.print("\nArea Total do paralelepipedo = " + calculoAreaTotal() + " Mˆ2");
    }

    public double calculoAreaTotal() {
        double calculoController;
        calculoController = 2 * ((this.x * this.y) + (this.y * this.z));
        return calculoController;
    }

    @Override
    public int compareTo(Paralelepipedo o) {
        String controllerThisParalelepipedo = toStringThisClasse();
        String controllerParalelepipedo = toString(o);
        int x = controllerThisParalelepipedo.compareTo(controllerParalelepipedo);

        if (x < 0 ) {
            System.out.println("Os valores são diferentes");
        }else{
            System.out.println("Os valores são iguais");
        }
        return 0;
    }
}