
import java.util.Scanner;
import java.util.Arrays;
/**
��ά����ʾ����
1��һ�����μӌ�˿����Ա�����ɣ���3���༶��3��ѧԱ������
��¼ÿ��ѧԱ�ĳɼ���������ÿ�����ƽ���֡�
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
			System.out.println("��"+i+"��ƽ���ɼ�Ϊ��"+average);
		}
	
	}
}