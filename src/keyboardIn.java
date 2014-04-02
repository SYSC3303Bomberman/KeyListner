import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class keyboardIn{

	static char newInput;
	char wasPressed(){
		
		JFrame frame = new JFrame("keylistener");
		Container contentPane = frame.getContentPane();
		KeyListener listener = new KeyListener(){
			
			public void keyReleased(KeyEvent e){
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_UP){
					System.out.print('u');
					newInput = 'u';
				}else if(key == KeyEvent.VK_DOWN){
					System.out.print('d');
					newInput = 'd';
				}else if(key == KeyEvent.VK_LEFT){
					System.out.print('l');
					newInput = 'l';
				}else if(key == KeyEvent.VK_RIGHT){
					System.out.print('r');
					newInput = 'r';
				}else if(key == KeyEvent.VK_SPACE){
					System.out.print("bomb");
					newInput = 'b';
				}
			}
		
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		JTextField textField = new JTextField();
		textField.addKeyListener(listener);
		contentPane.add(textField, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		return newInput;
	}
}
