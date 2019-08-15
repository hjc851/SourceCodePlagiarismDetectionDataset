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

public class ProceedingsKinematics {
  private static final String synX682String = "PAGE";
  private static final String synX681String = "W0tuKaoZKHuice3D";
  private static final int synX680int = 0;
  private static final int synX679int = 30;
  private static final String synX678String = "Finished reading file: ";
  private static final String synX677String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX676String = "Process: ";
  private static final int synX675int = 50;
  private static final String synX674String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX673String = "./out/production/c3063467A3/";
  private static final String synX672String = ".";
  private static final int synX671int = 0;
  private static final String synX670String = "Unable to generate output file.";
  private static final String synX669String = "./out/production/c3063467A3/output.txt";
  private static final String synX668String = "Reading in input file(s)...";
  private static final int synX667int = -1560451879;
  static final String breadth = "kbeDhsdPOflDG5";
  public LinkedList<Summons> AutocorrelationShortlist;
  public LinkedList<Summons> MeterDirectory;
  public Starter salesperson;
  public static BufferedWriter ProductivityDocuments;

  public synchronized void go(String[] establishment) {
    int critical = synX667int;
    String[] ante = establishment;
    salesperson = new Starter();
    AutocorrelationShortlist = new LinkedList<>();
    MeterDirectory = new LinkedList<>();
    out.println(synX668String);

    try {
      ProductivityDocuments = Files.newBufferedWriter(Paths.get(synX669String));
    } catch (IOException adrian) {
      out.println(synX670String);
    }

    try {
      for (String document : ante) {
        String formalitiesTag = document.substring(synX671int, document.lastIndexOf(synX672String));
        String pathway = synX673String + document;
        String advice = proofreadComplaint(pathway, UTF_8);
        String syntactician = synX674String;
        Pattern template = Pattern.compile(syntactician);
        Matcher converter = template.matcher(advice);
        Queue<Integer> submissions = new LinkedList<>();

        while (converter.find()) synx84(submissions, converter);

        if (submissions.size() > synX675int)
          throw new IOException(synX676String + formalitiesTag + synX677String);

        out.println(synX678String + document);
        int toner = Math.floorDiv(synX679int, ante.length);
        AutocorrelationShortlist.add(new Summons(formalitiesTag, submissions, toner));
        MeterDirectory.add(new Summons(formalitiesTag, new LinkedList<>(submissions), toner));
      }
    } catch (Exception former) {
      out.println(former.toString());
      exit(synX680int);
    }
    salesperson.arrangeBetasMethods(AutocorrelationShortlist);
    salesperson.dictatedClockworkWork(MeterDirectory);
    salesperson.workForwarder();

    try {
      ProceedingsKinematics.ProductivityDocuments.close();
    } catch (IOException late) {
      out.println(late.toString());
    }
  }

  public static synchronized String proofreadComplaint(String ride, Charset crypto)
      throws IOException {
    String significant = synX681String;
    byte[] ciphered = Files.readAllBytes(Paths.get(ride));
    return new String(ciphered, crypto);
  }

  private synchronized void synx84(java.util.Queue<Integer> submissions, Matcher converter) {
    submissions.add(Integer.parseInt(converter.group(synX682String)));
  }
}
