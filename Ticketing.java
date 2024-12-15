import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ColorModel;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JTextField;

public class Ticketing extends JFrame {

	private JPanel contentPane;
	int num;
	JTextField textField;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_6;
	int selected = 0;
	int a =0;
	int i = 0;
	int tix;
	int counter = 0;
	int[] seatNo = new int[15];
	float priceA = 8.50f, priceB = 8.00f, priceC=5.5f;
	float totalPrice = 0, refreshPrice=0;
	TicketingController c;
	JButton btnCancel ;
	JButton btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, 
	btnNewButton_5, btnNewButton_6, btnNewButton_7, btnNewButton_8, 
	btnNewButton_9, btnNewButton_10, btnNewButton_11, btnNewButton_12, 
	btnNewButton_13, btnNewButton_14, btnNewButton_15;
	JFrame jf2;
	JTextArea ta;
	
	
	JFrame jf;
	JTextField textField_10;
	JTextField textField_11;
	JTextField textField_12;
	JPanel contentPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketing frame = new Ticketing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ticketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 c = new TicketingController();
		 viewBookings();
		
		JPanel panel_17 = new JPanel();
		contentPane.add(panel_17, BorderLayout.SOUTH);
		panel_17.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel_17.add(panel);
		panel.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 5, 5, 5));

		// SEAT 1
		btnNewButton_1 = new JButton("1");

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_1) {
					if (i == 0) {
						btnNewButton_1.setBackground(Color.RED);
						selected++;
						seatNo[counter] = 1;
						counter++;
						btnNewButton_1.setEnabled(false);
						lblNewLabel_4.setText("Number of seats reserved is : "
								+ selected);

						if (selected > 2) {
							totalPrice = selected * priceB;
						} else {
							totalPrice = selected * priceA;
						}

						lblNewLabel_5.setText("Cost of total tickets is : $"
								+ totalPrice);
					} else {
						btnNewButton_1.setBackground(Color.BLUE);

						i++;
					}
				}
			}
		});
		panel_2.add(btnNewButton_1);

		// SEAT 2
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				{

					if (evt.getSource() == btnNewButton_2) {
						if (i == 0) {
							btnNewButton_2.setBackground(Color.RED);
							selected++;
							seatNo[counter] = 2;
							counter++;
							btnNewButton_2.setEnabled(false);
							lblNewLabel_4
									.setText("Number of seats reserved is : "
											+ selected);
							if (selected > 2) {
								totalPrice = selected * priceB;
							} else {
								totalPrice = selected * priceA;
							}

							lblNewLabel_5.setText("Cost of total tickets is : $"
									+ totalPrice);
						} else {
							btnNewButton_2.setBackground(Color.BLUE);

							i++;
						}
					}
				}
			}
		});
		panel_2.add(btnNewButton_2);

		// SEAT 3
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_3) {
					if (i % 2 == 0)
						btnNewButton_3.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 3;
					counter++;
					btnNewButton_3.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is :"
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_3.setBackground(Color.BLUE);

					i++;

				}
			}
		});

		panel_2.add(btnNewButton_3);

		// SEAT 4
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_4) {
					if (i == 0)
						btnNewButton_4.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 4;
					counter++;
					btnNewButton_4.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_4.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_4);

		// SEAT 5
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_5) {
					if (i == 0)
						btnNewButton_5.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 5;
					counter++;
					btnNewButton_5.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : $"
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_5.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_5);

		// SEAT 6
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_6) {
					if (i == 0)
						btnNewButton_6.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 6;
					counter++;
					btnNewButton_6.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_6.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_6);

		// SEAT 7
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_7) {
					if (i == 0)
						btnNewButton_7.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 7;
					counter++;
					btnNewButton_7.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : $"
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_7.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_7);

		btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_8) {
					if (i == 0)
						btnNewButton_8.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 8;
					counter++;
					btnNewButton_8.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_8.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_8);

		// SEAT 9
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_9) {
					if (i == 0)
						btnNewButton_9.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 9;
					counter++;
					btnNewButton_9.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				}

				else {
					btnNewButton_9.setBackground(Color.BLUE);

					i++;
				}

			}
		});
		panel_2.add(btnNewButton_9);

		// SEAT 10
		btnNewButton_10 = new JButton("10");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_10) {
					if (i == 0)
						btnNewButton_10.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 10;
					counter++;
					btnNewButton_10.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				}

				else {
					btnNewButton_10.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_10);

		// SEAT 11

		btnNewButton_11 = new JButton("11");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_11) {
					if (i == 0)
						btnNewButton_11.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 11;
					counter++;
					btnNewButton_11.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_11.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_11);

		// SEAT 12
		btnNewButton_12 = new JButton("12");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_12) {
					if (i == 0)
						btnNewButton_12.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 12;
					counter++;
					btnNewButton_12.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_12.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_12);

		// SEAT 13
		btnNewButton_13 = new JButton("13");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_13) {
					if (i == 0)
						btnNewButton_13.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 13;
					counter++;
					btnNewButton_13.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is : "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is : $"
							+ totalPrice);
				} else {
					btnNewButton_13.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_13);

		// SEAT 14

		btnNewButton_14 = new JButton("14");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_14) {
					if (i == 0)
						btnNewButton_14.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 14;
					counter++;
					btnNewButton_14.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is: "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is: $"
							+ totalPrice);
				} else {
					btnNewButton_14.setBackground(Color.BLUE);

					i++;

				}

			}
		});
		panel_2.add(btnNewButton_14);

		// SEAT 15

		btnNewButton_15 = new JButton("15");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (evt.getSource() == btnNewButton_15) {
					if (i == 0)
						btnNewButton_15.setBackground(Color.RED);
					selected++;
					seatNo[counter] = 15;
					counter++;
					btnNewButton_15.setEnabled(false);
					lblNewLabel_4.setText("Number of seats reserved is: "
							+ selected);
					if (selected > 2) {
						totalPrice = selected * priceB;
					} else {
						totalPrice = selected * priceA;
					}

					lblNewLabel_5.setText("Cost of total tickets is: $"
							+ totalPrice);
				} else {
					btnNewButton_15.setBackground(Color.BLUE);

					i++;

				}

			}
		});

		panel_2.add(btnNewButton_15);

		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_3.setBackground(Color.BLUE);
		btnNewButton_4.setBackground(Color.BLUE);
		btnNewButton_5.setBackground(Color.BLUE);
		btnNewButton_6.setBackground(Color.BLUE);
		btnNewButton_7.setBackground(Color.BLUE);
		btnNewButton_8.setBackground(Color.BLUE);
		btnNewButton_9.setBackground(Color.BLUE);
		btnNewButton_10.setBackground(Color.BLUE);
		btnNewButton_11.setBackground(Color.BLUE);
		btnNewButton_12.setBackground(Color.BLUE);
		btnNewButton_13.setBackground(Color.BLUE);
		btnNewButton_14.setBackground(Color.BLUE);
		btnNewButton_15.setBackground(Color.BLUE);

		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_5, BorderLayout.NORTH);

		JLabel lblReserveSeatsBy = new JLabel(
				"Reserve seats by clicking on them!");
		panel_5.add(lblReserveSeatsBy);
		lblReserveSeatsBy.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel lblSeatsAvailable = new JLabel(
				"Seats Available :  BLUE \t Reserved : RED \t Confirmed : GRAY ");
		lblSeatsAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblSeatsAvailable);

		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8, BorderLayout.WEST);

		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_7, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel(
				"Price per ticket : $8.50($8 promo price for 3 or more )");
		panel_7.add(lblNewLabel_1);

		JPanel panel_10 = new JPanel();
		panel_3.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_11.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_10.add(panel_11);

		JLabel lblNewLabel_2 = new JLabel(
				"Price per refreshment pack(Coke + Popcorn) ; $5.50");
		panel_11.add(lblNewLabel_2);

		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton_17 = new JButton("Confirm");
		btnNewButton_17.addActionListener(new ConfirmHandler());
		panel_12.add(btnNewButton_17);

		JButton btnNewButton_16 = new JButton("Reset");
		btnNewButton_16.addActionListener(new ActionListener() {
			private JLabel lblNewLabel_3;

			public void actionPerformed(ActionEvent e) {
                
				selected = 0;
				lblNewLabel_4.setText("Number of seats reserved is: " + selected);
				lblNewLabel_5.setText("Cost of total tickets is: $" + selected);
				lblNewLabel_6.setText("Cost of total refreshment packs is: $"+ selected);
				textField.setText("0");
				totalPrice = 0;
				refreshPrice = 0;
				a = 0;
			
				if(btnNewButton_1.getBackground() == Color.RED)
				{
					btnNewButton_1.setBackground(Color.BLUE);
					btnNewButton_1.setEnabled(true);
				}
				if(btnNewButton_2.getBackground() == Color.RED)
				{
					btnNewButton_2.setBackground(Color.BLUE);
					btnNewButton_2.setEnabled(true);
				}
				if(btnNewButton_3.getBackground() == Color.RED)
				{
					btnNewButton_3.setBackground(Color.BLUE);
					btnNewButton_3.setEnabled(true);
				}
				if(btnNewButton_4.getBackground() == Color.RED)
				{
					btnNewButton_4.setBackground(Color.BLUE);
					btnNewButton_4.setEnabled(true);
				}
				if(btnNewButton_5.getBackground() == Color.RED)
				{
					btnNewButton_5.setBackground(Color.BLUE);
					btnNewButton_5.setEnabled(true);
				}
				if(btnNewButton_6.getBackground() == Color.RED)
				{
					btnNewButton_6.setBackground(Color.BLUE);
					btnNewButton_6.setEnabled(true);
				}
				if(btnNewButton_7.getBackground() == Color.RED)
				{
					btnNewButton_7.setBackground(Color.BLUE);
					btnNewButton_7.setEnabled(true);
				}
				if(btnNewButton_8.getBackground() == Color.RED)
				{
					btnNewButton_8.setBackground(Color.BLUE);
					btnNewButton_8.setEnabled(true);
				}
				if(btnNewButton_9.getBackground() == Color.RED)
				{
					btnNewButton_9.setBackground(Color.BLUE);
					btnNewButton_9.setEnabled(true);
				}
				if(btnNewButton_10.getBackground() == Color.RED)
				{
					btnNewButton_10.setBackground(Color.BLUE);
					btnNewButton_10.setEnabled(true);
				}
				if(btnNewButton_11.getBackground() == Color.RED)
				{
					btnNewButton_11.setBackground(Color.BLUE);
					btnNewButton_11.setEnabled(true);
				}
				if(btnNewButton_12.getBackground() == Color.RED)
				{
					btnNewButton_12.setBackground(Color.BLUE);
					btnNewButton_12.setEnabled(true);
				}
				if(btnNewButton_13.getBackground() == Color.RED)
				{
					btnNewButton_13.setBackground(Color.BLUE);
					btnNewButton_13.setEnabled(true);
				}
				if(btnNewButton_14.getBackground() == Color.RED)
				{
					btnNewButton_14.setBackground(Color.BLUE);
					btnNewButton_14.setEnabled(true);
				}
				if(btnNewButton_15.getBackground() == Color.RED)
				{
					btnNewButton_15.setBackground(Color.BLUE);
					btnNewButton_15.setEnabled(true);
				}
				
			}
		});
		panel_12.add(btnNewButton_16);
		
		JButton btnNewButton_18 = new JButton("Reset All");
		btnNewButton_18.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
                
				selected = 0;
				lblNewLabel_4.setText("Number of seats reserved is: " + selected);
				lblNewLabel_5.setText("Cost of total tickets is: $" + selected);
				lblNewLabel_6.setText("Cost of total refreshment packs is: $"+ selected);
				textField.setText("0");
				totalPrice = 0;
				refreshPrice = 0;
				a = 0;
			
				c.resetBooking(); //delete the vector
				
				btnNewButton_1.setBackground(Color.BLUE);
				btnNewButton_1.setEnabled(true);
				btnNewButton_2.setBackground(Color.BLUE);
				btnNewButton_2.setEnabled(true);
				btnNewButton_3.setBackground(Color.BLUE);
				btnNewButton_3.setEnabled(true);
				btnNewButton_4.setBackground(Color.BLUE);
				btnNewButton_4.setEnabled(true);
				btnNewButton_5.setBackground(Color.BLUE);
				btnNewButton_5.setEnabled(true);
				btnNewButton_6.setBackground(Color.BLUE);
				btnNewButton_6.setEnabled(true);
				btnNewButton_7.setBackground(Color.BLUE);
				btnNewButton_7.setEnabled(true);
				btnNewButton_8.setBackground(Color.BLUE);
				btnNewButton_8.setEnabled(true);
				btnNewButton_9.setBackground(Color.BLUE);
				btnNewButton_9.setEnabled(true);
				btnNewButton_10.setBackground(Color.BLUE);
				btnNewButton_10.setEnabled(true);
				btnNewButton_11.setBackground(Color.BLUE);
				btnNewButton_11.setEnabled(true);
				btnNewButton_12.setBackground(Color.BLUE);
				btnNewButton_12.setEnabled(true);
				btnNewButton_13.setBackground(Color.BLUE);
				btnNewButton_13.setEnabled(true);
				btnNewButton_14.setBackground(Color.BLUE);
				btnNewButton_14.setEnabled(true);
				btnNewButton_15.setBackground(Color.BLUE);
				btnNewButton_15.setEnabled(true);
			}
		});
		panel_12.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("View Bookings");
		btnNewButton_19.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector v = c.getAllTicketEntity();
				jf2.setVisible(true);
				ta.setText("");
				ta.setText("Name\tNo. Of Seats\tSeat Number(s)\tRefreshment Number\tTotal Cost\n");
				int count = 0;
				
				for(int i = 0; i < v.size(); i++)
				{
					TicketEntity te = null;
					te = (TicketEntity) v.get(i);
					ta.append(te.getName()+"\t");
					ta.append(""+te.getNoOfSeats()+"\t");
					int[] a = te.getSeatNo();
					for(int z = count; z < count+te.getNoOfSeats(); z++)
					{
						ta.append(a[z]+"; ");
					}
					count += te.getNoOfSeats();
					ta.append("\t\t\t"+te.getRefreshment()+"\t");
					ta.append(te.getTotalCost()+"\n");
				}
			}
		});
		panel_12.add(btnNewButton_19);

		JPanel panel_13 = new JPanel();
		panel_10.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("Number of refreshment packs : ");
		panel_13.add(lblNewLabel_3);

		textField= new JTextField();
		textField.addKeyListener(new KeyListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblNewLabel_6.setText("Cost of total refreshment packs is: $ " );

			}

			public void keyPressed(KeyEvent arg0) { }

			public void keyReleased(KeyEvent arg0) {

				try {
						String strRef = textField.getText();
					 
					a = Integer.parseInt(strRef);

				refreshPrice= priceC * a ;
				lblNewLabel_6.setText("Cost of total refreshment packs is: $" +refreshPrice);
				} catch (NumberFormatException nfe) {
					if(!textField.getText().equals(""))
					{
					JOptionPane
							.showMessageDialog(
									null,
									"Please enter number only",
									"Input Error!",
									JOptionPane.PLAIN_MESSAGE);
					textField.setText("0");
					
					}else{lblNewLabel_6.setText("Cost of total refreshment packs is : $"+0);}
					
				}
					
			
			
				

				
				
			}

			public void keyTyped(KeyEvent arg0) {  }
		});
		panel_13.add(textField);
		textField.setColumns(10);

		JPanel panel_14 = new JPanel();
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_14.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 1, 0, 0));

		lblNewLabel_4 = new JLabel("Number of seats reserved is : ");
		panel_4.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Cost of total tickets is : $");
		panel_4.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Cost of total refreshment packs is : $");
		panel_4.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Please pay (by credit card)");
		panel_4.add(lblNewLabel_7);

		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15, BorderLayout.NORTH);

		JLabel lblNewLabel_8 = new JLabel(" ");
		panel_15.add(lblNewLabel_8);

		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16, BorderLayout.SOUTH);

		JLabel lblNewLabel_9 = new JLabel(" ");
		panel_16.add(lblNewLabel_9);

		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18, BorderLayout.EAST);

		JLabel label_1 = new JLabel("          ");
		panel_18.add(label_1);

		JPanel panel_19 = new JPanel();
		panel_17.add(panel_19, BorderLayout.WEST);

		JLabel label = new JLabel("          ");
		panel_19.add(label);

		JPanel panel_20 = new JPanel();
		panel_17.add(panel_20, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel(
				"Roxy Theatres - Online Ticketing System");
		panel_20.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}

	class ConfirmHandler implements ActionListener {
		//private JTextField textField_10;
		//private JTextField textField_11;
		//private JTextField textField_12;
		//private JPanel contentPane_1;

		public void actionPerformed(ActionEvent evt){
			create();
		}
class Confirm1Handler implements ActionListener{

			
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(null,"Name : "+textField_10.getText()
						+"\nCredit Card Number : "+textField_11.getText()
						+"\nPhone Number : "+textField_12.getText()
						+"\nNumber Of Ticket/s : "+selected
						+"\nNumber Of Refreshment : "+a
						+"\nTotal Cost : $"+(totalPrice+refreshPrice),"Confirm",JOptionPane.OK_CANCEL_OPTION);
				if(confirm == JOptionPane.OK_OPTION)
				{
					c.createticketing(selected, totalPrice+refreshPrice, a, textField_10.getText(), textField_11.getText(), textField_12.getText(), seatNo);
					jf.setVisible(false);

					if(btnNewButton_1.getBackground() == Color.red)
					{
						btnNewButton_1.setBackground(Color.GRAY);
					}
					if(btnNewButton_2.getBackground() == Color.red)
					{
						btnNewButton_2.setBackground(Color.GRAY);
					}
					if(btnNewButton_3.getBackground() == Color.red)
					{
						btnNewButton_3.setBackground(Color.GRAY);
					}
					if(btnNewButton_4.getBackground() == Color.red)
					{
						btnNewButton_4.setBackground(Color.GRAY);
					}
					if(btnNewButton_5.getBackground() == Color.red)
					{
						btnNewButton_5.setBackground(Color.GRAY);
					}
					if(btnNewButton_6.getBackground() == Color.red)
					{
						btnNewButton_6.setBackground(Color.GRAY);
					}
					if(btnNewButton_7.getBackground() == Color.red)
					{
						btnNewButton_7.setBackground(Color.GRAY);
					}
					if(btnNewButton_8.getBackground() == Color.red)
					{
						btnNewButton_8.setBackground(Color.GRAY);
					}
					if(btnNewButton_9.getBackground() == Color.red)
					{
						btnNewButton_9.setBackground(Color.GRAY);
					}
					if(btnNewButton_10.getBackground() == Color.red)
					{
						btnNewButton_10.setBackground(Color.GRAY);
					}
					if(btnNewButton_11.getBackground() == Color.red)
					{
						btnNewButton_11.setBackground(Color.GRAY);
					}
					if(btnNewButton_12.getBackground() == Color.red)
					{
						btnNewButton_12.setBackground(Color.GRAY);
					}
					if(btnNewButton_13.getBackground() == Color.red)
					{
						btnNewButton_13.setBackground(Color.GRAY);
					}
					if(btnNewButton_14.getBackground() == Color.red)
					{
						btnNewButton_14.setBackground(Color.GRAY);
					}
					if(btnNewButton_15.getBackground() == Color.red)
					{
						btnNewButton_15.setBackground(Color.GRAY);
					}
					
					reset();
				}
			}

		
		}class Cancel1Handler implements ActionListener {

			
			public void actionPerformed(ActionEvent arg0) {
				jf.setVisible(false);
				//dispose();
			}
			
		}
		
		public void create()
		{

		 
		 	jf = new JFrame();
			jf.setTitle("Purchase");
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setBounds(100, 100, 450, 300);
			//jf.contentPane_1 = new JPanel();
			//contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			//contentPane_1.setLayout(new BorderLayout(0, 0));
			//jf.setBorder(new EmptyBorder(5,5,5,5));
			jf.setLayout(new BorderLayout(0,0));
			//setContentPane(contentPane_1);
			
			JPanel panel_10 = new JPanel();
			//contentPane_1.add(panel_10, BorderLayout.CENTER);
			jf.add(panel_10, BorderLayout.CENTER);
			panel_10.setLayout(new GridLayout(4, 1, 0, 0));
			
			JPanel panel_11 = new JPanel();
			panel_10.add(panel_11);
			panel_11.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			
			JLabel lblEnterName = new JLabel("ENTER FULL NAME :         ");
			panel_11.add(lblEnterName);
			
			textField_10 = new JTextField();
			
			panel_11.add(textField_10);
			textField_10.setColumns(10);
			
			JPanel panel_12 = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel_12.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			panel_10.add(panel_12);
			
			JLabel lblNewLabel = new JLabel("CREDIT CARD\r\n NUMBER : ");
			panel_12.add(lblNewLabel);
			
			textField_11 = new JTextField();
			panel_12.add(textField_11);
			textField_11.setColumns(10);
			
			JPanel panel_3 = new JPanel();
			FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
			flowLayout_1.setAlignment(FlowLayout.LEFT);
			panel_10.add(panel_3);
			
			JLabel lblNewLabel_1 = new JLabel("ENTER PHONE NUMBER :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			panel_3.add(lblNewLabel_1);
			
			textField_12 = new JTextField();
			panel_3.add(textField_12);
			textField_12.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			panel_10.add(panel_4);
			
			JButton btnNewButton = new JButton("Confirm");
			btnNewButton.addActionListener(new Confirm1Handler());
			panel_4.add(btnNewButton);
			
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new Cancel1Handler());
			panel_4.add(btnCancel);
			jf.setVisible(true);
		}
		
		public void reset()
		{
			selected = 0;
			lblNewLabel_4.setText("Number of seats reserved is " + selected);
			lblNewLabel_5.setText("Cost of total tickets is : $" + selected);
			lblNewLabel_6.setText("Cost of total refreshment packs is : $ "+ selected);
			textField.setText("0");
			totalPrice = 0;
			refreshPrice = 0;
			a = 0;
		}
		

	
	
	}		
	
	public void viewBookings()
	{
		jf2 = new JFrame();
		jf2.setSize(800, 300);
		ta = new JTextArea();
		ta.setEditable(false);
		jf2.add(ta); 
	}
}

