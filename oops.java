//Oops In Java Is Class

class Faizan {
    String name="Faizan";
    int age=47;

   // Default Constructor 
    Faizan(){

        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        
        // Oops is object in java
        
        Faizan fs=new Faizan();
    }
}


// Oops is polymorphism  in java 

//This Opps Have 2 Type 

//First one Is Compile-time polymorphism (Method Overloading)

//End Secound one Is Runtime polymorphism (Method Overriding)


//This Examle of  Compile-time polymorphism
class Poly {

    

    public void Semname(String name){

    
        System.out.println(name);
    }
    public void Semname(int age){

  
        System.out.println(age);
    }
    public void Semname(String name, int age){

       
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Poly p1=new Poly();
        p1.Semname("faizan");
        p1.Semname(23);
        p1.Semname("faizan",23);
    }

}
//This Examle of Runtime polymorphism 

class poly1{

    public void java(){
        System.out.println("I am A Student Of Nisha Nagar");
    };
}

class poly2 extends poly1{

    public void java(){
        System.out.println("I am A Student Of Jinal Box");
    };

   
}

class Main{

   public static void main(String[] args) {
    poly1 p1=new poly1();
    poly2 p2=new poly2();
    p1.java();
    p2.java();

   }
    
    
}

//Four IS inheritance Oops in Java

//Four type in java  Inheritance

//1 Simple Inheritance

//2 Multilevel Inheritance

//3 Hierarchical Inheritance

//4 Hybrid Inheritance


// 1 Simple Inheritance example 

class Class1{


    Class1(){
    System.out.println("Me Uper Wali Class Se Aa Ya Hu😊");
}

}

class Class2 extends Class1{


    Class2(){
    System.out.println("Me Niche Wali Class Se Aa Ya Hu😊");
}

}

class display 
{

    public static void main(String[] args) {
        Class2 c1=new Class2();
    }
}

//2 Multilevel Inheritance Example

class C1{
    C1(){
        System.out.println("Me Uper Wali Class Se Aa Ya Hu😊");
    }

}

class C2 extends C1{
    C2(){
        System.out.println("Me Middle Wali Class Se Aa Ya Hu😊");
    }

}

class C3 extends C2{
    C3(){
        System.out.println("Me Niche Wali Class Se Aa Ya Hu😊");
    }

}

class D1{

    public static void main(String[] args) {
        C3 c1=new C3();
    }

}

//3 Hierarchical Inheritance Example

class S1{

 void hero(){

       
        System.out.println("Hello Hero");
        
    }
}
class S2 extends S1{

    
   void zero(){
      
       
        System.out.println("Hello Zero");
    }
}
class S3 extends S1{
 
  void  villen(){
      
       
        System.out.println("Hello Villen");
    }
}

class V1{

    public static void main(String[] args) {
    
      S2 o1=new S2();
      o1.hero();
      o1.zero();
      S3 o2=new S3();
      o2.hero();
      o2.villen();
    }
}


interface K1{

   public void hero();
 
   }
  

   class K3 {
    void  zero(){
         
          
        System.out.println("Hello Zero");
    }

   }
   class K4 extends K3 implements K1{
    
    public void  hero(){
         
          
           System.out.println("Hello hero");
       }
   }
   
   class F1{
   
       public static void main(String[] args) {
       
        
         K4 o2=new K4();
         o2.hero();
         o2.zero();
        // o2.villen();
       }
   }
   









