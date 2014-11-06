package me.looka.specialnative.keylog;

import java.io.IOException;

import me.looka.specialnative.Platform;
import me.looka.specialnative.utils.NativeUtils;

/**
 * Need to create the c code.
 * wip
 * @author Luca
 *
 */
public class KeyLogger {
	
	public static final KeyLogger INSTANCE = new KeyLogger();
	
	private KeyLogger() {
		try {
			NativeUtils.loadLibraryFromJar(Platform.isWindows() ? "/natives/JNIKeyloggerWIN.dll" : "/natives/JNIKeyloggerUNIX");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public native int getCurrentKey();
	
	public native boolean isPressed(int key);
	
	public native boolean isReleased(int key);

}
