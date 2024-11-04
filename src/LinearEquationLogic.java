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
        //System.out.println(numcord1 + "," + numcord2);
        LinearEquation equation = new LinearEquation(this.parse(temp2),this.parse(temp3),this.parse(tem2),this.parse(tem3));


        if (this.parse(temp2) == this.parse(tem2)) {
            System.out.println("These points are on a vertical line: x = " + this.parse(temp2));
            this.restartCalc();
        } else {
            System.out.println(equation.lineInfo());
            System.out.print("enter a x value: ");
            double xval = scan.nextDouble();
            System.out.println(equation.coordinateForX(xval));
            scan.nextLine();
            this.restartCalc();
        }
    }
      private void restartCalc() {
          System.out.println("do you want to repeat this process again(yes/no): ");
          String again = scan.nextLine();
          if (again.equals("yes")) {
              start();
          } else {
              System.out.println("thank you for your time");
          }
      }

      private int parse(String str1) {
        String result = str1;
        return(Integer.parseInt(result));
    }
}

