
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
			PointerByReference renderer = sdl.SDLCreateRenderer(window, -1, 1);
			
			
			PointerByReference surface = sdl.SDLLoadBMP("test.bmp");
			if (surface == null)
			{
				System.out.println("Failed to load surface");
			}
			PointerByReference texture = sdl.SDLCreateTextureFromSurface(renderer, surface);
			if (texture == null)
			{
				System.out.println("Failed to load texture");
			}
			sdl.SDLFreeSurface(surface);
			
			sdl.SDLSetRenderDrawColour(renderer, 255, 255, 0, 255);
			
			boolean quit = false;
			
			while (!quit)
			{
				// Thread.sleep(100); // 60 fps
				
				
				PointerByReference event = sdl.SDLCreateEvent();
				if (sdl.SDLPollEvent(event) != 0)
				{
					if (sdl.SDLCheckEventType(event, 0x100) != 0)
					{
						quit = true;
					}
				}
				sdl.SDLDestroyEvent(event);
				
				
				sdl.SDLRenderClear(renderer);
				
				sdl.SDLRenderCopy(renderer, texture, null, null);
				
				sdl.SDLRenderPresent(renderer);
			}
			
			sdl.SDLDestroyTexture(texture);
			sdl.SDLDestroyRenderer(renderer);
			sdl.SDLDestroyWindow(window);
			
		}	
		
		sdl.SDLQuit();
	}
	
}