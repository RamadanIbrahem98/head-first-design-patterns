public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck(){
    }

    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }
    
    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}