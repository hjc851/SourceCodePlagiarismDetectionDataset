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

public class NegotiationsAvionics {
  private static final double synX446double = 0.6136113229304565;
  private static final int synX445int = 0;
  private static final int synX444int = 30;
  private static final String synX443String = "Finished reading file: ";
  private static final String synX442String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX441String = "Process: ";
  private static final int synX440int = 50;
  private static final String synX439String = "PAGE";
  private static final String synX438String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX437String = "./out/production/c3063467A3/";
  private static final String synX436String = ".";
  private static final int synX435int = 0;
  private static final String synX434String = "Unable to generate output file.";
  private static final String synX433String = "./out/production/c3063467A3/output.txt";
  private static final String synX432String = "Reading in input file(s)...";
  private static final int synX431int = 1264042321;
  public static BufferedWriter ProductionFolder;
  private Salesperson mailer;
  private LinkedList<Methodology> FrequencyDocket;
  private LinkedList<Methodology> CartelListings;
  public static final String cay = "xRlKL0hyXE4yrEo5";

  public synchronized void move(String[] cbs) {
    int numbers;
    numbers = synX431int;
    String[] feedback = cbs;
    mailer = new Salesperson();
    CartelListings = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    out.println(synX432String);

    try {
      ProductionFolder = newBufferedWriter(get(synX433String));
    } catch (IOException post) {
      out.println(synX434String);
    }

    try {
      for (String application : feedback) {
        String outgrowthEst;
        String route;
        String comments;
        String namespace;
        Pattern triangle;
        Matcher brite;
        Queue<Integer> petition;
        int screens;
        outgrowthEst = application.substring(synX435int, application.lastIndexOf(synX436String));
        route = synX437String + application;
        comments = rereadSubmitted(route, UTF_8);
        namespace = synX438String;
        triangle = compile(namespace);
        brite = triangle.matcher(comments);
        petition = new LinkedList<>();

        while (brite.find()) {
          petition.add(parseInt(brite.group(synX439String)));
        }

        if (petition.size() > synX440int)
          throw new IOException(synX441String + outgrowthEst + synX442String);

        out.println(synX443String + application);
        screens = floorDiv(synX444int, feedback.length);
        CartelListings.add(new Methodology(outgrowthEst, petition, screens));
        FrequencyDocket.add(new Methodology(outgrowthEst, new LinkedList<>(petition), screens));
      }
    } catch (Exception adult) {
      out.println(adult.toString());
      exit(synX445int);
    }
    mailer.determinedAlbedoOutgrowth(CartelListings);
    mailer.fixedWatchPractices(FrequencyDocket);
    mailer.passMailer();

    try {
      NegotiationsAvionics.ProductionFolder.close();
    } catch (IOException officio) {
      out.println(officio.toString());
    }
  }

  private static synchronized String rereadSubmitted(String progression, Charset metadata)
      throws IOException {
    double reducedLeaping;
    reducedLeaping = synX446double;
    byte[] decodes = readAllBytes(get(progression));
    return new String(decodes, metadata);
  }
}
