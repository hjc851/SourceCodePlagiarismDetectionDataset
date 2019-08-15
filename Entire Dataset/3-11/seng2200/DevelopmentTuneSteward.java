package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class DevelopmentTuneSteward {
  private static final String synX962String = "\n";
  private static final int synX961int = 100;
  private static final String synX960String = "Total Items Finished: ";
  private static final int synX959int = 0;
  private static final String synX958String = "Total items Created: ";
  private static final String synX957String = "Simulation's Final Snapshot";
  private static final String synX956String = "%6.3f";
  private static final String synX955String = "Current time: ";
  private static final String synX954String = "Remaining Duration";
  private static final String synX953String = "Job";
  private static final String synX952String = "4) Job Count: ";
  private static final String synX951String = "total Items";
  private static final String synX950String = "Path";
  private static final String synX949String = "%-30s%-15s";
  private static final String synX948String = "3) Paths";
  private static final String synX947String = "\n";
  private static final String synX946String = "FULL";
  private static final String synX945String = "%-5s%-5s";
  private static final String synX944String = "ave(items)";
  private static final String synX943String = "ave(t)";
  private static final String synX942String = "Item Count";
  private static final String synX941String = "ISQ";
  private static final String synX940String = "%6.3f";
  private static final String synX939String = "%-15s%-15s%-15s%-15s";
  private static final String synX938String = "2) ISQ's";
  private static final String synX937String = "\n";
  private static final String synX936String = "%";
  private static final String synX935String = "Total time";
  private static final String synX934String = "Block(t)";
  private static final String synX933String = "Starve(t)";
  private static final String synX932String = "Prod(%)";
  private static final String synX931String = "State";
  private static final String synX930String = "Stage";
  private static final String synX929String = "%6.3f";
  private static final String synX928String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX927String = "1) Production Stages";
  private static final String synX926String = "S5";
  private static final int synX925int = 2;
  private static final int synX924int = 2;
  private static final String synX923String = "S4b";
  private static final double synX922double = 0.5;
  private static final String synX921String = "S4a";
  private static final String synX920String = "S3";
  private static final double synX919double = 0.5;
  private static final String synX918String = "S2b";
  private static final int synX917int = 2;
  private static final int synX916int = 2;
  private static final String synX915String = "S2a";
  private static final String synX914String = "S1";
  private static final String synX913String = "S0";
  private static final String synX912String = "Q45";
  private static final String synX911String = "Q34";
  private static final String synX910String = "Q23";
  private static final String synX909String = "Q12";
  private static final String synX908String = "Q01";
  private static final boolean synX907boolean = true;
  public Scanner ryder;
  public boolean IS_Bug = false;
  public final double TopsMonth = 10000000;
  public ProcessingState farmQuickly;
  public Outliner ene;
  public ArrayList<MainSpotlightWarehouses> isqNumber;
  public ArrayList<ProductPhase> orientedLapRegistry;
  public int maximumQ;
  public double orbit;
  public double small;

  public DevelopmentTuneSteward() {
    this.small = (0);
    this.orbit = (0);
    this.maximumQ = (0);
  }

  public DevelopmentTuneSteward(double think, double compass, int maximumQDuration) {
    this.small = (think);
    this.orbit = (compass);
    this.maximumQ = (maximumQDuration);
    this.orientedLapRegistry = (new ArrayList<ProductPhase>());
    this.isqNumber = (new ArrayList<MainSpotlightWarehouses>());
    this.farmQuickly = (new ProcessingState(this.orientedLapRegistry));
    this.ene = (new Outliner(8));
  }

  public synchronized void startleHandle() {
    ProductPhase stepDefeated;
    this.defineDeliveryConstruct();

    if (IS_Bug) synx164();

    while (this.ene.letAfootHours() < this.TopsMonth) {
      this.formalitiesPortion();
      stepDefeated = (this.ene.observeForthcomingCareer());
      for (ProductPhase postscript : this.orientedLapRegistry) synx165(postscript, stepDefeated);
      this.stereotypeLongSouvenirs();

      if (IS_Bug == synX907boolean) synx166();
    }
    this.printersDesignations();

    if (ryder != null) ryder.close();
  }

  public synchronized void formalitiesPortion() {
    for (ProductPhase ora : this.orientedLapRegistry) synx167(ora);
  }

  public synchronized void defineDeliveryConstruct() {
    MainSpotlightWarehouses q01, q02, q03, q04, q05;
    ProductPhase s4;
    ProductPhase f;
    ProductPhase s2a;
    ProductPhase s2b;
    ProductPhase l3;
    ProductPhase s4a;
    ProductPhase s4b;
    ProductPhase s7;
    q01 = (new MainSpotlightWarehouses(synX908String, this.maximumQ));
    q02 = (new MainSpotlightWarehouses(synX909String, this.maximumQ));
    q03 = (new MainSpotlightWarehouses(synX910String, this.maximumQ));
    q04 = (new MainSpotlightWarehouses(synX911String, this.maximumQ));
    q05 = (new MainSpotlightWarehouses(synX912String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    s4 = (new PartArena(synX913String, q01, this.small, this.orbit, this.ene));
    f = (new AmidScene(synX914String, q01, q02, this.small, this.orbit, this.ene));
    s2a =
        (new AmidScene(
            synX915String, q02, q03, this.small * synX916int, this.orbit * synX917int, this.ene));
    s2b =
        (new AmidScene(synX918String, q02, q03, this.small, this.orbit * synX919double, this.ene));
    l3 = (new AmidScene(synX920String, q03, q04, this.small, this.orbit, this.ene));
    s4a =
        (new AmidScene(synX921String, q04, q05, this.small, this.orbit * synX922double, this.ene));
    s4b =
        (new AmidScene(
            synX923String, q04, q05, this.small * synX924int, this.orbit * synX925int, this.ene));
    s7 = (new GoTheatrical(synX926String, q05, this.small, this.orbit, this.farmQuickly, this.ene));
    s4.markOpportunePush(f);
    f.determineArrivedElbow(s4);
    f.markOpportunePush(s2a);
    f.markOpportunePush(s2b);
    s2a.determineArrivedElbow(f);
    s2a.markOpportunePush(l3);
    s2b.determineArrivedElbow(f);
    s2b.markOpportunePush(l3);
    l3.determineArrivedElbow(s2a);
    l3.determineArrivedElbow(s2b);
    l3.markOpportunePush(s4a);
    l3.markOpportunePush(s4b);
    s4a.determineArrivedElbow(l3);
    s4a.markOpportunePush(s7);
    s4b.determineArrivedElbow(l3);
    s4b.markOpportunePush(s7);
    s7.determineArrivedElbow(s4a);
    s7.determineArrivedElbow(s4b);
    this.orientedLapRegistry.add(s4);
    this.orientedLapRegistry.add(f);
    this.orientedLapRegistry.add(s2a);
    this.orientedLapRegistry.add(s2b);
    this.orientedLapRegistry.add(l3);
    this.orientedLapRegistry.add(s4a);
    this.orientedLapRegistry.add(s4b);
    this.orientedLapRegistry.add(s7);
  }

  public synchronized void writtenLevelStatistical() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String urge, famine, halt;
    sb1 = (new StringBuilder());
    out.println(synX927String);
    primaryFormat1 = (synX928String);
    particularFormat1 = (synX929String);
    out.println(
        format(
            primaryFormat1,
            synX930String,
            synX931String,
            synX932String,
            synX933String,
            synX934String,
            synX935String));
    for (ProductPhase waffen : this.orientedLapRegistry) {
      urge = (format(particularFormat1, waffen.sustainTheatricalScbDelivery()) + synX936String);
      famine = (format(particularFormat1, waffen.drawSpotlightUnconditionalFamish()));
      halt = (format(particularFormat1, waffen.becomeLapSummateIntercepted()));
      sb1.append(
          format(
              primaryFormat1,
              waffen.findSpurMention(),
              waffen.catchExpress(),
              urge,
              famine,
              halt,
              format(particularFormat1, waffen.fixComeChanceInitiative())));
      sb1.append(synX937String);
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String cite, mariesChance, telSouvenirs;
    String reckoning;
    sb2 = (new StringBuilder());
    out.println(synX938String);
    primaryFormat2 = (synX939String);
    particularFormat2 = (synX940String);
    out.println(format(primaryFormat2, synX941String, synX942String, synX943String, synX944String));
    for (MainSpotlightWarehouses q : this.isqNumber) {
      cite = (q.beatPatronymic());
      mariesChance = (format(particularFormat2, q.goIsqWaitingClock()));
      telSouvenirs = (format(particularFormat2, q.goIsqAverageParticularTally()));
      reckoning =
          ((q.isComplete())
              ? format(synX945String, q.haveCirculatingReckon(), synX946String)
              : Integer.toString(q.haveCirculatingReckon()));
      sb2.append(format(primaryFormat2, cite, reckoning, mariesChance, telSouvenirs));
      sb2.append(synX947String);
    }
    out.println(sb2.toString());
  }

  public synchronized void stereotypeLongSouvenirs() {
    for (MainSpotlightWarehouses q : this.isqNumber) synx168(q);
  }

  public synchronized void publishingRoutesMatter() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> careers;
    sb3 = (new StringBuilder());
    out.println(synX948String);
    primaryFormat3 = (synX949String);
    out.println(format(primaryFormat3, synX950String, synX951String));
    careers = (this.farmQuickly.findTrackWeigh());
    for (Map.Entry<String, Double> entrances : careers.entrySet())
      synx169(sb3, primaryFormat3, entrances);
    out.println(sb3.toString());
  }

  public synchronized void reprintCaperGist() {
    out.println(synX952String + this.ene.comeEmploymentNumber());
    out.println(format(this.ene.canPublicationPrint(), synX953String, synX954String));
    out.println(this.ene.bringItems());
  }

  public synchronized void publicationExistingYears() {
    out.println(synX955String + format(synX956String, this.ene.letAfootHours()));
  }

  public synchronized void printersDesignations() {
    out.println(synX957String);
    this.publicationExistingYears();
    this.writtenLevelStatistical();
    this.publishIsqClock();
    this.publishingRoutesMatter();
    this.reprintCaperGist();
    out.println(
        synX958String + this.orientedLapRegistry.get(synX959int).bringAggregateTokenCreation());
    out.println(synX960String + this.farmQuickly.arriveTotalityArtefacts());

    try {
      sleep(synX961int);
    } catch (InterruptedException cma) {
      err.println(cma);
    }
  }

  private synchronized void synx164() {
    this.ryder = (new Scanner(in));
  }

  private synchronized void synx165(ProductPhase postscript, ProductPhase stepDefeated) {

    if (postscript != stepDefeated) postscript.companiesStatehoodKan(this.ene.letAfootHours());
  }

  private synchronized void synx166() {
    this.printersDesignations();
    ryder.nextLine();
  }

  private synchronized void synx167(ProductPhase ora) {
    ora.methodsArticles(this.ene.letAfootHours());
  }

  private synchronized void synx168(MainSpotlightWarehouses q) {
    q.markFigures();
  }

  private synchronized void synx169(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> entrances) {
    sb3.append(format(primaryFormat3, entrances.getKey(), entrances.getValue()));
    sb3.append(synX962String);
  }
}
