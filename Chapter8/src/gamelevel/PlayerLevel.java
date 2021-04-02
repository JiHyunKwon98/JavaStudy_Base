package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
	

}

/*
Player가 있고 이 Player가 게임을 합니다. 게임에서 Plqyer가 가지는 레벨에 따라 
run(), jump(),turn() 세가지 기능을 할 수 있습니다. 
각 레벨에 따라 기능가능 여부가 다음과 같습니다.

초보자 레벨 : 천천히 달립니다.(run()가능)
중급자 레벨 : 빠르게 달리고(run()가능), 점프(jump()가능)할 수 있습니다. 
고급자 레벨 : 엄청 빠르게 달리고(run()가능), 점프(jump()가능)하고, 
한바퀴 돌 수 있습니다. (turn()가능)
플레이어는 go()명령어를 받으면 이 세가지 기능을 수행합니다.
이중 할 수 없는 것은 할 수 없다는 메세지를 보냅니다.
플레이어는 go()명령어를 받으면 이 세가지 기능을 수행합니다.
이중 할 수 없는 것은 할 수 없다는 메세지를 보냅니다.
*/
