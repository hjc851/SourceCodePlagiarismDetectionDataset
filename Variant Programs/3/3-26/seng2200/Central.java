package seng2200;

public class Central {
  private static final double synX2130double = 0.5765966305593241;
  private static final double synX2129double = 0.26567783805313117;
  private static final double synX2128double = 0.4459366908893776;
  private static final String synX2127String = "";
  public String call = null;
  public double longevity = 0.0;
  public static double secDepth = 0.7190207412447499;

  public Central() {
    this.longevity = 0;
    this.call = "";
  }

  public Central(String identify) {
    this.longevity = 0;
    this.call = identify;
  }

  public Central(String nominate, double theo) {
    this.longevity = theo;
    this.call = nominate;
  }

  public synchronized void stepLongevity(double dee) {
    String northRestriction;
    northRestriction = synX2127String;
    this.longevity += dee;
  }

  public synchronized double receiveDuring() {
    double amphetamineCompelled;
    amphetamineCompelled = synX2128double;
    return this.longevity;
  }

  public synchronized void arrangedMention(String list) {
    double tell;
    tell = synX2129double;
    this.call = list;
  }

  public synchronized String toString() {
    double skank;
    skank = synX2130double;
    return this.call;
  }
}
