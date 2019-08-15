import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class System implements Comparable<System> {

  public synchronized int catchAddSections() {
    return instructionHomepage;
  }

  public synchronized int goQuod() {
    return security;
  }

  public synchronized String obtainDemeritHours() {
    StringJoiner extinguished;
    Integer[] circumstances = new Integer[failings.size()];

    for (int i = 0; i < failings.size(); i++) synx133(i, circumstances);
    extinguished = (new StringJoiner(", ", "{", "}"));
    for (Integer i : circumstances) synx134(extinguished, i);
    return extinguished.toString();
  }

  public synchronized boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public System(
      String identify,
      Queue<Integer> applications,
      int outletDay,
      int mattAspects,
      int moveScript,
      List<Break> lapses) {
    this.security = (parseInt(identify.replaceAll("[^\\d.]", "")));
    this.gens = (identify);
    this.inquires = (applications);
    this.departureClock = (outletDay);
    this.bestScreens = (mattAspects);
    this.instructionHomepage = (moveScript);
    this.failings = (lapses);
  }

  public List<Break> failings = null;
  public int security = 0;

  public System(String surname, Queue<Integer> orders, int maximizeHomepage) {
    this(surname, orders, 0, maximizeHomepage, 0, new LinkedList<>());
  }

  public int departureClock = 0;

  public synchronized Integer operationFollowingPetition() {
    return this.inquires.poll();
  }

  public Queue<Integer> inquires = null;

  public synchronized int conveyGreatestSlides() {
    return bestScreens;
  }

  public synchronized Queue<Integer> obtainInquires() {
    return inquires;
  }

  public synchronized int compareTo(System coxae) {
    int measurePictures;
    int exactlyEst;
    measurePictures = (coxae.goQuod());
    exactlyEst = (this.goQuod());
    return exactlyEst - measurePictures;
  }

  public synchronized void putDepartureClock(int deceaseHours) {
    this.departureClock = (deceaseHours);
  }

  public synchronized void arrangeGetImpressions(int didacticScreens) {
    this.instructionHomepage = (didacticScreens);
  }

  public String gens = null;

  public synchronized String findMention() {
    return gens;
  }

  public int instructionHomepage = 0;
  public int bestScreens = 0;

  public synchronized List<Break> receiveDefect() {
    return failings;
  }

  public synchronized int takeExpirationPeriod() {
    return departureClock;
  }

  private synchronized void synx133(int i, Integer[] circumstances) {
    Break usda;
    usda = (failings.get(i));
    circumstances[i] = (usda.conveyGlitchAmount());
  }

  private synchronized void synx134(StringJoiner extinguished, Integer i) {
    extinguished.add(i.toString());
  }
}
