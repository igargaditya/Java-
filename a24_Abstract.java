abstract class a24Car {
    public abstract void drive();

    public abstract void accelarate();

    public abstract void topspeed();

    public void buy() {
        System.out.println("This is a Car");
    }
}

abstract class a24SportsCar extends a24Car {
    public void drive() {
        System.out.println("Driving Rn");
    }

    public void accelarate() {
        System.out.println("Acceleration Rn");
    }
}

class a24TopCar extends a24SportsCar {
    public void topspeed() {
        System.out.println("The Top Speed is 80km/hr");
    }
}

public class a24_Abstract {
    public static void main(String[] args) {

        // a24Car car = new a24Car() ; // Error as abstract class
        a24Car car = new a24TopCar();
        car.drive();
        car.accelarate();
        car.topspeed();
        car.buy();
    }
}

// when we declare a method in parent class and define it in the child class
// then we have to use abstract keyword for the decalration and make the class
// abstract too
// Cannot create object of an ABSTRACT class and can only be created for
// CONCRETE class