package me.geon.thread.ch4;

import me.geon.thread.Utils;

public class Join {
	public static void main(String[] args) {
		Utils.logger("Main Start ====");

		new Job()

		Utils.logger("Main End ====");
	}

	static class Job implements Runnable {
		int startV;
		int endV;
		int rtn = 0;

		public Job(int startV, int endV) {
			this.startV = startV;
			this.endV = endV;
		}

		@Override
		public void run() {
			Utils.logger("작업시작");

			int sum = 0;
			for(int i = startV; i <= endV; i++) {
				sum += i;
			}
			rtn += sum;
			Utils.timeSleep(2000);
			Utils.logger("작업끝 result = "+ rtn);
		}
	}
}
