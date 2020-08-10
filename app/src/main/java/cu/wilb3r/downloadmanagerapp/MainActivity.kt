package cu.wilb3r.downloadmanagerapp

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cu.wilb3r.downloadmanagerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDownload.setOnClickListener {
            DownloadManager.beginDownload(this, "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_640_3MG.mp4")
        }


        registerReceiver(DownloadManager.br, IntentFilter(android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE))
    }

}