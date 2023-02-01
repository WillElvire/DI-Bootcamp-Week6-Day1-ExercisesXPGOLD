public class Voiture {

    private String make  = "Deutch";
    private String model = "C300 AMG";
    private int    year  = 2022;
    private String color = "red";
    private double price = 2500.0;

    Voiture() {
        super();
    }

    Voiture(String make, String model, int year ) {
        super();
        this.make  = make;
        this.model = model;
        this.year  = year;
    }
    Voiture(String make , String model , int year , String color , double price ) {
        super();
        this.make  = make;
        this.model = model;
        this.year  = year;
        this.price = price;
        this.color = color;
    }

    public void displayCarInfo() {
      System.out.println("Make: "+this.make+", Model:"+this.model+", Year: "+this.year+", Color:" +this.color+ ", Price:"+this.price);
    }


    public static void main(String[] args) throws Exception {
       Voiture voiture;
       voiture= new Voiture();
       voiture.displayCarInfo();
       voiture = new Voiture("Berlin","Poco x3",2022);
       voiture.displayCarInfo();
       voiture = new Voiture("4X4","Urus coupé sport",2021,"noir matt", 75000);
       voiture.displayCarInfo();
    }
}
