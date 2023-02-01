public class Student {
   private String name   = "BILL" ;
   private int    age    = 12 ;
   private String course = "Physics" ;
   private char   grade  = 'C';

   Student(){

   }

   Student(String name , int age) {
      this.name = name;
      this.age  = age;
   }

   Student(String name , int age , String course , char grade){
     this.name   = name;
     this.age    = age;
     this.course = course;
     this.grade  = grade;
   }

   public void displayStudentInfo() {
    System.out.println("Name: "+this.name+", Age:"+this.age+", Course: "+this.course+", Grade:" +this.grade);
   }

   public static void main(String[] args) throws Exception {
        Student st ;
        st = new Student();
        st.displayStudentInfo();
        st = new Student("Wilfried",20,"Mathmatics",'A');
        st.displayStudentInfo();
        st = new Student("Elvire",22);
        st.displayStudentInfo();
   }
}
