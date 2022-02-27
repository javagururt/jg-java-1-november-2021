package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

 class Triangle extends Shape {

     private double sideLength;

     public Triangle(String title, double sideLength) {
         super(title);
         this.sideLength = sideLength;
     }

     @Override
     double calculateArea() {
         return (sideLength*sideLength*Math.sqrt(3))/4;
     }

     @Override
     double calculatePerimeter() {
         return sideLength*3;
     }
 }
