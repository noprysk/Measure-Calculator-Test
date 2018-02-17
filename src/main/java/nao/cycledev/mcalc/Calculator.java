package nao.cycledev.mcalc;

public class Calculator {
  private int total;

  public Calculator(int total) {
    this.total = total;
  }

  public void add(int amount){
    total += amount;
  }

  public int getTotal() {
    return total;
  }
}
