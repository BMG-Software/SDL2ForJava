


public class testsdl
{
	
	public static void main(String[] args)
	{
		
		
		SDL sdl = new SDL();
		
		if (sdl.Init(SDL.SDL_INIT_VIDEO) == 0)
		{
		
			SDL_Window window = sdl.CreateWindow("Hello", 40, 40, 640, 480, SDL.SDL_WINDOW_SHOWN);
			SDL_Renderer renderer = sdl.CreateRenderer(window, -1, SDL.SDL_RENDERER_ACCELERATED);
			
			sdl.SetRenderDrawColor(renderer, 255, 0, 0, 255);
			
			boolean quit = false;

			SDL_Event event = new SDL_Event();
			while (!quit)
			{
				if (sdl.PollEvent(event) != 0)
				{
					if (event.type == SDL_EventType.SDL_QUIT)
					{
						quit = true;
					}
				}
				
				
				sdl.RenderClear(renderer);
				
				
				sdl.RenderPresent(renderer);
			}
		
		}
		else
		{
			System.out.println("Error initialising SDL");
		}
		sdl.Quit();
	}
	
}