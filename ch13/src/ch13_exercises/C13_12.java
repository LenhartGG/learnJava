package ch13_exercises;

/**
 * 	龟兔赛跑
 * @author hliu047
 */
public class C13_12 {
	public static void main(String[] arg) {
		new wugui().run();
		new tuzi().run();
	}

	static class wugui {
		final int sudu = 4;// 乌龟的速度是每秒4米
		public static boolean hasEnd = false;// 是否已经跑到终点

		public void run() {
			new Thread() {
				public void run() {
					int distance = 0;
					while (distance < 100) {
						try {
							Thread.sleep(1000);
							distance += sudu;
							System.out.println("小乌龟跑了" + distance + "米");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					hasEnd = true;
					if (tuzi.hasEnd) {
						System.out.println("呜呜，差一点点就赢了~");
					} else {
						System.out.println("胜利是属于有准备的人的，你的自大害了你！-------乌龟赢了");
					}
				}
			}.start();
		}
	}

	static class tuzi {
		final int sudu = 5;// 兔子的速度是每秒5米
		public static boolean hasEnd = false;// 是否已经跑到终点

		public void run() {
			new Thread() {
				@Override
				public void run() {
					int distance = 0;// 跑了多少米
					boolean hasXiuXi = false;// 是否休息过
					while (distance < 100) {
						try {
							Thread.sleep(1000);
							distance += sudu;
							System.out.println("小兔子跑了" + distance + "米");
							if (distance > 50 && !hasXiuXi) {
								System.out.println("小兔子累了，决定休息一会儿~");
								Thread.sleep((long) (10000 * Math.random()));
								System.out.println("小兔子休息够了，又开始跑了，决一胜负吧！");
								hasXiuXi = true;
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					hasEnd = true;
					if (wugui.hasEnd) {
						System.out.println("呜呜，早知道就不休息了~");
					} else {
						System.out.println("哇哈哈，你个战5渣也想赢我~~做梦去吧！！-------兔子赢了");
					}
				}
			}.start();
		}
	}
}
