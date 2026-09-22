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
        // Concrete implementation of the abstract method declared in Rest
        return "GET Method";
    }
    
    @Override
    String postRequest() {
        // Every abstract method must be implemented by the concrete subclass
        return "POST Method";
    }
}

