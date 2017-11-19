import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int hight;
    private int starsInLastPrint = 0;

    public NightSky(double density, int width, int hight){
        this.density = density;
        this.width = width;
        this.hight = hight;
    }
    public NightSky(double density){
        this(density,20,10);
    }
    public NightSky(int width, int hight){
        this(0.1,width,hight);
    }
    public void printLine(){
        Random random = new Random();
        for (int i = 0; i < width; i++){
            double probability = random.nextDouble();
            if(probability > this.density){
                System.out.print(" ");
            }else{
                System.out.print("*");
                starsInLastPrint++;
            }
        }
    }
}
