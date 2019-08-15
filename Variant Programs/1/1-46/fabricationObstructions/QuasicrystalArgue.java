package fabricationObstructions;

public class QuasicrystalArgue {
  public static int spawnedWeigh = 0;

  public QuasicrystalArgue() {
    this.pictures = (spawnedWeigh++);
  }

  public static synchronized int presentlyTell() {
    return spawnedWeigh;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.pictures;
  }

  public int pictures = 0;
}
