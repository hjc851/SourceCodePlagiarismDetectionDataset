package produceProjectiles;

public class NeocomianElement {
  private static final String synX1898String = "ProducibleObject:";
  public static int constructedGet;

  public static synchronized int rifeNumeration() {
    return constructedGet;
  }

  public int security;

  public NeocomianElement() {
    this.security = constructedGet++;
  }

  public synchronized String toString() {
    return synX1898String + this.security;
  }
}
