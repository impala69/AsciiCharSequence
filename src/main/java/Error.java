import java.io.IOException;

public class Error {
    public static void main(String[] args){


        Object i=Integer.valueOf(24);
        String s=(String) i;


    }

    public void testExp() throws MyNewException{
        throw new MyNewException();
    }


    private class MyNewException extends Exception {
    }

    public static String getCallerClassAndMethodName(){
        StackTraceElement[] ste=new Exception().getStackTrace();
        if(ste.length<4){
            return null;
        }else{
            return ste[2].getClassName()+"#"+ste[2].getMethodName();
        }
    }
}



