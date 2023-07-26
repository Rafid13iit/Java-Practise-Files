interface RoutePlanner {
    
    public default String Calculate_route(String Buyer_Adress,String Seller_adress)
    {
      String Shortest_route=Buyer_Adress+Seller_adress;
      return Shortest_route;
    }

}
