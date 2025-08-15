package me.geon.thread;

import jdk.jshell.execution.Util;

public class volatile_1 {
	public static void main(String[] args) {
		Worker work = new Worker();
		Thread t1 = new Thread(work, "worker");

		Utils.logger("t1 start");
		t1.start();
		Utils.timeSleep(1000);
		work.flag = false;
		Utils.logger("work의 flag를 상태 : " + work.flag);

	}

	static class Worker implements Runnable {

		volatile boolean flag = true;

		@Override
		public void run() {

			while (flag) {

			}
			Utils.logger("작업종료");
		}
	}
}
