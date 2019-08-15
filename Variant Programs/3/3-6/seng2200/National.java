package seng2200;

public class National {
  private String constitute = null;
  private double during = 0.0;

  National() {
    this.during = (0);
    this.constitute = ("");
  }

  National(String key) {
    this.during = (0);
    this.constitute = (key);
  }

  National(String list, double mur) {
    this.during = (mur);
    this.constitute = (list);
  }

  public synchronized void sliceLong(double rik) {
    this.during += (this.during + rik);
  }

  public synchronized double developTimescale() {
    return this.during;
  }

  public synchronized void solidifyingPatronymic(String make) {
    this.constitute = (make);
  }

  public synchronized String toString() {
    return this.constitute;
  }
}
