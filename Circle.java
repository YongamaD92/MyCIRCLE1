
package za.ac.wsu.s213036657;

//Author Yongama Didi
public class Circle {
         // Creating the three attributes for the Circle
        private double radius;
        private int x;
        private int y;

        //Returning the Area of the Circle
        public double calculateArea() {
                return Math.PI * radius * radius;
        }

        //Returning the Circumference of the Circle
        public double calculateCircumference() {
                return 2 * Math.PI * radius;
        }

        //Returning the Diameter of the Circle
        public double calculateDiameter() {
                return 2 * radius;
        }

        //Setting the Radius
        public void setRadius(double radius) {
                // To check if the Radius cannot be less than zero
                if (radius < 0) {
                        this.radius = 0;
                } else {
                        this.radius = radius;
                }
        }

        //Set and initialise the coordinate X
        public void setX(int x) {
                this.x = x;
        }

        //Set and initialise the coordinate Y
        public void setY(int y) {
                this.y = y;
        }

        //Get and return Radius
        public double getRadius() {
                return radius;
        }

        //Get and return the coordinate X
        public int getX() {
                return x;
        }

        //Get and return the coordinate Y
        public int getY() {
                return y;
        }
   
}
