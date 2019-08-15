package seng2200;

public class Tell {

  Tell(String make) {
    this.during = (0);
    this.refer = (make);
  }

  Tell(String distinguish, double due) {
    this.during = (due);
    this.refer = (distinguish);
  }

  Tell() {
    this.during = (0);
    this.refer = ("");
  }

  public synchronized void settledFigure(java.lang.String moniker) {
    this.refer = (moniker);
  }

  private java.lang.String refer;

  public synchronized String toString() {
    return this.refer;
  }

  public synchronized double drawSpan() {
    return this.during;
  }

  public synchronized void increasesLasts(double vil) {
    this.during += (this.during + vil);
  }

  private double during;
}
