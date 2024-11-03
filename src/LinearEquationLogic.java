import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    public LinearEquationLogic() {




    }
    public void start(){
        System.out.println("Hello User");
        System.out.print("Input your coordinate points: ");
        String coords = scan.nextLine();
        System.out.print("input your second set of coordinate points: ");
        String coords2 = scan.nextLine();
        int temp1 = coords.indexOf(",");
        int tem1 = coords2.indexOf(",");
        int temp4 = coords.length();
        int tem4 = coords2.length();
        String temp2 = coords.substring(1,temp1);
        String tem2 = coords2.substring(1,tem1);
        String temp3 = coords.substring(temp1+1,temp4-1);
        String tem3 = coords2.substring(tem1 + 1 , tem4 - 1);
        int numcord1 = Integer.parseInt(temp2);
        int numcord2 = Integer.parseInt(temp3);
        int numcord3 = Integer.parseInt(tem2);
        int numcord4 = Integer.parseInt(tem3);
        //System.out.println(numcord1 + "," + numcord2);
        LinearEquation equation = new LinearEquation(numcord1,numcord2,numcord3,numcord4);


        if (numcord1 == numcord3) {
            System.out.println("These points are on a vertical line: x = " + numcord1);
            System.out.println("do you want to repeat this process again(yes/no): ");
            String again = scan.nextLine();
            if (again.equals("yes")) {
                start();
            } else {
                System.out.println("thank you for your time");
            }
        } else {
            System.out.println(equation.lineInfo());
            System.out.print("enter a x value: ");
            double xval = scan.nextDouble();
            System.out.println(equation.coordinateForX(xval));
            scan.nextLine();
            System.out.println("do you want to repeat this process again(yes/no): ");
            String again = scan.nextLine();
            if (again.equals("yes")) {
                start();
            } else {
                System.out.println("thank you for your time");
            }
        }
    }
}

