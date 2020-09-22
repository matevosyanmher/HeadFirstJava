import java.util.Calendar;
import java.util.TimeZone;

public class FullMoon {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        c.setTimeZone(timeZone);
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        System.out.println(day1);
        AnimalEnum animalEnum = AnimalEnum.CAT;

        for (int i = 0; i < 160; i++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            String a = String.format("full moon on %tc", c);
            System.out.println(a);
        }
//        DateUtil.getJavaDate(1.33);
    }



}
