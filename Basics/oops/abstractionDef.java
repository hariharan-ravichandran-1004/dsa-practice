package Basics.oops;

public class abstractionDef {
    public static void main(String[] args) {
        HTTP http = new HTTP();
        String methodName = http.getRequest();
        System.out.println();
        System.out.println(methodName);
    }
}


abstract class Rest {
    abstract String getRequest();

    abstract String postRequest();
}

class HTTP extends Rest {
    @Override
    String getRequest() {
        // TODO Auto-generated method stub
        return "GET Method";
    }
    
    @Override
    String postRequest() {
        // TODO Auto-generated method stub
        return "POST Method";
    }
}

