import java.util.ArrayList;
import java.util.List;

//Finish time:17h
//ID:104

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);	
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		
		int counter = 0;
		for (int i = frames.size() -1; i>=0; --i);{
		counter += frames.get(0).score();
		}
		
		return counter;
		
	}
}
