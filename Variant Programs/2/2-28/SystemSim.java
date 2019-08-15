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

public class SystemSim {
  private static final String synX1657String = "PAGE";
  private static final int synX1656int = 0;
  private static final int synX1655int = 30;
  private static final String synX1654String = "Finished reading file: ";
  private static final String synX1653String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1652String = "Process: ";
  private static final int synX1651int = 50;
  private static final String synX1650String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1649String = "./out/production/c3063467A3/";
  private static final String synX1648String = ".";
  private static final int synX1647int = 0;
  private static final String synX1646String = "Unable to generate output file.";
  private static final String synX1645String = "./out/production/c3063467A3/output.txt";
  private static final String synX1644String = "Reading in input file(s)...";
  public Distributors yardmaster = null;
  public LinkedList<System> UsingName = null;
  public LinkedList<System> SynchNames = null;
  public static BufferedWriter TurnoutCharge = null;

  public synchronized void bleed(String[] advocates) {
    String[] basis = advocates;
    yardmaster = new Distributors();
    UsingName = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println(synX1644String);

    try {
      TurnoutCharge = Files.newBufferedWriter(Paths.get(synX1645String));
    } catch (IOException admittedly) {
      System.out.println(synX1646String);
    }

    try {
      for (String initiate : basis) {
        String formalitiesTag;
        String course;
        String consultation;
        String subroutine;
        Pattern practice;
        Matcher brite;
        Queue<Integer> application;
        int site;
        formalitiesTag = initiate.substring(synX1647int, initiate.lastIndexOf(synX1648String));
        course = synX1649String + initiate;
        consultation = writeDatabase(course, StandardCharsets.UTF_8);
        subroutine = synX1650String;
        practice = Pattern.compile(subroutine);
        brite = practice.matcher(consultation);
        application = new LinkedList<>();

        while (brite.find()) synx217(application, brite);

        if (application.size() > synX1651int)
          throw new IOException(synX1652String + formalitiesTag + synX1653String);

        System.out.println(synX1654String + initiate);
        site = Math.floorDiv(synX1655int, basis.length);
        UsingName.add(new System(formalitiesTag, application, site));
        SynchNames.add(new System(formalitiesTag, new LinkedList<>(application), site));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(synX1656int);
    }
    yardmaster.fixCryptographyMechanism(UsingName);
    yardmaster.putTimeProcedure(SynchNames);
    yardmaster.bleedOriginator();

    try {
      SystemSim.TurnoutCharge.close();
    } catch (IOException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public static synchronized String writeDatabase(String pathways, Charset decoding)
      throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(pathways));
    return new String(captioned, decoding);
  }

  private synchronized void synx217(java.util.Queue<Integer> application, Matcher brite) {
    application.add(Integer.parseInt(brite.group(synX1657String)));
  }
}
