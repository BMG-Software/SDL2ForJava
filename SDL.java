
import com.sun.jna.Native;


public class SDL 
{
	
	// SDL_Init flags
	public static int SDL_INIT_TIMER = 			0x00000001;
	public static int SDL_INIT_AUDIO = 			0x00000010;
	public static int SDL_INIT_VIDEO = 			0x00000020;
	public static int SDL_INIT_JOYSTICK = 		0x00000200;
	public static int SDL_INIT_HAPTIC = 		0x00001000;
	public static int SDL_INIT_GAMECONTROLLER = 0x00002000;
	public static int SDL_INIT_EVENTS = 		0x00004000;
	public static int SDL_INIT_SENSOR = 		0x00008000;
	public static int SDL_INIT_NOPARACHUTE = 	0x00100000;
	public static int SDL_INIT_EVERYTHING = (
		SDL_INIT_TIMER | SDL_INIT_AUDIO | SDL_INIT_VIDEO |
		SDL_INIT_EVENTS | SDL_INIT_JOYSTICK | SDL_INIT_HAPTIC |
		SDL_INIT_GAMECONTROLLER | SDL_INIT_SENSOR
	);
	
	private SDLJava m_SDLInstance;
	
	public SDL()
	{
		m_SDLInstance = (SDLJava)Native.loadLibrary("SDL2", SDLJava.class);
	}

	public int Init(int flags)
	{
		return m_SDLInstance.SDL_Init(flags);
	}
	
	public int InitSubSystem(int flags)
	{
		return m_SDLInstance.SDL_InitSubSystem(flags);
	}
	
	public void Quit()
	{
		m_SDLInstance.SDL_Quit();
	}
	
	public void QuitSubSystem(int flags)
	{
		m_SDLInstance.SDL_QuitSubSystem(flags);
	}
	
	public void WasInit(int flags)
	{
		m_SDLInstance.SDL_WasInit(flags);
	}
	
	// SDL_Window flags
	public static int SDL_WINDOW_FULLSCREEN =		0x00000001;
	public static int SDL_WINDOW_OPENGL =			0x00000002;
	public static int SDL_WINDOW_SHOWN =			0x00000004;
	public static int SDL_WINDOW_HIDDEN =			0x00000008;
	public static int SDL_WINDOW_BORDERLESS =		0x00000010;
	public static int SDL_WINDOW_RESIZABLE =		0x00000020;
	public static int SDL_WINDOW_MINIMIZED =		0x00000040;
	public static int SDL_WINDOW_MAXIMIZED =		0x00000080;
	public static int SDL_WINDOW_INPUT_GRABBED =	0x00000100;
	public static int SDL_WINDOW_INPUT_FOCUS =		0x00000200;
	public static int SDL_WINDOW_MOUSE_FOCUS =		0x00000400;
	public static int SDL_WINDOW_FULLSCREEN_DESKTOP =
			(SDL_WINDOW_FULLSCREEN | 0x00001000);
	public static int SDL_WINDOW_FOREIGN =			0x00000800;
	public static int SDL_WINDOW_ALLOW_HIGHDPI =	0x00002000;	/* Requires >= 2.0.1 */
	public static int SDL_WINDOW_MOUSE_CAPTURE =	0x00004000;	/* Requires >= 2.0.4 */
	public static int SDL_WINDOW_ALWAYS_ON_TOP =	0x00008000;	/* Requires >= 2.0.5 */
	public static int SDL_WINDOW_SKIP_TASKBAR =		0x00010000;	/* Requires >= 2.0.5 */
	public static int SDL_WINDOW_UTILITY =			0x00020000;	/* Requires >= 2.0.5 */
	public static int SDL_WINDOW_TOOLTIP =			0x00040000;	/* Requires >= 2.0.5 */
	public static int SDL_WINDOW_POPUP_MENU =		0x00080000;	/* Requires >= 2.0.5 */
	public static int SDL_WINDOW_VULKAN =			0x10000000;	/* Requires >= 2.0.6 */
	
	public SDL_Window CreateWindow(String title, int x, int y, int w, int h, int flags)
	{
		return m_SDLInstance.SDL_CreateWindow(title, x, y, w, h, flags);
	}
	
	public void DestroyWindow(SDL_Window window)
	{
		m_SDLInstance.SDL_DestroyWindow(window);
	}
	
	// SDL_Renderer flags
	public static int SDL_RENDERER_SOFTWARE = 		0x00000001;
	public static int SDL_RENDERER_ACCELERATED = 	0x00000002;
	public static int SDL_RENDERER_PRESENTVSYNC = 	0x00000004;
	public static int SDL_RENDERER_TARGETTEXTURE = 	0x00000008;
	
	public SDL_Renderer CreateRenderer(SDL_Window window, int index, int flags)
	{
		return m_SDLInstance.SDL_CreateRenderer(window, index, flags);
	}
	
	public void DestroyRenderer(SDL_Renderer renderer)
	{
		m_SDLInstance.SDL_DestroyRenderer(renderer);
	}
	
	public int SetRenderDrawColor(SDL_Renderer renderer, int r, int g, int b, int a)
	{
		return m_SDLInstance.SDL_SetRenderDrawColor(renderer, r, g, b, a);
	}
	
	public void RenderClear(SDL_Renderer renderer)
	{
		m_SDLInstance.SDL_RenderClear(renderer);
	}
	
	public void RenderPresent(SDL_Renderer renderer)
	{
		m_SDLInstance.SDL_RenderPresent(renderer);
	}
	
	public String GetError()
	{
		return m_SDLInstance.SDL_GetError();
	}

	public int PollEvent(SDL_Event event)
	{
		return m_SDLInstance.SDL_PollEvent(event);
	}
	
}