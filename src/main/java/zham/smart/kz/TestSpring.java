package zham.smart.kz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//       Music music= context.getBean("musicBean", Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
//       musicPlayer.player();
//
//        MusicPlayer firstMusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//
//        MusicPlayer secondMusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        System.out.println(firstMusicPlayer==secondMusicPlayer);
//    firstMusicPlayer.setMusic(new Music() {
//        @Override
//        public String getSong() {
//            return "Love";
//        }
//    });
//        firstMusicPlayer.player();
//        secondMusicPlayer.player();
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        Music music=context.getBean("classicalMusic",Music.class);

        MusicPlayer musicPlayer=new MusicPlayer(music);

        musicPlayer.player();

        context.close();
    }
}
