public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come Together";
        song.duration = 4;
        song.play();
        song.printDetails();
    }
}
