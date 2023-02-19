public class Main {
    public static void main(String[] args) {
       /*
       Stwórz klasęRoadsrer ze zmiennymi:
       1. typu float: topSpeed, acceleration, crazyTopSpeed, crazyAcceleration

       Klasa Roadster musi miećteż dwa konstruktory:
       1. Konstruktor pierwszy przyjmuje topSpeed i acceleration i ustawia ich wartości w instancji
       2. Drugi konstruktor przyjmuje powyższe wartości oraz crazyTOpSpeed i crazyAcceleration,
       ustawia w instancji wszystkie wartości razem z crazymode jako true.
       3. Metody getTopSpeed() i getAcceleration() zwracają topSpeed i acceleration
       4. Przeciążona metoda getTopSpeed(boolean crazyMode) zwraca crazyTopSpeed jeśli
       przekazano jako argument crazyMode i ma wartość true, w innym wypadku zwraca prędkość
       5. Przeciążona metoda getAcceleration(boolean crazyMode) podobnie, jeśli przekazano
       crazyMode jako true to zwraca crazyAcceleration, jako false zwykłe przyspieszenie
       6. Stwórz dwie instancje Car z różnymi wartościami maksymalnej prędkości
       i przyspieszenia. Sprawdź czy wywołąnie metody crazyMode jako true daje wyższe wartości.
        */
    Roadster car0 = new Roadster(10.0f, 1.2f);
    Roadster car1 = new Roadster(11.0f, 1.2f,20.0f, 0.5f);
        System.out.println("dla car0: ");
        System.out.println(car0.getTopSpeed());
 //       System.out.println("dla car2: ");
//        car1.getTopSpeed(false);
 //       car0.getAcceleration(false);
    }
}
class Roadster{
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;



    public Roadster(float tspd, float acc){
        this.topSpeed = tspd;
        this.acceleration = acc;

    }
    public Roadster(float tspd, float acc, float ctspd, float cacc){
        this.topSpeed = tspd;
        this.acceleration = acc;
        this.crazyTopSpeed = ctspd;
        this.crazyAcceleration = cacc;


    }
    public float getTopSpeed(){
        return this.topSpeed;
    }
    public float getAcceleration(){
        return this.acceleration;
    }
    public float getAcceleration(boolean crazyMode){


        if (crazyMode == true){
            return crazyAcceleration;
        }
        else {
            return acceleration;
        }

    }
    public float getTopSpeed(boolean crazyMode){

        if (crazyMode == true){
            return crazyTopSpeed;
        }
        else {
            return topSpeed;
        }

    }
}
