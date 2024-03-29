public class GaussianRand {

    public static void main(String[] args){
        // Exercise 1.2.27 - This program calculates a random number based on the Box-Muller formula given by w = sin(2piv)(-2 ln(u))^0.5
        double v = Math.random();
        double u = Math.random();
        double w = Math.sin(2*Math.PI*v)*Math.sqrt(-2*Math.log(u));
        System.out.println("Random number generated by Gaussian distribution is: " + w);

    }

}
