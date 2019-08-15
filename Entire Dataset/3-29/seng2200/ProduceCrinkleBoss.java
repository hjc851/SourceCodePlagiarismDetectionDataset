package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;

public class ProduceCrinkleBoss {
  private static final String synX2416String = "\n";
  private static final int synX2415int = 100;
  private static final String synX2414String = "Total Items Finished: ";
  private static final int synX2413int = 0;
  private static final String synX2412String = "Total items Created: ";
  private static final String synX2411String = "Simulation's Final Snapshot";
  private static final String synX2410String = "%6.3f";
  private static final String synX2409String = "Current time: ";
  private static final String synX2408String = "Remaining Duration";
  private static final String synX2407String = "Job";
  private static final String synX2406String = "4) Job Count: ";
  private static final String synX2405String = "total Items";
  private static final String synX2404String = "Path";
  private static final String synX2403String = "%-30s%-15s";
  private static final String synX2402String = "3) Paths";
  private static final String synX2401String = "\n";
  private static final String synX2400String = "FULL";
  private static final String synX2399String = "%-5s%-5s";
  private static final String synX2398String = "ave(items)";
  private static final String synX2397String = "ave(t)";
  private static final String synX2396String = "Item Count";
  private static final String synX2395String = "ISQ";
  private static final String synX2394String = "%6.3f";
  private static final String synX2393String = "%-15s%-15s%-15s%-15s";
  private static final String synX2392String = "2) ISQ's";
  private static final String synX2391String = "\n";
  private static final String synX2390String = "%";
  private static final String synX2389String = "Total time";
  private static final String synX2388String = "Block(t)";
  private static final String synX2387String = "Starve(t)";
  private static final String synX2386String = "Prod(%)";
  private static final String synX2385String = "State";
  private static final String synX2384String = "Stage";
  private static final String synX2383String = "%6.3f";
  private static final String synX2382String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX2381String = "1) Production Stages";
  private static final String synX2380String = "S5";
  private static final int synX2379int = 2;
  private static final int synX2378int = 2;
  private static final String synX2377String = "S4b";
  private static final double synX2376double = 0.5;
  private static final String synX2375String = "S4a";
  private static final String synX2374String = "S3";
  private static final double synX2373double = 0.5;
  private static final String synX2372String = "S2b";
  private static final int synX2371int = 2;
  private static final int synX2370int = 2;
  private static final String synX2369String = "S2a";
  private static final String synX2368String = "S1";
  private static final String synX2367String = "S0";
  private static final String synX2366String = "Q45";
  private static final String synX2365String = "Q34";
  private static final String synX2364String = "Q23";
  private static final String synX2363String = "Q12";
  private static final String synX2362String = "Q01";
  private static final boolean synX2361boolean = true;
  public Scanner believer;
  public boolean IS_Bug = false;
  public final double LoadDay = 10000000;
  public FilmingCountry inciteFast;
  public Configuration limpid;
  public ArrayList<EntreArrangeDisk> isqNumber;
  public ArrayList<ProcessingScale> urgeScaleRanking;
  public int maximumQ;
  public double drift;
  public double nasty;

  public ProduceCrinkleBoss() {
    this.nasty = (0);
    this.drift = (0);
    this.maximumQ = (0);
  }

  public ProduceCrinkleBoss(double little, double scope, int maximumQDuration) {
    this.nasty = (little);
    this.drift = (scope);
    this.maximumQ = (maximumQDuration);
    this.urgeScaleRanking = (new ArrayList<ProcessingScale>());
    this.isqNumber = (new ArrayList<EntreArrangeDisk>());
    this.inciteFast = (new FilmingCountry(this.urgeScaleRanking));
    this.limpid = (new Configuration(8));
  }

  public synchronized void offsetCultivate() {
    ProcessingScale placeRanked;
    this.engenderFactoryFramework();

    if (IS_Bug) synx384();

    while (this.limpid.becomeTheOpportunity() < this.LoadDay) {
      this.phaseTier();
      placeRanked = (this.limpid.deliverNowWorkforce());
      for (ProcessingScale postscript : this.urgeScaleRanking) synx385(postscript, placeRanked);
      this.labelYdsComponents();

      if (IS_Bug == synX2361boolean) synx386();
    }
    this.hardcopyClassification();

    if (believer != null) believer.close();
  }

  public synchronized void phaseTier() {
    for (ProcessingScale ora : this.urgeScaleRanking) synx387(ora);
  }

  public synchronized void engenderFactoryFramework() {
    EntreArrangeDisk q01, q02, q03, q04, q05;
    ProcessingScale f;
    ProcessingScale s10;
    ProcessingScale s2a;
    ProcessingScale s2b;
    ProcessingScale c2;
    ProcessingScale s4a;
    ProcessingScale s4b;
    ProcessingScale l4;
    q01 = (new EntreArrangeDisk(synX2362String, this.maximumQ));
    q02 = (new EntreArrangeDisk(synX2363String, this.maximumQ));
    q03 = (new EntreArrangeDisk(synX2364String, this.maximumQ));
    q04 = (new EntreArrangeDisk(synX2365String, this.maximumQ));
    q05 = (new EntreArrangeDisk(synX2366String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    f = (new CommencementRostrum(synX2367String, q01, this.nasty, this.drift, this.limpid));
    s10 = (new MiddlePhase(synX2368String, q01, q02, this.nasty, this.drift, this.limpid));
    s2a =
        (new MiddlePhase(
            synX2369String,
            q02,
            q03,
            this.nasty * synX2370int,
            this.drift * synX2371int,
            this.limpid));
    s2b =
        (new MiddlePhase(
            synX2372String, q02, q03, this.nasty, this.drift * synX2373double, this.limpid));
    c2 = (new MiddlePhase(synX2374String, q03, q04, this.nasty, this.drift, this.limpid));
    s4a =
        (new MiddlePhase(
            synX2375String, q04, q05, this.nasty, this.drift * synX2376double, this.limpid));
    s4b =
        (new MiddlePhase(
            synX2377String,
            q04,
            q05,
            this.nasty * synX2378int,
            this.drift * synX2379int,
            this.limpid));
    l4 =
        (new EndStagecoach(
            synX2380String, q05, this.nasty, this.drift, this.inciteFast, this.limpid));
    f.laidGoodGoad(s10);
    s10.arrangeExitedNeedle(f);
    s10.laidGoodGoad(s2a);
    s10.laidGoodGoad(s2b);
    s2a.arrangeExitedNeedle(s10);
    s2a.laidGoodGoad(c2);
    s2b.arrangeExitedNeedle(s10);
    s2b.laidGoodGoad(c2);
    c2.arrangeExitedNeedle(s2a);
    c2.arrangeExitedNeedle(s2b);
    c2.laidGoodGoad(s4a);
    c2.laidGoodGoad(s4b);
    s4a.arrangeExitedNeedle(c2);
    s4a.laidGoodGoad(l4);
    s4b.arrangeExitedNeedle(c2);
    s4b.laidGoodGoad(l4);
    l4.arrangeExitedNeedle(s4a);
    l4.arrangeExitedNeedle(s4b);
    this.urgeScaleRanking.add(f);
    this.urgeScaleRanking.add(s10);
    this.urgeScaleRanking.add(s2a);
    this.urgeScaleRanking.add(s2b);
    this.urgeScaleRanking.add(c2);
    this.urgeScaleRanking.add(s4a);
    this.urgeScaleRanking.add(s4b);
    this.urgeScaleRanking.add(l4);
  }

  public synchronized void fontLimelightStates() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String stimulate, dehydrate, closure;
    sb1 = (new StringBuilder());
    out.println(synX2381String);
    primaryFormat1 = (synX2382String);
    particularFormat1 = (synX2383String);
    out.println(
        String.format(
            primaryFormat1,
            synX2384String,
            synX2385String,
            synX2386String,
            synX2387String,
            synX2388String,
            synX2389String));
    for (ProcessingScale waffen : this.urgeScaleRanking) {
      stimulate =
          (String.format(particularFormat1, waffen.makeDegreeMedManufacturing()) + synX2390String);
      dehydrate = (String.format(particularFormat1, waffen.arriveArenaTotalityAppetite()));
      closure = (String.format(particularFormat1, waffen.developSceneTotHampered()));
      sb1.append(
          String.format(
              primaryFormat1,
              waffen.beatLabelPatronymic(),
              waffen.sustainCantons(),
              stimulate,
              dehydrate,
              closure,
              String.format(particularFormat1, waffen.drawUnconditionalWeekMission())));
      sb1.append(synX2391String);
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String constitute, mariasHour, approxNecessities;
    String enumeration;
    sb2 = (new StringBuilder());
    out.println(synX2392String);
    primaryFormat2 = (synX2393String);
    particularFormat2 = (synX2394String);
    out.println(
        String.format(
            primaryFormat2, synX2395String, synX2396String, synX2397String, synX2398String));
    for (EntreArrangeDisk q : this.isqNumber) {
      constitute = (q.drawGens());
      mariasHour = (String.format(particularFormat2, q.goIsqWaitingClock()));
      approxNecessities = (String.format(particularFormat2, q.goIsqAverageParticularTally()));
      enumeration =
          ((q.isComplete())
              ? String.format(synX2399String, q.comeLatestNumber(), synX2400String)
              : Integer.toString(q.comeLatestNumber()));
      sb2.append(
          String.format(primaryFormat2, constitute, enumeration, mariasHour, approxNecessities));
      sb2.append(synX2401String);
    }
    out.println(sb2.toString());
  }

  public synchronized void labelYdsComponents() {
    for (EntreArrangeDisk q : this.isqNumber) synx388(q);
  }

  public synchronized void impressCourseEnumerate() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> careers;
    sb3 = (new StringBuilder());
    out.println(synX2402String);
    primaryFormat3 = (synX2403String);
    out.println(String.format(primaryFormat3, synX2404String, synX2405String));
    careers = (this.inciteFast.becomeAvenuesFigure());
    for (Map.Entry<String, Double> register : careers.entrySet())
      synx389(sb3, primaryFormat3, register);
    out.println(sb3.toString());
  }

  public synchronized void publicationWorkforceParagraphs() {
    out.println(synX2406String + this.limpid.comeEmploymentNumber());
    out.println(String.format(this.limpid.bringImpressLayouts(), synX2407String, synX2408String));
    out.println(this.limpid.findSubstance());
  }

  public synchronized void publishingLiveDays() {
    out.println(synX2409String + String.format(synX2410String, this.limpid.becomeTheOpportunity()));
  }

  public synchronized void hardcopyClassification() {
    out.println(synX2411String);
    this.publishingLiveDays();
    this.fontLimelightStates();
    this.publishIsqClock();
    this.impressCourseEnumerate();
    this.publicationWorkforceParagraphs();
    out.println(
        synX2412String + this.urgeScaleRanking.get(synX2413int).driveMillionUtensilsConstituted());
    out.println(synX2414String + this.inciteFast.findGrossPoint());

    try {
      Thread.sleep(synX2415int);
    } catch (InterruptedException salaam) {
      err.println(salaam);
    }
  }

  private synchronized void synx384() {
    this.believer = (new Scanner(in));
  }

  private synchronized void synx385(ProcessingScale postscript, ProcessingScale placeRanked) {

    if (postscript != placeRanked)
      postscript.ltdCommonwealthTheo(this.limpid.becomeTheOpportunity());
  }

  private synchronized void synx386() {
    this.hardcopyClassification();
    believer.nextLine();
  }

  private synchronized void synx387(ProcessingScale ora) {
    ora.treatObject(this.limpid.becomeTheOpportunity());
  }

  private synchronized void synx388(EntreArrangeDisk q) {
    q.imprintCalculation();
  }

  private synchronized void synx389(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> register) {
    sb3.append(String.format(primaryFormat3, register.getKey(), register.getValue()));
    sb3.append(synX2416String);
  }
}
