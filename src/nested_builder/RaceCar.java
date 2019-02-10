package nested_builder;

public class RaceCar {
    private int maxSpeed;
    private int numberOfGears;
    private String modelName;
    private Driver driver;

    @Override
    public String toString() {
        return "RaceCar{" +
                "maxSpeed=" + maxSpeed +
                ", numberOfGears=" + numberOfGears +
                ", modelName='" + modelName + '\'' +
                ", driver=" + driver +
                '}';
    }

    private RaceCar(Builder builder) {
        this.maxSpeed = builder.maxSpeed;
        this.numberOfGears = builder.numberOfGears;
        this.modelName = builder.modelName;
        this.driver = builder.driver;
        builder.restet();
    }






    public static class Builder{

        private int maxSpeed=140;
        private int numberOfGears=5;
        private String modelName;
        private Driver driver;

        Builder(String modelName, Driver driver) {
            this.modelName = modelName;
            this.driver = driver;
        }

        Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setNumberOfGears(int numberOfGears) {
            this.numberOfGears = numberOfGears;
            return this;
        }

        void restet(){
            maxSpeed=140;
            numberOfGears=5;
            modelName=null;
            driver=null;
        }

        RaceCar build(){
            return new RaceCar(this);
        }



    }

}
