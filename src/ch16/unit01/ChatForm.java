package ch16.unit01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatForm extends JFrame implements ActionListener, Runnable {
	private static final long serialVersionUID = 1L;

	private JTextField tf = new JTextField(); // 한줄 입력
	private JTextArea ta = new JTextArea(); // 여러줄 입력
	
	public ChatForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta.setEditable(false);
		JScrollPane pane = new JScrollPane(ta); // 창이 길어지면 스크롤바 생김
		add(pane, BorderLayout.CENTER);
		
		// JTextField에 ActionEvent 등록
		// JTextField에서 엔터를 누르면 ActionEvent 발생
		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);
		
		setTitle("채팅");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatForm();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String s = tf.getText().trim();
			if(s.isEmpty()) { // if(s.length() == 0){
				return;
			}
			
			try {
				
				ta.append("보냄> " + s + "\n");
				
				tf.setText("");
				tf.requestFocus();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
