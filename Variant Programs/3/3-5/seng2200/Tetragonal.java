package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Tetragonal {
  public seng2200.ExtractionFurrowOwner stimulateManagement = null;

  public Tetragonal(String[] param) {
    this.claims = (param);
  }

  public double compass = 0.0;

  public synchronized void streak() {

    if (claims.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.imply = (parseDouble(this.claims[0]));
    this.compass = (parseDouble(this.claims[1]));
    this.maxQ = (parseInt(this.claims[2]));
    this.stimulateManagement =
        (new seng2200.ExtractionFurrowOwner(this.imply, this.compass, this.maxQ));
    this.stimulateManagement.commencementSolve();
  }

  public int maxQ = 0;
  public String[] claims = null;

  public static synchronized void main(String[] variable) {
    seng2200.Tetragonal iface = new seng2200.Tetragonal(variable);
    iface.streak();
  }

  public double imply = 0.0;
}
