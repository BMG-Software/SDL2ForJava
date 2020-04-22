
import com.sun.jna.Library;
import com.sun.jna.ptr.*;

public interface SDLJava extends Library
{
	
	public int SDLInit(int flags);
	public void SDLQuit();
	
	public PointerByReference SDLCreateWindow(String title, int x, int y, int w, int h, int flags);
	public PointerByReference SDLCreateRenderer(PointerByReference window, int index, int flags);
	
	public void SDLDestroyWindow(PointerByReference window);
	public void SDLDestroyRenderer(PointerByReference renderer);
	
	public int SDLSetRenderDrawColour(PointerByReference renderer, int r, int g, int b, int a);
	
	public void SDLRenderClear(PointerByReference renderer);
	public void SDLRenderPresent(PointerByReference renderer);
	
	public String SDLGetError();
	
	
}