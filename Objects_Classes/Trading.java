import java.util.*;

public class Trading{

    public static void main(String[] args){


        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        Trade t2 = new Trade("T1", "APPL", 100, 15.25);
        Trade t3 = new Trade("T1", "APPL", 100, 15.25);

        Account Seth = new Account();
        Seth.setTrade(t1);
        Seth.setTrade(t2);
        Seth.setTrade(t3);

        System.out.println(Seth.getTotal_trade());
    }

}

class Trade{
    private  String ID;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String id, String symbol, int qty,double price){
        this.ID = id;
        this.symbol = symbol;
        this.quantity = qty;
        this.price = price;
    }

    public Trade(String id, String symbol, int qty){
        this.ID = id;
        this.symbol = symbol;
        this.quantity = qty;
    }

    public void setPrice(double price){
        price = (price > 0) ? price : 0;
        this.price = price;
    }




    @Override
    public String toString(){
        return String.format("ID => " + this.ID +" Symbol=> " +this.symbol 
        +"Quantity => "
        +this.quantity+
        "Price => "+this.price);
    }

}


class Account{
    private List <Trade>trades = new ArrayList<Trade>();
    private int total_trade = 0;

    public void setTrade(Trade trade){
        trades.add(trade);
    }

    public int getTotal_trade(){
        return this.total_trade = trades.size();
    }

}

class Trader{

    private String trader_name;
    private Account account;


}