package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;

    @BeforeAll
    public static void createObjetsForTest(){
        car = new Car("Company", "Model", 2023);
        motorcycle = new Motorcycle("Company", "Model", 2023);
    }

    /*
        Проверка, что экземпляр класса Car является экземпляром транспортного средства.
     */
    @Test
    public void carShouldVehicleObject(){
        assertTrue(car instanceof Vehicle);
    }

    /*
        Проверка, что экземпляр класса Car создается с 4-мя колесами
     */
    @Test
    public void carShouldHaveFourWheels(){
        int expectedWheels = 4;
        int actualWheels = car.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Конструктор класса Car некорректен, кол-во колес не равно 4");
    }

    /*
        Проверка, что экземпляр класса Motorcycle создается с 2-мя колесами
     */
    @Test
    public void motorcycleShouldHaveFourWheels(){
        int expectedWheels = 2;
        int actualWheels = motorcycle.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Конструктор класса Motorcycle некорректен, кол-во колес не равно 4");
    }

    /*
        Проверка на корректность работы метода testDrive(), для экземпляра класса Car.
     */
    @Test
    public void carShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 60;
        car.testDrive();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод testDrive() некорректен, скорость машины не равна 60");
    }

    /*
        Проверка на корректность работы метода testDrive(), для экземпляра класса Car.
     */
    @Test
    public void motorcycleShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод testDrive() некорректен, скорость мотоцикла не равна 60");
    }

    /*
        Проверка на корректность работы метода park(), для экземпляра класса Car.
     */
    @Test
    public void carShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        car.testDrive(); //
        car.park();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод park() некорректен, скорость машины не равна 0");
    }

    /*
        Проверка на корректность работы метода park(), для экземпляра класса Car.
     */
    @Test
    public void motorcycleShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        motorcycle.testDrive();
        motorcycle.park();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод park() некорректен, скорость мотоцикла не равна 0");
    }
}