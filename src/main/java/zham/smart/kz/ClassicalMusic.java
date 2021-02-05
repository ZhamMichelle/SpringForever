package zham.smart.kz;

public class ClassicalMusic implements Music {
   private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("initialization");
    }

    public void doMyDestruct(){
        System.out.println("destruction");
    }

    @Override
    public String getSong(){
        return "Mocart";
    }
}
