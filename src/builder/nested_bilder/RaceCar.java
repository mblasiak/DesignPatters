package builder.nested_bilder;

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
        this.maxSpeed = builder.getMaxSpeed();
        this.numberOfGears = builder.numberOfGears;
        this.modelName = builder.modelName;
        this.driver = builder.driver;
    }






    public static class Builder{

        private int maxSpeed=140;
        private int numberOfGears=5;
        private String modelName;
        private Driver driver;

        public Builder(String modelName, Driver driver) {
            this.modelName = modelName;
            this.driver = driver;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setNumberOfGears(int numberOfGears) {
            this.numberOfGears = numberOfGears;
            return this;
        }

        private int getMaxSpeed() {
            return maxSpeed;
        }

        private int getNumberOfGears() {
            return numberOfGears;
        }

        private String getModelName() {
            return modelName;
        }

        private Driver getDriver() {
            return driver;
        }

        public RaceCar Create(){
            return new RaceCar(this);
        }



    }

}
