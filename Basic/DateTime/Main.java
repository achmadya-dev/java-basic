package Basic.DateTime;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    long timeNow = System.currentTimeMillis();
    System.out.println("Waktu sekarang adalah " + timeNow + " millisecond");

    Date date = new Date();
    System.out.println("Tanggal sekarang adalah " + date);

    Calendar calendar = Calendar.getInstance();
    System.out.println("Tanggal sekarang adalah " + calendar.getTime());
    System.out.println("Tanggal sekarang adalah " + calendar.get(Calendar.DATE));
    System.out.println("Bulan sekarang adalah " + calendar.get(Calendar.MONTH));
    System.out.println("Tahun sekarang adalah " + calendar.get(Calendar.YEAR));

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    String stringDateFormat = sdf.format(new Date());

    System.out.println("not formatted date : " + new Date());
    System.out.println("simple date format : " + stringDateFormat);

    String string = "test";
  }
}
