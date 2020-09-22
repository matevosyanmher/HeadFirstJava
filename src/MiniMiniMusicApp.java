import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            MidiEvent notOne = new MidiEvent(a, 3);
            track.add(notOne);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteTwo = new MidiEvent(b, 3);
            track.add(noteTwo);

            ShortMessage c = new ShortMessage();
            c.setMessage(192, 1, 102, 0);
            MidiEvent noteThree = new MidiEvent(c, 3);
            track.add(noteThree);

            player.setSequence(seq);
            player.start();


        } catch (Exception es) {
            es.printStackTrace();
        }
    }
}