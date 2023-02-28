import java.util.Scanner;

public class Area {

    static final double pi =Math.PI ;
    double radius ;
    double circum ;



 int value_option ;


    public  void option(){
        System.out.println("************MENU*************");
        System.out.println("Choose an option(1-3)");
        System.out.println("1:calculate Area "+"\n"+"2:Calculate Circum of circle"+"\n"+"3:to Exit");

        Scanner sc = new Scanner(System.in);
        value_option = sc.nextInt() ;


        switch (value_option){

            case 1:
                System.out.println("Enter radius:");
                radius =sc.nextDouble();
                  CircleArea(radius);
                  break;
            case 2:
                System.out.println("Enter radius");
                circum=sc.nextDouble();
                CircleCircum(circum);

                break;
            case 3:
                break;
            default:
                System.out.println("Input is wrong");
        }
    }

    public static void CircleArea(double radius){

        System.out.printf("Area of Circle:%.2f",pi*radius*radius);
    }
    public static void CircleCircum(double radius){

        System.out.printf("Circumference of Circle:%.2f", 2*pi*radius);
    }
    public static void main(String[] args) {

        Area obj = new Area();
        obj.option();


    }
}

