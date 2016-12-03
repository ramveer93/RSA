package com.beta.friends.cmp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 * 
 * @author Ramveer
 *  Dated: 03-12-2916
 *  
 *  This is the main class. To start the GUI, just run this class
 */
public class Decoding {
	/*
	 * TEXT FIELDS FOR RSA PARAMENTERS
	 */
	final JTextField paramBitLeng=new JTextField();
	final JTextField paramP=new JTextField();
	final JTextField paramQ=new JTextField();
	final JTextField paramN=new JTextField();
	final JTextField paramPhi=new JTextField();
	final JTextField paramE=new JTextField();
	final JTextField paramD=new JTextField();
	/*
	 * TEXTFIELDS FOR ENCRYPTION DECRYPTION
	 */
	final JTextArea orgMessage=new JTextArea();
	final JTextArea decodedMessage=new JTextArea();
	final JTextArea cyperMessage=new JTextArea();
	
	final JTextArea decodedMessageBob=new JTextArea();
	final JTextArea decryptedMessage=new JTextArea();
	
	/*
	 * labels for encryption decryption
	 */
	final JLabel decodedMessageLabel=new JLabel(Constants.DECODED_MESSAGE);
	final JLabel cyperMessageLabel=new JLabel(Constants.ENCRYPTED_MESSAGE);	
	final JLabel decodedMessageBobLabel=new JLabel(Constants.DECYPER_DECODED_MESSAGE);
	final JLabel decryptedMessageLabel=new JLabel(Constants.DECRYPTED_MESSAGE);
	/*
	 * LABELS FOR CORROSPONDING FIELDS
	 */
	final JLabel BitLenlabel=new JLabel(Constants.BIT_LENGTH);
	final JLabel Plabel=new JLabel(Constants.P);
	final JLabel Qlabel=new JLabel(Constants.Q);
	final JLabel Nlabel=new JLabel(Constants.N);
	final JLabel Philabel=new JLabel(Constants.PHI);
	final JLabel Elabel=new JLabel(Constants.E);
	final JLabel Dlabel=new JLabel(Constants.D);
	/*
	 * Alice label
	 */
	final JLabel alice=new JLabel(Constants.ALICE2);
	/*
	 * Bob label
	 */
	final JLabel bob=new JLabel(Constants.BOB2);
	
	final JButton hide=new JButton(Constants.HIDE2);
	final JButton show=new JButton(Constants.SHOW2);
	final JButton send=new JButton(Constants.SEND2);	
	String message;
	static BigInteger m;
	Decoding(String message){
		this.message=message;
		System.out.println("Message is : "+message);
		/*
		 * convert the message into bigInteger
		 */
		m=new BigInteger(message.getBytes());
		System.out.println("Decoded message is  "+m);
	}
	Decoding(){
		JFrame jf=new JFrame(Constants.RSA_DEMO);
		jf.setVisible(true);
		jf.setSize(700,600);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setForeground(Color.blue);
		
		final JPanel panel=new JPanel();
		jf.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.blue);
		//RSA parameters label
				final JLabel l1=new JLabel(Constants.RSA_PARAMETERS);
				jf.add(panel.add(l1));
				l1.setBounds(20,10,300,30);   
				/*
				 * bit length label
				 */
				BitLenlabel.setBounds(20, 50, 260, 30);
				jf.add(panel.add(BitLenlabel));
				
				paramBitLeng.setBounds(90, 50, 260, 30);
				jf.add(panel.add(paramBitLeng));
				paramBitLeng.setText(Constants.ENTER_BIT_LENGTH);
				paramBitLeng.setEditable(true);
				/*
				 * HIDE BUTTON
				 */
				hide.setBounds(400, 50, 100, 30);
				jf.add(hide);
				/*
				 * SHOW BUTTON
				 */
				show.setBounds(520, 50, 100, 30);
				jf.add(show);
				/*
				 * ACTION
				 */
				hide.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						paramP.setVisible(false);
						paramQ.setVisible(false);
						paramN.setVisible(false);
						paramPhi.setVisible(false);
						paramD.setVisible(false);
						paramE.setVisible(false);
						/*
						 * labels
						 */
						Plabel.setVisible(false);
						Qlabel.setVisible(false);
						Nlabel.setVisible(false);
						Philabel.setVisible(false);
						Dlabel.setVisible(false);
						Elabel.setVisible(false);
					}
				});
				show.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						paramP.setVisible(true);
						paramQ.setVisible(true);
						paramN.setVisible(true);
						paramPhi.setVisible(true);
						paramD.setVisible(true);
						paramE.setVisible(true);
						/*
						 * labels
						 */
						Plabel.setVisible(true);
						Qlabel.setVisible(true);
						Nlabel.setVisible(true);
						Philabel.setVisible(true);
						Dlabel.setVisible(true);
						Elabel.setVisible(true);
					}
					
				});
				/*
				 * P
				 */
				Plabel.setBounds(50, 100, 300, 30);
				jf.add(panel.add(Plabel));
				paramP.setBounds(90, 100, 260, 30);
				jf.add(panel.add(paramP));
				paramP.setText(Constants.VALUE_OF_P);
				paramP.setEditable(false);
				/*
				 * Q
				 */
				Qlabel.setBounds(370, 100, 300, 30);
					jf.add(panel.add(Qlabel));
					paramQ.setBounds(400, 100, 260, 30);
					jf.add(panel.add(paramQ));
					paramQ.setText(Constants.VALUE_OF_Q);
					paramQ.setEditable(false);
					/*
					 * N
					 */
					Nlabel.setBounds(50, 140, 300, 30);
						jf.add(panel.add(Nlabel));
						paramN.setBounds(90, 140, 260, 30);
						jf.add(panel.add(paramN));
						paramN.setText(Constants.VALUE_OF_N);
						paramN.setEditable(false);
						/*
						 * Phi
						 */
						Philabel.setBounds(370, 140, 300, 30);
						jf.add(panel.add(Philabel));
						paramPhi.setBounds(400, 140, 260, 30);
						jf.add(panel.add(paramPhi));
						paramPhi.setText(Constants.VALUE_OF_PHI);
						paramPhi.setEditable(false);
						/*
						 * E 
						 */
						Elabel.setBounds(50, 180, 300, 30);
						jf.add(panel.add(Elabel));
						paramE.setBounds(90, 180, 260, 30);
						jf.add(panel.add(paramE));
						paramE.setText(Constants.VALUE_OF_E);
						paramE.setEditable(false);
						/*
						 * D 
						 */
						Dlabel.setBounds(370, 180, 300, 30);
						jf.add(panel.add(Dlabel));
						paramD.setBounds(400, 180, 260, 30);
						jf.add(panel.add(paramD));
						paramD.setText(Constants.VALUE_OF_D);
						paramD.setEditable(false);
						/*
						 * alice label
						 */
						alice.setBounds(5, 190, 80, 200);
		                alice.setIcon(new ImageIcon("Images/Alice.jpg"));
		                jf.add(panel.add(alice));
		                /*
		                 * bob label
		                 */
		                bob.setBounds(610, 190, 80, 200);
		                bob.setIcon(new ImageIcon("Images/Bob.jpg"));
		                jf.add(panel.add(bob));
		               /*
		                * alice message
		                */
		                orgMessage.setBounds(90, 250, 260, 60);
		                jf.add(panel.add(orgMessage));
		                /*
		                 * SEND BUTTON
		                 */
		                send.setBounds(400, 250, 100, 30);
		                jf.add(panel.add(send));
		                /*
		                 * SEND BUTTON ACTION
		                 */
		                send.addActionListener(new ActionListener(){
							@Override
							public void actionPerformed(ActionEvent e) {
								Thread t=new Thread(){
									public void run(){
								/*
								 * BIT LENGTH
								 */
								int exception=9;
								int bLen = 0;
								try{
							 bLen=Integer.parseInt(paramBitLeng.getText());
								}
								catch(Exception exc){
									exception=10;
								}
								if(exception!=10 && orgMessage.getText().length()>2 ){
								Rsa rsaM=new Rsa(bLen);
								Decoding decoding=new Decoding(orgMessage.getText());
								Encryption encryption=new Encryption(rsaM, decoding);
								Decryption decryption=new Decryption(encryption);
								DecryptedMessage(decryption.m);
								System.out.println("blen is "+bLen);
								System.out.println("Message is "+orgMessage.getText());
								paramP.setText((rsaM.p).toString());
								paramQ.setText((rsaM.q).toString());
								paramN.setText((rsaM.n).toString());
								paramPhi.setText((rsaM.phi).toString());
								paramE.setText((rsaM.e).toString());
								paramD.setText((rsaM.d).toString());
								decodedMessage.setText((decoding.m).toString());
								cyperMessage.setText((encryption.c).toString());
								decodedMessageBob.setText((decryption.m).toString());
								decryptedMessage.setText(DecryptedMessage(decryption.m));
								}
								else{
									if(exception==10){
									JOptionPane.showMessageDialog(null, Constants.PLEASE_PROVIDE_A_NUMBER_FOR_BIT_LENGTH);
									}
									if(orgMessage.getText().length()==0){
										JOptionPane.showMessageDialog(null, Constants.PLEASE_ENTER_A_MESSAGE);
									}	
								}
								try {
				                      sleep(100);  // milliseconds
				                   } catch (InterruptedException ex) {}
							}
						};
						t.start();
		                }
						});
		                /*
		                 * decoded alice message
		                 */
		                decodedMessageLabel.setBounds(90, 320, 200, 30);
		                jf.add(panel.add(decodedMessageLabel));
		                decodedMessage.setBounds(90, 360, 260, 60);
		                jf.add(panel.add(decodedMessage));
		                /*
		                 * cyper message
		                 */
		                cyperMessageLabel.setBounds(90, 430, 200,30);
		                jf.add(panel.add(cyperMessageLabel));
		                cyperMessage.setBounds(90, 480, 260, 60);
		                jf.add(panel.add(cyperMessage));
		                decodedMessageBob.setBounds(420, 480, 260, 60);
		                jf.add(panel.add(decodedMessageBob));
		                decodedMessageBobLabel.setBounds(420, 430, 200, 30);
		                jf.add(panel.add(decodedMessageBobLabel));
		                decryptedMessage.setBounds(420, 360, 260, 60);
		                jf.add(panel.add(decryptedMessage));
		                decryptedMessageLabel.setBounds(420, 320, 200, 30);
		                jf.add(panel.add(decryptedMessageLabel));	
	}
	public static String DecryptedMessage(BigInteger m){
		/*
		 * again convert the bigInteger number into string
		 */
		String messageString=new String(m.toByteArray());	
		System.out.println("Original Message was "+messageString);
		return messageString;
	}

	public static void main(String arg[]){
		SwingUtilities.invokeLater(new Runnable(){
	  public void run(){
		  new Decoding();
	  } 
   });
	}
}
