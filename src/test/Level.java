package test;
public class Level {
	
	char[][] data;
	
	public Level(char[][] data) {
		this.data=data;
	}

	public void changeData(int row,int col,char c){
		data[row][col]=c;
	}
}
