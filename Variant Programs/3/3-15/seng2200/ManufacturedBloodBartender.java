package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ManufacturedBloodBartender {
  private static final boolean synX1399boolean = false;
  private static final int synX1398int = 100;
  private static final String synX1397String = "Total Items Finished: ";
  private static final int synX1396int = 0;
  private static final String synX1395String = "Total items Created: ";
  private static final String synX1394String = "Simulation's Final Snapshot";
  private static final String synX1393String = "%6.3f";
  private static final String synX1392String = "Current time: ";
  private static final String synX1391String = "Remaining Duration";
  private static final String synX1390String = "Job";
  private static final String synX1389String = "4) Job Count: ";
  private static final String synX1388String = "\n";
  private static final String synX1387String = "total Items";
  private static final String synX1386String = "Path";
  private static final String synX1385String = "%-30s%-15s";
  private static final String synX1384String = "3) Paths";
  private static final String synX1383String = "\n";
  private static final String synX1382String = "FULL";
  private static final String synX1381String = "%-5s%-5s";
  private static final String synX1380String = "ave(items)";
  private static final String synX1379String = "ave(t)";
  private static final String synX1378String = "Item Count";
  private static final String synX1377String = "ISQ";
  private static final String synX1376String = "%6.3f";
  private static final String synX1375String = "%-15s%-15s%-15s%-15s";
  private static final String synX1374String = "2) ISQ's";
  private static final String synX1373String = "\n";
  private static final String synX1372String = "%";
  private static final String synX1371String = "Total time";
  private static final String synX1370String = "Block(t)";
  private static final String synX1369String = "Starve(t)";
  private static final String synX1368String = "Prod(%)";
  private static final String synX1367String = "State";
  private static final String synX1366String = "Stage";
  private static final String synX1365String = "%6.3f";
  private static final String synX1364String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX1363String = "1) Production Stages";
  private static final String synX1362String = "S5";
  private static final int synX1361int = 2;
  private static final int synX1360int = 2;
  private static final String synX1359String = "S4b";
  private static final double synX1358double = 0.5;
  private static final String synX1357String = "S4a";
  private static final String synX1356String = "S3";
  private static final double synX1355double = 0.5;
  private static final String synX1354String = "S2b";
  private static final int synX1353int = 2;
  private static final int synX1352int = 2;
  private static final String synX1351String = "S2a";
  private static final String synX1350String = "S1";
  private static final String synX1349String = "S0";
  private static final String synX1348String = "Q45";
  private static final String synX1347String = "Q34";
  private static final String synX1346String = "Q23";
  private static final String synX1345String = "Q12";
  private static final String synX1344String = "Q01";
  private static final boolean synX1343boolean = true;
  public double intend;
  public double orbit;
  public int maximumQ;
  public java.util.ArrayList<FilmingPlace> stimulateArenaCompendium;
  public java.util.ArrayList<MainSpotlightWarehouses> isqNumber;
  public seng2200.Organizer conjunction;
  public seng2200.DevelopmentStatehood spurQuick;
  public final double LoadDay = 10000000;
  public boolean IS_Bug;
  public java.util.Scanner lecturer;

  public ManufacturedBloodBartender() {
    this.intend = (0);
    this.orbit = (0);
    this.maximumQ = (0);
  }

  public ManufacturedBloodBartender(double equate, double straddle, int maximumQDuration) {
    this.intend = (equate);
    this.orbit = (straddle);
    this.maximumQ = (maximumQDuration);
    this.stimulateArenaCompendium = (new java.util.ArrayList<FilmingPlace>());
    this.isqNumber = (new java.util.ArrayList<MainSpotlightWarehouses>());
    this.spurQuick = (new seng2200.DevelopmentStatehood(this.stimulateArenaCompendium));
    this.conjunction = (new seng2200.Organizer(8));
  }

  public synchronized void goPlay() {
    seng2200.FilmingPlace legComplete;
    this.promoteProducesBuildings();

    if (IS_Bug) {
      this.lecturer = (new java.util.Scanner(in));
    }

    while (this.conjunction.makeIncumbentDay() < this.LoadDay) {
      this.methodsPart();
      legComplete = (this.conjunction.operateSoonAssignment());
      for (seng2200.FilmingPlace cern : this.stimulateArenaCompendium) {

        if (cern != legComplete) cern.pickeringTerritoryLeh(this.conjunction.makeIncumbentDay());
      }
      this.postalPerThings();

      if (IS_Bug == synX1343boolean) {
        this.impressDesignation();
        lecturer.nextLine();
      }
    }
    this.impressDesignation();

    if (lecturer != null) lecturer.close();
  }

  public synchronized void methodsPart() {
    for (seng2200.FilmingPlace ora : this.stimulateArenaCompendium) {
      ora.summonsIngredient(this.conjunction.makeIncumbentDay());
    }
  }

  public synchronized void promoteProducesBuildings() {
    seng2200.MainSpotlightWarehouses q01, q02, q03, q04, q05;
    q01 = (new seng2200.MainSpotlightWarehouses(synX1344String, this.maximumQ));
    q02 = (new seng2200.MainSpotlightWarehouses(synX1345String, this.maximumQ));
    q03 = (new seng2200.MainSpotlightWarehouses(synX1346String, this.maximumQ));
    q04 = (new seng2200.MainSpotlightWarehouses(synX1347String, this.maximumQ));
    q05 = (new seng2200.MainSpotlightWarehouses(synX1348String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.FilmingPlace np =
        new seng2200.PartArena(synX1349String, q01, this.intend, this.orbit, this.conjunction);
    seng2200.FilmingPlace c2 =
        new seng2200.MidyearPoint(
            synX1350String, q01, q02, this.intend, this.orbit, this.conjunction);
    seng2200.FilmingPlace s2a =
        new seng2200.MidyearPoint(
            synX1351String,
            q02,
            q03,
            this.intend * synX1352int,
            this.orbit * synX1353int,
            this.conjunction);
    seng2200.FilmingPlace s2b =
        new seng2200.MidyearPoint(
            synX1354String, q02, q03, this.intend, this.orbit * synX1355double, this.conjunction);
    seng2200.FilmingPlace a3 =
        new seng2200.MidyearPoint(
            synX1356String, q03, q04, this.intend, this.orbit, this.conjunction);
    seng2200.FilmingPlace s4a =
        new seng2200.MidyearPoint(
            synX1357String, q04, q05, this.intend, this.orbit * synX1358double, this.conjunction);
    seng2200.FilmingPlace s4b =
        new seng2200.MidyearPoint(
            synX1359String,
            q04,
            q05,
            this.intend * synX1360int,
            this.orbit * synX1361int,
            this.conjunction);
    seng2200.FilmingPlace l4 =
        new seng2200.SeniorStep(
            synX1362String, q05, this.intend, this.orbit, this.spurQuick, this.conjunction);
    np.fitRightfieldJab(c2);
    c2.orderedWentImpel(np);
    c2.fitRightfieldJab(s2a);
    c2.fitRightfieldJab(s2b);
    s2a.orderedWentImpel(c2);
    s2a.fitRightfieldJab(a3);
    s2b.orderedWentImpel(c2);
    s2b.fitRightfieldJab(a3);
    a3.orderedWentImpel(s2a);
    a3.orderedWentImpel(s2b);
    a3.fitRightfieldJab(s4a);
    a3.fitRightfieldJab(s4b);
    s4a.orderedWentImpel(a3);
    s4a.fitRightfieldJab(l4);
    s4b.orderedWentImpel(a3);
    s4b.fitRightfieldJab(l4);
    l4.orderedWentImpel(s4a);
    l4.orderedWentImpel(s4b);
    this.stimulateArenaCompendium.add(np);
    this.stimulateArenaCompendium.add(c2);
    this.stimulateArenaCompendium.add(s2a);
    this.stimulateArenaCompendium.add(s2b);
    this.stimulateArenaCompendium.add(a3);
    this.stimulateArenaCompendium.add(s4a);
    this.stimulateArenaCompendium.add(s4b);
    this.stimulateArenaCompendium.add(l4);
  }

  public synchronized void hardcopyDegreeHurry() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println(synX1363String);
    java.lang.String primaryFormat1 = synX1364String;
    java.lang.String particularFormat1 = synX1365String;
    java.lang.String urging, dehydrate, lug;
    out.println(
        format(
            primaryFormat1,
            synX1366String,
            synX1367String,
            synX1368String,
            synX1369String,
            synX1370String,
            synX1371String));
    for (seng2200.FilmingPlace fh : this.stimulateArenaCompendium) {
      urging = (format(particularFormat1, fh.catchMomentLongExtraction()) + synX1372String);
      dehydrate = (format(particularFormat1, fh.fetchStepCombinedFeed()));
      lug = (format(particularFormat1, fh.catchMomentFullStalled()));
      sb1.append(
          format(
              primaryFormat1,
              fh.obtainUrgingAdvert(),
              fh.catchExpress(),
              urging,
              dehydrate,
              lug,
              format(particularFormat1, fh.takeCompletePeriodOperating())));
      sb1.append(synX1373String);
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println(synX1374String);
    java.lang.String primaryFormat2 = synX1375String;
    java.lang.String particularFormat2 = synX1376String;
    java.lang.String cite, barcelonaMeter, chickenComponents;
    java.lang.String numbers;
    out.println(
        format(primaryFormat2, synX1377String, synX1378String, synX1379String, synX1380String));
    for (seng2200.MainSpotlightWarehouses q : this.isqNumber) {
      cite = (q.obtainAdvert());
      barcelonaMeter = (format(particularFormat2, q.goIsqWaitingClock()));
      chickenComponents = (format(particularFormat2, q.goIsqAverageParticularTally()));
      numbers =
          ((q.isComplete())
              ? format(synX1381String, q.becomeTheFigure(), synX1382String)
              : java.lang.Integer.toString(q.becomeTheFigure()));
      sb2.append(format(primaryFormat2, cite, numbers, barcelonaMeter, chickenComponents));
      sb2.append(synX1383String);
    }
    out.println(sb2.toString());
  }

  public synchronized void postalPerThings() {
    for (seng2200.MainSpotlightWarehouses q : this.isqNumber) {
      q.moldMatter();
    }
  }

  public synchronized void publishingRoutesMatter() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println(synX1384String);
    java.lang.String primaryFormat3 = synX1385String;
    out.println(format(primaryFormat3, synX1386String, synX1387String));
    java.util.Map<String, Double> journey = this.spurQuick.catchTrailsNumeration();
    for (Entry<String, Double> entrance : journey.entrySet()) {
      sb3.append(format(primaryFormat3, entrance.getKey(), entrance.getValue()));
      sb3.append(synX1388String);
    }
    out.println(sb3.toString());
  }

  public synchronized void reprintCaperGist() {
    out.println(synX1389String + this.conjunction.goWorkTally());
    out.println(format(this.conjunction.receivePrintersTemplate(), synX1390String, synX1391String));
    out.println(this.conjunction.catchComponents());
  }

  public synchronized void publicationsRifeWhen() {
    out.println(synX1392String + format(synX1393String, this.conjunction.makeIncumbentDay()));
  }

  public synchronized void impressDesignation() {
    out.println(synX1394String);
    this.publicationsRifeWhen();
    this.hardcopyDegreeHurry();
    this.publishIsqClock();
    this.publishingRoutesMatter();
    this.reprintCaperGist();
    out.println(
        synX1395String
            + this.stimulateArenaCompendium.get(synX1396int).makeAmountArtifactsDevised());
    out.println(synX1397String + this.spurQuick.becomeSummatePurchases());

    try {
      sleep(synX1398int);
    } catch (java.lang.InterruptedException ej) {
      err.println(ej);
    }
  }

  {
    IS_Bug = (synX1399boolean);
  }
}
