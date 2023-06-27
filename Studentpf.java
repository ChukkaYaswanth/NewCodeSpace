import java.util.Scanner;


class Studentpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English : ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of Maths : ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of Science : ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Total Sum is " + sum);
        Double Percentage = (double)(sum*100/300);
        System.out.println("The Percentage is " + Percentage);
        if(a>=33 && b>=33 && c>=33 && Percentage >= 40){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are Fail");
        }
        
    }
}