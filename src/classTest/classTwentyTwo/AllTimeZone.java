package classTest.classTwentyTwo;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class AllTimeZone {

    public static void main(String[] args) {

        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        for (String zoneID: zoneIDs){
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneID));
            System.out.println(zoneID + " : " +zonedDateTime.format(formatter));

        }
    }
}
