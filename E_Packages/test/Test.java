//Package is a folder with java class files, that can be used by just importing it.
package E_Packages.test;

//imported Packages can be used/written directly.
import E_Packages.animal.Animal;
import E_Packages.car.Car;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();  // imported Animal class.

        //Two Class with same name.

        // 1.imported Car class from another package
        Car carWala = new Car();  // Since this is an imported class it can be used directly

        // 2.Car class in current Package.
        E_Packages.test.Car selfCar = new E_Packages.test.Car();


        //To access the inner Class.
        //More about inner class will be learned later.
        InnerClass iC = new InnerClass();
        InnerClass.innerMiniClass innerClass = iC.new innerMiniClass();

    }
}
