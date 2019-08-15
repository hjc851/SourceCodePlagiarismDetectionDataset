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

public class PhaseSimulations {
  private static final int synX1455int = 0;
  private static final int synX1454int = 30;
  private static final String synX1453String = "Finished reading file: ";
  private static final String synX1452String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1451String = "Process: ";
  private static final int synX1450int = 50;
  private static final String synX1449String = "PAGE";
  private static final String synX1448String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1447String = "./out/production/c3063467A3/";
  private static final String synX1446String = ".";
  private static final int synX1445int = 0;
  private static final String synX1444String = "Unable to generate output file.";
  private static final String synX1443String = "./out/production/c3063467A3/output.txt";
  private static final String synX1442String = "Reading in input file(s)...";
  private LinkedList<Proceeding> BooleanRegistry;
  private LinkedList<Proceeding> WatchRegistry;
  private Trainmaster mailer;
  public static BufferedWriter ProductivityDocuments;

  public synchronized void extend(String[] incumbents) {
    String[] basis = incumbents;
    mailer = new Trainmaster();
    BooleanRegistry = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    out.println(synX1442String);

    try {
      ProductivityDocuments = newBufferedWriter(get(synX1443String));
    } catch (IOException abel) {
      out.println(synX1444String);
    }

    try {
      for (String submit : basis) {
        String mechanismPicture = submit.substring(synX1445int, submit.lastIndexOf(synX1446String));
        String pathways = synX1447String + submit;
        String consultation = writeDatabase(pathways, UTF_8);
        String ascii = synX1448String;
        Pattern shape = compile(ascii);
        Matcher keyword = shape.matcher(consultation);
        Queue<Integer> orders = new LinkedList<>();

        while (keyword.find()) {
          orders.add(parseInt(keyword.group(synX1449String)));
        }

        if (orders.size() > synX1450int)
          throw new IOException(synX1451String + mechanismPicture + synX1452String);

        out.println(synX1453String + submit);
        int webpages = floorDiv(synX1454int, basis.length);
        BooleanRegistry.add(new Proceeding(mechanismPicture, orders, webpages));
        WatchRegistry.add(new Proceeding(mechanismPicture, new LinkedList<>(orders), webpages));
      }
    } catch (Exception afterwards) {
      out.println(afterwards.toString());
      exit(synX1455int);
    }
    mailer.putHasProcedure(BooleanRegistry);
    mailer.adjustHoursProcedures(WatchRegistry);
    mailer.passMailer();

    try {
      PhaseSimulations.ProductivityDocuments.close();
    } catch (IOException adrian) {
      out.println(adrian.toString());
    }
  }

  private static synchronized String writeDatabase(String step, Charset codec) throws IOException {
    byte[] codified = readAllBytes(get(step));
    return new String(codified, codec);
  }
}
