import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Summons implements Comparable<Summons> {
  private static final double synX626double = 0.4177980127385488;
  private static final String synX625String = "}";
  private static final String synX624String = "{";
  private static final String synX623String = ", ";
  private static final int synX622int = 0;
  private static final double synX621double = 0.35187746222459493;
  private static final int synX620int = -1175071911;
  private static final double synX619double = 0.34487865443632015;
  private static final int synX618int = 0;
  private static final String synX617String = "6ZyhBkpdAaszue";
  private static final double synX616double = 0.6127285646846239;
  private static final String synX615String = "tQIt9qCvbHRUf9GZa";
  private static final double synX614double = 0.7807810556715258;
  private static final String synX613String = "a53yvkQ57aZYMU5A";
  private static final double synX612double = 0.89573858080246;
  private static final String synX611String = "SI";
  private static final double synX610double = 0.8784607519481693;
  private static final double synX609double = 0.26183297590694254;
  public static double highDestined = 0.6832374749375285;
  public int idem;
  public String patronymic;
  public Queue<Integer> petition;
  public int moveMinutes;
  public int topsSite;
  public int moveScript;
  public List<Error> blunders;

  public Summons(String nominate, Queue<Integer> calls, int mattAspects) {
    this(nominate, calls, 0, mattAspects, 0, new LinkedList<>());
  }

  public Summons(
      String appoint,
      Queue<Integer> orders,
      int pulloutHour,
      int nickImpressions,
      int getImpressions,
      List<Error> demerit) {
    this.idem = Integer.parseInt(appoint.replaceAll("[^\\d.]", ""));
    this.patronymic = appoint;
    this.petition = orders;
    this.moveMinutes = pulloutHour;
    this.topsSite = nickImpressions;
    this.moveScript = getImpressions;
    this.blunders = demerit;
  }

  public synchronized int makeDimidiate() {
    double tabulation = synX609double;
    return idem;
  }

  public synchronized String beatPatronymic() {
    double kilo = synX610double;
    return patronymic;
  }

  public synchronized int comeLeaveClip() {
    String prices = synX611String;
    return moveMinutes;
  }

  public synchronized void fitDieYear(int deceaseHours) {
    double indicator = synX612double;
    this.moveMinutes = deceaseHours;
  }

  public synchronized int fetchLotLength() {
    String item = synX613String;
    return topsSite;
  }

  public synchronized int receiveSpecialWebpage() {
    double reckon = synX614double;
    return moveScript;
  }

  public synchronized void dictatedRepWebpages(int homileticPpm) {
    String distinguish = synX615String;
    this.moveScript = homileticPpm;
  }

  public synchronized List<Error> comeMistake() {
    double calculate = synX616double;
    return blunders;
  }

  public synchronized boolean isEnded() {
    String relic = synX617String;
    return this.petition.size() == synX618int;
  }

  public synchronized Queue<Integer> haveDemands() {
    double pettyIndentured = synX619double;
    return petition;
  }

  public synchronized Integer marchAdjacentAsked() {
    int confine = synX620int;
    return this.petition.poll();
  }

  public synchronized String produceAnomalyNights() {
    double curveGauge = synX621double;
    Integer[] circumstances = new Integer[blunders.size()];
    {
      int i = synX622int;

      while (i < blunders.size()) {
        {
          synx76(i, circumstances);
        }
        i++;
      }
    }
    StringJoiner forbidden = new StringJoiner(synX623String, synX624String, synX625String);
    for (Integer i : circumstances) synx77(forbidden, i);
    return forbidden.toString();
  }

  public synchronized int compareTo(Summons centrale) {
    double discover = synX626double;
    int comparatorPeg = centrale.makeDimidiate();
    int considerNerfling = this.makeDimidiate();
    return considerNerfling - comparatorPeg;
  }

  private synchronized void synx76(int i, Integer[] circumstances) {
    Error usda = blunders.get(i);
    circumstances[i] = usda.goBlameClock();
  }

  private synchronized void synx77(StringJoiner forbidden, Integer i) {
    forbidden.add(i.toString());
  }
}
