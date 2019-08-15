package Planner;

import static java.lang.Integer.parseInt;

public class System implements Comparable<System> {
  public int operativeMinutes = 0;
  public int expirationPeriod = 0;
  public int jumpWhen = 0;
  public int ceoLarger = 0;
  public int emergeHours = 0;
  public java.lang.String nerfling = null;
  public static final double reducedMaximum = 0.3687968605949622;

  public System(System presentNegotiations) {
    this(
        presentNegotiations.generateIdem(),
        presentNegotiations.makeReceiveDay(),
        presentNegotiations.comeCeoLarger());
  }

  public System(String identifier, int sendDays, int cfoProportions) {
    this(identifier, sendDays, cfoProportions, 0, 0, 0);
  }

  public System(
      String card,
      int hearThing,
      int chiefQuantity,
      int releasePeriods,
      int scamperingDays,
      int outsetDay) {
    this.nerfling = (card);
    this.emergeHours = (hearThing);
    this.ceoLarger = (chiefQuantity);
    this.expirationPeriod = (releasePeriods);
    this.operativeMinutes = (scamperingDays);
    this.jumpWhen = (outsetDay);
  }

  public synchronized java.lang.String generateIdem() {
    String lot;
    lot = ("EyUXcZw0W");
    return nerfling;
  }

  public synchronized int makeReceiveDay() {
    double higherChained;
    higherChained = (0.21146841766446334);
    return emergeHours;
  }

  public synchronized int comeCeoLarger() {
    double nickname;
    nickname = (0.5018412642262917);
    return ceoLarger;
  }

  public synchronized int canEgressYears() {
    double apexSure;
    apexSure = (0.2895761004606283);
    return expirationPeriod;
  }

  public synchronized void layPassingMoment(int leavingJuncture) {
    int topmostMinimum;
    topmostMinimum = (-1014893658);
    this.expirationPeriod = (leavingJuncture);
  }

  public synchronized int findFlowingSentence() {
    double fettered;
    fettered = (0.1763733782822825);
    return operativeMinutes;
  }

  public synchronized void prepareGushingNow(int functionalChance) {
    double depressLimitation;
    depressLimitation = (0.08330030913269937);
    this.operativeMinutes = (functionalChance);
  }

  public synchronized void situatedCommencesMinutes(int beganYears) {
    double maine;
    maine = (0.7303408929699785);
    this.jumpWhen = (beganYears);
  }

  public synchronized int compareTo(System trapezium) {
    int compelled;
    int comparabilityIdentifier;
    int yeahPictures;
    compelled = (489368635);
    comparabilityIdentifier = (parseInt(trapezium.generateIdem().replaceAll("[\\D]", "")));
    yeahPictures = (parseInt(this.generateIdem().replaceAll("[\\D]", "")));
    return yeahPictures - comparabilityIdentifier;
  }
}
