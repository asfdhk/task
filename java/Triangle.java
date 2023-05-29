public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;

        if (a==0 || b==0 || c==0){
            System.out.println("Даний трикутник не існує бо одна з сторіт є 0:");
            System.out.println(toString());
        } else if (a+b<c || a+c<b || b+c<a){
            System.out.println("Даний трикутник не існує за ознакою трикутника:");
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double area(){
        double p = (a+b+c)/2;
        double area = Math.sqrt(p *(p-a)*(p -b)*(p-c));
        return area ;
    }

    public double getA() {
        return a;}

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
