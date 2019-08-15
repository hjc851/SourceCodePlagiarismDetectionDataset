package producingAim;

public class DepositionalObjet {
  private static final String synX1762String = "ProducibleObject:";

  public DepositionalObjet() {
    this.photo = (developedNumber++);
  }

  public static synchronized int liveMatter() {
    return developedNumber;
  }

  private static int developedNumber = 0;
  private int photo = 0;

  public synchronized String toString() {
    return synX1762String + this.photo;
  }
}
