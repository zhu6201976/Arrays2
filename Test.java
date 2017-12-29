
import java.util.Scanner;
import java.util.Arrays;
/**
多维数组示例：
1、一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
记录每个学员的成绩，并计算每个班的平均分。
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int [][] scores = {{98,99,100},{80,78,85},{70,68,77}};
		
		for(int i=0;i<scores.length;i++){
			float sum = 0;
			float average =0;
			for(int j=0;j<scores[i].length;j++){
				sum +=scores[i][j];
			}
			average = sum/scores[i].length;
			System.out.println("第"+i+"班平均成绩为："+average);
		}
	
	}
}