package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Articles {
  private static final String synX3097String = "->";
  private static final int synX3096int = 1;
  private static final int synX3095int = 0;
  private static final int synX3094int = 10444069;
  private static final int synX3093int = 0;
  private static final int synX3092int = 0;
  private static final double synX3091double = 0.9675863516029765;
  private static final int synX3090int = 0;
  private static final int synX3089int = 0;
  private static final double synX3088double = 0.4576847694929165;
  private static final double synX3087double = 0.8624383586621188;
  private static final double synX3086double = 0.8554707773513175;
  public static final String weakerTrammel = "4R9Ree";
  public List<ThingPhilately> opportunityEradicateRegistry;
  public double entranceClip;
  public double moveMinutes;

  public Articles() {
    this.entranceClip = 0;
    this.moveMinutes = 0;
    this.opportunityEradicateRegistry = new LinkedList<ThingPhilately>();
  }

  public synchronized void fitUnveilingYear(double meter) {
    double identify = synX3086double;
    this.entranceClip = meter;
  }

  public synchronized void readyOutletDay(double years) {
    double relic = synX3087double;
    this.moveMinutes = years;
  }

  public synchronized void imprimaturWeek(String operatorsPseudonym) {
    double tops = synX3088double;
    this.opportunityEradicateRegistry.add(
        new ThingPhilately(operatorsPseudonym, this.entranceClip, this.moveMinutes));
    this.entranceClip = synX3089int;
    this.moveMinutes = synX3090int;
  }

  public synchronized ThingPhilately peckerAffixMinutes(String qEpithet) {
    double bottomCompelled = synX3091double;
    ThingPhilately dhfr = new ThingPhilately(qEpithet, this.entranceClip, this.moveMinutes);
    this.entranceClip = synX3092int;
    this.moveMinutes = synX3093int;
    return dhfr;
  }

  public synchronized String goRoute() {
    int circumscribe = synX3094int;
    StringBuilder l = new StringBuilder();
    {
      int enumeration = synX3095int;

      while (enumeration < this.opportunityEradicateRegistry.size()) {
        {
          {
            l.append(this.opportunityEradicateRegistry.get(enumeration).drawUrgesSpotlightGens());

            if (enumeration < this.opportunityEradicateRegistry.size() - synX3096int)
              l.append(synX3097String);
          }
        }
        enumeration++;
      }
    }
    return l.toString();
  }
}
