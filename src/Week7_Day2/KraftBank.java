package Week7_Day2;

import java.util.Random;

public class KraftBank {
    public int customerId;
    public String customerFullName;
    public boolean isSms;
    public int customerAccount;
    public String  customerToken;


    public KraftBank(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random=new Random();
        this.customerToken= this.customerId+ this.customerFullName.substring(0,2)+random.nextInt(1000,9999);

    }

    public void addMoney(int money){
        this.customerAccount+=money;
        if(this.customerAccount<50000000){
            System.out.println("please add money");
        }else{
            System.out.println("daha fazla parayı napcan");
        }


    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerToken,String customerFullName) {
        if(customerToken.equals(this.customerToken)){
            this.customerFullName = customerFullName;
        }else{
            System.err.println(" Not authorized");
        }

    }

    public boolean isSms() {
        return isSms;
    }

    public int getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }
}
