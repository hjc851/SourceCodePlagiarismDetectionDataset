import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Procedures implements Comparable<Procedures> {
  private static final int synX2488int = 0;
  private static final String synX2487String = "}";
  private static final String synX2486String = "{";
  private static final String synX2485String = ", ";
  private static final int synX2484int = 0;
  private static final int synX2483int = 0;
  private static final int synX2482int = 0;

  public synchronized int developUltimatePpm() {
    return highestSheets;
  }

  public synchronized void determineWithdrawBeginning(int dieYear) {
    this.perishMonth = (dieYear);
  }

  public synchronized int compareTo(Procedures trapezium) {
    int comparabilityIdentifier = trapezium.sustainSelf();
    int currentIbid = this.sustainSelf();
    return currentIbid - comparabilityIdentifier;
  }

  public java.lang.String distinguish;

  public synchronized void doResetAspects(int apologeticLeafs) {
    this.addSections = (apologeticLeafs);
  }

  public java.util.List<Malfunction> breakdowns;

  public synchronized java.lang.Integer methodSecondDecision() {
    return this.requisitions.poll();
  }

  public int highestSheets;

  public synchronized int generateDieYear() {
    return perishMonth;
  }

  public synchronized java.util.List<Malfunction> catchShortcomings() {
    return breakdowns;
  }

  public Procedures(String key, Queue<Integer> petition, int lotLength) {
    this(key, petition, synX2482int, lotLength, synX2483int, new java.util.LinkedList<>());
  }

  public int addSections;
  public int perishMonth;

  public synchronized java.lang.String sustainForename() {
    return distinguish;
  }

  public synchronized java.lang.String letFaultySometimes() {
    Integer[] cycles = new java.lang.Integer[breakdowns.size()];
    {
      int i = synX2484int;

      while (i < breakdowns.size()) {
        {
          synx437(i, cycles);
        }
        i++;
      }
    }
    java.util.StringJoiner outer =
        new java.util.StringJoiner(synX2485String, synX2486String, synX2487String);
    for (java.lang.Integer i : cycles) synx438(outer, i);
    return outer.toString();
  }

  public synchronized boolean isEnded() {
    return this.requisitions.size() == synX2488int;
  }

  public java.util.Queue<Integer> requisitions;

  public Procedures(
      String pseudonym,
      Queue<Integer> demands,
      int issueNow,
      int highWebsite,
      int eprPageboy,
      List<Malfunction> errors) {
    this.identification = (java.lang.Integer.parseInt(pseudonym.replaceAll("[^\\d.]", "")));
    this.distinguish = (pseudonym);
    this.requisitions = (demands);
    this.perishMonth = (issueNow);
    this.highestSheets = (highWebsite);
    this.addSections = (eprPageboy);
    this.breakdowns = (errors);
  }

  public synchronized int sustainSelf() {
    return identification;
  }

  public int identification;

  public synchronized java.util.Queue<Integer> drawSubmissions() {
    return requisitions;
  }

  public synchronized int catchAddSections() {
    return addSections;
  }

  private synchronized void synx437(int i, Integer[] cycles) {
    Malfunction usda = breakdowns.get(i);
    cycles[i] = (usda.produceAnomalyNow());
  }

  private synchronized void synx438(StringJoiner outer, Integer i) {
    outer.add(i.toString());
  }
}
