package Day_20_StringClassCon;

public class StringMethodsCont {

    public static void main(String[] args) throws InterruptedException {


//        System.out.println(findFirstCharInSecond("talip", "tıraş"));
//        System.out.println(countY("Javayı Seviyor muyum?"));
//        System.out.println(sesliHarf("Javayı Seviyor muyum?"));
//        lastThree("Alparslan");


//        String str = " akşam";
//        String str2 = "GÜZEL BİR akşam";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));

//        System.out.println(str.startsWith(" akşam"));
//        System.out.println(str.endsWith("akşam"));
//        System.out.println(str2.contains("BİR"));

    }
    //Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi 2. kelimede varsa index ini alın.
    public static int findFirstCharInSecond(String str, String str2) {
        return str2.indexOf(str.charAt(0));
    }

    //    "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren bir program yazın.
    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;
            }
        }
        return count;
    }
    //    Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın
    public static String sesliHarf(String str) {
        String holder = "";

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'ü', 'ı', 'u':
                    holder += str.charAt(i);
                    break;
                default:
            }
        }
        return holder;


    }

//      Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
//      isteyin cümle içinde sev köküne sahip bir kelime var ise bir
//      method what a lovely person(ne hoş bir insan) mesajı
//      döndürsün.

    public static void searchWord(String str) {
        if (str.contains("sev")) {
            System.out.println("what a lovely person");
        } else {
            System.out.println("ok");
        }
    }
//    İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static void lastThree(String str) {
        String holder = "";
        for (int i = 0; i < 5; i--) {
            holder += str.substring(str.length() - 3);

        }
        System.out.println(holder);
    }

}
