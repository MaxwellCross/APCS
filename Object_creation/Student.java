import java.awt.*;

public class Student {
   String name;
   int[] scores;
   double highScore;
   
   
   public Student(String studentName, int studentClassCount) {
      if (studentClassCount < 1) {
         throw new IllegalArgumentException("Student must have at least one class)");
      }
      else {
         this.name = studentName;
         this.scores = new int[studentClassCount];
      }
   }
   
   public void setScore(int classNumber, int score) {
      this.scores[classNumber] = score;
   }
   
   public String getName() {
      return this.name;
   }
   
   public double getAverage() {
      double total = 0;
      for (int i = 0; i < this.scores.length; i++) {
         total += (double)this.scores[i];
      }
      return total / (double)this.scores.length;
   }
   
   public int getHighScore() {
      int highest = this.scores[0];
      for (int i = 0; i < this.scores.length; i++) {
         if (this.scores[i] > highest) {
            highest = this.scores[i];
         }
      }
      return highest;
   }
}
