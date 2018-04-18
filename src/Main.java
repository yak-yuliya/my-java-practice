public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setName("BMW");
        v1.setModel("M3");
        v1.setLitres(6);

        Vehicle v2 = new Vehicle();
        v2.setName("Audi");
        v2.setModel("A6");
        v2.setLitres(10);

        Vehicle v3 = (Vehicle) v2;


        String var1 = "1000"; // Casting to integer
        int var2 = Integer.parseInt(var1); //1st method
        //   int var3 = 0;
        //   Convert.string2int(var1, var3); //2nd method

        //  int var4 = (Integer) var1; //Object conversion method

        System.out.println(var2);
    }
}
