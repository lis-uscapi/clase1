

class Downloader {

    //PARA SABER CUANDO INICIA LA DESCARGA
    var downloadListener:DownloadListener?=null

    fun downloadFile(file:String){//esta descargando
        //desde la carpeta de interfas valida que la descarga inicio
        downloadListener?.onDownloadStarted()
        for(i in 1..10){//cada segundo
                Thread.sleep(600)//INICIA DESCARGA
                //marca el nprogreso de la descarga
                downloadListener?.onProgressUpdate(i*10)//para que aparesca(10%..20%...)

        }
        downloadListener?.onDownloadComplete(file)
    }

}