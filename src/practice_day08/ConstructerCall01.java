package practice_day08;

public class ConstructerCall01 {
    int x ;
     int y ;

     public ConstructerCall01 (int x , int y){
         this.x = x;
         this.y = y ;
         display();
     }

    private void display() {
        System.out.println("X" + x + "Y" + y);
    }

    public static void main(String[] args) {
        ConstructerCall01 kordinat = new ConstructerCall01(5,55);


    }
}
