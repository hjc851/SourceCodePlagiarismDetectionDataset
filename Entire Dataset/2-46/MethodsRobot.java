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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class MethodsRobot {
  private static final String synX2531String = "PAGE";
  private static final int synX2530int = 0;
  private static final int synX2529int = 30;
  private static final String synX2528String = "Finished reading file: ";
  private static final String synX2527String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2526String = "Process: ";
  private static final int synX2525int = 50;
  private static final String synX2524String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2523String = "./out/production/c3063467A3/";
  private static final String synX2522String = ".";
  private static final int synX2521int = 0;
  private static final String synX2520String = "Unable to generate output file.";
  private static final String synX2519String = "./out/production/c3063467A3/output.txt";
  private static final String synX2518String = "Reading in input file(s)...";

  public static synchronized java.lang.String wrotePapers(
      java.lang.String trail, java.nio.charset.Charset encrypting) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(interlaced, encrypting);
  }

  public Sender retailer;
  public static java.io.BufferedWriter VolumeArchiving;
  public java.util.LinkedList<Procedures> AlbedoBlacklist;
  public java.util.LinkedList<Procedures> MeterDirectory;

  public synchronized void bleed(String[] advocates) {
    String[] field = advocates;
    retailer = (new Sender());
    AlbedoBlacklist = (new java.util.LinkedList<>());
    MeterDirectory = (new java.util.LinkedList<>());
    out.println(synX2518String);

    try {
      VolumeArchiving =
          (java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2519String)));
    } catch (java.io.IOException con) {
      out.println(synX2520String);
    }

    try {
      for (java.lang.String filename : field) {
        java.lang.String systemNerfling =
            filename.substring(synX2521int, filename.lastIndexOf(synX2522String));
        java.lang.String road = synX2523String + filename;
        java.lang.String opinion = wrotePapers(road, UTF_8);
        java.lang.String parse = synX2524String;
        java.util.regex.Pattern formula = java.util.regex.Pattern.compile(parse);
        java.util.regex.Matcher converter = formula.matcher(opinion);
        java.util.Queue<Integer> pleas = new java.util.LinkedList<>();

        while (converter.find()) synx445(pleas, converter);

        if (pleas.size() > synX2525int)
          throw new java.io.IOException((synX2526String + systemNerfling + synX2527String));

        out.println(synX2528String + filename);
        int chapters = java.lang.Math.floorDiv(synX2529int, field.length);
        AlbedoBlacklist.add(new Procedures(systemNerfling, pleas, chapters));
        MeterDirectory.add(
            new Procedures(systemNerfling, new java.util.LinkedList<>(pleas), chapters));
      }
    } catch (java.lang.Exception tipp) {
      out.println(tipp.toString());
      exit(synX2530int);
    }
    retailer.adjustAveragesProcedures(AlbedoBlacklist);
    retailer.arrangeSynchronizationMethods(MeterDirectory);
    retailer.ramRegulator();

    try {
      MethodsRobot.VolumeArchiving.close();
    } catch (java.io.IOException former) {
      out.println(former.toString());
    }
  }

  private synchronized void synx445(java.util.Queue<Integer> pleas, Matcher converter) {
    pleas.add(java.lang.Integer.parseInt(converter.group(synX2531String)));
  }
}
