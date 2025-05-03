public class lab1q2{
    interface chessplayer{
        abstract void walk();
    }
    public static class elephant implements chessplayer{
        public void walk(){
            System.out.println("up,down,left,right");
        }
    }
    public static class pawn implements chessplayer{
        public void walk(){
            System.out.println("up,down,left,right,one step forward");
        }
    }
    public static void main(String[] args) {
        elephant obj = new elephant();
        pawn obj2 = new pawn();
        obj.walk();
        obj2.walk();   
        }
    }
