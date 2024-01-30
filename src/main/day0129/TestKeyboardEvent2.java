package day0129;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
//1.KeyListener를 implements
@SuppressWarnings("serial")
public class TestKeyboardEvent2 extends JFrame  {
	//3.이벤트 처리와 관련있는 컴포넌트를 인스턴스 변수로 선언.
	private JTextField jtf;
	private JTextArea jta;
	public TestKeyboardEvent2() {
		super("키보드 이벤트");
		
		jtf=new JTextField();
		jta=new JTextArea();
		
		JScrollPane jsp= new JScrollPane(jta);
		
		jtf.setBorder( new TitledBorder("아무 키나 누르세요"));
		jsp.setBorder( new TitledBorder("눌린 키의 정보"));
		
		//jtf에 이벤트가 발생하면이벤트를 감지할 수 있도록 이벤트 객체에 등록
		//2. anonymous inner class로 이벤트 처리

		jtf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent ke) {
				//눌린 키의 키 코드와 키 값을 얻는다.
				char c =ke.getKeyChar();
				int code = ke.getKeyCode();
				
//				JTextAtare에 추가
				jta.append("문자 : "+c + ",코드 :" +code + "\n");
//				ESC키가 눌렸을 때, 프로그램을 종료
//				코드 27
				if (code ==KeyEvent.VK_ESCAPE) {
					dispose();
				}
				//엔터 키가 눌렸을때 J.T.A에 엔터눌림을 추가.
				//코드 10
				if (code ==10) {
					jta.append("엔터눌림\n");
				}
				
			}
});		
		
		add("North",jtf);
		add("Center",jsp);
		
		setSize(400, 400);
		setVisible(true);
		
		//윈도우 종료 이벤트 처리
		addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
				
			}
			
		});
		
		
	}//TestKeyboardEvent
	

	public static void main(String[] args) {
		new TestKeyboardEvent2();
	}//main

}//class