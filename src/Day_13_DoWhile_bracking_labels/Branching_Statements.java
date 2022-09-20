package Day_13_DoWhile_bracking_labels;

public class Branching_Statements {

    public static void main(String[] args) {
       /* for(int i=0; i<5; i++){
            System.out.println(i+" ilk döngü");
            for(int j=0; j<5; j++){
               if(j==2){
                   break;
               }
                System.out.println(j+" ikinci döngü");
            }
        }
        Scanner scan=new Scanner(System.in);
        boolean k=true;
        while(true){
            System.out.println("toplam 50 ise programdan çıkış işlemi olacaktır");
            System.out.print("1.sayi");
            int a= scan.nextInt();
            System.out.print("2.sayi");
            int b= scan.nextInt();
            System.out.println("toplam="+(a+b));
            if(b==0|| a==b || a==0){
                break;
            }
Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1-Toplama \n 2-Çıkarma" +
                    "\n 3-Çarpma\n 4-Bölme\n 5-Çıkış");
            System.out.print("Seçiminiz: ");
            int i= scan.nextInt();
             if(i==1){
                 while(true) {
                 System.out.println("Toplama işlemi çıkış için toplam 0 olmalı");
                 System.out.print("1.sayı: ");
                 int a = scan.nextInt();
                 System.out.print("2.sayı: ");
                 int b = scan.nextInt();
                 System.out.println("toplam=" + (a + b));
                    if ((a+b)==0){
                        break;
                    }
             }
             }
            if(i==5){
               break;
            }
        }
int j=0;
        for(int i=0; i<10; i++){
            if(i>5 && i<8){
                continue;
            }
            System.out.println(i);
        }
        // 0 1 2 3 4 5 8 9
*/
        firstLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println("ilk döngü");
            secondLoop:
            for (int j = 0; j < 5; j++) {
                System.out.println("merhaba");
                if (j > 1) {
                    int k = 0;
                    thirdLoop:
                    while (k < 10) {
                        System.out.println("nasılsın");
                        if (k == 5) {
                            continue firstLoop;

                        }
                    }
                }
                System.out.println("dünya");
            }
        }


    }
}
