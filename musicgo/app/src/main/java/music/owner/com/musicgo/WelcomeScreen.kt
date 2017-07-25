package music.owner.com.musicgo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window

/**
 * Created by yuxinfeng on 17/5/10.
 */

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

    }
}
