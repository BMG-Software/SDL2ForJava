
package SDL2ForJava;

import com.sun.jna.Library;
import com.sun.jna.ptr.PointerByReference;

public interface SDLJava extends Library
{

	public int SDL_Init(int flags);
	public int SDL_InitSubSystem(int flags);
	
	public void SDL_Quit();
	public void SDL_QuitSubSystem(int flags);
	
	public void SDL_WasInit(int flags);
	
	public SDL_Window SDL_CreateWindow(String title, int x, int y, int w, int h, int flags);
	public SDL_Renderer SDL_CreateRenderer(SDL_Window window, int index, int flags);
	
	public void SDL_DestroyWindow(SDL_Window window);
	public void SDL_DestroyRenderer(SDL_Renderer renderer);
	
	public int SDL_SetRenderDrawColor(SDL_Renderer renderer, int r, int g, int b, int a);
	
	public void SDL_RenderClear(SDL_Renderer renderer);
	public void SDL_RenderPresent(SDL_Renderer renderer);
	
	public String SDL_GetError();
	
	public PointerByReference SDL_RWFromFile(String file, String mode);
	public SDL_Surface SDL_LoadBMP_RW(PointerByReference src, int freesrc);
	
	
	public void SDL_FreeSurface(SDL_Surface surface);
	
	public SDL_Texture SDL_CreateTextureFromSurface(SDL_Renderer renderer, SDL_Surface surface);
	public void SDL_DestroyTexture(SDL_Texture texture);
	
	public int SDL_RenderCopy(SDL_Renderer renderer, SDL_Texture texture, SDL_Rect src, SDL_Rect dst);
	
	public int SDL_PollEvent(SDL_Event event);
	
}