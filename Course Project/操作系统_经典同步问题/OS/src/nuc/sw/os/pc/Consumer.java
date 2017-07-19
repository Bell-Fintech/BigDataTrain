package nuc.sw.os.pc;

public class Consumer extends Thread {
	    //每次消费的产品数量
		private int num;
		//所放位置的仓库
		private Storage storage;
		//构造函数 设置仓库
		public Consumer(Storage storage){
			this.storage=storage;
		}
		//线程run函数
		public void run(){
			try {
				consume(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//调用仓库的生产函数
		private void consume(int num) throws InterruptedException {
			storage.consume(num);
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public Storage getStorage() {
			return storage;
		}
		public void setStorage(Storage storage) {
			this.storage = storage;
		}
}
