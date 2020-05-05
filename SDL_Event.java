
import java.util.LinkedList;
import java.util.List;

import com.sun.jna.Structure;

public class SDL_Event extends Structure
{
	
	public int type = 0;
	/*
	public int display;
	
	public int window;

	public int key;

	public int edit;

	public int text;

	public int motion;

	public int button;

	public int wheel;

	public int jaxis;

	public int jball;

	public int jhat;

	public int jbutton;

	public int jdevice;

	public int caxis;

	public int cbutton;

	public int cdevice;

	public int adevice;

	public int sensor;

	public int quit;

	public int user;

	public int syswm;

	public int tfinger;

	public int mgesture;

	public int dgesture;

	public int drop;*/

	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		LinkedList<String> fields = new LinkedList<String>();
		fields.add("type");
		return fields;
	}

}