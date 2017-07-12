package send_tost_module.sendtoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class SendToast {

    public static void sendShortToast(Context context, String message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
