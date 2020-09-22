import java.util.*;

public class TestFormats {

    public static void main(String[] args) {
        int one = 123456;
        double two = 123456.789;
        String s = String.format("%tr", new Date());
        System.out.println(s);
        Date today = new Date();
        String s1 = String.format("%tA, %<tB %<td", today);
        System.out.println(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Yerevan"));
        calendar.set(2004,0,7,15,40);
        long day1=calendar.getTimeInMillis();
        day1+=1000*60*60;
        calendar.setTimeInMillis(day1);
//        System.out.println(day1);
        System.out.println("new hour " + calendar.get(Calendar.HOUR_OF_DAY));
        calendar.add(Calendar.DATE, 35);
        System.out.println("add 35 days " +calendar.getTime());
        calendar.roll(Calendar.DATE, 35);
        System.out.println("roll 35 day " + calendar.getTime());
        calendar.set(Calendar.DATE, 1);
        System.out.println(calendar.getTime());

//        ArrayList<String> list = new ArrayList<String >();
//        ArrayList<Honey> a = Collections.list(Honey a);
    }

}
