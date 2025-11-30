interface myInterface{
    public void method1();
    public void method2();
}
class Main implements myInterface{
    public void method1(){
        System.out.println("implementation of method1");

    }
    public void method2(){
        System.out.println("implementation of method2");
    }
    public static void main(String arg[]){
       myInterface obj=new Main();
       obj.method1();
       obj.method2();
    }
}