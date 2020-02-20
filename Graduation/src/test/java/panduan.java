import org.junit.Test;

public class panduan {

    @Test
    public void lianxi (){
        String a = "A";
        if(!a.equals("b")){
            a = "1";
        }else{
            a = "0";
        }
        System.out.println(a);
    }
}
