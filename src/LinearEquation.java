public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;






    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance(){
        double result = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        result = roundedToHundredth(result);
        return(result);
    }
    public double yIntercept(){
        double slope = this.slope();
        double result = roundedToHundredth((1.0*y1)-(1.0*x1 * slope));
        return(result);
    }
    public double slope(){
        double top = (double)y2-y1;
        double bottom = (double)x2-x1;
        return (top/bottom);
    }
    public String equation(){
        double y = y2-y1;
        double x = x2-x1;
        if ((y1 == y2) || (x1==x2)){
            String result = "y= ";
            result += this.yIntercept();
            return(result);
        } else {
            if (this.yIntercept() == 0) {
                if ((y/x) == 1) {
                    String result = "y= ";
                    result += "x ";
                    return (result);


                } else if ((y/x)== -1) {
                    String result = "y= ";
                    result += "-x ";
                    return (result);
                } else if ((((y/x) * 10) % 10) == 0) {
                    String result = "y= ";
                    result += (int) (y / x);
                    result += "x ";
                    return(result);
                } else {
                    if ((y / x) < 0) {
                        String result = "y=";
                        result += "-";
                        result += (int) y;
                        result += "/";
                        result += (int) (x * -1);
                        result += "x ";
                        return (result);
                    } else if ((x < 0) && (y < 0)) {
                        String result = "y=";
                        result += (int) (y * -1);
                        result += "/";
                        result += (int) (x * -1);
                        result += "x ";
                        return (result);
                    } else {
                        String result = "y=";
                        result += (int) y;
                        result += "/";
                        result += (int) x;
                        result += "x ";
                        return (result);
                    }
                }
            } else if (this.yIntercept() < 0) {
                if ((y/x) == 1) {
                    String result = "y= ";
                    result += "x - ";
                    result += this.yIntercept() * -1;
                    return (result);


                } else if ((y/x)== -1) {
                    String result = "y= ";
                    result += "-x - ";
                    result += this.yIntercept() * -1;
                    return (result);
                } else if ((((y/x) * 10) % 10) == 0) {
                    String result = "y= ";
                    result += (int) (y / x);
                    result += "x - ";
                    result += this.yIntercept() * -1;
                    return(result);
                } else {
                    if ((y / x) < 0) {
                        String result = "y=";
                        result += "-";
                        result += (int) y;
                        result += "/";
                        result += (int) (x * -1);
                        result += "x - ";
                        result += this.yIntercept() * -1;
                        return (result);
                    } else if ((x < 0) && (y < 0)) {
                        String result = "y=";
                        result += (int) (y * -1);
                        result += "/";
                        result += (int) (x * -1);
                        result += "x - ";
                        result += this.yIntercept() * -1;
                        return (result);
                    } else {
                        String result = "y=";
                        result += (int) y;
                        result += "/";
                        result += (int) x;
                        result += "x - ";
                        result += this.yIntercept() * -1;
                        return (result);
                    }
                }
            }  else {
                if ((y/x) == 1) {
                    String result = "y= ";
                    result += "x + ";
                    result += this.yIntercept();
                    return (result);


                } else if ((y/x)== -1) {
                    String result = "y= ";
                    result += "-x + ";
                    result += this.yIntercept();
                    return (result);
                } else if ((((y/x) * 10) % 10) == 0) {
                    String result = "y= ";
                    result += (int) (y / x);
                    result += "x + ";
                    result += this.yIntercept();
                    return(result);
                } else {
                    if ((y / x) < 0) {
                        String result = "y=";
                        result += "-";
                        result += (int) y;
                        result += "/";
                        result += (int) (x * -1);
                        result += "x + ";
                        result += this.yIntercept();
                        return (result);
                    } else if ((x < 0) && (y < 0)) {
                        String result = "y=";
                        result += (int) (y * -1);
                        result += "/";
                        result += (int) (x * -1);
                        result += "x + ";
                        result += this.yIntercept();
                        return (result);
                    } else {
                        String result = "y=";
                        result += (int) y;
                        result += "/";
                        result += (int) x;
                        result += "x + ";
                        result += this.yIntercept();
                        return (result);
                    }
                }




            }
        }
    }
    public String coordinateForX(double x) {
        String result = "(" + x + "," + ((slope()*x) + yIntercept()) + ")";
        return(result);
    }
    public String lineInfo(){
        return("The two points are: (" + x1 + ","+ y1 + ") and (" + x2 +"," + y2 +")"  + "\n" + "The equation of the line between these points is: " + this.equation() + "\n" + "The slope of this line is: " + this.slope() + "\n" + "The y-intercept of this line is: " + yIntercept() + "\n"  + "The distance between these points is " + this.distance());
    }
    public double roundedToHundredth(double toRound){
        double result = (Math.round(toRound * 100) / 100.0) ;
        return(result);
    }
}

