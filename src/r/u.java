package r;

import java.awt.BorderLayout;


import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.text.SimpleDateFormat;
import datechooser.beans.DateChooserCombo;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
public class u extends JFrame {

	private JPanel contentPane;
	 DateChooserCombo a;
	  JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					u frame = new u();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void map(String w,String h)
	{
		
		File f=new File(w);
		try
		{
			
			FileReader fi=new FileReader(f);
			BufferedReader b=new BufferedReader(fi);
			String l;
			o d=new o();
			d.setVisible(true);
		
			
			while((l=b.readLine())!=null)
			{
               
                
				
				 String lire="";
			    
			 for(int i=0;i<7;i++)
			 {
			      lire += "" + l.charAt(i);
			    
			     
			 }
			 if(h.equals(lire)) {
				  
					d.txtF.setText(l);
			 }
			}
		}
				catch(FileNotFoundException e)
				{
					System.err.print("not found");
				}
				catch (Exception e) {
					e.printStackTrace();}
				
	}
	/**
	 * Create the frame.
	 */
	public u() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String j=textField.getText();
				String r="ex3.txt";
				map(r,j);
				
			}
		});
		btnNewButton.setBounds(102, 37, 89, 23);
		contentPane.add(btnNewButton);
		
		DateChooserCombo dateChooserCombo = new DateChooserCombo();
		dateChooserCombo.setBounds(74, 112, 155, 20);
		contentPane.add(dateChooserCombo);
		
		JTextArea txtrDateaaaammjj = new JTextArea();
		txtrDateaaaammjj.setText("Date(AAAA-MM-JJ)");
		txtrDateaaaammjj.setBackground(Color.RED);
		txtrDateaaaammjj.setBounds(112, 79, 133, 22);
		contentPane.add(txtrDateaaaammjj);
		
		textField = new JTextField();
		textField.setBounds(251, 81, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("tunis");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String j=textField.getText();
				String r="nizar.txt";
				map(r,j);
				
			}
		});
		btnNewButton_1.setBounds(238, 37, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
