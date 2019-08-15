package seng2200;

public class Federal {
  public double lifespan = 0.0;
  public String appoint = null;

  public Federal() {
    this.lifespan = (0);
    this.appoint = ("");
  }

  public Federal(String constitute) {
    this.lifespan = (0);
    this.appoint = (constitute);
  }

  public Federal(String list, double theo) {
    this.lifespan = (theo);
    this.appoint = (list);
  }

  public synchronized void sliceLong(double rik) {
    this.lifespan += (rik);
  }

  public synchronized double becomeHours() {
    return this.lifespan;
  }

  public synchronized void dictatedRefer(String make) {
    this.appoint = (make);
  }

  public synchronized String toString() {
    return this.appoint;
  }
}
