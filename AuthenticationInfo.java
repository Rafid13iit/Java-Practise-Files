import java.util.*;
import java.net.URL;



public class AuthenticationInfo
{
   URL weSite_url;
   String Username;
   String Password;

   AuthenticationInfo(URL weSite_url,String Username,String Password)
   
   {
    this.weSite_url=weSite_url;
    this.Password=Password;
    this.Username=Username;
   }

}