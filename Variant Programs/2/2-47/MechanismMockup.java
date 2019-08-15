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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class MechanismMockup {
  private static final double synX2638double = 0.8439196687573497;
  private static final int synX2637int = 0;
  private static final int synX2636int = 30;
  private static final String synX2635String = "Finished reading file: ";
  private static final String synX2634String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2633String = "Process: ";
  private static final int synX2632int = 50;
  private static final String synX2631String = "PAGE";
  private static final String synX2630String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2629String = "./out/production/c3063467A3/";
  private static final String synX2628String = ".";
  private static final int synX2627int = 0;
  private static final String synX2626String = "Unable to generate output file.";
  private static final String synX2625String = "./out/production/c3063467A3/output.txt";
  private static final String synX2624String = "Reading in input file(s)...";
  private static final String synX2623String = "QyZz";
  public java.util.LinkedList<Outgrowth> EstimationPlaylist;

  public synchronized void move(String[] nii) {
    String beam = synX2623String;
    String[] information = nii;
    vendor = new Limiter();
    EstimationPlaylist = new java.util.LinkedList<>();
    CountingLitany = new java.util.LinkedList<>();
    out.println(synX2624String);

    try {
      VolumeArchiving = newBufferedWriter(get(synX2625String));
    } catch (java.io.IOException admittedly) {
      out.println(synX2626String);
    }

    try {
      for (java.lang.String submit : information) {
        java.lang.String systemNerfling =
            submit.substring(synX2627int, submit.lastIndexOf(synX2628String));
        java.lang.String trails = synX2629String + submit;
        java.lang.String component = takeDocument(trails, UTF_8);
        java.lang.String malloc = synX2630String;
        java.util.regex.Pattern phenomenon = compile(malloc);
        java.util.regex.Matcher validator = phenomenon.matcher(component);
        java.util.Queue<Integer> complaints = new java.util.LinkedList<>();

        while (validator.find()) {
          complaints.add(parseInt(validator.group(synX2631String)));
        }

        if (complaints.size() > synX2632int)
          throw new java.io.IOException(synX2633String + systemNerfling + synX2634String);

        out.println(synX2635String + submit);
        int screens = floorDiv(synX2636int, information.length);
        EstimationPlaylist.add(new Outgrowth(systemNerfling, complaints, screens));
        CountingLitany.add(
            new Outgrowth(systemNerfling, new java.util.LinkedList<>(complaints), screens));
      }
    } catch (java.lang.Exception abel) {
      out.println(abel.toString());
      exit(synX2637int);
    }
    vendor.determineCartelProces(EstimationPlaylist);
    vendor.dictatedClockworkWork(CountingLitany);
    vendor.endureRetailer();

    try {
      MechanismMockup.VolumeArchiving.close();
    } catch (java.io.IOException appointed) {
      out.println(appointed.toString());
    }
  }

  public java.util.LinkedList<Outgrowth> CountingLitany;
  public Limiter vendor;
  public static double superiorTethered = 0.48792312245620817;
  public static java.io.BufferedWriter VolumeArchiving;

  public static synchronized java.lang.String takeDocument(
      java.lang.String route, java.nio.charset.Charset code) throws IOException {
    double cost = synX2638double;
    byte[] programmed = readAllBytes(get(route));
    return new java.lang.String(programmed, code);
  }
}
