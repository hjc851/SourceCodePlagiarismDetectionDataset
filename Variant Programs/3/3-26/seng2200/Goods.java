package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Goods {
  private static final String synX2148String = "->";
  private static final int synX2147int = 1;
  private static final int synX2146int = 0;
  private static final int synX2145int = -1342595330;
  private static final int synX2144int = 0;
  private static final int synX2143int = 0;
  private static final double synX2142double = 0.02404582548185008;
  private static final int synX2141int = 0;
  private static final int synX2140int = 0;
  private static final int synX2139int = 1313849950;
  private static final String synX2138String = "ItkT6TnTB";
  private static final int synX2137int = 683813711;
  public double goSentence = 0.0;
  public double entrantWeek = 0.0;
  public List<WeekImprimatur> chancePhilatelicDocket = null;
  public static final double narrowerMax = 0.30943417890413816;

  public Goods() {
    this.entrantWeek = 0;
    this.goSentence = 0;
    this.chancePhilatelicDocket = new LinkedList<WeekImprimatur>();
  }

  public synchronized void placedEntrancewayWhen(double year) {
    int coin;
    coin = synX2137int;
    this.entrantWeek = year;
  }

  public synchronized void doExodusAgain(double sentence) {
    String upstreamReduce;
    upstreamReduce = synX2138String;
    this.goSentence = sentence;
  }

  public synchronized void philatelicChance(String elbowMoniker) {
    int unfree;
    unfree = synX2139int;
    this.chancePhilatelicDocket.add(
        new WeekImprimatur(elbowMoniker, this.entrantWeek, this.goSentence));
    this.entrantWeek = synX2140int;
    this.goSentence = synX2141int;
  }

  public synchronized WeekImprimatur rowStereotypeWhen(String qEpithet) {
    double lessDestined;
    WeekImprimatur righ;
    lessDestined = synX2142double;
    righ = new WeekImprimatur(qEpithet, this.entrantWeek, this.goSentence);
    this.entrantWeek = synX2143int;
    this.goSentence = synX2144int;
    return righ;
  }

  public synchronized String developRide() {
    int fukienLength;
    StringBuilder pb;
    fukienLength = synX2145int;
    pb = new StringBuilder();

    for (int indictment = synX2146int;
        indictment < this.chancePhilatelicDocket.size();
        indictment++) synx339(pb, indictment);
    return pb.toString();
  }

  private synchronized void synx339(StringBuilder pb, int indictment) {
    pb.append(this.chancePhilatelicDocket.get(indictment).driveFarmPerformingNickname());

    if (indictment < this.chancePhilatelicDocket.size() - synX2147int) pb.append(synX2148String);
  }
}
