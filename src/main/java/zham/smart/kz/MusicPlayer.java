package zham.smart.kz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> music;

    public MusicPlayer(List<Music> music){
        this.music=music;
    }


    public String player()
    {
        int rand = (int) (Math.random()*3);
        System.out.println("rand="+rand);
    return "playing: " + music.get(rand);
    }


}
