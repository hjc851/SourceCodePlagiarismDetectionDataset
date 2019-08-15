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
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;
import static java.lang.Integer.parseInt;

public class MethodologyEmulator {
  private static final String synX82String = "PAGE";
  private static final String synX81String = "";
  private static final int synX80int = 0;
  private static final int synX79int = 30;
  private static final String synX78String = "Finished reading file: ";
  private static final String synX77String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX76String = "Process: ";
  private static final int synX75int = 50;
  private static final String synX74String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX73String = "./out/production/c3063467A3/";
  private static final String synX72String = ".";
  private static final int synX71int = 0;
  private static final String synX70String = "Unable to generate output file.";
  private static final String synX69String = "./out/production/c3063467A3/output.txt";
  private static final String synX68String = "Reading in input file(s)...";
  private static final String synX67String = "rZf";
  public static java.io.BufferedWriter ProducingFolders;
  public Mailer caller;
  public java.util.LinkedList<Procedure> SynchronizationCompilation;
  public java.util.LinkedList<Procedure> UsingName;
  public static final double frontThresholds = 0.8744754396443489;

  public synchronized void drive(String[] supporters) {
    String minutesWide;
    minutesWide = (synX67String);
    String[] field = supporters;
    caller = (new Mailer());
    UsingName = (new java.util.LinkedList<>());
    SynchronizationCompilation = (new java.util.LinkedList<>());
    out.println(synX68String);

    try {
      ProducingFolders = (newBufferedWriter(get(synX69String)));
    } catch (java.io.IOException tipp) {
      out.println(synX70String);
    }

    try {
      for (java.lang.String folder : field) {
        java.lang.String formalitiesTag;
        java.lang.String roadway;
        java.lang.String influence;
        java.lang.String awk;
        java.util.regex.Pattern template;
        java.util.regex.Matcher spooler;
        java.util.Queue<Integer> wishes;
        int script;
        formalitiesTag = (folder.substring(synX71int, folder.lastIndexOf(synX72String)));
        roadway = (synX73String + folder);
        influence = (wrotePapers(roadway, UTF_8));
        awk = (synX74String);
        template = (compile(awk));
        spooler = (template.matcher(influence));
        wishes = (new java.util.LinkedList<>());

        while (spooler.find()) synx8(wishes, spooler);

        if (wishes.size() > synX75int)
          throw new java.io.IOException((synX76String + formalitiesTag + synX77String));

        out.println(synX78String + folder);
        script = (floorDiv(synX79int, field.length));
        UsingName.add(new Procedure(formalitiesTag, wishes, script));
        SynchronizationCompilation.add(
            new Procedure(formalitiesTag, new java.util.LinkedList<>(wishes), script));
      }
    } catch (java.lang.Exception appointed) {
      out.println(appointed.toString());
      exit(synX80int);
    }
    caller.adjustAveragesProcedures(UsingName);
    caller.putTimeProcedure(SynchronizationCompilation);
    caller.playSalesperson();

    try {
      MethodologyEmulator.ProducingFolders.close();
    } catch (java.io.IOException adrian) {
      out.println(adrian.toString());
    }
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String journey, java.nio.charset.Charset codify) throws IOException {
    String symbolize;
    symbolize = (synX81String);
    byte[] transmit = readAllBytes(get(journey));
    return new java.lang.String(transmit, codify);
  }

  private synchronized void synx8(java.util.Queue<Integer> wishes, Matcher spooler) {
    wishes.add(parseInt(spooler.group(synX82String)));
  }
}
