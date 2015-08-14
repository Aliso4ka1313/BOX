package game;

import java.util.Scanner;

/**
 * Created by admin on 14.08.15.
 */
public class Main {
    public static void main(String[] args) {

        int[] poleXO = new int[9];

        for(int i = 0 ; i<9;i++){
            if(i%2==0){
                System.out.println("Igrok1");
                int index = takeTurn(poleXO);
                poleXO[index] = 1;
            }else{
                System.out.println("Igrok2");
                int index = compTurn(poleXO);//takeTurn(poleXO);
                poleXO[index] = -1;
            }
            showPole(poleXO);
            int res = checkWin(poleXO);
            if(res !=0){
                System.out.println("Gamer " + c2c(res) + " WIN!!!");
                break;
            }
            System.out.println("__________________");
        }

    }



    public static int compTurn(int[] poleXO){

        int last = 0;
        for(int i = 0 ; i<9;i++){
            if(poleXO[i] == 0){
                poleXO[i] = -1;
                int res = checkWin(poleXO);
                last = i;
                if(res == -1){
                    return i;
                }

                poleXO[i] = 0;
            }
        }
        return last;
    }



    public static int checkWin(int[] poleXO){
        for(int i = 0;i<9;i+=3){
            int res =(poleXO[i]+poleXO[i+1]+poleXO[i+2]);
            if(res == 3) return 1;
            if(res == -3) return -1;
        }
        for(int i = 0;i<3;i++){
            int res =(poleXO[i]+poleXO[i+3]+poleXO[i+6]);
            if(res == 3) return 1;
            if(res == -3) return -1;
        }
        return 0;
    }

    static Scanner sc = new Scanner(System.in);

    public static int takeTurn(int[] poleXO){
        int tmp=0;
        do{
            System.out.println("Take turn!");
            tmp = sc.nextInt();
        }while(poleXO[tmp] != 0);
        return tmp;
    }

    public static char c2c(int c){
        return (c==1)?'X':((c==-1)?'O':' ');
    }

    public static void showPole(int[] poleXO){
        System.out.println("-------");
        for(int i = 0;i<9;i+=3){
            System.out.println(String.format("|%s|%s|%s|",
                    c2c(poleXO[i]),c2c(poleXO[i+1]),c2c(poleXO[i+2])));
            System.out.println("-------");
        }
    }

}
