package ch13_exercises;

/**
 * 	��������
 * @author hliu047
 */
public class C13_12 {
	public static void main(String[] arg) {
		new wugui().run();
		new tuzi().run();
	}

	static class wugui {
		final int sudu = 4;// �ڹ���ٶ���ÿ��4��
		public static boolean hasEnd = false;// �Ƿ��Ѿ��ܵ��յ�

		public void run() {
			new Thread() {
				public void run() {
					int distance = 0;
					while (distance < 100) {
						try {
							Thread.sleep(1000);
							distance += sudu;
							System.out.println("С�ڹ�����" + distance + "��");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					hasEnd = true;
					if (tuzi.hasEnd) {
						System.out.println("���أ���һ����Ӯ��~");
					} else {
						System.out.println("ʤ����������׼�����˵ģ�����Դ����㣡-------�ڹ�Ӯ��");
					}
				}
			}.start();
		}
	}

	static class tuzi {
		final int sudu = 5;// ���ӵ��ٶ���ÿ��5��
		public static boolean hasEnd = false;// �Ƿ��Ѿ��ܵ��յ�

		public void run() {
			new Thread() {
				@Override
				public void run() {
					int distance = 0;// ���˶�����
					boolean hasXiuXi = false;// �Ƿ���Ϣ��
					while (distance < 100) {
						try {
							Thread.sleep(1000);
							distance += sudu;
							System.out.println("С��������" + distance + "��");
							if (distance > 50 && !hasXiuXi) {
								System.out.println("С�������ˣ�������Ϣһ���~");
								Thread.sleep((long) (10000 * Math.random()));
								System.out.println("С������Ϣ���ˣ��ֿ�ʼ���ˣ���һʤ���ɣ�");
								hasXiuXi = true;
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					hasEnd = true;
					if (wugui.hasEnd) {
						System.out.println("���أ���֪���Ͳ���Ϣ��~");
					} else {
						System.out.println("�۹��������ս5��Ҳ��Ӯ��~~����ȥ�ɣ���-------����Ӯ��");
					}
				}
			}.start();
		}
	}
}
