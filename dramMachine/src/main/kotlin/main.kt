import kotlinx.coroutines.*
import java.io.File
import javax.sound.sampled.AudioSystem

suspend fun playBeats(beats: String, file: String){
    val parts = beats.split("x")
    var count = 0

    for (part in parts){
        count += part.length + 1
        if (part == ""){
            playSong(file)
        }else{
            delay(100 * (part.length + 1L))
            if (count < beats.length){
                playSong(file)
            }
        }
    }

}

fun playSong(file: String){
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(
            file
        )
    )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main(){
    runBlocking {
        launch {
            playBeats(
                "x-x-x-x-x-x-x-x-x-x-x-x-",
                "/home/naron/Рабочий стол/kotlin head first/dramMachine/src/main/resources/audio/toms.aiff"
            )
        }
        playBeats(
            "x-----x-----x-----x-----",
            "/home/naron/Рабочий стол/kotlin head first/dramMachine/src/main/resources/audio/crash_cymbal.aiff"
        )
    }
}