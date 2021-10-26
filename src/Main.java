public class Main {
    //Cerinta 1
    public static void nume(){
        System.out.println("Hello \n" +"Razvan");
    }

    public static int suma(int a, int b){
        return a + b;

    }

    public static int impartire(int a, int b){
        return a / b;
    }

    public static int calcul1(int a, int b, int c){
        return -a + b * c;
    }

    public static int calcul2(int a,int b ,int c){
        return (a + b) % c;
    }

    public static int calcul3(int a , int b , int c ,int d){
        return a + (-b) * c / d;
    }

    public static int calcul4(int a , int b , int c ,int d , int e , int f){
        return a + b / c * d - e % f;
    }

    //Cerinta 2
    public static int sum(int a , int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a , int b){
        return a * b;
    }
    public static double divide(double a , int b){
        return a / b;
    }

    //Cerinta 3
    public static void java(){
        System.out.println("   J    a   v     v   a\n" +
                           "   J   a a   v   v   a a\n" +
                           "J  J  aaaaa   V V   aaaaa\n" +
                           " JJ  a     a   V   a     a");
    }

    //Cerinta 4
    public static int mean(int a , int b, int c){
        return (a + b + c) / 3;
    }

    //Cerinta 5

    public static void robot(){
        System.out.println(" +\"\"\"\"\"+ \n"+
                              "[| o o |] \n"+
                              " |  ^  | \n"+
                              " | '-' | \n"+
                              " +-----+ \n" );
    }

    //Cerinta 6

    public static int rest(int a, int b){
        return a % b;
    }

    //Cerinta 7
    public static float grade(int f){
        float c = 5.0f / 9 * ( f - 32);
        return c;
    }

    //Cerinta 8
    public static float distanta(float d){
        return d * 0.0254f;
    }

    //Cerinta 9

    public static void main(String[] args) {
        //Cerinta 1
        nume();
        System.out.println(Calculator.suma(2,6));
        System.out.println(Calculator.impartire(10 , 5));
        System.out.println(Calculator.calcul1(5, 8 ,6));
        System.out.println(Calculator.calcul2(55,9,9));
        System.out.println(Calculator.calcul3(20 ,3 ,5 ,8));
        System.out.println(Calculator.calcul4(5,15,3,2,8,3));

        //Cerinta 2
        System.out.println(Operatii.sum(5,6));
        System.out.println(Operatii.subtract(20,13));
        System.out.println(Operatii.multiply(10,4));
        System.out.println(Operatii.divide(12,4));

        //Cerinta 3
        Desene.java();

        //Cerinta 4
        System.out.println(Operatii.mean(3,12,15));

        //Cerinta 5
        Desene.robot();

        //Cerinta 6
        System.out.println(Operatii.rest(10,3));

        //Cerinta 7
        System.out.println(Conversii.grade(150));

        //Cerinta 8
        System.out.println(Conversii.distanta(30));
    }
}
