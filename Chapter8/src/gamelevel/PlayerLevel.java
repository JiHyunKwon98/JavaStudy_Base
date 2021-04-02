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
Player�� �ְ� �� Player�� ������ �մϴ�. ���ӿ��� Plqyer�� ������ ������ ���� 
run(), jump(),turn() ������ ����� �� �� �ֽ��ϴ�. 
�� ������ ���� ��ɰ��� ���ΰ� ������ �����ϴ�.

�ʺ��� ���� : õõ�� �޸��ϴ�.(run()����)
�߱��� ���� : ������ �޸���(run()����), ����(jump()����)�� �� �ֽ��ϴ�. 
����� ���� : ��û ������ �޸���(run()����), ����(jump()����)�ϰ�, 
�ѹ��� �� �� �ֽ��ϴ�. (turn()����)
�÷��̾�� go()��ɾ ������ �� ������ ����� �����մϴ�.
���� �� �� ���� ���� �� �� ���ٴ� �޼����� �����ϴ�.
�÷��̾�� go()��ɾ ������ �� ������ ����� �����մϴ�.
���� �� �� ���� ���� �� �� ���ٴ� �޼����� �����ϴ�.
*/
