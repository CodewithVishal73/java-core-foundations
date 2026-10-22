interface playable{
	void play();
}
class Guitar implements playable{
		@Override
		public void play(){
			System.out.println("Guitar is playing");
		}
}
class Piano implements playable{
		@Override
		public void play(){
			System.out.println("Piano is playing");
		}
}
class Drum implements playable{
		@Override
		public void play(){
			System.out.println("Drum is playing");
		}
}
public class musicplay{
		public static void main(String [] args){
			     playable guitar= new Guitar();
			     playable piano= new Piano();
			     playable drum= new Drum();
			     guitar.play();
			     piano.play();
			     drum.play();
		}
}