

import java.util.LinkedList;
import java.util.List;

import com.sun.jna.Structure;

public class SDL_Rect extends Structure
{
	public int x, y, w, h;
	
	@Override
	public List<String> getFieldOrder()
	{
		return null;
	}
}