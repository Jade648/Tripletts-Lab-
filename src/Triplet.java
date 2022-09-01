
public class Triplet <C>{

   private C Hours;
   private C Minutes;

   public Triplet(C hours, C minutes, C seconds) {
   }

   public C getHours() {
      return Hours;
   }

   public void setHours(C hours) {
      Hours = hours;
   }

   public C getMinutes() {
      return Minutes;
   }

   public void setMinutes(C minutes) {
      Minutes = minutes;
   }

   public C getSeconds() {
      return Seconds;
   }

   public void setSeconds(C seconds) {
      Seconds = seconds;
   }

   private C Seconds; 
   
}

