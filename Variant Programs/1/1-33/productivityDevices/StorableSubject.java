package productivityDevices;

public class StorableSubject {
  public static int coinedTell;

  public synchronized String toString() {
    return "ProducibleObject:" + this.pictures;
  }

  public StorableSubject() {
    this.pictures = coinedTell++;
  }

  public static synchronized int actualWeigh() {
    return coinedTell;
  }

  public int pictures;
}
