
package SDL2ForJava;

import java.util.LinkedList;
import java.util.List;

import com.sun.jna.Structure;

public class SDL_Rect extends Structure
{
	public int x = 0, y = 0, w = 0, h = 0;
	
	@Override
	public List<String> getFieldOrder()
	{
		LinkedList<String> fields = new LinkedList<String>();
		fields.add("x");
		fields.add("y");
		fields.add("w");
		fields.add("h");
		return fields;
	}
}