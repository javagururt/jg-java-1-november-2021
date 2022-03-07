package student_julija_radchenko.lesson_8_homeworks.level_3_junior.Task_13;

    abstract class Car{
        private String model;
        private String color;
        private int maxSpeed;

        public abstract void gas();

        public abstract void brake();

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
    }

