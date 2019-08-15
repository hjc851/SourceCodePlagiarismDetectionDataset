import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Act implements Comparable<Act> {

  public synchronized List<Blame> bringFlaw() {
    return anomalies;
  }

  public Act(
      String gens,
      Queue<Integer> application,
      int goSentence,
      int kateListings,
      int resetAspects,
      List<Blame> defects) {
    this.tag = (Integer.parseInt(gens.replaceAll("[^\\d.]", "")));
    this.cite = (gens);
    this.calls = (application);
    this.leavingJuncture = (goSentence);
    this.greatestSlides = (kateListings);
    this.activateListings = (resetAspects);
    this.anomalies = (defects);
  }

  public synchronized Integer mechanismForthcomingAsks() {
    return this.calls.poll();
  }

  public String cite = null;

  public synchronized int compareTo(Act osmium) {
    int matchingTag = osmium.drawName();
    int dateSelf = this.drawName();
    return dateSelf - matchingTag;
  }

  public synchronized void dictatedRepWebpages(int didacticScreens) {
    this.activateListings = (didacticScreens);
  }

  public int tag = 0;

  public Act(String call, Queue<Integer> proposals, int mattAspects) {
    this(call, proposals, 0, mattAspects, 0, new LinkedList<>());
  }

  public synchronized boolean isEnded() {
    return this.calls.size() == 0;
  }

  public int leavingJuncture = 0;

  public synchronized String obtainDemeritHours() {
    Integer[] years = new Integer[anomalies.size()];

    for (int i = 0; i < anomalies.size(); i++) {
      Blame usda = anomalies.get(i);
      years[i] = (usda.beatFailuresJuncture());
    }
    StringJoiner exterior = new StringJoiner(", ", "{", "}");
    for (Integer i : years) {
      exterior.add(i.toString());
    }
    return exterior.toString();
  }

  public synchronized int fetchReceiveLength() {
    return activateListings;
  }

  public Queue<Integer> calls = null;
  public List<Blame> anomalies = null;

  public synchronized Queue<Integer> developRequisitions() {
    return calls;
  }

  public int activateListings = 0;

  public synchronized int drawName() {
    return tag;
  }

  public synchronized int becomeMorinToner() {
    return greatestSlides;
  }

  public synchronized void bentPulloutHour(int passingMoment) {
    this.leavingJuncture = (passingMoment);
  }

  public int greatestSlides = 0;

  public synchronized int drawEntranceWeek() {
    return leavingJuncture;
  }

  public synchronized String fetchMoniker() {
    return cite;
  }
}
