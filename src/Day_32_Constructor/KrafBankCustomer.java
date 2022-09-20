package Day_32_Constructor;

import java.util.Random;

public class KrafBankCustomer {

    //1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
    //2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
    //3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in
    // ilk iki harfi+1000-9999 rasında random bir sayı ile otomatik oluşturulacak.
    //4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için
    // class içerisinde addMoney adında bir metot yazılacak.

    public int customerId;
    public String customerFullName;
    public boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KrafBankCustomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        Random random=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2)+(random.nextInt(8999)+1000);

    }
    public String getCustomerToken(){
        return  this.customerToken;
    }
    public double getCustomerAccount(){
        return this.customerAccount;
    }
    public void setCustomerAccount(double money){
        if(getCustomerToken().equals("abc")){
            this.customerAccount=money;
        }
        else{
            System.out.println(" Yetkiniz yoktur.");
        }

    }
    public void addMoney(double money){
        this.customerAccount+=(money*18.22);
    }
}
