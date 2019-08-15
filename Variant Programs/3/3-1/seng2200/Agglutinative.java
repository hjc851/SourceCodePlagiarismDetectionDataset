package seng2200;

import static java.lang.System.out;

public class Agglutinative {
  public String[] sender = null;
  public seng2200.ProducersWrinkleManger pushChief = null;
  public double hateful = 0.0;
  public double scope = 0.0;
  public int maxQ = 0;

  public Agglutinative(String[] vent) {
    this.sender = vent;
  }

  public synchronized void operate() {

    if (sender.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.hateful = java.lang.Double.parseDouble(this.sender[0]);
    this.scope = java.lang.Double.parseDouble(this.sender[1]);
    this.maxQ = java.lang.Integer.parseInt(this.sender[2]);
    this.pushChief = new seng2200.ProducersWrinkleManger(this.hateful, this.scope, this.maxQ);
    this.pushChief.initiateBring();
  }

  public static synchronized void main(String[] constructor) {
    seng2200.Agglutinative iface = new seng2200.Agglutinative(constructor);
    iface.operate();
  }
}
