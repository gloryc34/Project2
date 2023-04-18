import org.jfree.ui.RefineryUtilities;
/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 * Followed tutorial to graph from https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm
 * Generated ideas and got information from: https://commons.apache.org/proper/commons-math/  https://www.jfree.org/jfreechart/  https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm  https://www.youtube.com/watch?v=MifbwoCumX0&t=402s
 */
public class saltFunctionTester {
	
	 public static void main( String[ ] args ) {
		 //chart creation
	      saltFunction chart = new saltFunction("Graph1", "y=x^2");
	      chart.pack( );          
	      RefineryUtilities.centerFrameOnScreen( chart );          
	      chart.setVisible( true ); 
	   }
}
