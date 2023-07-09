package online.quiz;

public class Student {
    static String name;
    static String roll;
    static int marks;
    static String result;
    
    Student(String a, String b, String c, int d){
        
        this.name = a;
        this.roll = b;
        this.result = c;
        this.marks = d;
        
        System.out.println(name);
        System.out.println(roll);
        System.out.println(result);
        System.out.println(marks);
    }
}
