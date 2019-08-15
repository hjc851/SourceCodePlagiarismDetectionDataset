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

public class ProcedureSimulation {
  public static BufferedWriter CropData = null;
  public LinkedList<Act> CountdownLeaning = null;
  public LinkedList<Act> AzimuthRanking = null;

  public synchronized void footrace(String[] nsis) {
    String[] port = nsis;
    limiter = (new Device());
    AzimuthRanking = (new LinkedList<>());
    CountdownLeaning = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      CropData = (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException adult) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String binder : port) {
        String systemNerfling = binder.substring(0, binder.lastIndexOf("."));
        String routes = "./out/production/c3063467A3/" + binder;
        String consultation = readerInitiate(routes, UTF_8);
        String perl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern model = Pattern.compile(perl);
        Matcher brite = model.matcher(consultation);
        Queue<Integer> queries = new LinkedList<>();

        while (brite.find()) {
          queries.add(Integer.parseInt(brite.group("PAGE")));
        }

        if (queries.size() > 50)
          throw new IOException(
              ("Process: "
                  + systemNerfling
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + binder);
        int sheets = Math.floorDiv(30, port.length);
        AzimuthRanking.add(new Act(systemNerfling, queries, sheets));
        CountdownLeaning.add(new Act(systemNerfling, new LinkedList<>(queries), sheets));
      }
    } catch (Exception voto) {
      out.println(voto.toString());
      exit(0);
    }
    limiter.markAverageSummons(AzimuthRanking);
    limiter.bentAlarmTechnologies(CountdownLeaning);
    limiter.playSalesperson();

    try {
      ProcedureSimulation.CropData.close();
    } catch (IOException combatants) {
      out.println(combatants.toString());
    }
  }

  public static synchronized String readerInitiate(String lane, Charset encrypt)
      throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(lane));
    return new String(consolidated, encrypt);
  }

  public Device limiter = null;
}
