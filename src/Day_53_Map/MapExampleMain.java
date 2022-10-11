package Day_53_Map;

import java.util.Map;
import java.util.TreeMap;

public class MapExampleMain {

    public static void main(String[] args) {

        Map<Integer,Ogrenci> okul=new TreeMap<>();

        Ogrenci ogr1=new Ogrenci("h.talha","uysal",53);
        Ogrenci ogr2=new Ogrenci("süleyman","çakır",89);
        Ogrenci ogr3=new Ogrenci("memati","baş",76);
        Ogrenci ogr4=new Ogrenci("mehmet","karahanlı",20);

        okul.put(978,ogr4);
        okul.put(133,ogr3);
        okul.put(1071,ogr2);
        okul.put(1299,ogr1);
        okul.put(1453,new Ogrenci("laz","ziya",10));

        okul.get(1071).setAverageNote(94.8);
        System.out.println(okul.get(1071).getName()+" ".concat(ogr2.getSurName()));
        System.out.println(okul.keySet());
        System.out.println(okul.get(978).getSurName());


      /*    List<Ogrenci> list=new ArrayList<>();
        list.add(ogr1);
        list.add(ogr2);
        list.add(ogr3);
        list.add(ogr4);
        System.out.println(list.get(0).getAverageNote());
        */

    }
}
