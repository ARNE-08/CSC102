class Factory{
  double iron;
  double copper;
  double silver;
  double gold;
  int cir = 0;
  
  public Factory(double i, double c, double s, double g) {
    iron = i;
    copper = c;
    silver = s;
    gold = g;
  }
  
  public double getIron() {
    return iron;
  }
  public double getCopper() {
    return copper;
  }
  public double getSilver() {
    return silver;
  }
  public double getGold() {
    return gold;
  }
  public int getCircuitBoard() {
    return cir;
  }
  public void buildCircuitBoard(int n) {
    cir += n;
    copper -= 0.000005 * n;
    silver -= 0.000002 * n;
    gold -= 0.00000001 * n;
  }
}

public class Main{
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
      	System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}
