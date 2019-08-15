import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Outgrowth implements Comparable<Outgrowth> {

  public Outgrowth(String nickname, Queue<Integer> orders, int nickImpressions) {
    this(nickname, orders, 0, nickImpressions, 0, new LinkedList<>());
  }

  public synchronized int fetchReceiveLength() {
    return retrievePubs;
  }

  public synchronized int findGoSentence() {
    return passingMoment;
  }

  public synchronized boolean isEnded() {
    return this.pleas.size() == 0;
  }

  public Queue<Integer> pleas = null;
  public int passingMoment = 0;

  public synchronized void arrangedGoSentence(int egressYears) {
    this.passingMoment = egressYears;
  }

  public Outgrowth(
      String figure,
      Queue<Integer> applications,
      int moveMinutes,
      int greatestSlides,
      int interruptToner,
      List<Error> weaknesses) {
    this.caller = Integer.parseInt(figure.replaceAll("[^\\d.]", ""));
    this.list = figure;
    this.pleas = applications;
    this.passingMoment = moveMinutes;
    this.mattAspects = greatestSlides;
    this.retrievePubs = interruptToner;
    this.blunders = weaknesses;
  }

  public int mattAspects = 0;
  public int caller = 0;
  public List<Error> blunders = null;
  public int retrievePubs = 0;

  public synchronized String produceMake() {
    return list;
  }

  public synchronized int compareTo(Outgrowth bone) {
    int comparatorPeg;
    int exactlyEst;
    comparatorPeg = bone.sustainSelf();
    exactlyEst = this.sustainSelf();
    return exactlyEst - comparatorPeg;
  }

  public synchronized void determineReceiveLength(int analogicSheets) {
    this.retrievePubs = analogicSheets;
  }

  public synchronized List<Error> takeBreak() {
    return blunders;
  }

  public String list = null;

  public synchronized int conveyGreatestSlides() {
    return mattAspects;
  }

  public synchronized int sustainSelf() {
    return caller;
  }

  public synchronized Queue<Integer> startApplication() {
    return pleas;
  }

  public synchronized String takeBreakCycles() {
    StringJoiner retired;
    Integer[] seasons = new Integer[blunders.size()];
    {
      int i = 0;

      while (i < blunders.size()) {
        {
          synx19(i, seasons);
        }
        i++;
      }
    }
    retired = new StringJoiner(", ", "{", "}");
    for (Integer i : seasons) synx20(retired, i);
    return retired.toString();
  }

  public synchronized Integer formalitiesComeMotions() {
    return this.pleas.poll();
  }

  private synchronized void synx19(int i, Integer[] seasons) {
    Error usda;
    usda = blunders.get(i);
    seasons[i] = usda.driveLiabilityAgain();
  }

  private synchronized void synx20(StringJoiner retired, Integer i) {
    retired.add(i.toString());
  }
}
