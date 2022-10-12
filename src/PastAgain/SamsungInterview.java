package PastAgain;
import  java.util.*;

public class SamsungInterview {

    public static void main(String[] args) {

        String samsung="&samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2,\n" +
                " WA48J7700AW/AA',20916," +
                "&samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV,\n" +
                " WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995," +
                "&samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M',\n" +
                " 22970,&samsung,'Samsung DC97-17022B Assy Detergent',32959," +
                "&samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,&samsung,\n" +
                " 'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000," +
                "&samsung,'Samsung DC97-16991A Assembly Filter',13000\n ";

        String[] split = samsung.split("&");
           System.out.println(Arrays.toString(split));
          System.out.println("split.length = " + split.length);

        List <String> stringList =new ArrayList<>(Arrays.asList(split));
         System.out.println("stringList = " + stringList);
        stringList.remove(0);
         System.out.println("stringList = " + stringList);

         System.out.println("stringList.size() = " + stringList.size());

        for (String string:stringList ) {
            System.out.println("string = " + string);
        }







    }

}
