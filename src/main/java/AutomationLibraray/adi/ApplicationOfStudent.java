package AutomationLibraray.adi;

public class ApplicationOfStudent {
    public static void main(String[] args) {
        Student student=new Student("Real ","Madrid ","111 Caddesi Omaha,Nebraska ", 18, 1000.0,15 );
        var s1=student.getName()+ student.getLastName()+student.getAdress()+student.getAge()+student.getBook()+student.getPoint();
        System.out.println(s1);
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        System.out.println(student.getAdress());
        System.out.println(student.getAge());
        System.out.println(student.getBook());
        System.out.println(student.getPoint());

        System.out.println(student.getName());


        student.setName("Vahhabi");
        student.setLastName("Tarrikkkk");
        student.setAdress("Abidin Dino Sokak no:61");
        student.setAge(82);
        student.setBook(82698.0);
        student.setPoint(100000);
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        var s2=student.getName()+ student.getLastName()+student.getAdress();
        System.out.println(s2);


    }
}
