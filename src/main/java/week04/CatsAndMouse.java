package week04;

public class CatsAndMouse {
    public static String catAndMouse(int x,int y,int z){
        int distance1 = Math.abs(x-z);
        int distance2 = Math.abs(y-z);
        String winner = "";
        if(distance1 < distance2){
            winner = "Cat A";
        }else if(distance2 < distance1){
            winner = "Cat B";
        }else{
            winner = "Mouse C";
        }
        return winner;
    }
    public static void main(String[] args) {
        int x = 2,y = 5,z = 4;
        String winner = catAndMouse(x,y,z);
        System.out.println("winner of the game: "+winner);
    }
}