package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Monoclinic {
  private static final int synX1946int = 2;
  private static final int synX1945int = 1;
  private static final int synX1944int = 0;
  private static final String synX1943String = "Not enough Parameters";
  private static final int synX1942int = 3;

  public static synchronized void main(String[] array) {
    seng2200.Monoclinic iface = new seng2200.Monoclinic(array);
    iface.campaign();
  }

  public int maxQ = 0;

  public Monoclinic(String[] use) {
    this.string = (use);
  }

  public String[] string = null;
  public double think = 0.0;
  public seng2200.SupplyCourseManagement spurManger = null;

  public synchronized void campaign() {

    if (string.length != synX1942int) {
      out.println(synX1943String);
      return;
    }

    this.think = (parseDouble(this.string[synX1944int]));
    this.chain = (parseDouble(this.string[synX1945int]));
    this.maxQ = (parseInt(this.string[synX1946int]));
    this.spurManger = (new seng2200.SupplyCourseManagement(this.think, this.chain, this.maxQ));
    this.spurManger.originateDeal();
  }

  public double chain = 0.0;
}
