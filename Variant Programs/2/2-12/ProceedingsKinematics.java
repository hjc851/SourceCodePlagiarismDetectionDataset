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
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;
import static java.lang.Integer.parseInt;

public class ProceedingsKinematics {
  private static final String synX918String = "PAGE";
  private static final double synX917double = 0.2837336314645018;
  private static final int synX916int = 0;
  private static final int synX915int = 30;
  private static final String synX914String = "Finished reading file: ";
  private static final String synX913String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX912String = "Process: ";
  private static final int synX911int = 50;
  private static final String synX910String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX909String = "./out/production/c3063467A3/";
  private static final String synX908String = ".";
  private static final int synX907int = 0;
  private static final String synX906String = "Unable to generate output file.";
  private static final String synX905String = "./out/production/c3063467A3/output.txt";
  private static final String synX904String = "Reading in input file(s)...";
  private static final double synX903double = 0.7180920845785657;
  public static java.io.BufferedWriter IntensityReadme = null;
  public Dealer distributor = null;
  public java.util.LinkedList<Litigate> SynchronizationCompilation = null;
  public java.util.LinkedList<Litigate> AutocorrelationShortlist = null;
  static double threshold = 0.1806334925019477;

  public synchronized void bleed(String[] supporters) {
    double winder;
    winder = (synX903double);
    String[] entrance = supporters;
    distributor = (new Dealer());
    AutocorrelationShortlist = (new java.util.LinkedList<>());
    SynchronizationCompilation = (new java.util.LinkedList<>());
    System.out.println(synX904String);

    try {
      IntensityReadme = (newBufferedWriter(get(synX905String)));
    } catch (java.io.IOException afterwards) {
      System.out.println(synX906String);
    }

    try {
      for (java.lang.String documents : entrance) {
        java.lang.String mechanismsSecurity;
        java.lang.String route;
        java.lang.String perspective;
        java.lang.String namespace;
        java.util.regex.Pattern normal;
        java.util.regex.Matcher brite;
        java.util.Queue<Integer> queries;
        int webpages;
        mechanismsSecurity =
            (documents.substring(synX907int, documents.lastIndexOf(synX908String)));
        route = (synX909String + documents);
        perspective = (recordExecutable(route, StandardCharsets.UTF_8));
        namespace = (synX910String);
        normal = (compile(namespace));
        brite = (normal.matcher(perspective));
        queries = (new java.util.LinkedList<>());

        while (brite.find()) synx103(queries, brite);

        if (queries.size() > synX911int)
          throw new java.io.IOException((synX912String + mechanismsSecurity + synX913String));

        System.out.println(synX914String + documents);
        webpages = (floorDiv(synX915int, entrance.length));
        AutocorrelationShortlist.add(new Litigate(mechanismsSecurity, queries, webpages));
        SynchronizationCompilation.add(
            new Litigate(mechanismsSecurity, new java.util.LinkedList<>(queries), webpages));
      }
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
      exit(synX916int);
    }
    distributor.fixCryptographyMechanism(AutocorrelationShortlist);
    distributor.adjustHoursProcedures(SynchronizationCompilation);
    distributor.prevailDistributor();

    try {
      ProceedingsKinematics.IntensityReadme.close();
    } catch (java.io.IOException libris) {
      System.out.println(libris.toString());
    }
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String approach, java.nio.charset.Charset encrypt) throws IOException {
    double confine;
    confine = (synX917double);
    byte[] programmed = readAllBytes(get(approach));
    return new java.lang.String(programmed, encrypt);
  }

  private synchronized void synx103(java.util.Queue<Integer> queries, Matcher brite) {
    queries.add(parseInt(brite.group(synX918String)));
  }
}
