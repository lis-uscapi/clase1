/*class App:DownloadListener{
    //lo que pasa en cada procesos DownloadListener y Downloader
    //cuando se inicia descarga
    override fun onDownloadStarted() {
        println("Download started")
    }

    //cuando se termina la descarga
    override fun onDownloadComplete(file: String) {
        println("$file downloaded")
    }

    //proceso de la descarga(porcentaje)
    override fun onProgressUpdate(progress: Int) {
        println("$progress% downloaded")
    }
} */
fun main() {
    //val downloadListener=App()
    //para volverlo un objeto

    val downloader=Downloader()
    //downloader.downloadListener=downloadListener
    downloader.downloadListener= object : DownloadListener{

        override fun onDownloadStarted() {
            println("Download started")
        }
        override fun onDownloadComplete(file: String) {
            println("$file downloaded")
        }
        override fun onProgressUpdate(progress: Int) {
            println("$progress% downloaded")
        }
    }
        downloader.downloadFile("newSong.mp3")



}