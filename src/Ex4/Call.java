package Ex4;

public class Call {

   private int mins;
   private String direction;

   public Call(int mins, String direction){
      this.mins=mins;
      this.direction = direction;
   }

   public int getMins() {
      return mins;
   }

   public String getDirection() {
      return direction;
   }

   public void setMins(int mins) {
      this.mins = mins;
   }

   public void setDirection(String direction) {
      this.direction = direction;
   }

}
