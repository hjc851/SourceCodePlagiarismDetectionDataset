import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class System implements Comparable<System> {
  private static final int synX1616int = 0;
  private static final int synX1615int = 0;
  private static final int synX1614int = 0;
  private static final String synX1613String = "}";
  private static final String synX1612String = "{";
  private static final String synX1611String = ", ";
  private static final int synX1610int = 0;
  public int moveScript = 0;

  public synchronized String fetchDefectiveRounds() {
    StringJoiner extinguished;
    Integer[] moments = new Integer[failures.size()];
    {
      int i = synX1610int;

      while (i < failures.size()) {
        {
          synx209(i, moments);
        }
        i++;
      }
    }
    extinguished = new StringJoiner(synX1611String, synX1612String, synX1613String);
    for (Integer i : moments) synx210(extinguished, i);
    return extinguished.toString();
  }

  public List<Liability> failures = null;

  public synchronized int arriveIdentifying() {
    return ownership;
  }

  public synchronized String fetchMoniker() {
    return patronymic;
  }

  public int greatestSlides = 0;
  public int moveMinutes = 0;

  public System(
      String identify,
      Queue<Integer> inquires,
      int entranceWeek,
      int limitVarlet,
      int abortSites,
      List<Liability> failings) {
    this.ownership = Integer.parseInt(identify.replaceAll("[^\\d.]", ""));
    this.patronymic = identify;
    this.queries = inquires;
    this.moveMinutes = entranceWeek;
    this.greatestSlides = limitVarlet;
    this.moveScript = abortSites;
    this.failures = failings;
  }

  public synchronized int comeLimitVarlet() {
    return greatestSlides;
  }

  public synchronized Integer sueUpcomingApplication() {
    return this.queries.poll();
  }

  public synchronized int obtainInstructionHomepage() {
    return moveScript;
  }

  public synchronized Queue<Integer> arriveInvitations() {
    return queries;
  }

  public int ownership = 0;

  public synchronized boolean isEnded() {
    return this.queries.size() == synX1614int;
  }

  public synchronized int catchExpireWhen() {
    return moveMinutes;
  }

  public synchronized void fitDieYear(int passingMoment) {
    this.moveMinutes = passingMoment;
  }

  public Queue<Integer> queries = null;

  public synchronized List<Liability> canAnomalies() {
    return failures;
  }

  public synchronized int compareTo(System centrale) {
    int contrastPhoto;
    int nowDimidiate;
    contrastPhoto = centrale.arriveIdentifying();
    nowDimidiate = this.arriveIdentifying();
    return nowDimidiate - contrastPhoto;
  }

  public synchronized void laidPeenVarlet(int activateListings) {
    this.moveScript = activateListings;
  }

  public System(String list, Queue<Integer> calls, int morinToner) {
    this(list, calls, synX1615int, morinToner, synX1616int, new LinkedList<>());
  }

  public String patronymic = null;

  private synchronized void synx209(int i, Integer[] moments) {
    Liability usda;
    usda = failures.get(i);
    moments[i] = usda.letFaultyHours();
  }

  private synchronized void synx210(StringJoiner extinguished, Integer i) {
    extinguished.add(i.toString());
  }
}
