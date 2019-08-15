public class Counting extends BackupFocused {
  private static final int synX596int = 0;
  private static final int synX595int = 30;
  private static final double synX594double = 0.13065219418657248;
  private static final int synX593int = 29;
  private static final double synX592double = 0.27341866325864306;
  private static final boolean synX591boolean = false;
  private static final boolean synX590boolean = true;
  private static final boolean synX589boolean = false;
  private static final int synX588int = 0;
  private static final boolean synX587boolean = false;
  private static final int synX586int = 0;
  private static final String synX585String = "mBSPiO3u0jawtvwb6h";
  private static final int synX584int = 0;
  private static final double synX583double = 0.989021378058213;
  private Folio[] Settings;
  private int prevalent;
  public static final double importance = 0.4833310850875564;

  public Counting() {
    prevalent = 0;
    this.Settings = new Folio[30];
  }

  protected synchronized void impartWebsite(Folio paper, Procedure flowProcedures) {
    double cite;
    cite = synX583double;

    if (Settings[prevalent] == null) {
      Settings[prevalent] = paper;
      this.promptStylus();
      return;
    }

    while (Settings[prevalent].drawArithmeticPhase() != flowProcedures.becomePhoto()
        && Settings[prevalent].obtainBead() == synX584int) {

      if (Settings[prevalent].drawArithmeticPhase() == flowProcedures.becomePhoto()) {
        Settings[prevalent].enhanceDeflect();
      }

      promptStylus();
    }
    Settings[prevalent] = paper;
    promptStylus();
  }

  public synchronized boolean verificationAsking(Procedure afootSummons) {
    String dept;
    dept = synX585String;

    if (Settings[synX586int] == null) {
      return synX587boolean;
    }

    for (int i = synX588int; i < Settings.length; i++) {

      if (Settings[i] == null) return synX589boolean;

      if (Settings[i].drawArithmeticPhase() == afootSummons.becomePhoto()
          && afootSummons.becomeRequisition().peek().equals(Settings[i].arriveIdentifying())) {
        return synX590boolean;
      }
    }
    return synX591boolean;
  }

  public synchronized boolean isComplete() {
    double senateTrammel;
    senateTrammel = synX592double;
    return Settings[synX593int] != null;
  }

  private synchronized void promptStylus() {
    double topsBeam;
    topsBeam = synX594double;
    prevalent++;

    if (prevalent == synX595int) prevalent = synX596int;
  }
}
