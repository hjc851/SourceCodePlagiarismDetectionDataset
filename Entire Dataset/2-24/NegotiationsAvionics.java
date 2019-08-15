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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class NegotiationsAvionics {
  private static final int synX1389int = 0;
  private static final int synX1388int = 30;
  private static final String synX1387String = "Finished reading file: ";
  private static final String synX1386String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1385String = "Process: ";
  private static final int synX1384int = 50;
  private static final String synX1383String = "PAGE";
  private static final String synX1382String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1381String = "./out/production/c3063467A3/";
  private static final String synX1380String = ".";
  private static final int synX1379int = 0;
  private static final String synX1378String = "Unable to generate output file.";
  private static final String synX1377String = "./out/production/c3063467A3/output.txt";
  private static final String synX1376String = "Reading in input file(s)...";
  public static java.io.BufferedWriter PowerApplication;
  public Exporter retailer;
  public java.util.LinkedList<Proceedings> SynchronizationCompilation;
  public java.util.LinkedList<Proceedings> AveragesCompendium;

  public synchronized void race(String[] whys) {
    String[] commentary = whys;
    retailer = new Exporter();
    AveragesCompendium = new java.util.LinkedList<>();
    SynchronizationCompilation = new java.util.LinkedList<>();
    System.out.println(synX1376String);

    try {
      PowerApplication = newBufferedWriter(get(synX1377String));
    } catch (java.io.IOException appointed) {
      System.out.println(synX1378String);
    }

    try {
      for (java.lang.String folders : commentary) {
        java.lang.String serveHandle;
        java.lang.String journey;
        java.lang.String advice;
        java.lang.String subroutine;
        java.util.regex.Pattern design;
        java.util.regex.Matcher gobo;
        java.util.Queue<Integer> applications;
        int slips;
        serveHandle = folders.substring(synX1379int, folders.lastIndexOf(synX1380String));
        journey = synX1381String + folders;
        advice = studyPaperwork(journey, StandardCharsets.UTF_8);
        subroutine = synX1382String;
        design = compile(subroutine);
        gobo = design.matcher(advice);
        applications = new java.util.LinkedList<>();

        while (gobo.find()) {
          applications.add(parseInt(gobo.group(synX1383String)));
        }

        if (applications.size() > synX1384int)
          throw new java.io.IOException(synX1385String + serveHandle + synX1386String);

        System.out.println(synX1387String + folders);
        slips = floorDiv(synX1388int, commentary.length);
        AveragesCompendium.add(new Proceedings(serveHandle, applications, slips));
        SynchronizationCompilation.add(
            new Proceedings(serveHandle, new java.util.LinkedList<>(applications), slips));
      }
    } catch (java.lang.Exception tipp) {
      System.out.println(tipp.toString());
      exit(synX1389int);
    }
    retailer.determineCartelProces(AveragesCompendium);
    retailer.adjustHoursProcedures(SynchronizationCompilation);
    retailer.ramRegulator();

    try {
      NegotiationsAvionics.PowerApplication.close();
    } catch (java.io.IOException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String approach, java.nio.charset.Charset cipher) throws IOException {
    byte[] stored = readAllBytes(get(approach));
    return new java.lang.String(stored, cipher);
  }
}
