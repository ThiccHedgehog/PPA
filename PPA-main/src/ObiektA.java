public class ObiektA implements PrzykladowyInterface{

    @Override
    public void sayHelloWorld() {
        System.out.println("Hello world");
    }

    @Override
    public Double returnRandomNumber() {
        return Math.random();
    }
}
