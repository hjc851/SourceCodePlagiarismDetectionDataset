package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Icosahedral {
  public int maxQ;
  public double rove;
  public double poor;
  public seng2200.OutputPipelineCoach goadingSupervisor;
  public String[] handles;

  public Icosahedral(String[] abscissa) {
    this.handles = (abscissa);
  }

  public synchronized void play() {

    if (handles.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.poor = (parseDouble(this.handles[0]));
    this.rove = (parseDouble(this.handles[1]));
    this.maxQ = (parseInt(this.handles[2]));
    this.goadingSupervisor = (new seng2200.OutputPipelineCoach(this.poor, this.rove, this.maxQ));
    this.goadingSupervisor.earlyCover();
  }

  public static synchronized void main(String[] align) {
    seng2200.Icosahedral iface;
    iface = (new seng2200.Icosahedral(align));
    iface.play();
  }
}
