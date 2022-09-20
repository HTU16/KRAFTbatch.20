package Day_21_String_Class;

public class Lab2 {

    //Kullanıcıdan bir input alın ve girilen inputun
// ilk 3 harfini yazan , 3 harf az ise inputu
// döndüren bir metot yazınız.

    public static String firstThree(String str){
        if(str.length()<3){
            return str;
        }
        return  str.substring(0,3);

    }

    //Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukKaldir(String str){
        return str.replace(" ","%");
    }

    //Kullanıcın girdiği eşit
    // uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    public static String ikinciYari(String str){
        return str.substring(str.length()/2);
    }
//Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri
// ve yeni harfi/harfleri alan
// ve buna göre kelimede/dizede sadece
// ilk bulduğu yeri değiştiren metodu yazınız.
    //   (Merhaba ,a, e) Merheba
    //    (Kasaba , a, i) Kisaba

    public static String changeWord(String str,String old,String new1){
        //Merhaba
        //Merhiba
        System.out.println(str.replace("a", "i"));
        return str.replaceFirst(old,new1);
    }


    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //Ali AAAllliii


    public static String repeatThree(String str){
        String result="";
        // Merhaba
        for(int i=0; i<str.length(); i++){
            for (int j=0; j<3; j++){
                result+=str.charAt(i);
            }

        }

        return result;

    }
    //Kullanıcıdan bir kelime ve bir karakter alın ve
    // bu kelimenin istenen karakterin
    // kaç adet olduğunu döndüren metodu yazınız.
    // (büyük küçük harf göz ardı edilecek)
    //Ankara,a       3
    //Edirne,e      2
    // bulamaz ise 0 döndüren programı yaznız


    public static int harfSayisi(String str,String target){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    //Kullanıcıdan 2 kelime alın ve
    // bu kelimenin istenen 2.kelimenin ilk kelimede kaç adet bulunduğunu ekrana
    //getiren programı yazınız.
    // (büyük küçük harf göz ardı edilecek)
    //Ankaran,ank       1
    //sarmalasaksa ,sa      3
    // bulamaz ise 0 döndüren programı yaznız

    public static int kelimeSayisi(String str,String target ){  //an 2
        int count=0;                                //ankaraankara
        for(int i=0; i<str.length()-(target.length()-1); i++){
            String result=str.substring(i,i+target.length());
            if(str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }
//Kullanıcıdan bir kelime ve bir harf alın kelimenizin
// içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
//(Merhaba, a)  Merhb

    public static String harfTemizle(String kelime,String harf){
        return kelime.replace(harf,"");
    }

    //Kullanıcıdan bir kelime alın ve "kin" kelimesi başından veya ilk karakterden
    // sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    //Kinlenmek true
    //Kin tutmak true
    //Ekin ektim true
    //Keskin ilçesinden geçiyorum false
    //Neden kin tutuyorsun false
    public static void main(String[] args) {
        System.out.println(controlSentence("merhaba dünya","rha"));
//                                                 0123456789
    }
    public static boolean controlSentence(String kelime,String control){
        if(kelime.substring(0,3).equalsIgnoreCase(control) ||
                kelime.substring(1,1+control.length()).equalsIgnoreCase(control)  ) {
            return true;
        }
        return false;

    }
}
