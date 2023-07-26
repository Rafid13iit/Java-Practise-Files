public class EncryptionUtil {


    private String cyclicLeftShift(String s, int k){
        k = k%s.length();
        return s.substring(k) + s.substring(0, k);
    }


    public String Encrypt(String Decryted_form)
    {
      int shifting_index=Decryted_form.length()-2;


      return cyclicLeftShift(Decryted_form, shifting_index);
    }
   

    public String Decrypt(String Encryted_form)
    {
      int Shifting_Index=Encryted_form.length()-2;
       
      return cyclicLeftShift(Encryted_form, Encryted_form.length()-Shifting_Index);
        
      
    }
}
