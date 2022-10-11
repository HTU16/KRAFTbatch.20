package Day_55_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {

    public static void main(String[] args) {

        Map<String,Integer> excalibur=new HashMap<>();
        //put()
        excalibur.put("fatih",1453);
        excalibur.put("kanuni",1526);
        excalibur.put("yavuz",1512);
        //size()
        System.out.println(excalibur.size());  //3

        //get(K)
        System.out.println("excalibur.get(\"yavuz\") = " + excalibur.get("yavuz"));  //1512
        int integer=excalibur.get("yavuz");//unboxed

        //containsKey()
        System.out.println("excalibur.containsKey(1526) = " + excalibur.containsKey("kanuni"));  //true

        //remove()
        System.out.println("excalibur.remove(\"fatih\") = " + excalibur.remove("fatih"));  //1453 yazdı ve fatih i sildi.

        //putAll()
        Map<String,Integer>excalibur2=new HashMap<>();
        excalibur2.put("ferdi",7);
        excalibur2.put("osayi",23);
        excalibur2.put("ardagüler",10);
        excalibur2.put("valencia",null);
        System.out.println("excalibur2 = " + excalibur2);  // {ferdi=7, valencia=null, osayi=23, ardagüler=10}

        //clear()
        excalibur2.clear();
        System.out.println(excalibur2);  // {}
        System.out.println(excalibur);  // {yavuz=1512, kanuni=1526}

        //putIfAbsent()
        System.out.println("excalibur.putIfAbsent(\"kanuni\",1071) = " + excalibur.putIfAbsent("kanuni", 1071)); // 1526

        //getOrDefault
        System.out.println("excalibur.getOrDefault(\"fatih\",1517) = " + excalibur.getOrDefault("fatih", 1517));

        //replace()
        System.out.println( excalibur.replace("kanuni", 1526, 1998)); // true
    }
}
