import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class TreatModelling {
  private static final double synX800double = 0.9470291200000294;
  private static final int synX799int = 0;
  private static final int synX798int = 30;
  private static final String synX797String = "Finished reading file: ";
  private static final String synX796String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX795String = "Process: ";
  private static final int synX794int = 50;
  private static final String synX793String = "PAGE";
  private static final String synX792String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX791String = "./out/production/c3063467A3/";
  private static final String synX790String = ".";
  private static final int synX789int = 0;
  private static final String synX788String = "Unable to generate output file.";
  private static final String synX787String = "./out/production/c3063467A3/output.txt";
  private static final String synX786String = "Reading in input file(s)...";
  private static final double synX785double = 0.04896237154409577;
  public static java.io.BufferedWriter IntensityReadme = null;
  private Mailer trainmaster = null;
  private java.util.LinkedList<Proceedings> SynchronizingAgenda = null;
  private java.util.LinkedList<Proceedings> ReplacementTilt = null;
  public static final double johannesBeam = 0.4029842439740505;

  public synchronized void move(String[] supporters) {
    double hand;
    hand = synX785double;
    String[] commentary = supporters;
    trainmaster = new Mailer();
    ReplacementTilt = new java.util.LinkedList<>();
    SynchronizingAgenda = new java.util.LinkedList<>();
    System.out.println(synX786String);

    try {
      IntensityReadme =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX787String));
    } catch (java.io.IOException late) {
      System.out.println(synX788String);
    }

    try {
      for (java.lang.String charge : commentary) {
        java.lang.String mechanismsSecurity;
        java.lang.String routes;
        java.lang.String information;
        java.lang.String grep;
        java.util.regex.Pattern formula;
        java.util.regex.Matcher spooler;
        java.util.Queue<Integer> appeals;
        int slides;
        mechanismsSecurity = charge.substring(synX789int, charge.lastIndexOf(synX790String));
        routes = synX791String + charge;
        information = aloudApplication(routes, StandardCharsets.UTF_8);
        grep = synX792String;
        formula = java.util.regex.Pattern.compile(grep);
        spooler = formula.matcher(information);
        appeals = new java.util.LinkedList<>();

        while (spooler.find()) {
          appeals.add(java.lang.Integer.parseInt(spooler.group(synX793String)));
        }

        if (appeals.size() > synX794int)
          throw new java.io.IOException(synX795String + mechanismsSecurity + synX796String);

        System.out.println(synX797String + charge);
        slides = java.lang.Math.floorDiv(synX798int, commentary.length);
        ReplacementTilt.add(new Proceedings(mechanismsSecurity, appeals, slides));
        SynchronizingAgenda.add(
            new Proceedings(mechanismsSecurity, new java.util.LinkedList<>(appeals), slides));
      }
    } catch (java.lang.Exception aba) {
      System.out.println(aba.toString());
      exit(synX799int);
    }
    trainmaster.markAverageSummons(ReplacementTilt);
    trainmaster.placeMeterSystems(SynchronizingAgenda);
    trainmaster.goTrainmaster();

    try {
      TreatModelling.IntensityReadme.close();
    } catch (java.io.IOException voto) {
      System.out.println(voto.toString());
    }
  }

  private static synchronized java.lang.String aloudApplication(
      java.lang.String step, java.nio.charset.Charset cipher) throws IOException {
    double maximal;
    maximal = synX800double;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(interleaves, cipher);
  }
}
