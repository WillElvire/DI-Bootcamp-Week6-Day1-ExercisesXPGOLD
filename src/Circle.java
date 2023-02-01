public class Circle {

    private double radius  = 1.0;
    private String color   = "red" ;
 
    Circle(){
     super();
    }
 
    Circle(double radius){
     super();
     this.radius  = radius;
    }
 
    Circle(double radius , String color) {
     super();
     this.radius  = radius;
     this.color   = color;
    }
 
     public double getRadius() {
         return radius;
     }
 
     public String getColor() {
         return color;
     }
 
     public void setRadius(double radius) {
         this.radius = radius;
     }
 
     public void setColor(String color) {
         this.color = color;
     }
 
     @Override
     public String toString() {
         return "Circle [radius=" + radius + ", color=" + color + "]";
     }
 
     public double  getArea() {
      return  Math.PI*Math.pow(radius, 2);
    }


    public static void main(String[] args) throws Exception {
      
        Circle cercle1 = new Circle(2.0);
        Circle cercle2 = new Circle(12);
        Circle cercle3 = new Circle(24);

        System.out.println("(Rayon pour le cerle 1 :  " + cercle1.getRadius() + ") \t (Zone pour le cerle 1  " + cercle1.getArea()+")");
        System.out.println("(Rayon pour le cerle 1 :  " + cercle2.getRadius() + ") \t (Zone pour le cerle 1  " + cercle2.getArea()+")");
        System.out.println("(Rayon pour le cerle 1 :  " + cercle3.getRadius() + ") \t (Zone pour le cerle 1  " + cercle3.getArea()+")");
    }
     
    
 }
 