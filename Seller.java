import java.util.ArrayList;

public class Seller extends User{
   
    ArrayList<Fruit> Fruites=new ArrayList<Fruit>();
    private String Address;

    public Seller(String First_name, String Last_name, String Phone_number,String Address,ArrayList<Fruit> Fruites) {
        super(First_name, Last_name, Phone_number);
        this.Address=Address;
        this.Fruites=Fruites;
        
    }
    
    
}
