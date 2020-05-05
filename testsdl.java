


public class testsdl
{
	
	public static void main(String[] args)
	{
		
		
		SDL sdl = new SDL();
		
		if (sdl.Init(SDL.SDL_INIT_VIDEO) == 0)
		{
		
			SDL_Window window = sdl.CreateWindow("Hello", 40, 40, 640, 480, 4);
			SDL_Renderer renderer = sdl.CreateRenderer(window, -1, 1);
			
			sdl.SetRenderDrawColor(renderer, 255, 0, 0, 255);
			
			while (true)
			{
				sdl.RenderClear(renderer);
				
				
				sdl.RenderPresent(renderer);
			}
		
		}
		else
		{
			System.out.println("Error initialising SDL");
		}
		sdl.Quit();
		/*
		SDLJava sdl = (SDLJava)Native.loadLibrary("SDL2", SDLJava.class);
		
		if (sdl.SDL_Init(20) == 0)
		{
			
			PointerByReference window = sdl.SDL_CreateWindow("Java SDL2 Window", 40, 40, 640, 480, 4);
			PointerByReference renderer = sdl.SDL_CreateRenderer(window, -1, 1);
			
			
			PointerByReference surface = sdl.SDL_LoadBMP("test.bmp");
			if (surface == null)
			{
				System.out.println("Failed to load surface");
			}
			PointerByReference texture = sdl.SDL_CreateTextureFromSurface(renderer, surface);
			if (texture == null)
			{
				System.out.println("Failed to load texture");
			}
			sdl.SDL_FreeSurface(surface);
			
			sdl.SDL_SetRenderDrawColour(renderer, 255, 255, 0, 255);
			
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
				
				
				sdl.SDL_RenderClear(renderer);
				
				sdl.SDL_RenderCopy(renderer, texture, null, null);
				
				sdl.SDL_RenderPresent(renderer);
			}
			
			sdl.SDL_DestroyTexture(texture);
			sdl.SDL_DestroyRenderer(renderer);
			sdl.SDL_DestroyWindow(window);
			
		}	
		
		sdl.SDL_Quit();
		
		*/
		
	}
	
}