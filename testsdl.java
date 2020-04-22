
import com.sun.jna.Native;
import com.sun.jna.ptr.*;

public class testsdl
{
	
	public static void main(String[] args)
	{
		SDLJava sdl = (SDLJava)Native.loadLibrary("SDL2", SDLJava.class);
		
		if (sdl.SDLInit(20 /* TODO: fix dirty magic numbers */) == 0)
		{
			
			PointerByReference window = sdl.SDLCreateWindow("Java SDL2 Window", 40, 40, 640, 480, 4);
			PointerByReference renderer = sdl.SDLCreateRenderer(window, -1, 0);
			
			sdl.SDLSetRenderDrawColour(renderer, 255, 255, 0, 255);
			
			while (true)
			{
				
				sdl.SDLRenderClear(renderer);
				
				
				sdl.SDLRenderPresent(renderer);
			}
			
		}	
	}
	
}