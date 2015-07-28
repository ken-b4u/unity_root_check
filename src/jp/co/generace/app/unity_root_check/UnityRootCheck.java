package jp.co.generace.app.unity_root_check;
import java.io.IOException;

import com.unity3d.player.UnityPlayer;

public class UnityRootCheck {
	public static void isRooted(final String gameObjectName) {
		try {
			Runtime.getRuntime().exec("su");
			UnityPlayer.UnitySendMessage(gameObjectName, "OnCallBack", "Rooted");
		} catch (IOException e) {
			UnityPlayer.UnitySendMessage(gameObjectName, "OnCallBack", "Not Rooted");
		}
	}
}
