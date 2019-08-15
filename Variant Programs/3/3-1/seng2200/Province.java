package seng2200;

public class Province {
  public double lasts = 0.0;
  public java.lang.String list = null;

  public Province() {
    this.lasts = 0;
    this.list = "";
  }

  public Province(String gens) {
    this.lasts = 0;
    this.list = gens;
  }

  public Province(String mention, double meer) {
    this.lasts = meer;
    this.list = mention;
  }

  public synchronized void levelHours(double rik) {
    this.lasts += this.lasts + rik;
  }

  public synchronized double makeLasted() {
    return this.lasts;
  }

  public synchronized void doNickname(java.lang.String diagnose) {
    this.list = diagnose;
  }

  public synchronized String toString() {
    return this.list;
  }
}
