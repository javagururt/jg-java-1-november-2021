package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

 class Circle extends Shape {

     private double radius;

     public Circle(String title, double radius) {
         super(title);
         this.radius = radius;
     }

     @Override
     double calculateArea() {
         return radius*radius*Math.PI;
     }

     @Override
     double calculatePerimeter() {
         return 2*radius*Math.PI;
     }
 }
