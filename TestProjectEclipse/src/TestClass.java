interface Racing1{  
    public void sprint();  
}  
public class TestClass {  
    public static void main(String[] args) {  
        int distance=10;  
        int a = 5;
  
        //without lambda, Racing1 implementation using anonymous class  
        Racing1 d=new Racing1(){  
            public void sprint(){
            	System.out.println("Running "+distance + " miles");
            	}  
        };  
        d.sprint();  
    }  
} 
