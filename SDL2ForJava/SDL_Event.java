
package SDL2ForJava;

import java.util.LinkedList;
import java.util.List;

import com.sun.jna.Structure;

public class SDL_Event extends Structure
{
	
	public int type = 0;
	
	public int display = 0;
	
	public int window = 0;

	public int key = 0;

	public int edit = 0;

	public int text = 0;

	public int motion = 0;

	public int button = 0;

	public int wheel = 0;

	public int jaxis = 0;

	public int jball = 0;

	public int jhat = 0;

	public int jbutton = 0;

	public int jdevice = 0;

	public int caxis = 0;

	public int cbutton = 0;

	public int cdevice = 0;

	public int adevice = 0;

	public int sensor = 0;

	public int quit = 0;

	public int user = 0;

	public int syswm = 0;

	public int tfinger = 0;

	public int mgesture = 0;

	public int dgesture = 0;

	public int drop = 0;

	@Override
	protected List<String> getFieldOrder() {
		LinkedList<String> fields = new LinkedList<String>();
		fields.add("type");
		fields.add("display");
		fields.add("window");
		fields.add("key");
		fields.add("edit");
		fields.add("text");
		fields.add("motion");
		fields.add("button");
		fields.add("wheel");
		fields.add("jaxis");
		fields.add("jball");
		fields.add("jhat");
		fields.add("jbutton");
		fields.add("jdevice");
		fields.add("caxis");
		fields.add("cbutton");
		fields.add("cdevice");
		fields.add("adevice");
		fields.add("sensor");
		fields.add("quit");
		fields.add("user");
		fields.add("syswm");
		fields.add("tfinger");
		fields.add("mgesture");
		fields.add("dgesture");
		fields.add("drop");
		return fields;
	}

}