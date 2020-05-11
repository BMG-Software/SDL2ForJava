
package SDL2ForJava;

public class SDL_EventType
{
	
	public static final int SDL_FIRSTEVENT = 					0;

	/* Application events */
	public static final int SDL_QUIT =	 					0x100;

	/* iOS/Android/WinRT app events */
	public static final int SDL_APP_TERMINATING = 			0x101;
	public static final int SDL_APP_LOWMEMORY = 			0x102;
	public static final int SDL_APP_WILLENTERBACKGROUND = 	0x103;
	public static final int SDL_APP_DIDENTERBACKGROUND = 	0x104;
	public static final int SDL_APP_WILLENTERFOREGROUND = 	0x105;
	public static final int SDL_APP_DIDENTERFOREGROUND = 	0x106; 

	/* Display events */
	/* Only available in SDL 2.0.9 or higher. */
	public static final int SDL_DISPLAYEVENT = 				0x150;

	/* Window events */
	public static final int SDL_WINDOWEVENT = 				0x200;
	public static final int SDL_SYSWMEVENT = 				0x201;

	/* Keyboard events */
	public static final int SDL_KEYDOWN = 					0x300;
	public static final int SDL_KEYUP = 					0x301;
	public static final int SDL_TEXTEDITING = 				0x302;
	public static final int SDL_TEXTINPUT = 				0x303;
	public static final int SDL_KEYMAPCHANGED = 			0x304;

	/* Mouse events */
	public static final int SDL_MOUSEMOTION = 				0x400;
	public static final int SDL_MOUSEBUTTONDOWN = 			0x401;
	public static final int SDL_MOUSEBUTTONUP = 			0x402;
	public static final int SDL_MOUSEWHEEL =				0x403;

	/* Joystick events */
	public static final int SDL_JOYAXISMOTION = 			0x600;
	public static final int SDL_JOYBALLMOTION = 			0x601;
	public static final int SDL_JOYHATMOTION = 				0x602;
	public static final int SDL_JOYBUTTONDOWN = 			0x603;
	public static final int SDL_JOYBUTTONUP = 				0x604;
	public static final int SDL_JOYDEVICEADDED = 			0x605;
	public static final int SDL_JOYDEVICEREMOVED = 			0x606;

	/* Game controller events */
	public static final int SDL_CONTROLLERAXISMOTION = 		0x650;
	public static final int SDL_CONTROLLERBUTTONDOWN = 		0x651;
	public static final int SDL_CONTROLLERBUTTONUP = 		0x652;
	public static final int SDL_CONTROLLERDEVICEADDED = 	0x653;
	public static final int SDL_CONTROLLERDEVICEREMOVED = 	0x654;
	public static final int SDL_CONTROLLERDEVICEREMAPPED = 	0x655;

	/* Touch events */
	public static final int SDL_FINGERDOWN = 				0x700;
	public static final int SDL_FINGERUP = 					0x701;
	public static final int SDL_FINGERMOTION = 				0x702;

	/* Gesture events */
	public static final int SDL_DOLLARGESTURE = 			0x800;
	public static final int SDL_DOLLARRECORD = 				0x801;
	public static final int SDL_MULTIGESTURE = 				0x802;

	/* Clipboard events */
	public static final int SDL_CLIPBOARDUPDATE = 			0x900;

	/* Drag and drop events */
	public static final int SDL_DROPFILE =					0x1000;
	/* Only available in 2.0.4 or higher. */
	public static final int SDL_DROPTEXT = 					0x1001;
	public static final int SDL_DROPBEGIN = 				0x1002;
	public static final int SDL_DROPCOMPLETE = 				0x1003;

	/* Audio hotplug events */
	/* Only available in SDL 2.0.4 or higher. */
	public static final int SDL_AUDIODEVICEADDED = 			0x1100;
	public static final int SDL_AUDIODEVICEREMOVED = 		0x1101;

	/* Sensor events */
	/* Only available in SDL 2.0.9 or higher. */
	public static final int SDL_SENSORUPDATE = 				0x1200;

	/* Render events */
	/* Only available in SDL 2.0.2 or higher. */
	public static final int SDL_RENDER_TARGETS_RESET = 		0x2000;
	/* Only available in SDL 2.0.4 or higher. */
	public static final int SDL_RENDER_DEVICE_RESET = 		0x2001;

	/* Events SDL_USEREVENT through SDL_LASTEVENT are for
	 * your use, and should be allocated with
	 * SDL_RegisterEvents()
	 */
	public static final int SDL_USEREVENT = 				0x8000;

	/* The last event, used for bouding arrays. */
	public static final int SDL_LASTEVENT = 				0xFFFF;


}