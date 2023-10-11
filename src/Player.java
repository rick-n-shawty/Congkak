import javax.swing.JPanel;
import java.awt.Color;
public class Player extends JPanel{
    private int id;
    private int TOTAL_MARBLES;  // marbles that we put into the houses 
    private int currentMabrles; // dummy marbles 
    private Color defaultColor;
    
    public Player(int id, Color color){
        this.id = id; 
        this.defaultColor = color;
        this.TOTAL_MARBLES= 0;
    }
    // NON-VISUAL METHODS
    public void incrementHouseMarbles(){
        this.TOTAL_MARBLES += 1;
    }
    public void decrementCurrentMarbles(){
        this.currentMabrles -= 1;
    }
    public void setCurrentMarbles(int marblesNum){
        this.currentMabrles = marblesNum; 
    }
    public int getCurrentMarbles(){
        return this.currentMabrles;
    }
    public int getTotalMarbles(){
        return this.TOTAL_MARBLES; 
    }
    public String toString(){
        return "Current m: " + this.currentMabrles + " Total m: " + this.TOTAL_MARBLES;
    }
    // VISUAL METHODS 
    public Color getPlayerDefaultColor(){
        return this.defaultColor;
    }
}
