package excercise01.examWeekSix14Dec;

public abstract class Car {
    //There are two kinds of car: manual and automatic.
    //A car has a brand.
    //A car can drive. When it does, it returns a message saying “<car kind> <brand>”.

    //The Car class must be abstract. It has a brand that is given with the constructor.
        private String brand;

        public Car(String brand) {
            this.brand = brand;
        }

        public String drive() {
            return getType() + " " + brand;
        }

        protected abstract String getType();
    }
