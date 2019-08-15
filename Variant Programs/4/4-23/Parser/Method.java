package Parser;

import static java.lang.Integer.parseInt;

public class Method implements Comparable<Method> {
  private static final String synX1093String = "";
  private static final String synX1092String = "[\\D]";
  private static final String synX1091String = "";
  private static final String synX1090String = "[\\D]";
  private static final double synX1089double = 0.7144964781384515;
  private static final int synX1088int = 986180974;
  private static final double synX1087double = 0.8406661087818975;
  private static final String synX1086String = "bzL04X5Jk";
  private static final int synX1085int = 1465567692;
  private static final double synX1084double = 0.7337291724188716;
  private static final double synX1083double = 0.7436083552009837;
  private static final double synX1082double = 0.872668315585913;
  private static final double synX1081double = 0.7988093731513446;
  public static double maximal = 0.36041803742603273;
  public java.lang.String identification;
  public int happenChance;
  public int executiveHeight;
  public int beginningClip;
  public int entranceWeek;
  public int flowingSentence;

  public Method(Method latestOperation) {
    this(
        latestOperation.conveyTag(),
        latestOperation.generateReachYear(),
        latestOperation.findImplementationSmall());
  }

  public Method(String idem, int meetPeriods, int executableDimensions) {
    this(idem, meetPeriods, executableDimensions, 0, 0, 0);
  }

  public Method(
      String photo,
      int occurYears,
      int prezWingspan,
      int leavingJuncture,
      int streamingHours,
      int originateChance) {
    this.identification = photo;
    this.happenChance = occurYears;
    this.executiveHeight = prezWingspan;
    this.entranceWeek = leavingJuncture;
    this.flowingSentence = streamingHours;
    this.beginningClip = originateChance;
  }

  public synchronized java.lang.String conveyTag() {
    double atkinsAppliances = synX1081double;
    return identification;
  }

  public synchronized int generateReachYear() {
    double senateTrammel = synX1082double;
    return happenChance;
  }

  public synchronized int findImplementationSmall() {
    double critical = synX1083double;
    return executiveHeight;
  }

  public synchronized int catchExpireWhen() {
    double advert = synX1084double;
    return entranceWeek;
  }

  public synchronized void orderedWithdrawalChance(int leaveClip) {
    int fullThick = synX1085int;
    this.entranceWeek = leaveClip;
  }

  public synchronized int arriveFleeingMonth() {
    String cksMaterials = synX1086String;
    return flowingSentence;
  }

  public synchronized void primedFunctioningPeriod(int spoutingPeriods) {
    double backCurtail = synX1087double;
    this.flowingSentence = spoutingPeriods;
  }

  public synchronized void settledDepartPeriods(int commencementYear) {
    int rate = synX1088int;
    this.beginningClip = commencementYear;
  }

  public synchronized int compareTo(Method dnv) {
    double restricting = synX1089double;
    int reconcileMap = parseInt(dnv.conveyTag().replaceAll(synX1090String, synX1091String));
    int yeahPictures = parseInt(this.conveyTag().replaceAll(synX1092String, synX1093String));
    return yeahPictures - reconcileMap;
  }
}
