import java.util.ArrayList;

public class Buyer extends User{
   
    private Order new_order=new Order();
    private String Address;
    private String Reward;
    Buyer(String First_name, String Last_name, String Phone_number,String Address,String Reward,Order buyer_order) {
        super(First_name, Last_name, Phone_number);
        this.Address=Address;
        this.Reward=Reward;
        this.new_order=buyer_order;
    }
    
}
