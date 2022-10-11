package Day_55_MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceStudy_2 {
    public static void main(String[] args) {

        Map<String,Integer> memduh=new HashMap<>();

        memduh.put("alirızabey",25);
        memduh.put("burhanaltintop",24);
        memduh.put("pala",22);
        memduh.put("cabbar",50);
        memduh.put("hüsrevaga",37);
        memduh.put("hüsnücoban",24);
        memduh.put("cerrahpasalihalit",24);
        memduh.put("sungerbob",45);

        Set<String> stringSet=memduh.keySet();
        System.out.println("stringSet = " + stringSet);
        // [sungerbob, pala, hüsnücoban, burhanaltintop, hüsrevaga, cerrahpasalihalit, cabbar, alirızabey]

        Iterator<String> iterator=stringSet.iterator();
        while (iterator.hasNext()){
            String next= iterator.next();
            if (memduh.get(next)>=25){
                iterator.remove();
            }
        }
        System.out.println("memduh = " + memduh);  //  {pala=22, hüsnücoban=24, burhanaltintop=24, cerrahpasalihalit=24}

        for (String abuzer:stringSet){
            System.out.println("abuzer = " + abuzer+"-->"+memduh.get(abuzer));
//            abuzer = pala-->22
//            abuzer = hüsnücoban-->24
//            abuzer = burhanaltintop-->24
//            abuzer = cerrahpasalihalit-->24


        }
    }
    
}
