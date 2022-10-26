package executor;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            TaskScheduler scheduler = new TaskSchedulerImpl( 13);
            int time = 5;
        while(time != 0){
            System.out.println("Em quantos segundos deseja executar?");
            time = sc.nextInt();
            System.out.println("Quantas vezes deseja executar?");
            int vezes = sc.nextInt();
            System.out.println("Qual o nome do arquivo?");
            String nome = sc.next();
            TaskAction task =  new TaskAction(nome, time, vezes);
            scheduler.scheduleTask(task);
        }
    }
}
