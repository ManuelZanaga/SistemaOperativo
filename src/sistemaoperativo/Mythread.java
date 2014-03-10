package sistemaoperativo;
import java.util.Random;

class Mythread extends Thread{
    Random r = new Random();
    int processo =r.nextInt(10)*1000;
    @Override
    public void run() {
        while(processo!=0){
            synchronized(this){
                processo--;
            }
        }
    } 
}
