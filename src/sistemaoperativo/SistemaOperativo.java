package sistemaoperativo;
// Librerie importate
import java.io.*;
import java.util.Random;
// Classe principale
public class SistemaOperativo {
    // Metodo main che gestisce le eccezioni I/O
    public static void main(String[] args) throws IOException, InterruptedException, NullPointerException{
        // Creazione di un canale e di un buffer per l'acquisizione di una stringa
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        System.out.println("Questo programma simula il funzionamento\n"
                + "di un sistema operativo. Ordina i processi e li esegue in coda.\nPremere invio per continuare...");
        String cod = buffer.readLine();
        System.out.println("Generazione di processi e messa in coda...");
        Random r = new Random();
        int numeroProcessi = r.nextInt(10);
        int cont0=0, cont1=0, cont2=0,cont3=0, cont4=0;
        int ultimo0=0, ultimo1=0,ultimo2=0,ultimo3=0,ultimo4=0;
        // Creazione degli array per la schedulazione dei processi 
        Mythread[] array0 = new Mythread[10];
        Mythread[] array1 = new Mythread[10];
        Mythread[] array2 = new Mythread[10];
        Mythread[] array3 = new Mythread[10];
        Mythread[] array4 = new Mythread[10];
        // Inserimento dei processi negli array di schedulazione
        for(int contTotale=0; contTotale<=numeroProcessi; contTotale++){
            // Al processo viene assegnato un valore di priorità
            int priorita = r.nextInt(5);
            // Se il valore è 0
            if(priorita == 0){
                // Messa in coda nel gruppo 0
                array0[cont0] = new Mythread();
                System.out.println("Creazione del processo con priorità 0: #"+cont0);
                ultimo0=cont0;
                // Incremento del contatore
                cont0++;
            // Se il valore è 1
            }else if(priorita == 1){
                // Messa in coda nel gruppo 1
                array1[cont1] = new Mythread();
                System.out.println("Creazione del processo con priorità 1: #"+cont1);
                ultimo1=cont1;
                // Incremento del contatore
                cont1++;
            // Se il valore è 2
            }else if(priorita == 2){
                // Messa in coda nel gruppo 2
                array2[cont2] = new Mythread();
                System.out.println("Creazione del processo con priorità 2: #"+cont2);
                ultimo2=cont2;
                // Incremento del contatore
                cont2++;
            // Se il valore è 3
            }else if(priorita == 3){
                // Messa in coda nel gruppo 3
                array3[cont3] = new Mythread();
                System.out.println("Creazione del processo con priorità 3: #"+cont3);
                ultimo3=cont3;
                // Incremento del contatore
                cont3++;
            // Se il valore è 4
            }else{
                // Messa in coda nel gruppo 4
                array4[cont4] = new Mythread();
                System.out.println("Creazione del processo con priorità 4: #"+cont4);
                ultimo4=cont4;
                // Incremento del contatore
                cont4++;
            }
            // Ritardo per simulare la creazione del processo
            Thread.sleep(1500);
        }

        // Ripristino dei valori dei contatori
        cont0 = 0;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        System.out.println("\nPreparazione all'esecuzione dei processi");
        if(array0!=null){
            while(cont0<=ultimo0){
                if(cont0<=ultimo0 && ultimo0>=0){
                    if(array0[cont0].processo!=0){
                        System.out.println("Esecuzione del processo con priorità 0: #"+cont0);
                        array0[cont0].run();
                        Thread.sleep(3000);
                        array0[cont0].interrupt();
                        cont0++;
                    }else{
                        break;
                    }               
                }
            }
        }else{}
        if(array1!=null){
            while(cont1<=ultimo1){
                if(cont1<=ultimo1 && ultimo1>=0){
                    if(array1[cont1].processo!=0){
                        System.out.println("Esecuzione del processo con priorità 1: #"+cont1);
                        array1[cont1].run();
                        Thread.sleep(3000);
                        array1[cont1].interrupt();
                        cont1++;
                    }else{
                        break;
                    }
                }
            }
        }else{}
        if(array2!=null){
            while(cont2<=ultimo2){
                if(cont2<=ultimo2 && ultimo2>=0){
                    if(array2[cont2].processo!=0){
                        System.out.println("Esecuzione del processo con priorità 2: #"+cont2);
                        array2[cont2].run();
                        Thread.sleep(3000);
                        array2[cont2].interrupt();
                        cont2++;
                    }else{
                        break;
                    }
                }
            }
        }else{}
        if(array3!=null){
            while(cont3<=ultimo3){
                if(cont3<=ultimo3 && ultimo3>=0){
                    if(array3[cont3].processo!=0){
                        System.out.println("Esecuzione del processo con priorità 3: #"+cont3);
                        array3[cont3].run();
                        Thread.sleep(3000);
                        array3[cont3].interrupt();
                        cont3++;
                    }else{
                        break;
                    }
                }
            }
        }else{}
        if(array4!=null){
            while(cont4<=ultimo4){
                if(cont4<=ultimo4 && ultimo4>=0){
                    if(array4[cont4].processo!=0){
                        System.out.println("Esecuzione del processo con priorità 4: #"+cont4);
                        array4[cont4].run();
                        Thread.sleep(3000);
                        array4[cont4].interrupt();
                        cont4++;
                    }else{
                        break;
                    }
                }
            }
        }else{}
    }
}
