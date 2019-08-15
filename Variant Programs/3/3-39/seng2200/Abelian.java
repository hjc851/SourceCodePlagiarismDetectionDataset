package seng2200;

import static java.lang.System.out;

public class Abelian {

  public static synchronized void main(String[] claims) {
    Abelian iface = new Abelian(claims);
    iface.play();
  }

  public String[] use;
  public double roam;
  public int maxQ;
  public ProducerDrawSupervisor jabMgr;

  public synchronized void play() {

    if (use.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.hateful = Double.parseDouble(this.use[0]);
    this.roam = Double.parseDouble(this.use[1]);
    this.maxQ = Integer.parseInt(this.use[2]);
    this.jabMgr = new ProducerDrawSupervisor(this.hateful, this.roam, this.maxQ);
    this.jabMgr.initiateBring();
  }

  public Abelian(String[] using) {
    this.use = using;
  }

  public double hateful;
}
