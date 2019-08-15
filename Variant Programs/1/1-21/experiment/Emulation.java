package experiment;

import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import presenter.*;
import garage.*;
import disc.*;
import static java.lang.String.format;

public class Emulation {

  public Emulation(double sentenceConfine, double authoritativeHateful, double commonStray) {
    this.thingReduce = (sentenceConfine);
    this.canonicalSmall = (authoritativeHateful);
    this.canonicalCompass = (commonStray);
    this.festivalSpooler = (new VenueList());
    this.publisher = (new Fabricator[8]);
    this.depository = (new Memory[5]);
    depository[0] = (new Memory());
    depository[1] = (new Memory());
    depository[2] = (new Memory());
    depository[3] = (new Memory());
    depository[4] = (new Memory());
    publisher[0] = (new SupplierFirst(this.canonicalSmall, this.canonicalCompass, depository[0]));
    publisher[1] =
        (new FilmmakerRadio(
            this.canonicalSmall, this.canonicalCompass, depository[1], depository[0]));
    publisher[2] =
        (new FilmmakerRadio(
            this.canonicalSmall * 2.0, this.canonicalCompass * 2.0, depository[2], depository[1]));
    publisher[3] =
        (new FilmmakerRadio(
            this.canonicalSmall * 2.0, this.canonicalCompass * 2.0, depository[2], depository[1]));
    publisher[4] =
        (new FilmmakerRadio(
            this.canonicalSmall, this.canonicalCompass, depository[3], depository[2]));
    publisher[5] =
        (new FilmmakerRadio(
            this.canonicalSmall * 2.0, this.canonicalCompass * 2.0, depository[4], depository[3]));
    publisher[6] =
        (new FilmmakerRadio(
            this.canonicalSmall * 2.0, this.canonicalCompass * 2.0, depository[4], depository[3]));
    publisher[7] = (new FarmExit(this.canonicalSmall, this.canonicalCompass, depository[4]));
    depository[0].orderedAgain(publisher[1]);
    depository[0].fixedPredecessor(publisher[0]);
    depository[1].orderedAgain(publisher[2], publisher[3]);
    depository[1].fixedPredecessor(publisher[1]);
    depository[2].orderedAgain(publisher[4]);
    depository[2].fixedPredecessor(publisher[2], publisher[3]);
    depository[3].orderedAgain(publisher[5], publisher[6]);
    depository[3].fixedPredecessor(publisher[4]);
    depository[4].orderedAgain(publisher[7]);
    depository[4].fixedPredecessor(publisher[5], publisher[6]);
    this.festivalSpooler.installCeremonies(
        new GrowersMeeting(JunctureJailer.prevalentNow(), GrowersMeeting.TushOffset, publisher[0]));
  }

  public synchronized double momentRestrain() {
    return this.thingReduce;
  }

  private static Emulation prevailingModel = null;
  private Fabricator publisher[] = null;

  public static synchronized Emulation contemporaryFeigning() {
    return prevailingModel;
  }

  private Memory depository[] = null;
  private double canonicalSmall = 0.0;
  private double canonicalCompass = 0.0;
  private VenueList festivalSpooler = null;

  public synchronized void begin() {
    Emulation.prevailingModel = (this);

    while (JunctureJailer.prevalentNow() < this.thingReduce && this.festivalSpooler.weigh() > 0)
      synx129();
    this.publicationMetrics();
  }

  private synchronized void publicationMetrics() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.thingReduce,
            JunctureJailer.prevalentNow(),
            this.canonicalSmall,
            this.canonicalCompass));
    System.out.println(format("Storage Capacity: %d", Memory.safekeepingCurb()));
    System.out.println("ProducibleObject count: " + DepositionalObjet.flowNumbers());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Fabricator leong : publisher) synx130(leong);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory ora : depository) synx131(ora);
    System.out.println(" ----------------------------------------------- ");
  }

  private double thingReduce = 0.0;

  private synchronized void synx129() {
    this.festivalSpooler.comeDemonstration().summonsForum();
  }

  private synchronized void synx130(Fabricator leong) {
    System.out.println(leong.metrics());
  }

  private synchronized void synx131(Memory ora) {
    System.out.println(ora.digits());
  }
}
