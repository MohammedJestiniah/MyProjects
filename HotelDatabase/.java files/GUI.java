



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Choice;

import javax.swing.JList;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

import javax.swing.JLayeredPane;

import java.awt.CardLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.List;

import javax.swing.JMenu;

import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NationalIDField;
	private JTextField FNameField;
	private JTextField MnameField;
	private JTextField LnameField;
	private JTextField EmailField;
	private JTextField PhoneField;
	private JTextField OtherPhoneField;
	private JTextField SearchNationalIDField;
	private JTextField SearchFnameField;
	private JTextField SearchMnameField;
	private JTextField SearchLNameField;
	private JTextField SearchEmailField;
	private JTextField SearchPhoneField;
	private JTextField textField_8;
	private JButton ReceptionistBtn;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField EmployeeIDField;
	private JTextField FnameField;
	private JTextField MnameField_1;
	private JTextField LnameFiled;
	private JTextField SalaryField;
	private JTextField DepartmentNumberFiled;
	private JTextField SuperIDField;
	private JTextField FieldSearchByEmployee;
	private JTextField FieldFName;
	private JTextField FieldMname;
	private JTextField FieldLname;
	private JTextField FieldSalary;
	private JTextField DnumberField;
	private JTextField DltEmpIDFIeld;
	private JTextField DltFnameFeild;
	private JTextField DltSnameFeild;
	private JTextField DltLnameFeild;
	private JTextField DnumField;
	private JTextField DNameField;
	private JTextField ManagerIDField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField DdepartmentNumberFeild;
	private JTextField ddepartmentNameField;
	private JTextField dManagerIDField;
	private JTextField SEmpIDFeild;
	private JTextField SFnameFeild;
	private JTextField SMnameFeild;
	private JTextField SLnameFeild;
	private JTextField SSalaryFeild;
	private JTextField SDnumberFeild;
	private JTextField SDnumField;
	private JTextField SDnameField;
	private JTextField SManagerIDField;
	private JTextField tfNationalID;
	private JTextField tfFName;
	private JTextField tfMName;
	private JTextField tfLName;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JTextField tfOtherPhone;
	private JTextField tfReservationNumber;
	private JTextField tfGuestName3;
	private JTextField tfFrom3;
	private JTextField tfTo3;
	private JTextField tfRoomNumber3;
	private JTextField tfRoomType3;
	private JTextField tfEReservationNumber;
	private JTextField tfCReservationNumber;
	private JTextField tfRoomNumber;
	private JTextField tfDepartmentNumber;
//**********************************************************************************************************************************************************
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	

		private String reservationNumber ; // 
		private String FromDate;
		private String ToDate;
		private String RoomType ;
		private String RoomNumber ;
		JLabel ReservationNumberLabel = new JLabel("New label");
		JLabel NameLabel = new JLabel("New label");
		JLabel FromLabel = new JLabel("New label");
		JLabel toLabel = new JLabel("New label");
		JLabel roonNumberlabel = new JLabel("New label");
		JLabel roomtypelabel = new JLabel("New label");
		JTextField EmpIDFieldd = new JTextField();
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
	//----------------------------------------------------------------------Janbi
		private String reservationNumber1 ;
		private String FromDate1;
		private String ToDate1;
		private String RoomType1;
		private String RoomNumber1;
		JLabel lblReservationNumberG3 = new JLabel("New label");
		JLabel lblFullNameG3 = new JLabel("New label");
		JLabel lblFromG3 = new JLabel("New label");
		JLabel lblToG3 = new JLabel("New label");
		JLabel lblRoomNumberG3 = new JLabel("New label");
		JLabel lblRoomTypeG3 = new JLabel("New label");
	//----------------------------------------------------------------------
		
	private List guestList;
	private List reservationSearchList;
	private List employeeList;
	private JTextField textField_5;
	private JComboBox salaryOptionBox;
	private List departmentSearchList;
	private List departmentServiceList;
	private List roomServiceList;
	private List RNewBookingList;
	private Room newBookingRoom;
	private List GNewBookingList;
	private List EditEmployeeList;
	private List deleteEmployeeList;
	private List EditDepartmentList;
	private List deleteDepartmentList;
	private List reportList;
	
	checker check = new checker();
	DeleteOperations Do = new DeleteOperations();
	UpdateOperations Up = new UpdateOperations();
	InsertionOperations In = new InsertionOperations();
	retrieveOperations Rt = new retrieveOperations();
	private JTextField NewDepNametextField_6;
	private JTextField NewManagerIDtextField_7;
	private JTextField tfDepartmentNumberRSP;
	private JTextField tfRoomNumberRSP;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	//--------------------------------------------------------------------------------------------------------------------------------	
		JPanel MainGui = new JPanel();
		MainGui.setBorder(new LineBorder(new Color(0, 0, 0)));
		MainGui.setBounds(0, 67, 973, 509);
		contentPane.add(MainGui);
		MainGui.setLayout(new CardLayout(0, 0));
		CardLayout cardLayout = (CardLayout) MainGui.getLayout();
		//--------------------------------------------------------------------------------------------------------------------------------		
		JPanel LoginGUI = new JPanel();
		MainGui.add(LoginGUI, "LoginGUI");
		LoginGUI.setLayout(null);
		
		ReceptionistBtn = new JButton("Receptionist");
		
		ReceptionistBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ReceptionistBtn.setBounds(226, 238, 118, 25);
		LoginGUI.add(ReceptionistBtn);
		
		JButton ManagerBtn = new JButton("Manager");
		ManagerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MMain");
			}
		});
		ManagerBtn.setBounds(356, 238, 118, 25);
		LoginGUI.add(ManagerBtn);
		
		JButton GuestBtn = new JButton("Guest");
		GuestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "GNewBooking");
			}
		});
		GuestBtn.setBounds(486, 238, 118, 25);
		LoginGUI.add(GuestBtn);
		
		JButton RoomServiceBtn = new JButton("Room Service");
		RoomServiceBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "RS");
			}
		});
		RoomServiceBtn.setBounds(616, 238, 118, 25);
		LoginGUI.add(RoomServiceBtn);
		
		JLabel lblNewLabel = new JLabel("Select your role :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(404, 183, 153, 25);
		LoginGUI.add(lblNewLabel);
		// TILL here
		
		


		//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RMain = new JPanel();
				RMain.setLayout(null);
				MainGui.add(RMain, "RMain");
				
				JPanel panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_3.setBounds(0, 0, 157, 507);
				RMain.add(panel_3);
				
				JButton button = new JButton("New Booking");
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RNewBooking");
					}
				});
				button.setBounds(0, 0, 157, 47);
				panel_3.add(button);
				
				JButton button_1 = new JButton("Edit Booking");
				button_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "REditBooking");
					}
				});
				button_1.setBounds(0, 47, 157, 47);
				panel_3.add(button_1);
				
				JButton button_2 = new JButton("Cancel Booking");
				button_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RCancelBooking");
					}
				});
				button_2.setBounds(0, 94, 157, 47);
				panel_3.add(button_2);
				
				JButton button_5 = new JButton("Search Guest");
				button_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchGuest");
					}
				});
				button_5.setBounds(0, 141, 157, 47);
				panel_3.add(button_5);
				
				JButton button_6 = new JButton("Search Booking");
				button_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchBooking");
					}
				});
				button_6.setBounds(0, 189, 157, 47);
				panel_3.add(button_6);
				
				JButton button_127 = new JButton("Logout");
				button_127.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_127.setBounds(0, 236, 157, 47);
				panel_3.add(button_127);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RNewBooking = new JPanel();
				MainGui.add(RNewBooking, "RNewBooking");
				RNewBooking.setLayout(null);
				
				
				
				JPanel panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_2.setBounds(0, 0, 157, 507);
				RNewBooking.add(panel_2);
				
				JButton button_3 = new JButton("New Booking");
				button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_3.setBounds(0, 0, 157, 47);
				panel_2.add(button_3);
				
				JButton button_4 = new JButton("Edit Booking");
				button_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "REditBooking");
					}
				});
				button_4.setBounds(0, 47, 157, 47);
				panel_2.add(button_4);
				
				JButton button_13 = new JButton("Cancel Booking");
				button_13.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RCancelBooking");
					}
				});
				button_13.setBounds(0, 94, 157, 47);
				panel_2.add(button_13);
				
				JButton button_14 = new JButton("Search Guest");
				button_14.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchGuest");
					}
				});
				button_14.setBounds(0, 141, 157, 47);
				panel_2.add(button_14);
				
				JButton button_15 = new JButton("Search Booking");
				button_15.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchBooking");
					}
				});
				button_15.setBounds(0, 189, 157, 47);
				panel_2.add(button_15);
				
				JButton button_128 = new JButton("Logout");
				button_128.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_128.setBounds(0, 236, 157, 47);
				panel_2.add(button_128);
				
				JLabel lblNewBooking = new JLabel("New Booking :");
				lblNewBooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewBooking.setBounds(169, 13, 140, 20);
				RNewBooking.add(lblNewBooking);
				
				JPanel panel_13 = new JPanel();
				panel_13.setLayout(null);
				panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_13.setBounds(169, 42, 763, 389);
				RNewBooking.add(panel_13);
				
				JLabel lblDate = new JLabel("Date:");
				lblDate.setBounds(12, 13, 56, 16);
				panel_13.add(lblDate);
				lblDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				JLabel lblFrom = new JLabel("FROM");
				lblFrom.setBounds(61, 42, 56, 22);
				panel_13.add(lblFrom);
				lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				// FROM
				JComboBox FromDay = new JComboBox();
				FromDay.setBounds(129, 43, 46, 22);
				panel_13.add(FromDay);
				FromDay.setMaximumRowCount(30);
				FromDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				
				JLabel lblRoomType = new JLabel("Room Type:");
				lblRoomType.setBounds(61, 82, 114, 22);
				panel_13.add(lblRoomType);
				lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				JComboBox FromMonth = new JComboBox();
				FromMonth.setBounds(187, 43, 46, 22);
				panel_13.add(FromMonth);
				FromMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
				FromMonth.setMaximumRowCount(40);
				
				JComboBox FromYear = new JComboBox();
				FromYear.setBounds(245, 43, 68, 22);
				panel_13.add(FromYear);
				FromYear.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018"}));
				
				JComboBox RoomTypeList = new JComboBox();
				RoomTypeList.setBounds(187, 83, 126, 22);
				panel_13.add(RoomTypeList);
				RoomTypeList.setModel(new DefaultComboBoxModel(new String[] {"Normal room", "Studio room", "Suite room"}));
				
				JLabel lblTo = new JLabel("TO");
				lblTo.setBounds(348, 42, 33, 22);
				panel_13.add(lblTo);
				lblTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				JComboBox ToDay = new JComboBox();
				ToDay.setBounds(393, 43, 46, 22);
				panel_13.add(ToDay);
				ToDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				ToDay.setMaximumRowCount(30);
				
				Button SearchBookingBtn = new Button("Search");
				SearchBookingBtn.setBounds(393, 80, 79, 24);
				panel_13.add(SearchBookingBtn);
				
				JComboBox ToMonth = new JComboBox();
				ToMonth.setBounds(451, 43, 46, 22);
				panel_13.add(ToMonth);
				ToMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
				ToMonth.setMaximumRowCount(40);
				
				JComboBox ToYear = new JComboBox();
				ToYear.setBounds(509, 43, 68, 22);
				panel_13.add(ToYear);
				ToYear.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018"}));
				
				RNewBookingList = new List();
				RNewBookingList.setBounds(12, 136, 739, 240);
				panel_13.add(RNewBookingList);
				
				JLabel lblNewLabel_3 = new JLabel("Room#");
				lblNewLabel_3.setBounds(12, 117, 46, 16);
				panel_13.add(lblNewLabel_3);
				
				JLabel lblFloor = new JLabel("Floor");
				lblFloor.setBounds(63, 117, 40, 16);
				panel_13.add(lblFloor);
				
				JLabel lblPrice = new JLabel("Price");
				lblPrice.setBounds(107, 117, 56, 16);
				panel_13.add(lblPrice);
				
				JLabel lblNewLabel_4 = new JLabel("MaxGuest");
				lblNewLabel_4.setBounds(159, 118, 62, 16);
				panel_13.add(lblNewLabel_4);
				
				JLabel lblAvailibilty = new JLabel("Availibilty");
				lblAvailibilty.setBounds(229, 118, 56, 16);
				panel_13.add(lblAvailibilty);
				
				JLabel lblType = new JLabel("Type#");
				lblType.setBounds(293, 118, 56, 16);
				panel_13.add(lblType);
				
				JLabel lblTypeName = new JLabel("Type Name");
				lblTypeName.setBounds(361, 117, 95, 16);
				panel_13.add(lblTypeName);
				SearchBookingBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						retrieveOperations rop = new retrieveOperations();
						String FDate = FromYear.getSelectedItem().toString()+"-"+FromMonth .getSelectedItem().toString()+"-"+FromDay.getSelectedItem().toString();
						String TDate = ToYear.getSelectedItem().toString()+"-"+ToMonth .getSelectedItem().toString()+"-"+ToDay.getSelectedItem().toString();
						String roomType = RoomTypeList.getSelectedIndex()+1+"";
						rop.retrieveStatementForAvailableRoomOnDate(FDate, TDate, roomType);
						RNewBookingList.removeAll();
						for(int i = 0; i<retrieveOperations.rooms.size();i++){
							RNewBookingList.setFont( new Font("monospaced", Font.PLAIN, 16) );
							RNewBookingList.add(retrieveOperations.rooms.get(i).toString());
						}
					}
				});
				
				Button button_11 = new Button("Next");
				button_11.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(RNewBookingList.getSelectedItem() == null){
							infoBox("Please select room ","ERROR");
						}else{
							newBookingRoom = retrieveOperations.rooms.get(RNewBookingList.getSelectedIndex());
							RoomType = newBookingRoom.getRoom_typeName();
							RoomNumber = newBookingRoom.getRoom_Number();
		                    System.out.println(newBookingRoom);
							RNewBookingList.removeAll();
							cardLayout.show(MainGui, "RNewBooking2");
							
						}
					}
				});
				button_11.setBounds(882, 473, 79, 24);
				RNewBooking.add(button_11);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RNewBooking2 = new JPanel();
				RNewBooking2.setLayout(null);
				MainGui.add(RNewBooking2, "RNewBooking2");
				
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_1.setBounds(0, 0, 157, 507);
				RNewBooking2.add(panel_1);
				
				JButton button_7 = new JButton("New Booking");
				button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_7.setBounds(0, 0, 157, 47);
				panel_1.add(button_7);
				
				JButton button_8 = new JButton("Edit Booking");
				button_8.setBounds(0, 47, 157, 47);
				panel_1.add(button_8);
				
				JButton button_9 = new JButton("Cancel Booking");
				button_9.setBounds(0, 94, 157, 47);
				panel_1.add(button_9);
				
				JButton btnSearch = new JButton("Search Guest");
				btnSearch.setBounds(0, 141, 157, 47);
				panel_1.add(btnSearch);
				
				JButton btnSearchBooking = new JButton("Search Booking");
				btnSearchBooking.setBounds(0, 189, 157, 47);
				panel_1.add(btnSearchBooking);
				
				JButton button_129 = new JButton("Logout");
				button_128.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_129.setBounds(0, 236, 157, 47);
				panel_1.add(button_129);
				
				JLabel lblGuestInformation = new JLabel("Guest Information :");
				lblGuestInformation.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblGuestInformation.setBounds(169, 13, 140, 16);
				RNewBooking2.add(lblGuestInformation);
				
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.setBounds(169, 42, 763, 389);
				RNewBooking2.add(panel);
				panel.setLayout(null);
				
				Label label = new Label("National ID:");
				label.setBounds(10, 10, 70, 24);
				panel.add(label);
				
				Label label_1 = new Label("First Name:");
				label_1.setBounds(10, 40, 70, 24);
				panel.add(label_1);
				
				Label label_2 = new Label("Email:");
				label_2.setBounds(10, 70, 70, 24);
				panel.add(label_2);
				
				Label label_3 = new Label("Phone:");
				label_3.setBounds(10, 100, 70, 24);
				panel.add(label_3);
				
				Label label_4 = new Label("Other Phone:");
				label_4.setBounds(10, 130, 88, 24);
				panel.add(label_4);
				
				Label label_5 = new Label("Middle Name:");
				label_5.setBounds(227, 40, 82, 24);
				panel.add(label_5);
				
				Label label_6 = new Label("Last Name:");
				label_6.setBounds(455, 40, 70, 24);
				panel.add(label_6);
				
				NationalIDField = new JTextField();
				NationalIDField.setBounds(106, 12, 136, 22);
				panel.add(NationalIDField);
				NationalIDField.setColumns(10);
				
				FNameField = new JTextField();
				FNameField.setColumns(10);
				FNameField.setBounds(106, 42, 116, 22);
				panel.add(FNameField);
				
				MnameField = new JTextField();
				MnameField.setColumns(10);
				MnameField.setBounds(313, 42, 136, 22);
				panel.add(MnameField);
				
				LnameField = new JTextField();
				LnameField.setColumns(10);
				LnameField.setBounds(531, 42, 136, 22);
				panel.add(LnameField);
				
				EmailField = new JTextField();
				EmailField.setColumns(10);
				EmailField.setBounds(104, 72, 211, 22);
				panel.add(EmailField);
				
				PhoneField = new JTextField();
				PhoneField.setColumns(10);
				PhoneField.setBounds(104, 102, 136, 22);
				panel.add(PhoneField);
				
				OtherPhoneField = new JTextField();
				OtherPhoneField.setColumns(10);
				OtherPhoneField.setBounds(104, 132, 136, 22);
				panel.add(OtherPhoneField);
				
				Label label_59 = new Label("Reservation created By Employee#:");
				label_59.setBounds(10, 355, 211, 24);
				panel.add(label_59);
				
				EmpIDFieldd = new JTextField();
				EmpIDFieldd.setColumns(10);
				EmpIDFieldd.setBounds(227, 357, 136, 22);
				panel.add(EmpIDFieldd);
				
				Button button_12 = new Button("Next");
				button_12.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
						String[] strPhone0 = new String[0];
						String[] strPhone1 = new String[1];
						String[] strPhone2 = new String[2];
						
						if(!check.checkNationalID(NationalIDField.getText()))
								infoBox("National ID either empty or not in correct format !!!", "ERROR");
						 else if (!check.checkName(FNameField.getText())){
							    infoBox("First Name either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkName(MnameField.getText())){  
						    	infoBox("Middle Name either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkName(LnameField.getText())){
							    infoBox("Last Name ID either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkEmail(EmailField.getText())){ 
							    infoBox("Email either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkPhone(PhoneField.getText())){ 
							    infoBox("Phone is not in correct format !!!", "ERROR");
						}else if (!check.checkPhone(OtherPhoneField.getText())){ 
							     infoBox("Other Phone is not in correct format !!!", "ERROR");
						}else if (!check.checkEmployeeID(EmpIDFieldd.getText())){
							     infoBox("EmployeeID either empty or not in correct format !!!", "ERROR");
						}else{
							Rt.retrieveStatementForEmployeesByID(EmpIDFieldd.getText());
							if(Rt.employees.isEmpty()){
								infoBox("Employee ID is not in the Database !!!", "ERROR");
							}else{
								Rt.retrieveStatementForGuestByID(NationalIDField.getText());
								if(!Rt.guests.isEmpty()){
									infoBox("Guest exsist", "ERROR");
								}else{
									if(PhoneField.getText().isEmpty() && OtherPhoneField.getText().isEmpty()){
										In.insertionStatementForGuests(NationalIDField.getText(), FNameField.getText(), MnameField.getText(), LnameField.getText(), EmailField.getText(), strPhone0);
									}else if(!PhoneField.getText().isEmpty() && OtherPhoneField.getText().isEmpty()){
										strPhone1[0] = PhoneField.getText();
										In.insertionStatementForGuests(NationalIDField.getText(), FNameField.getText(), MnameField.getText(), LnameField.getText(), EmailField.getText(), strPhone1);
									}else if(PhoneField.getText().isEmpty() && !OtherPhoneField.getText().isEmpty()){
										strPhone1[0] = OtherPhoneField.getText();
										In.insertionStatementForGuests(NationalIDField.getText(), FNameField.getText(), MnameField.getText(), LnameField.getText(), EmailField.getText(), strPhone1);
									}else{
										strPhone2[0] = PhoneField.getText();
										strPhone2[1] = OtherPhoneField.getText();
										In.insertionStatementForGuests(NationalIDField.getText(), FNameField.getText(), MnameField.getText(), LnameField.getText(), EmailField.getText(), strPhone2);
							}
								}
							reservationNumber = In.createReservationNum(NationalIDField.getText());
							FromDate = FromYear.getSelectedItem()+"-"+FromMonth.getSelectedItem()+"-"+FromDay.getSelectedItem();
							ToDate = ToYear.getSelectedItem()+"-"+ToMonth.getSelectedItem()+"-"+ToDay.getSelectedItem();
							In.insertionStatementForReservation(reservationNumber,FromDate,ToDate, NationalIDField.getText());
							In.insertionStatementForHasRoom(reservationNumber, RoomNumber);
							In.insertionStatementForReserve(NationalIDField.getText(), EmpIDFieldd.getText(), reservationNumber);
							
							ReservationNumberLabel.setText(reservationNumber);
							NameLabel.setText(FNameField.getText()+" "+ MnameField.getText()+" "+  LnameField.getText());
							FromLabel.setText(FromDate);
							toLabel.setText(ToDate);
							roonNumberlabel.setText(RoomNumber);
							roomtypelabel.setText(RoomType);
							
							NationalIDField.setText("");
							FNameField.setText("");
							MnameField.setText("");
							LnameField.setText("");
							EmailField.setText("");
							PhoneField.setText("");
							OtherPhoneField.setText("");
							cardLayout.show(MainGui, "RNewBooking3");
						}
						}
				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
					}
				});
				button_12.setBounds(882, 473, 79, 24);
				RNewBooking2.add(button_12);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RNewBooking3 = new JPanel();
				RNewBooking3.setLayout(null);
				MainGui.add(RNewBooking3, "RNewBooking3");
				
				JPanel panel_4 = new JPanel();
				panel_4.setLayout(null);
				panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_4.setBounds(0, 0, 157, 507);
				RNewBooking3.add(panel_4);
				
				JButton button_16 = new JButton("New Booking");
				button_16.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_16.setBounds(0, 0, 157, 47);
				panel_4.add(button_16);
				
				JButton button_17 = new JButton("Edit Booking");
				button_17.setBounds(0, 47, 157, 47);
				panel_4.add(button_17);
				
				JButton button_18 = new JButton("Cancel Booking");
				button_18.setBounds(0, 94, 157, 47);
				panel_4.add(button_18);
				
				JButton button_19 = new JButton("Search Guest");
				button_19.setBounds(0, 141, 157, 47);
				panel_4.add(button_19);
				
				JButton button_20 = new JButton("Search Booking");
				button_20.setBounds(0, 189, 157, 47);
				panel_4.add(button_20);
				
				JButton button_130 = new JButton("Logout");
				button_130.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_130.setBounds(0, 236, 157, 47);
				panel_4.add(button_130);
				
				JLabel lblBookInformation = new JLabel("Book Information :");
				lblBookInformation.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblBookInformation.setBounds(169, 13, 140, 16);
				RNewBooking3.add(lblBookInformation);
				
				JPanel panel_5 = new JPanel();
				panel_5.setLayout(null);
				panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_5.setBounds(169, 42, 763, 389);
				RNewBooking3.add(panel_5);
				
				Label label_8 = new Label("Reservation Number :");
				label_8.setBounds(10, 10, 130, 24);
				panel_5.add(label_8);
				
				Label label_9 = new Label("Full Name:");
				label_9.setBounds(10, 40, 70, 24);
				panel_5.add(label_9);
				
				Label label_10 = new Label("Reservation date:");
				label_10.setBounds(10, 70, 114, 24);
				panel_5.add(label_10);
				
				Label label_11 = new Label("Room Number:");
				label_11.setBounds(10, 100, 88, 24);
				panel_5.add(label_11);
				
				Label label_12 = new Label("Room type:");
				label_12.setBounds(10, 130, 88, 24);
				panel_5.add(label_12);
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
				
				ReservationNumberLabel.setBounds(146, 10, 56, 24);
				panel_5.add(ReservationNumberLabel);
				
				
				NameLabel.setBounds(146, 40, 354, 24);
				panel_5.add(NameLabel);
				
				
				FromLabel.setBounds(214, 70, 56, 24);
				panel_5.add(FromLabel);
				
				
				toLabel.setBounds(332, 70, 56, 24);
				panel_5.add(toLabel);
				
				
				roonNumberlabel.setBounds(146, 100, 79, 24);
				panel_5.add(roonNumberlabel);
				
				
				roomtypelabel.setBounds(146, 130, 242, 24);
				panel_5.add(roomtypelabel);
				
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
				JLabel lblFrom_1 = new JLabel("From:");
				lblFrom_1.setBounds(146, 70, 56, 24);
				panel_5.add(lblFrom_1);
				
				JLabel lblTo_1 = new JLabel("To:");
				lblTo_1.setBounds(296, 70, 56, 24);
				panel_5.add(lblTo_1);
				
				Button button_21 = new Button("OK");
				button_21.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RMain");
					}
				});
				button_21.setBounds(882, 473, 79, 24);
				RNewBooking3.add(button_21);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel REditBooking = new JPanel();
				REditBooking.setLayout(null);
				MainGui.add(REditBooking, "REditBooking");
				
				JPanel panel_7 = new JPanel();
				panel_7.setLayout(null);
				panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_7.setBounds(0, 0, 157, 507);
				REditBooking.add(panel_7);
				
				JButton button_22 = new JButton("New Booking");
				button_22.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RNewBooking");
					}
				});
				button_22.setBounds(0, 0, 157, 47);
				panel_7.add(button_22);
				
				JButton button_23 = new JButton("Edit Booking");
				button_23.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_23.setBounds(0, 47, 157, 47);
				panel_7.add(button_23);
				
				JButton button_24 = new JButton("Cancel Booking");
				button_24.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RCancelBooking");
					}
				});
				button_24.setBounds(0, 94, 157, 47);
				panel_7.add(button_24);
				
				JButton button_25 = new JButton("Search Guest");
				button_25.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchGuest");
					}
				});
				button_25.setBounds(0, 141, 157, 47);
				panel_7.add(button_25);
				
				JButton button_26 = new JButton("Search Booking");
				button_26.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchBooking");
					}
				});
				button_26.setBounds(0, 189, 157, 47);
				panel_7.add(button_26);
				
				JButton button_131 = new JButton("Logout");
				button_131.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_131.setBounds(0, 235, 157, 47);
				panel_7.add(button_131);
				
				JLabel lblEditBooking = new JLabel("Edit Booking");
				lblEditBooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblEditBooking.setBounds(169, 13, 140, 20);
				REditBooking.add(lblEditBooking);
				
				JPanel panel_11 = new JPanel();
				panel_11.setLayout(null);
				panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_11.setBounds(169, 42, 763, 389);
				REditBooking.add(panel_11);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(174, 13, 157, 22);
				panel_11.add(textField);
				
				JLabel label_18 = new JLabel("Reservation Number:");
				label_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_18.setBounds(12, 15, 150, 16);
				panel_11.add(label_18);
				
				Button button_32 = new Button("Edit");
				button_32.setBounds(674, 355, 79, 24);
				panel_11.add(button_32);
				button_32.addMouseListener(new MouseAdapter() {
					@Override
				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					public void mouseClicked(MouseEvent e) {
						
						if(!check.checkReservationNumber(textField.getText())){
							infoBox("Reservation Number either empty or not in correct format !!!", "ERROR");
						}else {
							Rt.retrieveStatementForReservationByReservationNumber(textField.getText());
							if(Rt.reservations.isEmpty()){
								infoBox("Reservation Number is not in the Database !!!", "ERROR");
							}else{
							Do.DeleteReservation(textField.getText());
							cardLayout.show(MainGui, "RNewBooking");
							}
						}
					}
				});
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RCancelBooking = new JPanel();
				RCancelBooking.setLayout(null);
				MainGui.add(RCancelBooking, "RCancelBooking");
				
				JPanel panel_9 = new JPanel();
				panel_9.setLayout(null);
				panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_9.setBounds(0, 0, 157, 507);
				RCancelBooking.add(panel_9);
				
				JButton button_27 = new JButton("New Booking");
				button_27.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RNewBooking");
					}
				});
				button_27.setBounds(0, 0, 157, 47);
				panel_9.add(button_27);
				
				JButton button_28 = new JButton("Edit Booking");
				button_28.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "REditBooking");
					}
				});
				button_28.setBounds(0, 47, 157, 47);
				panel_9.add(button_28);
				
				JButton button_29 = new JButton("Cancel Booking");
				button_29.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_29.setBounds(0, 94, 157, 47);
				panel_9.add(button_29);
				
				JButton button_30 = new JButton("Search Guest");
				button_30.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchGuest");
					}
				});
				button_30.setBounds(0, 141, 157, 47);
				panel_9.add(button_30);
				
				JButton button_31 = new JButton("Search Booking");
				button_31.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchBooking");
					}
				});
				button_31.setBounds(0, 189, 157, 47);
				panel_9.add(button_31);
				
				JButton button_132 = new JButton("Logout");
				button_132.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_132.setBounds(0, 236, 157, 47);
				panel_9.add(button_132);
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

				Button button_33 = new Button("Delete");
				button_33.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if(!check.checkReservationNumber(textField_1.getText())){
							infoBox("Reservation Number either empty or not in correct format !!!", "ERROR");
						}else {
							Rt.retrieveStatementForReservationByReservationNumber(textField_1.getText());
							if(Rt.reservations.isEmpty()){
								infoBox("Reservation Number is not in the Database !!!", "ERROR");
							}else{
							Do.DeleteReservation(textField_1.getText());
							infoBox(" Reservation is canceled !!!", "Canceled");
							
							}
						}
					}
				});
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

				button_33.setBounds(882, 473, 79, 24);
				RCancelBooking.add(button_33);
				
				JLabel lblCancelBooking = new JLabel("Cancel Booking :");
				lblCancelBooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblCancelBooking.setBounds(169, 13, 140, 20);
				RCancelBooking.add(lblCancelBooking);
				
				JPanel panel_8 = new JPanel();
				panel_8.setLayout(null);
				panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_8.setBounds(169, 42, 763, 389);
				RCancelBooking.add(panel_8);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(174, 13, 157, 22);
				panel_8.add(textField_1);
				
				JLabel label_22 = new JLabel("Reservation Number:");
				label_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_22.setBounds(12, 15, 150, 16);
				panel_8.add(label_22);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RSearchGuest = new JPanel();
				RSearchGuest.setLayout(null);
				MainGui.add(RSearchGuest, "RSearchGuest");
				
				JPanel panel_10 = new JPanel();
				panel_10.setLayout(null);
				panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_10.setBounds(0, 0, 157, 507);
				RSearchGuest.add(panel_10);
				
				JButton button_34 = new JButton("New Booking");
				button_34.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RNewBooking");
					}
				});
				button_34.setBounds(0, 0, 157, 47);
				panel_10.add(button_34);
				
				JButton button_35 = new JButton("Edit Booking");
				button_35.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "REditBooking");
					}
				});
				button_35.setBounds(0, 47, 157, 47);
				panel_10.add(button_35);
				
				JButton button_36 = new JButton("Cancel Booking");
				button_36.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RCancelBooking");
					}
				});
				button_36.setBounds(0, 94, 157, 47);
				panel_10.add(button_36);
				
				JButton button_37 = new JButton("Search Guest");
				button_37.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_37.setBounds(0, 141, 157, 47);
				panel_10.add(button_37);
				
				JButton button_38 = new JButton("Search Booking");
				button_38.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchBooking");
					}
				});
				button_38.setBounds(0, 189, 157, 47);
				panel_10.add(button_38);
				
				JButton button_133 = new JButton("Logout");
				button_133.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_133.setBounds(0, 236, 157, 47);
				panel_10.add(button_133);
				
				JLabel label_13 = new JLabel("Guest Information :");
				label_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_13.setBounds(169, 13, 140, 16);
				RSearchGuest.add(label_13);
				
				JPanel Panel11 = new JPanel();
				Panel11.setLayout(null);
				Panel11.setBorder(new LineBorder(new Color(0, 0, 0)));
				Panel11.setBounds(169, 42, 763, 389);
				RSearchGuest.add(Panel11);
				
				Label label_14 = new Label("National ID:");
				label_14.setBounds(10, 10, 70, 24);
				Panel11.add(label_14);
				
				Label label_15 = new Label("First Name:");
				label_15.setBounds(10, 40, 70, 24);
				Panel11.add(label_15);
				
				Label label_16 = new Label("Email:");
				label_16.setBounds(10, 71, 70, 24);
				Panel11.add(label_16);
				
				Label label_17 = new Label("Phone:");
				label_17.setBounds(10, 102, 70, 24);
				Panel11.add(label_17);
				
				Label label_19 = new Label("Middle Name:");
				label_19.setBounds(182, 40, 88, 24);
				Panel11.add(label_19);
				
				Label label_20 = new Label("Last Name:");
				label_20.setBounds(358, 40, 70, 24);
				Panel11.add(label_20);
				
				SearchNationalIDField = new JTextField();
				SearchNationalIDField.setColumns(10);
				SearchNationalIDField.setBounds(106, 12, 136, 22);
				Panel11.add(SearchNationalIDField);
				
				SearchFnameField = new JTextField();
				SearchFnameField.setColumns(10);
				SearchFnameField.setBounds(106, 42, 70, 22);
				Panel11.add(SearchFnameField);
				
				SearchMnameField = new JTextField();
				SearchMnameField.setColumns(10);
				SearchMnameField.setBounds(276, 42, 70, 22);
				Panel11.add(SearchMnameField);
				
				SearchLNameField = new JTextField();
				SearchLNameField.setColumns(10);
				SearchLNameField.setBounds(434, 42, 88, 22);
				Panel11.add(SearchLNameField);
				
				SearchEmailField = new JTextField();
				SearchEmailField.setColumns(10);
				SearchEmailField.setBounds(104, 73, 211, 22);
				Panel11.add(SearchEmailField);
				
				SearchPhoneField = new JTextField();
				SearchPhoneField.setColumns(10);
				SearchPhoneField.setBounds(104, 104, 136, 22);
				Panel11.add(SearchPhoneField);
		//*********************************************************************************************************************************************************************		
		//start
				JButton SearchByNationalID = new JButton("Search By national ID");
				SearchByNationalID.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkNationalID(SearchNationalIDField.getText())){
							rop.retrieveStatementForGuestByID(SearchNationalIDField.getText());
							guestList.removeAll();
							for(int i = 0; i<retrieveOperations.guests.size();i++){
								guestList.setFont( new Font("monospaced", Font.PLAIN, 14) );
								guestList.add(retrieveOperations.guests.get(i).toString());
							}
						
						}else{
							infoBox("National ID is not in correct format !!!", "ERROR");
						}
						
					}
				});
				SearchByNationalID.setBounds(338, 10, 167, 25);
				Panel11.add(SearchByNationalID);
				
				
				
				JButton btnSearchByName = new JButton("Search By Name");
				btnSearchByName.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						rop.retrieveStatementForGuestByName(SearchFnameField.getText(), SearchMnameField.getText(), SearchLNameField.getText());
						guestList.removeAll();
						for(int i = 0; i<retrieveOperations.guests.size();i++){
							guestList.setFont( new Font("monospaced", Font.PLAIN, 14) );
							guestList.add(retrieveOperations.guests.get(i).toString());
						}
						
					}
				});
				btnSearchByName.setBounds(537, 39, 167, 25);
				Panel11.add(btnSearchByName);
				
				JButton btnSearchByEmail = new JButton("Search By Email");
				btnSearchByEmail.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkEmail(SearchEmailField.getText())){
							rop.retrieveStatementForGuestByEmail(SearchEmailField.getText());
							guestList.removeAll();
							for(int i = 0; i<retrieveOperations.guests.size();i++){
								guestList.setFont( new Font("monospaced", Font.PLAIN, 14) );
								guestList.add(retrieveOperations.guests.get(i).toString());
							}
						
						}else{
							infoBox(" Email is not in correct format !!!", "ERROR");
						}
						
						
					}
				});
				btnSearchByEmail.setBounds(338, 70, 167, 25);
				Panel11.add(btnSearchByEmail);
				
				JButton btnSearchByPhone = new JButton("Search By Phone");
				btnSearchByPhone.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkPhone(SearchPhoneField.getText()) && !SearchPhoneField.getText().isEmpty() ){
							rop.retrieveStatementForGuestByPhone(SearchPhoneField.getText());
							guestList.removeAll();
							for(int i = 0; i<retrieveOperations.guests.size();i++){
								guestList.setFont( new Font("monospaced", Font.PLAIN, 14) );
								guestList.add(retrieveOperations.guests.get(i).toString());
							}
						}else{
							infoBox(" phone number is not in correct format !!!", "ERROR");
						}
						
					}
				});
				btnSearchByPhone.setBounds(338, 101, 167, 25);
				Panel11.add(btnSearchByPhone);
				
				guestList = new List();
				guestList.setBounds(10, 147, 741, 229);
				Panel11.add(guestList);
				
				JLabel lblGuestId = new JLabel("Guest ID");
				lblGuestId.setBounds(38, 132, 56, 16);
				Panel11.add(lblGuestId);
				
				JLabel lblFirstName = new JLabel("First Name");
				lblFirstName.setBounds(144, 132, 70, 16);
				Panel11.add(lblFirstName);
				
				JLabel lblMname_1 = new JLabel("MName");
				lblMname_1.setBounds(297, 132, 56, 16);
				Panel11.add(lblMname_1);
				
				JLabel lblLastName = new JLabel("Last Name");
				lblLastName.setBounds(413, 132, 73, 16);
				Panel11.add(lblLastName);
				
				JLabel lblEmail_1 = new JLabel("Email");
				lblEmail_1.setBounds(617, 132, 56, 16);
				Panel11.add(lblEmail_1);
				//--------------------------------------------------------------------------------------------------------------------------------
				JPanel RSearchBooking = new JPanel();
				RSearchBooking.setLayout(null);
				MainGui.add(RSearchBooking, "RSearchBooking");
				
				JPanel panel_12 = new JPanel();
				panel_12.setLayout(null);
				panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_12.setBounds(0, 0, 157, 507);
				RSearchBooking.add(panel_12);
				
				JButton button_40 = new JButton("New Booking");
				button_40.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RNewBooking");
					}
				});
				button_40.setBounds(0, 0, 157, 47);
				panel_12.add(button_40);
				
				JButton button_41 = new JButton("Edit Booking");
				button_41.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "REditBooking");
					}
				});
				button_41.setBounds(0, 47, 157, 47);
				panel_12.add(button_41);
				
				JButton button_42 = new JButton("Cancel Booking");
				button_42.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RCancelBooking");
					}
				});
				button_42.setBounds(0, 94, 157, 47);
				panel_12.add(button_42);
				
				JButton button_43 = new JButton("Search Guest");
				button_43.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSearchGuest");
					}
				});
				button_43.setBounds(0, 141, 157, 47);
				panel_12.add(button_43);
				
				JButton button_44 = new JButton("Search Booking");
				button_44.setFont(new Font("Tahoma", Font.BOLD, 13));
				button_44.setBounds(0, 189, 157, 47);
				panel_12.add(button_44);
				
				JButton button_134 = new JButton("Logout");
				button_134.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				button_134.setBounds(0, 236, 157, 47);
				panel_12.add(button_134);

				//****************************************************************************************************************************************************	
				Button button_45 = new Button("Search Booking");
				button_45.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkReservationNumber(textField_8.getText())){
							rop.retrieveStatementForReservationByReservationNumber(textField_8.getText());
							reservationSearchList.removeAll();
							for(int i = 0; i<retrieveOperations.reservations.size();i++){
								reservationSearchList.setFont( new Font("monospaced", Font.PLAIN, 17) );
								reservationSearchList.add(retrieveOperations.reservations.get(i).toString());
							}
						}else{
							infoBox(" reservation number is not in correct format !!!", "ERROR");
						}
					}
				});
				
				//****************************************************************************************************************************************************
				
				button_45.setBounds(865, 473, 96, 24);
				RSearchBooking.add(button_45);
				
				JLabel lblSearchBooking = new JLabel("Search Booking :");
				lblSearchBooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblSearchBooking.setBounds(169, 13, 140, 20);
				RSearchBooking.add(lblSearchBooking);
				
				JPanel panel_6 = new JPanel();
				panel_6.setLayout(null);
				panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_6.setBounds(169, 42, 763, 389);
				RSearchBooking.add(panel_6);
				
				textField_8 = new JTextField();
				textField_8.setBounds(174, 13, 157, 22);
				panel_6.add(textField_8);
				textField_8.setColumns(10);
				
				JLabel label_21 = new JLabel("Reservation Number:");
				label_21.setBounds(12, 15, 150, 16);
				panel_6.add(label_21);
				label_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		//****************************************************************************************************************************************************		
				reservationSearchList = new List();
				reservationSearchList.setBounds(12, 49, 739, 327);
				panel_6.add(reservationSearchList);
				
				JLabel lblResirvation = new JLabel("Resirvation#");
				lblResirvation.setBounds(34, 33, 91, 16);
				panel_6.add(lblResirvation);
				
				JLabel lblStartDate = new JLabel("Start Date");
				lblStartDate.setBounds(143, 33, 77, 16);
				panel_6.add(lblStartDate);
				
				JLabel lblEndDate = new JLabel("End Date");
				lblEndDate.setBounds(287, 33, 56, 16);
				panel_6.add(lblEndDate);
				
				JLabel lblGuestId_1 = new JLabel("Guest ID");
				lblGuestId_1.setBounds(431, 33, 56, 16);
				panel_6.add(lblGuestId_1);
		//*****************************************************************************************************************************************************		
				//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MMain = new JPanel();
		MainGui.add(MMain, "MMain");
		MMain.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBounds(0, 0, 157, 507);
		MMain.add(panel_14);
		
		JButton btnNewEmployee = new JButton("New Employee");
		btnNewEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		btnNewEmployee.setBounds(0, 0, 157, 47);
		panel_14.add(btnNewEmployee);
		
		
		
		
		JButton btnEditEmployee = new JButton("Edit Employee");
		btnEditEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		btnEditEmployee.setBounds(0, 47, 157, 47);
		panel_14.add(btnEditEmployee);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		btnDeleteEmployee.setBounds(0, 94, 157, 47);
		panel_14.add(btnDeleteEmployee);
		
		JButton btnNewDepartment = new JButton("New Department");
		btnNewDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		btnNewDepartment.setBounds(0, 141, 157, 47);
		panel_14.add(btnNewDepartment);
		
		JButton btnEditDepartment = new JButton("Edit Department");
		btnEditDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		btnEditDepartment.setBounds(0, 189, 157, 47);
		panel_14.add(btnEditDepartment);
		
		JButton btnDeleteDepartment = new JButton("Delete Department");
		btnDeleteDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		btnDeleteDepartment.setBounds(0, 237, 157, 47);
		panel_14.add(btnDeleteDepartment);
		
		JButton btnSearchEmployee = new JButton("Search Employee");
		btnSearchEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		btnSearchEmployee.setBounds(0, 285, 157, 47);
		panel_14.add(btnSearchEmployee);
		
		JButton btnSearchDepartment = new JButton("Search Department");
		btnSearchDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		btnSearchDepartment.setBounds(0, 334, 157, 47);
		panel_14.add(btnSearchDepartment);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		btnGenerateReport.setBounds(0, 382, 157, 47);
		panel_14.add(btnGenerateReport);
		
		JButton button_135 = new JButton("Logout");
		button_135.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_135.setBounds(0, 428, 157, 47);
		panel_14.add(button_135);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MNewEmployee = new JPanel();
		MainGui.add(MNewEmployee, "MNewEmployee");
		MNewEmployee.setLayout(null);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setBounds(0, 0, 157, 507);
		MNewEmployee.add(panel_15);
		
		JButton button_10 = new JButton("New Employee");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 13));

		button_10.setBounds(0, 0, 157, 47);
		panel_15.add(button_10);
		
		JButton button_46 = new JButton("Edit Employee");
		button_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_46.setBounds(0, 47, 157, 47);
		panel_15.add(button_46);
		
		JButton button_47 = new JButton("Delete Employee");
		button_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_47.setBounds(0, 94, 157, 47);
		panel_15.add(button_47);
		
		JButton button_48 = new JButton("New Department");
		button_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_48.setBounds(0, 141, 157, 47);
		panel_15.add(button_48);
		
		JButton button_49 = new JButton("Edit Department");
		button_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_49.setBounds(0, 189, 157, 47);
		panel_15.add(button_49);
		
		JButton button_50 = new JButton("Delete Department");
		button_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_50.setBounds(0, 237, 157, 47);
		panel_15.add(button_50);
		
		JButton button_51 = new JButton("Search Employee");
		button_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_51.setBounds(0, 285, 157, 47);
		panel_15.add(button_51);
		
		JButton button_52 = new JButton("Search Department");
		button_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_52.setBounds(0, 334, 157, 47);
		panel_15.add(button_52);
		
		JButton button_53 = new JButton("Generate Report");
		button_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_53.setBounds(0, 382, 157, 47);
		panel_15.add(button_53);
		
		JButton button_143 = new JButton("Logout");
		button_143.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_143.setBounds(0, 429, 157, 47);
		panel_15.add(button_143);
		
		JLabel lblRegisterEmployee = new JLabel("Register Employee :");
		lblRegisterEmployee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRegisterEmployee.setBounds(169, 13, 149, 20);
		MNewEmployee.add(lblRegisterEmployee);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_16.setBounds(169, 42, 763, 389);
		MNewEmployee.add(panel_16);
		
		Label label_23 = new Label("Employee ID:");
		label_23.setBounds(10, 10, 88, 24);
		panel_16.add(label_23);
		
		Label label_24 = new Label("First Name:");
		label_24.setBounds(10, 40, 70, 24);
		panel_16.add(label_24);
		
		Label label_25 = new Label("Salary:");
		label_25.setBounds(10, 70, 70, 24);
		panel_16.add(label_25);
		
		Label label_26 = new Label("Department Number:");
		label_26.setBounds(10, 100, 127, 24);
		panel_16.add(label_26);
		
		Label label_27 = new Label("Supervisor ID:");
		label_27.setBounds(10, 130, 88, 24);
		panel_16.add(label_27);
		
		Label label_28 = new Label("Middle Name:");
		label_28.setBounds(264, 40, 82, 24);
		panel_16.add(label_28);
		
		Label label_29 = new Label("Last Name:");
		label_29.setBounds(492, 40, 70, 24);
		panel_16.add(label_29);
		
		EmployeeIDField = new JTextField();
		EmployeeIDField.setColumns(10);
		EmployeeIDField.setBounds(143, 12, 136, 22);
		panel_16.add(EmployeeIDField);
		
		FnameField = new JTextField();
		FnameField.setColumns(10);
		FnameField.setBounds(143, 42, 116, 22);
		panel_16.add(FnameField);
		
		MnameField_1 = new JTextField();
		MnameField_1.setColumns(10);
		MnameField_1.setBounds(350, 42, 136, 22);
		panel_16.add(MnameField_1);
		
		LnameFiled = new JTextField();
		LnameFiled.setColumns(10);
		LnameFiled.setBounds(568, 42, 136, 22);
		panel_16.add(LnameFiled);
		
		SalaryField = new JTextField();
		SalaryField.setColumns(10);
		SalaryField.setBounds(143, 72, 136, 22);
		panel_16.add(SalaryField);
		
		DepartmentNumberFiled = new JTextField();
		DepartmentNumberFiled.setColumns(10);
		DepartmentNumberFiled.setBounds(143, 102, 136, 22);
		panel_16.add(DepartmentNumberFiled);
		
		SuperIDField = new JTextField();
		SuperIDField.setColumns(10);
		SuperIDField.setBounds(143, 132, 136, 22);
		panel_16.add(SuperIDField);
		
		Button Createbtn = new Button("Create");
		Createbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(check.checkEmployeeID(EmployeeIDField.getText()) 
						&& check.checkName(FnameField.getText()) && check.checkName(MnameField_1.getText())
						&& check.checkName(LnameFiled.getText()) && check.checkSalary(SalaryField.getText())
						&& check.checkDepartmentNumber(DepartmentNumberFiled.getText())
						&& check.checkSupervisorID(SuperIDField.getText())){
					if(SuperIDField.getText().isEmpty()){
						int salary = Integer.parseInt(SalaryField.getText());
						
						In.insertionStatementForEmployees(EmployeeIDField.getText(), salary, FnameField.getText(), MnameField_1.getText()
								, LnameFiled.getText(), DepartmentNumberFiled.getText(), null);	
						infoBox("Employee Account Created", "message");
						FnameField.setText("");
						MnameField_1.setText("");
						LnameFiled.setText("");
						SalaryField.setText("");
						DepartmentNumberFiled.setText("");
						EmployeeIDField.setText("");
						SuperIDField.setText("");
					}else{
						Rt.retrieveStatementForEmployeesByID(EmployeeIDField.getText());
						if(Rt.employees.isEmpty()){
						Rt.retrieveStatementForDerpartmentByNumber(DepartmentNumberFiled.getText());
						Rt.retrieveStatementForEmployeesByID(SuperIDField.getText());
						if(!Rt.employees.isEmpty() && !Rt.departments.isEmpty()){
							int salary = Integer.parseInt(SalaryField.getText());
							
							In.insertionStatementForEmployees(EmployeeIDField.getText(), salary, FnameField.getText(), MnameField_1.getText()
									, LnameFiled.getText(), DepartmentNumberFiled.getText(), SuperIDField.getText());
							infoBox("Employee Account Created", "message");
							FnameField.setText("");
							MnameField_1.setText("");
							LnameFiled.setText("");
							SalaryField.setText("");
							DepartmentNumberFiled.setText("");
							EmployeeIDField.setText("");
							SuperIDField.setText("");	
						}else{
							infoBox("Manegar ID or Department number does not exist ", "Error");
						}
						}else{
							infoBox("Employee ID already exists ", "Error");
						}
					}
				}else{
					infoBox("invalid entered values", "Error");
				}
				
				
				
				
				
				
				
				
			}
		});
		Createbtn.setBounds(882, 473, 79, 24);
		MNewEmployee.add(Createbtn);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MEditEmployee = new JPanel();
		MainGui.add(MEditEmployee, "MEditEmployee");
		MEditEmployee.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.setBounds(0, 0, 157, 507);
		MEditEmployee.add(panel_17);
		
		JButton button_54 = new JButton("New Employee");
		button_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_54.setBounds(0, 0, 157, 47);
		panel_17.add(button_54);
		
		JButton button_55 = new JButton("Edit Employee");
		button_55.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_55.setBounds(0, 47, 157, 47);
		panel_17.add(button_55);
		
		JButton button_56 = new JButton("Delete Employee");
		button_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_56.setBounds(0, 94, 157, 47);
		panel_17.add(button_56);
		
		JButton button_57 = new JButton("New Department");
		button_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_57.setBounds(0, 141, 157, 47);
		panel_17.add(button_57);
		
		JButton button_58 = new JButton("Edit Department");
		button_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_58.setBounds(0, 189, 157, 47);
		panel_17.add(button_58);
		
		JButton button_59 = new JButton("Delete Department");
		button_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_59.setBounds(0, 237, 157, 47);
		panel_17.add(button_59);
		
		JButton button_60 = new JButton("Search Employee");
		button_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_60.setBounds(0, 285, 157, 47);
		panel_17.add(button_60);
		
		JButton button_61 = new JButton("Search Department");
		button_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_61.setBounds(0, 334, 157, 47);
		panel_17.add(button_61);
		
		JButton button_62 = new JButton("Generate Report");
		button_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_62.setBounds(0, 382, 157, 47);
		panel_17.add(button_62);
		
		JButton button_136 = new JButton("Logout");
		button_136.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_136.setBounds(0, 428, 157, 47);
		panel_17.add(button_136);
		
		JLabel lblEditEmployeeInformation = new JLabel("Edit Employee Information :");
		lblEditEmployeeInformation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEditEmployeeInformation.setBounds(169, 13, 201, 16);
		MEditEmployee.add(lblEditEmployeeInformation);
		
		JPanel FieldFname = new JPanel();
		FieldFname.setLayout(null);
		FieldFname.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldFname.setBounds(169, 42, 763, 389);
		MEditEmployee.add(FieldFname);
		
		Label label_30 = new Label("Employee ID:");
		label_30.setBounds(10, 10, 80, 24);
		FieldFname.add(label_30);
		
		Label label_31 = new Label("First Name:");
		label_31.setBounds(10, 40, 70, 24);
		FieldFname.add(label_31);
		
		Label label_32 = new Label("Salary:");
		label_32.setBounds(10, 71, 70, 24);
		FieldFname.add(label_32);
		
		Label label_33 = new Label("Department Number:");
		label_33.setBounds(10, 102, 127, 24);
		FieldFname.add(label_33);
		
		Label label_34 = new Label("Middle Name:");
		label_34.setBounds(182, 40, 88, 24);
		FieldFname.add(label_34);
		
		Label label_35 = new Label("Last Name:");
		label_35.setBounds(358, 40, 70, 24);
		FieldFname.add(label_35);
		
		FieldSearchByEmployee = new JTextField();
		FieldSearchByEmployee.setColumns(10);
		FieldSearchByEmployee.setBounds(143, 12, 155, 22);
		FieldFname.add(FieldSearchByEmployee);
		
		FieldFName = new JTextField();
		FieldFName.setColumns(10);
		FieldFName.setBounds(106, 42, 70, 22);
		FieldFname.add(FieldFName);
		
		FieldMname = new JTextField();
		FieldMname.setColumns(10);
		FieldMname.setBounds(276, 42, 70, 22);
		FieldFname.add(FieldMname);
		
		FieldLname = new JTextField();
		FieldLname.setColumns(10);
		FieldLname.setBounds(434, 42, 88, 22);
		FieldFname.add(FieldLname);
		
		FieldSalary = new JTextField();
		FieldSalary.setColumns(10);
		FieldSalary.setBounds(143, 73, 155, 22);
		FieldFname.add(FieldSalary);
		
		DnumberField = new JTextField();
		DnumberField.setColumns(10);
		DnumberField.setBounds(143, 104, 155, 22);
		FieldFname.add(DnumberField);
		
		
		JButton btnSearchByEmployee = new JButton("Search By Employee ID");
		btnSearchByEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				retrieveOperations rop = new retrieveOperations();
				if(check.checkEmployeeID(FieldSearchByEmployee.getText())){
					rop.retrieveStatementForEmployeesByID(FieldSearchByEmployee.getText());
					EditEmployeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						EditEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						EditEmployeeList.add(retrieveOperations.employees.get(i).toString());
						
					}
				}else{
					infoBox(" Employee ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByEmployee.setBounds(338, 10, 218, 25);
		FieldFname.add(btnSearchByEmployee);
		
		JButton btnSearchByName_1 = new JButton("Search By name");
		btnSearchByName_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				rop.retrieveStatementForEmployeesByName(FieldFName.getText(), FieldMname .getText(), FieldLname .getText());
				EditEmployeeList.removeAll();
				for(int i = 0; i<retrieveOperations.employees.size();i++){
					EditEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
					EditEmployeeList.add(retrieveOperations.employees.get(i).toString());
					
				}
			}
		});
		btnSearchByName_1.setBounds(537, 39, 167, 25);
		FieldFname.add(btnSearchByName_1);
		
		JButton btnSearchBySalary = new JButton("Search By Salary");
		btnSearchBySalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkSalary(FieldSalary .getText())){
					rop.retrieveStatementForEmployeesBySalary("=" , Integer.parseInt(FieldSalary .getText()));
					EditEmployeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						EditEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						EditEmployeeList.add(retrieveOperations.employees.get(i).toString());
					}
				}else{
					infoBox(" Salary ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchBySalary.setBounds(338, 70, 218, 25);
		FieldFname.add(btnSearchBySalary);
		
		JButton btnSearchByDepartment = new JButton("Search By Department Number");
		btnSearchByDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentNumber(DnumberField .getText())){
					rop.retrieveStatementForEmployeesByDepartment(DnumberField .getText());
					EditEmployeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						
						EditEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						EditEmployeeList.add(retrieveOperations.employees.get(i).toString());
					}
				}else{
					infoBox(" Department Number is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByDepartment.setBounds(338, 101, 218, 25);
		FieldFname.add(btnSearchByDepartment);
		
		EditEmployeeList = new List();
		EditEmployeeList.setBounds(10, 148, 741, 158);
		FieldFname.add(EditEmployeeList);
		//`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
		 Label label_60 = new Label("First Name:");
				label_60.setBounds(10, 310, 70, 24);
				FieldFname.add(label_60);
				
				JTextField FnametextField_10 = new JTextField();
				FnametextField_10.setColumns(10);
				FnametextField_10.setBounds(86, 312, 70, 22);
				FieldFname.add(FnametextField_10);
				
				Label label_61 = new Label("Middle Name:");
				label_61.setBounds(252, 310, 88, 24);
				FieldFname.add(label_61);
				
				JTextField MnametextField_11 = new JTextField();
				MnametextField_11.setColumns(10);
				MnametextField_11.setBounds(338, 312, 70, 22);
				FieldFname.add(MnametextField_11);
				
				Label label_62 = new Label("Last Name:");
				label_62.setBounds(506, 310, 70, 24);
				FieldFname.add(label_62);
				
				JTextField LnametextField_12 = new JTextField();
				LnametextField_12.setColumns(10);
				LnametextField_12.setBounds(582, 310, 70, 22);
				FieldFname.add(LnametextField_12);
				
				JButton btnInsertLname = new JButton("Insert");
				btnInsertLname.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(!check.checkName(LnametextField_12.getText())){
							infoBox("Wrong format for Name","Error");
						}else{
						Employee tmp = Rt.employees.get(EditEmployeeList.getSelectedIndex());
						Up.updateStatementForEmployeeLName(LnametextField_12.getText(), tmp.getID());
						infoBox("Last name successfully updated","message");
						LnametextField_12.setText("");
						}
					
					}
				});
				btnInsertLname.setBounds(664, 309, 78, 25);
				FieldFname.add(btnInsertLname);
				
				Label label_57 = new Label("Salary:");
				label_57.setBounds(10, 341, 70, 24);
				FieldFname.add(label_57);
				
				JTextField SalarytextField_6 = new JTextField();
				SalarytextField_6.setColumns(10);
				SalarytextField_6.setBounds(86, 343, 70, 22);
				FieldFname.add(SalarytextField_6);
				
				JButton btnInsertNewSalary = new JButton("Insert new salary");
				btnInsertNewSalary.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(!check.checkSalary(SalarytextField_6.getText())){
							infoBox("Wrong format for Salary","Error");
						}else{
							int salary = Integer.parseInt(SalarytextField_6.getText());
						Employee tmp = Rt.employees.get(EditEmployeeList.getSelectedIndex());
						Up.updateStatementForEmployeeSalary(salary, tmp.getID());
						infoBox("Salary Successfully updated","message");
						SalarytextField_6.setText("");
						}	
						
					}
				});
				btnInsertNewSalary.setBounds(168, 340, 131, 25);
				FieldFname.add(btnInsertNewSalary);
				
				JTextField DeprtmentnumtextField_7 = new JTextField();
				DeprtmentnumtextField_7.setBounds(471, 343, 58, 22);
				FieldFname.add(DeprtmentnumtextField_7);
				DeprtmentnumtextField_7.setColumns(10);
				
				JButton btnInsertNewDepartment = new JButton("Insert new department");
				btnInsertNewDepartment.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if(!check.checkSalary(DeprtmentnumtextField_7.getText())){
							infoBox("Wrong format for Department number","Error");
						}else{
							Rt.retrieveStatementForDerpartmentByNumber(DeprtmentnumtextField_7.getText());
							
							if(!Rt.departments.isEmpty()){
						Employee tmp = Rt.employees.get(EditEmployeeList.getSelectedIndex());
						Up.updateStatementForEmployeeDepartment(DeprtmentnumtextField_7.getText(), tmp.getID());
						infoBox("Department Number Successfully updated","message");
						DeprtmentnumtextField_7.setText("");
						}else{
							infoBox("Department number does not exist","Error");
						}
						}
					}
				});
				btnInsertNewDepartment.setBounds(541, 340, 201, 25);
				FieldFname.add(btnInsertNewDepartment);
				
				
				
				Label label_58 = new Label("Department Number:");
				label_58.setBounds(338, 341, 127, 24);
				FieldFname.add(label_58);
				
				JButton btnInsertMname = new JButton("Insert");
				btnInsertMname.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(!check.checkName(MnametextField_11.getText())){
							infoBox("Wrong format for Name","Error");
						}else{
						Employee tmp = Rt.employees.get(EditEmployeeList.getSelectedIndex());
						Up.updateStatementForEmployeeMName(MnametextField_11.getText(), tmp.getID());
						infoBox("Mid name successfully updated","message");
						MnametextField_11.setText("");
						}
					}
					
				});
				btnInsertMname.setBounds(422, 309, 78, 25);
				FieldFname.add(btnInsertMname);
				
				JButton btnInsertFname = new JButton("Insert");
				btnInsertFname.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if(!check.checkName(FnametextField_10.getText())){
							infoBox("Wrong format for Name","Error");
						}else{
						Employee tmp = Rt.employees.get(EditEmployeeList.getSelectedIndex());
						Up.updateStatementForEmployeeFName(FnametextField_10.getText(), tmp.getID());
						infoBox("First name successfully updated","message");
						FnametextField_10.setText("");
						}
					}
				});
				btnInsertFname.setBounds(168, 310, 78, 25);
				FieldFname.add(btnInsertFname);
				
				JLabel lblNewLabel_1 = new JLabel("   ID");
				lblNewLabel_1.setBounds(10, 132, 35, 16);
				FieldFname.add(lblNewLabel_1);
				
				JLabel lblFname = new JLabel("      FName");
				lblFname.setBounds(57, 132, 70, 16);
				FieldFname.add(lblFname);
				
				JLabel lblMname = new JLabel("      MName");
				lblMname.setBounds(200, 132, 70, 16);
				FieldFname.add(lblMname);
				
				JLabel lblLname = new JLabel("      LName");
				lblLname.setBounds(338, 132, 70, 16);
				FieldFname.add(lblLname);
				
				JLabel lblSalary = new JLabel("      Salary");
				lblSalary.setBounds(489, 132, 70, 16);
				FieldFname.add(lblSalary);
				
				JLabel lblDepartmentName = new JLabel("      Department Name");
				lblDepartmentName.setBounds(560, 132, 146, 16);
				FieldFname.add(lblDepartmentName);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MDeleteEmployee = new JPanel();
		MainGui.add(MDeleteEmployee, "MDeleteEmployee");
		MDeleteEmployee.setLayout(null);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_18.setBounds(0, 0, 157, 507);
		MDeleteEmployee.add(panel_18);
		
		JButton button_63 = new JButton("New Employee");
		button_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_63.setBounds(0, 0, 157, 47);
		panel_18.add(button_63);
		
		JButton button_64 = new JButton("Edit Employee");
		button_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_64.setBounds(0, 47, 157, 47);
		panel_18.add(button_64);
		
		JButton button_65 = new JButton("Delete Employee");
		button_65.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_65.setBounds(0, 94, 157, 47);
		panel_18.add(button_65);
		
		JButton button_66 = new JButton("New Department");
		button_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_66.setBounds(0, 141, 157, 47);
		panel_18.add(button_66);
		
		JButton button_67 = new JButton("Edit Department");
		button_67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_67.setBounds(0, 189, 157, 47);
		panel_18.add(button_67);
		
		JButton button_68 = new JButton("Delete Department");
		button_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_68.setBounds(0, 237, 157, 47);
		panel_18.add(button_68);
		
		JButton button_69 = new JButton("Search Employee");
		button_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_69.setBounds(0, 285, 157, 47);
		panel_18.add(button_69);
		
		JButton button_70 = new JButton("Search Department");
		button_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_70.setBounds(0, 334, 157, 47);
		panel_18.add(button_70);
		
		JButton button_71 = new JButton("Generate Report");
		button_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_71.setBounds(0, 382, 157, 47);
		panel_18.add(button_71);
		
		JButton button_137 = new JButton("Logout");
		button_137.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_137.setBounds(0, 429, 157, 47);
		panel_18.add(button_137);
		
		JLabel lblDeleteEmployee = new JLabel("Delete Employee :");
		lblDeleteEmployee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeleteEmployee.setBounds(169, 13, 201, 16);
		MDeleteEmployee.add(lblDeleteEmployee);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_19.setBounds(169, 42, 763, 389);
		MDeleteEmployee.add(panel_19);
		
		Label label_36 = new Label("Employee ID:");
		label_36.setBounds(10, 10, 80, 24);
		panel_19.add(label_36);
		
		Label label_37 = new Label("First Name:");
		label_37.setBounds(10, 40, 70, 24);
		panel_19.add(label_37);
		
		Label label_40 = new Label("Middle Name:");
		label_40.setBounds(182, 40, 88, 24);
		panel_19.add(label_40);
		
		Label label_41 = new Label("Last Name:");
		label_41.setBounds(358, 40, 70, 24);
		panel_19.add(label_41);
		
		DltEmpIDFIeld = new JTextField();
		DltEmpIDFIeld.setColumns(10);
		DltEmpIDFIeld.setBounds(106, 10, 155, 22);
		panel_19.add(DltEmpIDFIeld);
		
		DltFnameFeild = new JTextField();
		DltFnameFeild.setColumns(10);
		DltFnameFeild.setBounds(106, 42, 70, 22);
		panel_19.add(DltFnameFeild);
		
		DltSnameFeild = new JTextField();
		DltSnameFeild.setColumns(10);
		DltSnameFeild.setBounds(276, 42, 70, 22);
		panel_19.add(DltSnameFeild);
		
		DltLnameFeild = new JTextField();
		DltLnameFeild.setColumns(10);
		DltLnameFeild.setBounds(434, 42, 88, 22);
		panel_19.add(DltLnameFeild);
		
		JButton btnSearchByEmployee_1 = new JButton("Search By Employee  ID");
		btnSearchByEmployee_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkEmployeeID(DltEmpIDFIeld.getText())){
					rop.retrieveStatementForEmployeesByID(DltEmpIDFIeld.getText());
					if(Rt.employees.isEmpty()){
						infoBox("Employee ID not found","Error");
					}else{
					deleteEmployeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						deleteEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						deleteEmployeeList.add(retrieveOperations.employees.get(i).toString());
					}
					}
				}else{
					infoBox(" Employee ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByEmployee_1.setBounds(273, 10, 218, 25);
		panel_19.add(btnSearchByEmployee_1);
		
		JButton btnSearchByName_2 = new JButton("Search By name");
		btnSearchByName_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				rop.retrieveStatementForEmployeesByName(DltFnameFeild.getText(), DltSnameFeild .getText(), DltLnameFeild .getText());
				if(Rt.employees.isEmpty()){
					infoBox("name not found","Error");
				}else{
				deleteEmployeeList.removeAll();
				for(int i = 0; i<retrieveOperations.employees.size();i++){
					deleteEmployeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
					deleteEmployeeList.add(retrieveOperations.employees.get(i).toString());
				}
				}
			}
		});
		btnSearchByName_2.setBounds(537, 39, 167, 25);
		panel_19.add(btnSearchByName_2);
		
		deleteEmployeeList = new List();
		deleteEmployeeList.setBounds(10, 87, 741, 289);
		panel_19.add(deleteEmployeeList);
		
		JLabel label_64 = new JLabel("   ID");
		label_64.setBounds(8, 71, 35, 16);
		panel_19.add(label_64);
		
		JLabel label_65 = new JLabel("      FName");
		label_65.setBounds(55, 71, 70, 16);
		panel_19.add(label_65);
		
		JLabel label_66 = new JLabel("      MName");
		label_66.setBounds(198, 71, 70, 16);
		panel_19.add(label_66);
		
		JLabel label_67 = new JLabel("      LName");
		label_67.setBounds(336, 71, 70, 16);
		panel_19.add(label_67);
		
		JLabel label_68 = new JLabel("      Salary");
		label_68.setBounds(487, 71, 70, 16);
		panel_19.add(label_68);
		
		JLabel label_69 = new JLabel("      Department Name");
		label_69.setBounds(558, 71, 146, 16);
		panel_19.add(label_69);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee tmp = Rt.employees.get(deleteEmployeeList.getSelectedIndex());
				Do.DeleteEmployee(tmp.getID());
				infoBox("Employee successfully deleted","message");
				deleteEmployeeList.remove(deleteEmployeeList.getSelectedIndex());
				
			}
		});
		btnDelete.setBounds(835, 444, 97, 25);
		MDeleteEmployee.add(btnDelete);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MNewDepartment = new JPanel();
		MainGui.add(MNewDepartment, "MNewDepartment");
		MNewDepartment.setLayout(null);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_20.setBounds(0, 0, 157, 507);
		MNewDepartment.add(panel_20);
		
		JButton button_72 = new JButton("New Employee");
		button_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_72.setBounds(0, 0, 157, 47);
		panel_20.add(button_72);
		
		JButton button_73 = new JButton("Edit Employee");
		button_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_73.setBounds(0, 47, 157, 47);
		panel_20.add(button_73);
		
		JButton button_74 = new JButton("Delete Employee");
		button_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_74.setBounds(0, 94, 157, 47);
		panel_20.add(button_74);
		
		JButton button_75 = new JButton("New Department");
		button_75.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_75.setBounds(0, 141, 157, 47);
		panel_20.add(button_75);
		
		JButton button_76 = new JButton("Edit Department");
		button_76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_76.setBounds(0, 189, 157, 47);
		panel_20.add(button_76);
		
		JButton button_77 = new JButton("Delete Department");
		button_77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_77.setBounds(0, 237, 157, 47);
		panel_20.add(button_77);
		
		JButton button_78 = new JButton("Search Employee");
		button_78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_78.setBounds(0, 285, 157, 47);
		panel_20.add(button_78);
		
		JButton button_79 = new JButton("Search Department");
		button_79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_79.setBounds(0, 334, 157, 47);
		panel_20.add(button_79);
		
		JButton button_80 = new JButton("Generate Report");
		button_80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_80.setBounds(0, 382, 157, 47);
		panel_20.add(button_80);
		
		JButton button_138 = new JButton("Logout");
		button_138.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_138.setBounds(0, 428, 157, 47);
		panel_20.add(button_138);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_21.setBounds(169, 42, 763, 389);
		MNewDepartment.add(panel_21);
		
		Label label_7 = new Label("Department Number:");
		label_7.setBounds(10, 10, 127, 24);
		panel_21.add(label_7);
		
		Label label_39 = new Label("Name:");
		label_39.setBounds(10, 40, 70, 24);
		panel_21.add(label_39);
		
		Label label_43 = new Label("Manager ID:");
		label_43.setBounds(10, 70, 88, 24);
		panel_21.add(label_43);
		
		DnumField = new JTextField();
		DnumField.setColumns(10);
		DnumField.setBounds(143, 12, 136, 22);
		panel_21.add(DnumField);
		
		DNameField = new JTextField();
		DNameField.setColumns(10);
		DNameField.setBounds(143, 42, 136, 22);
		panel_21.add(DNameField);
		
		ManagerIDField = new JTextField();
		ManagerIDField.setColumns(10);
		ManagerIDField.setBounds(143, 72, 136, 22);
		panel_21.add(ManagerIDField);
		
		JLabel lblRegisterDepartment = new JLabel("Add Department:");
		lblRegisterDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRegisterDepartment.setBounds(169, 13, 157, 20);
		MNewDepartment.add(lblRegisterDepartment);
		
		Button button_81 = new Button("Create");
		button_81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(check.checkDepartmentNumber(DnumField.getText()) 
						&& check.checkDepartmentName(DNameField.getText()) && check.checkManagerID(ManagerIDField.getText())){
					if(ManagerIDField.getText().isEmpty()){
						
						Rt.retrieveStatementForDerpartmentByNumber(DnumField.getText());
						if(Rt.departments.isEmpty()){
						In.insertionStatementForDepartments(DnumField.getText(), DNameField.getText(), null);	
						infoBox("New Department is Created", "message");
						}else{
							infoBox("Duplicated department number!","Error");
						}
					}else{
						Rt.retrieveStatementForDerpartmentByNumber(DnumField.getText());
						Rt.retrieveStatementForEmployeesByID(ManagerIDField.getText());
						if(!Rt.employees.isEmpty() && Rt.departments.isEmpty()){
						In.insertionStatementForDepartments(DnumField.getText(), DNameField.getText(), ManagerIDField.getText());
						infoBox("New Department is Created", "message");
					}else{
						infoBox("Duplicated department number or manegar ID not found!","Error");
					}
					}
				}else{
					infoBox("invalid entered values", "Error");
				}
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		button_81.setBounds(882, 473, 79, 24);
		MNewDepartment.add(button_81);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MEditDepartment = new JPanel();
		MainGui.add(MEditDepartment, "MEditDepartment");
		MEditDepartment.setLayout(null);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_22.setBounds(0, 0, 157, 507);
		MEditDepartment.add(panel_22);
		
		JButton button_82 = new JButton("New Employee");
		button_82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_82.setBounds(0, 0, 157, 47);
		panel_22.add(button_82);
		
		JButton button_83 = new JButton("Edit Employee");
		button_83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_83.setBounds(0, 47, 157, 47);
		panel_22.add(button_83);
		
		JButton button_84 = new JButton("Delete Employee");
		button_84.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_84.setBounds(0, 94, 157, 47);
		panel_22.add(button_84);
		
		JButton button_85 = new JButton("New Department");
		button_85.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_85.setBounds(0, 141, 157, 47);
		panel_22.add(button_85);
		
		JButton button_86 = new JButton("Edit Department");
		button_86.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_86.setBounds(0, 189, 157, 47);
		panel_22.add(button_86);
		
		JButton button_87 = new JButton("Delete Department");
		button_87.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_87.setBounds(0, 237, 157, 47);
		panel_22.add(button_87);
		
		JButton button_88 = new JButton("Search Employee");
		button_88.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_88.setBounds(0, 285, 157, 47);
		panel_22.add(button_88);
		
		JButton button_89 = new JButton("Search Department");
		button_89.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_89.setBounds(0, 334, 157, 47);
		panel_22.add(button_89);
		
		JButton button_90 = new JButton("Generate Report");
		button_90.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_90.setBounds(0, 382, 157, 47);
		panel_22.add(button_90);
		
		JButton button_139 = new JButton("Logout");
		button_139.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_139.setBounds(0, 429, 157, 47);
		panel_22.add(button_139);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_23.setBounds(169, 49, 763, 428);
		MEditDepartment.add(panel_23);
		
		Label label_38 = new Label("Department Number:");
		label_38.setBounds(10, 10, 127, 24);
		panel_23.add(label_38);
		
		Label label_42 = new Label("Name:");
		label_42.setBounds(10, 40, 70, 24);
		panel_23.add(label_42);
		
		Label label_44 = new Label("Manager ID:");
		label_44.setBounds(10, 70, 88, 24);
		panel_23.add(label_44);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 12, 136, 22);
		panel_23.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 42, 136, 22);
		panel_23.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 72, 136, 22);
		panel_23.add(textField_4);
		
		JButton SearchByDepartmentNumberbtn = new JButton("Search By Department Number");
		SearchByDepartmentNumberbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentNumber(textField_2 .getText())){
					rop.retrieveStatementForDerpartmentByNumber(textField_2 .getText());
					EditDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						EditDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						EditDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
				}else{
					infoBox("Department Number is not in correct format !!!", "ERROR");
				}
			}
		});
		SearchByDepartmentNumberbtn.setBounds(291, 10, 209, 25);
		panel_23.add(SearchByDepartmentNumberbtn);
		
		JButton btnSearchByDepartment_1 = new JButton("Search By Department Name");
		btnSearchByDepartment_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentName(textField_3.getText())){
					rop.retrieveStatementForDerpartmentByName(textField_3.getText());
					EditDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						EditDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						EditDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
					
				}else{
					infoBox("Department Name is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByDepartment_1.setBounds(291, 40, 209, 25);
		panel_23.add(btnSearchByDepartment_1);
		
		JButton btnSearchByManager = new JButton("Search By Manager ID");
		btnSearchByManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkManagerID(textField_4.getText())){
					rop.retrieveStatementForDerpartmentByManagerID(textField_4.getText() );
					EditDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						EditDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						EditDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
				}else{
					infoBox("Manager ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByManager.setBounds(291, 69, 209, 25);
		panel_23.add(btnSearchByManager);
		
		EditDepartmentList = new List();
		EditDepartmentList.setBounds(10, 118, 741, 207);
		panel_23.add(EditDepartmentList);
		//```````````````````````````````````````````````````````````````````````````````````````````
		Label label_590 = new Label("Name:");
		label_590.setBounds(33, 331, 70, 24);
		panel_23.add(label_590);
		
		NewDepNametextField_6 = new JTextField();
		NewDepNametextField_6.setColumns(10);
		NewDepNametextField_6.setBounds(143, 333, 136, 22);
		panel_23.add(NewDepNametextField_6);
		
		JButton btnInsertNewDepartment_1 = new JButton("Insert new department name");
		btnInsertNewDepartment_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!check.checkDepartmentName(NewDepNametextField_6.getText())){
					infoBox("Wrong format for Department Name","Error");
				}else{
				Department tmp = Rt.departments.get(EditDepartmentList.getSelectedIndex());
				Up.updateStatementForDepartmentNum(NewDepNametextField_6.getText(), tmp.getDepartment_Number());
				infoBox("Department name successfully updated","message");
				NewDepNametextField_6.setText("");
				}
			}
		});
		btnInsertNewDepartment_1.setBounds(291, 331, 209, 25);
		panel_23.add(btnInsertNewDepartment_1);
		
		Label label_63 = new Label("Manager ID:");
		label_63.setBounds(26, 374, 88, 24);
		panel_23.add(label_63);
		
		NewManagerIDtextField_7 = new JTextField();
		NewManagerIDtextField_7.setColumns(10);
		NewManagerIDtextField_7.setBounds(143, 376, 136, 22);
		panel_23.add(NewManagerIDtextField_7);
		
		JButton btnInsertNewManager = new JButton("Insert new manager ID");
		btnInsertNewManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!check.checkManagerID(NewManagerIDtextField_7.getText())){
					infoBox("Wrong format for manegar ID","Error");
				}else{
					Rt.retrieveStatementForEmployeesByID(NewManagerIDtextField_7.getText());
					if(!Rt.employees.isEmpty()){
				Department tmp = Rt.departments.get(EditDepartmentList.getSelectedIndex());
				Up.updateStatementForDepartmentMananger(NewManagerIDtextField_7.getText(), tmp.getDepartment_Number());
				infoBox("Department new manegar successfully updated","message");
				NewManagerIDtextField_7.setText("");
					}else{
						infoBox("Manegar ID is Not Found!","Error");
					}
			}
			}
		});
		btnInsertNewManager.setBounds(291, 375, 209, 25);
		panel_23.add(btnInsertNewManager);
		
		JLabel label_79 = new JLabel("Department#");
		label_79.setBounds(10, 100, 88, 16);
		panel_23.add(label_79);
		
		JLabel label_80 = new JLabel("Department Name");
		label_80.setBounds(138, 100, 127, 16);
		panel_23.add(label_80);
		
		JLabel label_81 = new JLabel("ManagerID");
		label_81.setBounds(322, 100, 127, 16);
		panel_23.add(label_81);
		
		JLabel lblEditDepartment = new JLabel("Edit Department:");
		lblEditDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEditDepartment.setBounds(169, 13, 157, 20);
		MEditDepartment.add(lblEditDepartment);
		//```````````````````````````````````````````````````````````````````````````````````````````
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MDeleteDepartment = new JPanel();
		MainGui.add(MDeleteDepartment, "MDeleteDepartment");
		MDeleteDepartment.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_24.setBounds(0, 0, 157, 507);
		MDeleteDepartment.add(panel_24);
		
		JButton button_91 = new JButton("New Employee");
		button_91.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_91.setBounds(0, 0, 157, 47);
		panel_24.add(button_91);
		
		JButton button_92 = new JButton("Edit Employee");
		button_92.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_92.setBounds(0, 47, 157, 47);
		panel_24.add(button_92);
		
		JButton button_93 = new JButton("Delete Employee");
		button_93.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_93.setBounds(0, 94, 157, 47);
		panel_24.add(button_93);
		
		JButton button_94 = new JButton("New Department");
		button_94.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_94.setBounds(0, 141, 157, 47);
		panel_24.add(button_94);
		
		JButton button_95 = new JButton("Edit Department");
		button_95.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_95.setBounds(0, 189, 157, 47);
		panel_24.add(button_95);
		
		JButton button_96 = new JButton("Delete Department");
		button_96.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_96.setBounds(0, 237, 157, 47);
		panel_24.add(button_96);
		
		JButton button_97 = new JButton("Search Employee");
		button_97.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_97.setBounds(0, 285, 157, 47);
		panel_24.add(button_97);
		
		JButton button_98 = new JButton("Search Department");
		button_98.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_98.setBounds(0, 334, 157, 47);
		panel_24.add(button_98);
		
		JButton button_99 = new JButton("Generate Report");
		button_99.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_99.setBounds(0, 382, 157, 47);
		panel_24.add(button_99);
		
		JButton button_140 = new JButton("Logout");
		button_140.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_140.setBounds(0, 429, 157, 47);
		panel_24.add(button_140);
		
		JLabel lblDeleteDepartment = new JLabel("Delete Department:");
		lblDeleteDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeleteDepartment.setBounds(169, 13, 157, 20);
		MDeleteDepartment.add(lblDeleteDepartment);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_25.setBounds(169, 42, 763, 389);
		MDeleteDepartment.add(panel_25);
		
		Label label_46 = new Label("Department Number:");
		label_46.setBounds(10, 10, 127, 24);
		panel_25.add(label_46);
		
		Label label_47 = new Label("Name:");
		label_47.setBounds(10, 40, 70, 24);
		panel_25.add(label_47);
		
		Label label_48 = new Label("Manager ID:");
		label_48.setBounds(10, 70, 88, 24);
		panel_25.add(label_48);
		
		DdepartmentNumberFeild = new JTextField();
		DdepartmentNumberFeild.setColumns(10);
		DdepartmentNumberFeild.setBounds(143, 12, 136, 22);
		panel_25.add(DdepartmentNumberFeild);
		
		ddepartmentNameField = new JTextField();
		ddepartmentNameField.setColumns(10);
		ddepartmentNameField.setBounds(143, 42, 136, 22);
		panel_25.add(ddepartmentNameField);
		
		dManagerIDField = new JTextField();
		dManagerIDField.setColumns(10);
		dManagerIDField.setBounds(143, 72, 136, 22);
		panel_25.add(dManagerIDField);
		
		JButton btnSearchByDepartmentnumber = new JButton("Search By Department Number");
		btnSearchByDepartmentnumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentNumber(DdepartmentNumberFeild.getText())){
					rop.retrieveStatementForDerpartmentByNumber(DdepartmentNumberFeild.getText());
					if(Rt.departments.isEmpty()){
						infoBox("Department number not found","Error");
					}else{
					deleteDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						deleteDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						deleteDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
					}
				}else{
					infoBox("Department Number is not in correct format !!!", "ERROR");
				}
				
			}
		});
		btnSearchByDepartmentnumber.setBounds(291, 10, 209, 25);
		panel_25.add(btnSearchByDepartmentnumber);
		
		JButton btnSearchByDepartmentname = new JButton("Search By Department Name");
		btnSearchByDepartmentname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentName(ddepartmentNameField.getText())){
					rop.retrieveStatementForDerpartmentByName(ddepartmentNameField.getText());
					if(Rt.departments.isEmpty()){
						infoBox("department name not found","Error");
					}else{
					deleteDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						deleteDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						deleteDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
					}
				}else{
					infoBox("Department Name is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByDepartmentname.setBounds(291, 40, 209, 25);
		panel_25.add(btnSearchByDepartmentname);
		
		JButton btnSearchBymanagerId = new JButton("Search By Manager ID");
		btnSearchBymanagerId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkManagerID(dManagerIDField.getText())){
					rop.retrieveStatementForDerpartmentByManagerID(dManagerIDField.getText() );
					if(Rt.departments.isEmpty()){
						infoBox("maneger ID not found","Error");
					}else{
					deleteDepartmentList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						deleteDepartmentList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						deleteDepartmentList.add(retrieveOperations.departments.get(i).toString());
					}
					}
				}else{
					infoBox("Manager ID is not in correct format !!!", "ERROR");
				}
			
			
		}
		});
		btnSearchBymanagerId.setBounds(291, 69, 209, 25);
		panel_25.add(btnSearchBymanagerId);
		
		 deleteDepartmentList = new List();
		deleteDepartmentList.setBounds(10, 118, 741, 258);
		panel_25.add(deleteDepartmentList);
		
		JLabel label_76 = new JLabel("Department#");
		label_76.setBounds(10, 100, 88, 16);
		panel_25.add(label_76);
		
		JLabel label_77 = new JLabel("Department Name");
		label_77.setBounds(138, 100, 127, 16);
		panel_25.add(label_77);
		
		JLabel label_78 = new JLabel("ManagerID");
		label_78.setBounds(322, 100, 127, 16);
		panel_25.add(label_78);
		
		JButton DeleteDepartment = new JButton("Delete");
		DeleteDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Department tmp = Rt.departments.get(deleteDepartmentList.getSelectedIndex());
				Do.DeleteDepartment(tmp.getDepartment_Number());
				infoBox("Department successfully deleted","message");
				deleteDepartmentList.remove(deleteDepartmentList.getSelectedIndex());
			}
		});
		DeleteDepartment.setBounds(835, 444, 97, 25);
		MDeleteDepartment.add(DeleteDepartment);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MSearchEmployee = new JPanel();
		MainGui.add(MSearchEmployee, "MSearchEmployee");
		MSearchEmployee.setLayout(null);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26.setBounds(0, 0, 157, 507);
		MSearchEmployee.add(panel_26);
		
		JButton button_100 = new JButton("New Employee");
		button_100.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_100.setBounds(0, 0, 157, 47);
		panel_26.add(button_100);
		
		JButton button_101 = new JButton("Edit Employee");
		button_101.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_101.setBounds(0, 47, 157, 47);
		panel_26.add(button_101);
		
		JButton button_102 = new JButton("Delete Employee");
		button_102.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_102.setBounds(0, 94, 157, 47);
		panel_26.add(button_102);
		
		JButton button_103 = new JButton("New Department");
		button_103.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_103.setBounds(0, 141, 157, 47);
		panel_26.add(button_103);
		
		JButton button_104 = new JButton("Edit Department");
		button_104.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_104.setBounds(0, 189, 157, 47);
		panel_26.add(button_104);
		
		JButton button_105 = new JButton("Delete Department");
		button_105.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_105.setBounds(0, 237, 157, 47);
		panel_26.add(button_105);
		
		JButton button_106 = new JButton("Search Employee");
		button_106.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_106.setBounds(0, 285, 157, 47);
		panel_26.add(button_106);
		
		JButton button_107 = new JButton("Search Department");
		button_107.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_107.setBounds(0, 334, 157, 47);
		panel_26.add(button_107);
		
		JButton button_108 = new JButton("Generate Report");
		button_108.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_108.setBounds(0, 382, 157, 47);
		panel_26.add(button_108);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		btnLogout.setBounds(0, 429, 157, 47);
		panel_26.add(btnLogout);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_27.setBounds(169, 42, 763, 389);
		MSearchEmployee.add(panel_27);
		
		Label label_45 = new Label("Employee ID:");
		label_45.setBounds(10, 10, 80, 24);
		panel_27.add(label_45);
		
		Label label_49 = new Label("First Name:");
		label_49.setBounds(10, 40, 70, 24);
		panel_27.add(label_49);
		
		Label label_50 = new Label("Salary:");
		label_50.setBounds(10, 71, 70, 24);
		panel_27.add(label_50);
		
		Label label_51 = new Label("Department Number:");
		label_51.setBounds(10, 102, 127, 24);
		panel_27.add(label_51);
		
		Label label_52 = new Label("Middle Name:");
		label_52.setBounds(182, 40, 88, 24);
		panel_27.add(label_52);
		
		Label label_53 = new Label("Last Name:");
		label_53.setBounds(358, 40, 70, 24);
		panel_27.add(label_53);
		
		SEmpIDFeild = new JTextField();
		SEmpIDFeild.setColumns(10);
		SEmpIDFeild.setBounds(143, 12, 155, 22);
		panel_27.add(SEmpIDFeild);
		
		SFnameFeild = new JTextField();
		SFnameFeild.setColumns(10);
		SFnameFeild.setBounds(106, 42, 70, 22);
		panel_27.add(SFnameFeild);
		
		SMnameFeild = new JTextField();
		SMnameFeild.setColumns(10);
		SMnameFeild.setBounds(276, 42, 70, 22);
		panel_27.add(SMnameFeild);
		
		SLnameFeild = new JTextField();
		SLnameFeild.setColumns(10);
		SLnameFeild.setBounds(434, 42, 88, 22);
		panel_27.add(SLnameFeild);
		
		SSalaryFeild = new JTextField();
		SSalaryFeild.setColumns(10);
		SSalaryFeild.setBounds(192, 73, 106, 22);
		panel_27.add(SSalaryFeild);
		
		SDnumberFeild = new JTextField();
		SDnumberFeild.setColumns(10);
		SDnumberFeild.setBounds(143, 104, 155, 22);
		panel_27.add(SDnumberFeild);
//*************************************************************************************************************************************************************
//start
		JButton btnSearchByemployeeId = new JButton("Search By Employee ID");
		btnSearchByemployeeId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkEmployeeID(SEmpIDFeild.getText())){
					rop.retrieveStatementForEmployeesByID(SEmpIDFeild.getText());
					employeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						employeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						employeeList.add(retrieveOperations.employees.get(i).toString());
					}
				}else{
					infoBox(" Employee ID is not in correct format !!!", "ERROR");
				}
				
				
			}
		});
		btnSearchByemployeeId.setBounds(338, 10, 218, 25);
		panel_27.add(btnSearchByemployeeId);
		
		JButton btnSearchByName_3 = new JButton("Search By Name");
		btnSearchByName_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				rop.retrieveStatementForEmployeesByName(SFnameFeild.getText(), SMnameFeild.getText(), SLnameFeild.getText());
				employeeList.removeAll();
				for(int i = 0; i<retrieveOperations.employees.size();i++){
					employeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
					employeeList.add(retrieveOperations.employees.get(i).toString());
				}
			}
		});
		btnSearchByName_3.setBounds(537, 39, 167, 25);
		panel_27.add(btnSearchByName_3);
		
		JButton btnSearchBySalary_1 = new JButton("Search By Salary ");
		btnSearchBySalary_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkSalary(SSalaryFeild .getText())){
					rop.retrieveStatementForEmployeesBySalary(salaryOptionBox.getSelectedItem().toString() , Integer.parseInt(SSalaryFeild .getText()));
					employeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						employeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						employeeList.add(retrieveOperations.employees.get(i).toString());
					}
				}else{
					infoBox(" Salary ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchBySalary_1.setBounds(338, 70, 218, 25);
		panel_27.add(btnSearchBySalary_1);
		
		JButton btnSearchByDepartment_2 = new JButton("Search By Department Number ");
		btnSearchByDepartment_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentNumber(SDnumberFeild.getText())){
					rop.retrieveStatementForEmployeesByDepartment(SDnumberFeild.getText());
					employeeList.removeAll();
					for(int i = 0; i<retrieveOperations.employees.size();i++){
						employeeList.setFont( new Font("monospaced", Font.PLAIN, 14) );
						employeeList.add(retrieveOperations.employees.get(i).toString());
					}
				}else{
					infoBox(" Department Number is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByDepartment_2.setBounds(338, 101, 218, 25);
		panel_27.add(btnSearchByDepartment_2);
		
		employeeList = new List();
		employeeList.setBounds(10, 148, 741, 231);
		panel_27.add(employeeList);
		
		textField_5 = new JTextField();
		textField_5.setBounds(79, 208, 116, 22);
		panel_27.add(textField_5);
		textField_5.setColumns(10);
		
		salaryOptionBox = new JComboBox();
		salaryOptionBox.setBounds(143, 73, 46, 22);
		salaryOptionBox.addItem("=");
		salaryOptionBox.addItem(">");
		salaryOptionBox.addItem("<");
		panel_27.add(salaryOptionBox);
		
		JLabel label_70 = new JLabel("   ID");
		label_70.setBounds(8, 132, 35, 16);
		panel_27.add(label_70);
		
		JLabel label_71 = new JLabel("      FName");
		label_71.setBounds(55, 132, 70, 16);
		panel_27.add(label_71);
		
		JLabel label_72 = new JLabel("      MName");
		label_72.setBounds(198, 132, 70, 16);
		panel_27.add(label_72);
		
		JLabel label_73 = new JLabel("      LName");
		label_73.setBounds(336, 132, 70, 16);
		panel_27.add(label_73);
		
		JLabel label_74 = new JLabel("      Salary");
		label_74.setBounds(487, 132, 70, 16);
		panel_27.add(label_74);
		
		JLabel label_75 = new JLabel("      Department Name");
		label_75.setBounds(558, 132, 146, 16);
		panel_27.add(label_75);
		
//end		
//*************************************************************************************************************************************************************		
		
		JLabel lblSearchEmployee = new JLabel("Search Employee :");
		lblSearchEmployee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSearchEmployee.setBounds(169, 13, 147, 16);
		MSearchEmployee.add(lblSearchEmployee);
		//--------------------------------------------------------------------------------------------------------------------------------
		JPanel MSearchDepartment = new JPanel();
		MainGui.add(MSearchDepartment, "MSearchDepartment");
		MSearchDepartment.setLayout(null);
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_28.setBounds(0, 0, 157, 507);
		MSearchDepartment.add(panel_28);
		
		JButton button_109 = new JButton("New Employee");
		button_109.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_109.setBounds(0, 0, 157, 47);
		panel_28.add(button_109);
		
		JButton button_110 = new JButton("Edit Employee");
		button_110.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_110.setBounds(0, 47, 157, 47);
		panel_28.add(button_110);
		
		JButton button_111 = new JButton("Delete Employee");
		button_111.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_111.setBounds(0, 94, 157, 47);
		panel_28.add(button_111);
		
		JButton button_112 = new JButton("New Department");
		button_112.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEDepartment");
			}
		});
		button_112.setBounds(0, 141, 157, 47);
		panel_28.add(button_112);
		
		JButton button_113 = new JButton("Edit Department");
		button_113.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_113.setBounds(0, 189, 157, 47);
		panel_28.add(button_113);
		
		JButton button_114 = new JButton("Delete Department");
		button_114.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		button_114.setBounds(0, 237, 157, 47);
		panel_28.add(button_114);
		
		JButton button_115 = new JButton("Search Employee");
		button_115.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_115.setBounds(0, 285, 157, 47);
		panel_28.add(button_115);
		
		JButton button_116 = new JButton("Search Department");
		button_116.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_116.setBounds(0, 334, 157, 47);
		panel_28.add(button_116);
		
		JButton button_117 = new JButton("Generate Report");
		button_117.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MGenerateReport");
			}
		});
		button_117.setBounds(0, 382, 157, 47);
		panel_28.add(button_117);
		
		JButton button_141 = new JButton("Logout");
		button_141.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_141.setBounds(0, 430, 157, 47);
		panel_28.add(button_141);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_29.setBounds(169, 42, 763, 389);
		MSearchDepartment.add(panel_29);
		
		Label label_54 = new Label("Department Number:");
		label_54.setBounds(10, 10, 127, 24);
		panel_29.add(label_54);
		
		Label label_55 = new Label("Name:");
		label_55.setBounds(10, 40, 70, 24);
		panel_29.add(label_55);
		
		Label label_56 = new Label("Manager ID:");
		label_56.setBounds(10, 70, 88, 24);
		panel_29.add(label_56);
		
		SDnumField = new JTextField();
		SDnumField.setColumns(10);
		SDnumField.setBounds(143, 12, 136, 22);
		panel_29.add(SDnumField);
		
		SDnameField = new JTextField();
		SDnameField.setColumns(10);
		SDnameField.setBounds(143, 42, 136, 22);
		panel_29.add(SDnameField);
		
		SManagerIDField = new JTextField();
		SManagerIDField.setColumns(10);
		SManagerIDField.setBounds(143, 72, 136, 22);
		panel_29.add(SManagerIDField);

//*******************************************************************************************************************************
//start
		
		JButton btnSearchByDepartment_3 = new JButton("Search By Department Number");
		btnSearchByDepartment_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentNumber(SDnumField .getText())){
					rop.retrieveStatementForDerpartmentByNumber(SDnumField .getText());
					departmentSearchList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						departmentSearchList.setFont( new Font("monospaced", Font.PLAIN, 20) );

						departmentSearchList.add(retrieveOperations.departments.get(i).toString());
					}
				}else{
					infoBox("Department Number is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByDepartment_3.setBounds(291, 10, 209, 25);
		panel_29.add(btnSearchByDepartment_3);
		
		JButton btnSearchByDepartment_4 = new JButton("Search By Department Name ");
		btnSearchByDepartment_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkDepartmentName(SDnameField.getText())){
					rop.retrieveStatementForDerpartmentByName(SDnameField.getText());
					departmentSearchList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						departmentSearchList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						departmentSearchList.add(retrieveOperations.departments.get(i).toString());
					}
				}else{
					infoBox("Department Name is not in correct format !!!", "ERROR");
				}
				
			}
		});
		btnSearchByDepartment_4.setBounds(291, 40, 209, 25);
		panel_29.add(btnSearchByDepartment_4);
		
		JButton btnSearchByManager_1 = new JButton("Search By Manager ID ");
		btnSearchByManager_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveOperations rop = new retrieveOperations();
				checker ck = new checker();
				if(ck.checkManagerID(SManagerIDField.getText())){
					rop.retrieveStatementForDerpartmentByManagerID(SManagerIDField.getText() );
					departmentSearchList.removeAll();
					for(int i = 0; i<retrieveOperations.departments.size();i++){
						departmentSearchList.setFont( new Font("monospaced", Font.PLAIN, 20) );
						departmentSearchList.add(retrieveOperations.departments.get(i).toString());
					}
				}else{
					infoBox("Manager ID is not in correct format !!!", "ERROR");
				}
			}
		});
		btnSearchByManager_1.setBounds(291, 69, 209, 25);
		panel_29.add(btnSearchByManager_1);
		
		departmentSearchList = new List();
		departmentSearchList.setBounds(10, 130, 741, 246);
		panel_29.add(departmentSearchList);
		
		JLabel lblDepartment = new JLabel("Department#");
		lblDepartment.setBounds(15, 115, 88, 16);
		panel_29.add(lblDepartment);
		
		JLabel lblDepartmentName_1 = new JLabel("Department Name");
		lblDepartmentName_1.setBounds(143, 115, 127, 16);
		panel_29.add(lblDepartmentName_1);
		
		JLabel lblManegarid = new JLabel("ManagerID");
		lblManegarid.setBounds(327, 115, 127, 16);
		panel_29.add(lblManegarid);

//end		
//********************************************************************************************************		
		
		JLabel lblSearchDepartment = new JLabel("Search Department:");
		lblSearchDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSearchDepartment.setBounds(169, 13, 157, 20);
		MSearchDepartment.add(lblSearchDepartment);
		//--------------------------------------------------------------------------------------------------------------------------------
		
		JPanel MGenerateReport = new JPanel();
		MainGui.add(MGenerateReport, "MGenerateReport");
		MGenerateReport.setLayout(null);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_30.setBounds(0, 0, 157, 507);
		MGenerateReport.add(panel_30);
		
		JButton button_118 = new JButton("New Employee");
		button_118.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewEmployee");
			}
		});
		button_118.setBounds(0, 0, 157, 47);
		panel_30.add(button_118);
		
		JButton button_119 = new JButton("Edit Employee");
		button_119.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditEmployee");
			}
		});
		button_119.setBounds(0, 47, 157, 47);
		panel_30.add(button_119);
		
		JButton button_120 = new JButton("Delete Employee");
		button_120.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteEmployee");
			}
		});
		button_120.setBounds(0, 94, 157, 47);
		panel_30.add(button_120);
		
		JButton button_121 = new JButton("New Department");
		button_121.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MNewDepartment");
			}
		});
		button_121.setBounds(0, 141, 157, 47);
		panel_30.add(button_121);
		
		JButton button_122 = new JButton("Edit Department");
		button_122.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MEditDepartment");
			}
		});
		button_122.setBounds(0, 189, 157, 47);
		panel_30.add(button_122);
		
		JButton button_123 = new JButton("Delete Department");
		button_123.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MDeleteDepartment");
			}
		});
		
		button_123.setBounds(0, 237, 157, 47);
		panel_30.add(button_123);
		
		JButton button_124 = new JButton("Search Employee");
		button_124.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchEmployee");
			}
		});
		button_124.setBounds(0, 285, 157, 47);
		panel_30.add(button_124);
		
		JButton button_125 = new JButton("Search Department");
		button_125.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "MSearchDepartment");
			}
		});
		button_125.setBounds(0, 334, 157, 47);
		panel_30.add(button_125);
		
		JButton button_126 = new JButton("Generate Report");
		button_126.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_126.setBounds(0, 382, 157, 47);
		panel_30.add(button_126);
		
		JButton button_142 = new JButton("Logout");
		button_142.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(MainGui, "LoginGUI");
			}
		});
		button_142.setBounds(0, 430, 157, 47);
		panel_30.add(button_142);
		
		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_31.setBounds(169, 42, 763, 389);
		MGenerateReport.add(panel_31);
		JLabel lblReservation = new JLabel("Reservation#");
		lblReservation.setBounds(42, 40, 87, 16);
		panel_31.add(lblReservation);
		lblReservation.setVisible(false);
		JLabel lblStartdate = new JLabel("Start_Date");
		lblStartdate.setBounds(172, 40, 100, 16);
		panel_31.add(lblStartdate);
		lblStartdate.setVisible(false);
		JLabel lblEnddate = new JLabel("End_Date");
		lblEnddate.setBounds(348, 40, 100, 16);
		panel_31.add(lblEnddate);
		lblEnddate.setVisible(false);
		JLabel lblNewLabel_2 = new JLabel("Room");
		lblNewLabel_2.setBounds(477, 40, 56, 16);
		panel_31.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		JLabel label_82 = new JLabel("   ID");
		label_82.setBounds(12, 40, 35, 16);
		panel_31.add(label_82);
		label_82.setVisible(false);
		JLabel label_83 = new JLabel("      FName");
		label_83.setBounds(59, 40, 70, 16);
		panel_31.add(label_83);
		label_83.setVisible(false);
		JLabel label_84 = new JLabel("      MName");
		label_84.setBounds(202, 40, 70, 16);
		panel_31.add(label_84);
		label_84.setVisible(false);
		JLabel label_85 = new JLabel("      LName");
		label_85.setBounds(340, 40, 70, 16);
		panel_31.add(label_85);
		label_85.setVisible(false);
		JLabel label_86 = new JLabel("      Salary");
		label_86.setBounds(491, 40, 70, 16);
		panel_31.add(label_86);
		label_86.setVisible(false);
		JLabel label_87 = new JLabel("      Department Name");
		label_87.setBounds(573, 40, 146, 16);
		panel_31.add(label_87);
		label_87.setVisible(false);
		JButton btnReservedRooms = new JButton("Reserved Rooms");
		btnReservedRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblReservation.setVisible(true);
				lblStartdate.setVisible(true);
				lblEnddate.setVisible(true);
				lblNewLabel_2.setVisible(true);
				label_82.setVisible(false);
				label_83.setVisible(false);
				label_84.setVisible(false);
				label_85.setVisible(false);
				label_86.setVisible(false);
				label_87.setVisible(false);
				retrieveOperations rop = new retrieveOperations();
				rop.reports();
				reportList.removeAll();
				for(int i = 0; i<retrieveOperations.reports.size();i++){
					reportList.setFont( new Font("monospaced", Font.PLAIN, 20) );
					reportList.add(retrieveOperations.reports.get(i).toString());
				}
			}
		});
		btnReservedRooms.setBounds(12, 13, 209, 25);
		panel_31.add(btnReservedRooms);
		
		JButton btnDepartmentEmployee = new JButton("Department Employee");
		btnDepartmentEmployee.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lblReservation.setVisible(false);
				lblStartdate.setVisible(false);
				lblEnddate.setVisible(false);
				lblNewLabel_2.setVisible(false);
				label_82.setVisible(true);
				label_83.setVisible(true);
				label_84.setVisible(true);
				label_85.setVisible(true);
				label_86.setVisible(true);
				label_87.setVisible(true);
				retrieveOperations rop = new retrieveOperations();
				rop.retrieveStatementForEmployeesReport();
				reportList.removeAll();
				for(int i = 0; i<retrieveOperations.employees.size();i++){
					reportList.setFont( new Font("monospaced", Font.PLAIN, 14) );
					reportList.add(retrieveOperations.employees.get(i).toString());
				}
			}
		});
		btnDepartmentEmployee.setBounds(255, 13, 209, 25);
		panel_31.add(btnDepartmentEmployee);
		
		JButton btnHotelRevenue = new JButton("Hotel Revenue");
		btnHotelRevenue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				label_82.setVisible(false);
				label_83.setVisible(false);
				label_84.setVisible(false);
				label_85.setVisible(false);
				label_86.setVisible(false);
				label_87.setVisible(false);
				retrieveOperations rop = new retrieveOperations();
				rop.revenue();
				reportList.removeAll();
				for(int i = 0; i<retrieveOperations.revenues.size();i++){
					reportList.setFont( new Font("monospaced", Font.PLAIN, 20) );
					reportList.add(retrieveOperations.revenues.get(i).toString());
				}
			}
		});
		btnHotelRevenue.setBounds(503, 13, 209, 25);
		panel_31.add(btnHotelRevenue);
		
		reportList = new List();
		reportList.setBounds(12, 57, 739, 319);
		panel_31.add(reportList);
		
		
		
	
		
		
		JLabel lblGenerateReport = new JLabel("Generate Report:");
		lblGenerateReport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenerateReport.setBounds(169, 13, 157, 20);
		MGenerateReport.add(lblGenerateReport);
		
		JLabel lblDreamHotel = new JLabel("Dream Hotel");
		lblDreamHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblDreamHotel.setFont(new Font("Sitka Heading", Font.BOLD, 25));
		lblDreamHotel.setBounds(407, 24, 150, 30);
		contentPane.add(lblDreamHotel);
		
		

		//---------------------------------------------------------------------------
				JPanel GNewBooking1 = new JPanel();
				GNewBooking1.setLayout(null);
				MainGui.add(GNewBooking1, "GNewBooking1");
				
				JPanel panel_300 = new JPanel();
				panel_300.setLayout(null);
				panel_300.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_300.setBounds(0, 0, 157, 507);
				GNewBooking1.add(panel_300);
				
				JButton btnNewBooking1 = new JButton("New Booking");
				btnNewBooking1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBooking1.setBounds(0, 0, 157, 47);
				panel_300.add(btnNewBooking1);
				
				JButton btnEditBooking1 = new JButton("Edit Booking");
				btnEditBooking1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBooking1.setBounds(0, 45, 157, 47);
				panel_300.add(btnEditBooking1);
				
				JButton btnCancelBooking1 = new JButton("Cancel Booking");
				btnCancelBooking1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBooking1.setBounds(0, 90, 157, 47);
				panel_300.add(btnCancelBooking1);
				
				JButton btnSignOutGN1 = new JButton("Sign Out");
				btnSignOutGN1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGN1.setBounds(0, 135, 157, 47);
				panel_300.add(btnSignOutGN1);
				
				JLabel label_Date = new JLabel("Date:");
				label_Date.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_Date.setBounds(167, 11, 56, 16);
				GNewBooking1.add(label_Date);
				
				JLabel label_From = new JLabel("FROM");
				label_From.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_From.setBounds(216, 40, 56, 22);
				GNewBooking1.add(label_From);
				
				JComboBox comboBox_DayFrom = new JComboBox();
				comboBox_DayFrom.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				comboBox_DayFrom.setMaximumRowCount(30);
				comboBox_DayFrom.setBounds(284, 41, 46, 22);
				GNewBooking1.add(comboBox_DayFrom);
				
				JComboBox comboBox_MonthFrom = new JComboBox();
				comboBox_MonthFrom.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
				comboBox_MonthFrom.setMaximumRowCount(40);
				comboBox_MonthFrom.setBounds(342, 41, 46, 22);
				GNewBooking1.add(comboBox_MonthFrom);
				
				JComboBox comboBox_YearFrom = new JComboBox();
				comboBox_YearFrom.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018"}));
				comboBox_YearFrom.setBounds(400, 41, 68, 22);
				GNewBooking1.add(comboBox_YearFrom);
				
				JLabel label_To = new JLabel("TO");
				label_To.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_To.setBounds(503, 40, 33, 22);
				GNewBooking1.add(label_To);
				
				JComboBox comboBox_DayTo = new JComboBox();
				comboBox_DayTo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				comboBox_DayTo.setMaximumRowCount(30);
				comboBox_DayTo.setBounds(548, 41, 46, 22);
				GNewBooking1.add(comboBox_DayTo);
				
				JComboBox comboBox_MonthTo = new JComboBox();
				comboBox_MonthTo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
				comboBox_MonthTo.setMaximumRowCount(40);
				comboBox_MonthTo.setBounds(606, 41, 46, 22);
				GNewBooking1.add(comboBox_MonthTo);
				
				JComboBox comboBox_YearTo = new JComboBox();
				comboBox_YearTo.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018"}));
				comboBox_YearTo.setBounds(664, 41, 68, 22);
				GNewBooking1.add(comboBox_YearTo);
				
				JLabel label_RoomType = new JLabel("Room Type:");
				label_RoomType.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_RoomType.setBounds(167, 89, 94, 16);
				GNewBooking1.add(label_RoomType);
				
				JComboBox comboBox_RoomType = new JComboBox();
				comboBox_RoomType.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Studio", "Suite"}));
				comboBox_RoomType.setBounds(284, 89, 68, 22);
				GNewBooking1.add(comboBox_RoomType);
				
				JButton btnNext = new JButton("Next");
				btnNext.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(GNewBookingList.getSelectedItem() == null){
							infoBox("Please select room ","ERROR");
						}else{
							newBookingRoom = retrieveOperations.rooms.get(GNewBookingList.getSelectedIndex());
							RoomNumber1 = newBookingRoom.getRoom_Number();
							RoomType1 = newBookingRoom.getRoom_typeName();
							GNewBookingList.clear();
							cardLayout.show(MainGui, "GNewBooking2");
						}
					}
				});
				
				btnNext.setBounds(872, 473, 89, 23);
				GNewBooking1.add(btnNext);
				
				JButton btnSearch1 = new JButton("Search");
				btnSearch1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						String FDate = comboBox_YearFrom.getSelectedItem().toString()+"-"+comboBox_MonthFrom.getSelectedItem().toString()+"-"+comboBox_DayFrom.getSelectedItem().toString();
						String TDate = comboBox_YearTo.getSelectedItem().toString()+"-"+comboBox_MonthTo.getSelectedItem().toString()+"-"+comboBox_DayTo.getSelectedItem().toString();
						String roomType = comboBox_RoomType.getSelectedIndex()+1+"";
						rop.retrieveStatementForAvailableRoomOnDate(FDate, TDate, roomType);
						GNewBookingList.removeAll();
						for(int i = 0; i<retrieveOperations.rooms.size();i++){
							GNewBookingList.setFont( new Font("monospaced", Font.PLAIN, 16) );
							GNewBookingList.add(retrieveOperations.rooms.get(i).toString());
						}
					}
					
					
				});
				
				btnSearch1.setBounds(643, 88, 89, 23);
				GNewBooking1.add(btnSearch1);
				
				GNewBookingList = new List();
				GNewBookingList.setBounds(169, 159, 790, 301);
				GNewBooking1.add(GNewBookingList);
				
				JLabel label_88 = new JLabel("Room#");
				label_88.setBounds(169, 136, 46, 16);
				GNewBooking1.add(label_88);
				
				JLabel label_89 = new JLabel("Floor");
				label_89.setBounds(220, 136, 40, 16);
				GNewBooking1.add(label_89);
				
				JLabel label_90 = new JLabel("Price");
				label_90.setBounds(264, 136, 56, 16);
				GNewBooking1.add(label_90);
				
				JLabel label_91 = new JLabel("MaxGuest");
				label_91.setBounds(316, 137, 62, 16);
				GNewBooking1.add(label_91);
				
				JLabel label_92 = new JLabel("Availibilty");
				label_92.setBounds(386, 137, 56, 16);
				GNewBooking1.add(label_92);
				
				JLabel label_93 = new JLabel("Type#");
				label_93.setBounds(450, 137, 56, 16);
				GNewBooking1.add(label_93);
				
				JLabel label_94 = new JLabel("Type Name");
				label_94.setBounds(518, 136, 95, 16);
				GNewBooking1.add(label_94);

		//---------------------------------------------------------------------------Janbi
				JPanel GNewBooking2 = new JPanel();
				GNewBooking2.setLayout(null);
				MainGui.add(GNewBooking2, "GNewBooking2");
				
				JPanel panel_400 = new JPanel();
				panel_400.setLayout(null);
				panel_400.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_400.setBounds(0, 0, 157, 507);
				GNewBooking2.add(panel_400);
				
				JButton btnNewBooking2 = new JButton("New Booking");
				btnNewBooking2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBooking2.setBounds(0, 0, 157, 47);
				panel_400.add(btnNewBooking2);
				
				JButton btnEditBooking2 = new JButton("Edit Booking");
				btnEditBooking2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBooking2.setBounds(0, 45, 157, 47);
				panel_400.add(btnEditBooking2);
				
				JButton btnCancelBooking2 = new JButton("Cancel Booking");
				btnCancelBooking2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBooking2.setBounds(0, 90, 157, 47);
				panel_400.add(btnCancelBooking2);
				
				JButton btnSignOutGN2 = new JButton("Sign Out");
				btnSignOutGN2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGN2.setBounds(0, 135, 157, 47);
				panel_400.add(btnSignOutGN2);
				
				JLabel lblNationalID = new JLabel("National ID:");
				lblNationalID.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNationalID.setBounds(167, 11, 89, 14);
				GNewBooking2.add(lblNationalID);
				
				tfNationalID = new JTextField();
				tfNationalID.setBounds(266, 10, 86, 20);
				GNewBooking2.add(tfNationalID);
				tfNationalID.setColumns(10);
				
				JLabel lblName = new JLabel("Name:");
				lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblName.setBounds(167, 36, 56, 14);
				GNewBooking2.add(lblName);
				
				tfFName = new JTextField();
				tfFName.setBounds(266, 35, 86, 20);
				GNewBooking2.add(tfFName);
				tfFName.setColumns(10);
				
				tfMName = new JTextField();
				tfMName.setColumns(10);
				tfMName.setBounds(362, 35, 86, 20);
				GNewBooking2.add(tfMName);
				
				tfLName = new JTextField();
				tfLName.setColumns(10);
				tfLName.setBounds(458, 35, 86, 20);
				GNewBooking2.add(tfLName);
				
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblEmail.setBounds(167, 61, 56, 14);
				GNewBooking2.add(lblEmail);
				
				tfEmail = new JTextField();
				tfEmail.setColumns(10);
				tfEmail.setBounds(266, 60, 182, 20);
				GNewBooking2.add(tfEmail);
				
				JLabel lblPhone = new JLabel("Phone:");
				lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPhone.setBounds(167, 86, 56, 14);
				GNewBooking2.add(lblPhone);
				
				JLabel lblOtherPhone = new JLabel("Other Phone:");
				lblOtherPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblOtherPhone.setBounds(167, 111, 101, 14);
				GNewBooking2.add(lblOtherPhone);
				
				tfPhone = new JTextField();
				tfPhone.setBounds(266, 85, 86, 20);
				GNewBooking2.add(tfPhone);
				tfPhone.setColumns(10);
				
				tfOtherPhone = new JTextField();
				tfOtherPhone.setBounds(266, 110, 86, 20);
				GNewBooking2.add(tfOtherPhone);
				tfOtherPhone.setColumns(10);
				
				JButton btnBook = new JButton("Book");
				btnBook.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String[] strPhone0 = new String[0];
						String[] strPhone1 = new String[1];
						String[] strPhone2 = new String[2];
						
						if(!check.checkNationalID(tfNationalID.getText()))
								infoBox("National ID either empty or not in correct format !!!", "ERROR");
						 else if (!check.checkName(tfFName.getText())){
							    infoBox("First Name either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkName(tfMName.getText())){  
						    	infoBox("Middle Name either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkName(tfLName.getText())){
							    infoBox("Last Name ID either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkEmail(tfEmail.getText())){ 
							    infoBox("Email either empty or not in correct format !!!", "ERROR");
						}else if (!check.checkPhone(tfPhone.getText())){ 
							    infoBox("Phone is not in correct format !!!", "ERROR");
						}else if (!check.checkPhone(tfOtherPhone.getText())){ 
							     infoBox("Other Phone is not in correct format !!!", "ERROR");
						}else{
							
							Rt.retrieveStatementForGuestByID(tfNationalID.getText());
							
							if(Rt.guests.isEmpty()){
								if(tfPhone.getText().isEmpty() && tfOtherPhone.getText().isEmpty()){
									In.insertionStatementForGuests(tfNationalID.getText(), tfFName.getText(), tfMName.getText(), tfLName.getText(), tfEmail.getText(), strPhone0);
								}else if(!tfPhone.getText().isEmpty() && tfOtherPhone.getText().isEmpty()){
									strPhone1[0] = tfPhone.getText();
									In.insertionStatementForGuests(tfNationalID.getText(), tfFName.getText(), tfMName.getText(), tfLName.getText(), tfEmail.getText(), strPhone1);
								}else if(tfPhone.getText().isEmpty() && !tfOtherPhone.getText().isEmpty()){
									strPhone1[0] = tfOtherPhone.getText();
									In.insertionStatementForGuests(tfNationalID.getText(), tfFName.getText(), tfMName.getText(), tfLName.getText(), tfEmail.getText(), strPhone1);
								}else{
									strPhone2[0] = tfPhone.getText();
									strPhone2[1] = tfOtherPhone.getText();
									In.insertionStatementForGuests(tfNationalID.getText(), tfFName.getText(), tfMName.getText(), tfLName.getText(), tfEmail.getText(), strPhone2);
								}
								reservationNumber1 = In.createReservationNum(tfNationalID.getText());
								FromDate1 = comboBox_YearFrom.getSelectedItem()+"-"+comboBox_MonthFrom.getSelectedItem()+"-"+comboBox_DayFrom.getSelectedItem();
								ToDate1 = comboBox_YearTo.getSelectedItem()+"-"+comboBox_MonthTo.getSelectedItem()+"-"+comboBox_DayTo.getSelectedItem();
								In.insertionStatementForReservation(reservationNumber1,FromDate1,ToDate1, tfNationalID.getText());
								
								lblReservationNumberG3.setText(reservationNumber1);
								lblFullNameG3.setText(tfFName.getText()+" "+ tfMName.getText()+" "+  tfLName.getText());
								lblFromG3.setText(FromDate1);
								lblToG3.setText(ToDate1);
								lblRoomNumberG3.setText(RoomNumber1);
								lblRoomTypeG3.setText(RoomType1);
								
								In.insertionStatementForHasRoom(reservationNumber1, RoomNumber1);
							}else{
								reservationNumber1 = In.createReservationNum(Rt.guests.get(0).getID());
								FromDate1 = comboBox_YearFrom.getSelectedItem()+"-"+comboBox_MonthFrom.getSelectedItem()+"-"+comboBox_DayFrom.getSelectedItem();
								ToDate1 = comboBox_YearTo.getSelectedItem()+"-"+comboBox_MonthTo.getSelectedItem()+"-"+comboBox_DayTo.getSelectedItem();
								In.insertionStatementForReservation(reservationNumber1,FromDate1,ToDate1, Rt.guests.get(0).getID());
								
								lblReservationNumberG3.setText(reservationNumber1);
								lblFullNameG3.setText(Rt.guests.get(0).getFName()+" "+ Rt.guests.get(0).getMName()+" "+ Rt.guests.get(0).getLName());
								lblFromG3.setText(FromDate1);
								lblToG3.setText(ToDate1);
								lblRoomNumberG3.setText(RoomNumber1);
								lblRoomTypeG3.setText(RoomType1);
								
								In.insertionStatementForHasRoom(reservationNumber1, RoomNumber1);
								
							}
							
							tfNationalID.setText("");
							tfFName.setText("");
							tfMName.setText("");
							tfLName.setText("");
							tfEmail.setText("");
							tfPhone.setText("");
							tfOtherPhone.setText("");

							infoBox("Your Reservation is created", "Successful Booking");
							cardLayout.show(MainGui, "GNewBooking3");
						}
					}
				});
				btnBook.setBounds(872, 473, 89, 23);
				GNewBooking2.add(btnBook);

		//---------------------------------------------------------------------------		
				JPanel GNewBooking = new JPanel();
				GNewBooking.setLayout(null);
				MainGui.add(GNewBooking, "GNewBooking");
				
				JPanel panel_500 = new JPanel();
				panel_500.setLayout(null);
				panel_500.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_500.setBounds(0, 0, 157, 507);
				GNewBooking.add(panel_500);
				
				JButton btnNewBooking = new JButton("New Booking");
				btnNewBooking.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBooking.setBounds(0, 0, 157, 47);
				panel_500.add(btnNewBooking);
				
				JButton btnEditBooking = new JButton("Edit Booking");
				btnEditBooking.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBooking.setBounds(0, 45, 157, 47);
				panel_500.add(btnEditBooking);
				
				JButton btnCancelBooking = new JButton("Cancel Booking");
				btnCancelBooking.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBooking.setBounds(0, 90, 157, 47);
				panel_500.add(btnCancelBooking);
				
				JButton btnSignOutGN = new JButton("Sign Out");
				btnSignOutGN.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGN.setBounds(0, 133, 157, 47);
				panel_500.add(btnSignOutGN);
				
		//---------------------------------------------------------------------------
		//---------------------------------------------------------------------------Janbi		
				JPanel GNewBooking3 = new JPanel();
				GNewBooking3.setLayout(null);
				MainGui.add(GNewBooking3, "GNewBooking3");
				
				JPanel panel_600 = new JPanel();
				panel_600.setLayout(null);
				panel_600.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_600.setBounds(0, 0, 157, 507);
				GNewBooking3.add(panel_600);
				
				JButton btnNewBooking3 = new JButton("New Booking");
				btnNewBooking3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBooking3.setBounds(0, 0, 157, 47);
				panel_600.add(btnNewBooking3);
				
				JButton btnEditBooking3 = new JButton("Edit Booking");
				btnEditBooking3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBooking3.setBounds(0, 45, 157, 47);
				panel_600.add(btnEditBooking3);
				
				JButton btnCancelBooking3 = new JButton("Cancel Booking");
				btnCancelBooking3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBooking3.setBounds(0, 90, 157, 47);
				panel_600.add(btnCancelBooking3);
				
				JButton btnSignOutGN3 = new JButton("Sign Out");
				btnSignOutGN3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGN3.setBounds(0, 133, 157, 47);
				panel_600.add(btnSignOutGN3);
				
				JLabel lblReservationNumber3 = new JLabel("Reservation Number:");
				lblReservationNumber3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblReservationNumber3.setBounds(167, 11, 157, 14);
				GNewBooking3.add(lblReservationNumber3);
				
				JLabel lblGuestName3 = new JLabel("Guest Name:");
				lblGuestName3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblGuestName3.setBounds(167, 37, 99, 14);
				GNewBooking3.add(lblGuestName3);
				
				JLabel lblBookingDate3 = new JLabel("Booking Date:");
				lblBookingDate3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblBookingDate3.setBounds(167, 62, 107, 14);
				GNewBooking3.add(lblBookingDate3);
				
				JLabel lblFrom3 = new JLabel("From");
				lblFrom3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblFrom3.setBounds(288, 62, 36, 14);
				GNewBooking3.add(lblFrom3);
				
				JLabel lblTo3 = new JLabel("To");
				lblTo3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblTo3.setBounds(426, 62, 24, 14);
				GNewBooking3.add(lblTo3);
				
				JLabel lblRoomType3 = new JLabel("Room Type:");
				lblRoomType3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblRoomType3.setBounds(167, 112, 107, 20);
				GNewBooking3.add(lblRoomType3);
				
				JLabel lblRoomNumber3 = new JLabel("Room Number:");
				lblRoomNumber3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblRoomNumber3.setBounds(167, 87, 119, 14);
				GNewBooking3.add(lblRoomNumber3);
				
				JButton btnOk3 = new JButton("OK");
				btnOk3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking");
					}
				});
				btnOk3.setBounds(872, 473, 89, 23);
				GNewBooking3.add(btnOk3);
				
				
				lblReservationNumberG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblReservationNumberG3.setBounds(334, 13, 157, 14);
				GNewBooking3.add(lblReservationNumberG3);
				
				
				lblFullNameG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblFullNameG3.setBounds(276, 39, 250, 14);
				GNewBooking3.add(lblFullNameG3);
				
				
				lblFromG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblFromG3.setBounds(332, 62, 82, 14);
				GNewBooking3.add(lblFromG3);
				
				
				lblToG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblToG3.setBounds(462, 62, 82, 14);
				GNewBooking3.add(lblToG3);
				
				
				lblRoomNumberG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblRoomNumberG3.setBounds(288, 89, 186, 14);
				GNewBooking3.add(lblRoomNumberG3);
				
				
				lblRoomTypeG3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblRoomTypeG3.setBounds(288, 117, 162, 14);
				GNewBooking3.add(lblRoomTypeG3);
		//---------------------------------------------------------------------------
		//---------------------------------------------------------------------------
		//---------------------------------------------------------------------------Janbi
				JPanel GEditBooking = new JPanel();
				GEditBooking.setLayout(null);
				MainGui.add(GEditBooking, "GEditBooking");
				
				JPanel panel_700 = new JPanel();
				panel_700.setLayout(null);
				panel_700.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_700.setBounds(0, 0, 157, 507);
				GEditBooking.add(panel_700);
				
				JButton btnNewBookingGE = new JButton("New Booking");
				btnNewBookingGE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBookingGE.setBounds(0, 0, 157, 47);
				panel_700.add(btnNewBookingGE);
				
				JButton btnEditBookingGE = new JButton("Edit Booking");
				btnEditBookingGE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBookingGE.setBounds(0, 45, 157, 47);
				panel_700.add(btnEditBookingGE);
				
				JButton btnCancelBookingGE = new JButton("Cancel Booking");
				btnCancelBookingGE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBookingGE.setBounds(0, 90, 157, 47);
				panel_700.add(btnCancelBookingGE);
				
				JButton btnSignOutGE = new JButton("Sign Out");
				btnSignOutGE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGE.setBounds(0, 135, 157, 47);
				panel_700.add(btnSignOutGE);
				
				tfEReservationNumber = new JTextField();
				tfEReservationNumber.setBounds(334, 10, 157, 20);
				GEditBooking.add(tfEReservationNumber);
				tfEReservationNumber.setColumns(10);
				
				JButton btnEdit = new JButton("Edit");
				btnEdit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if(!check.checkReservationNumber(tfEReservationNumber.getText())){
							infoBox("Reservation Number either empty or not in correct format !!!", "ERROR");
						}else {
							Rt.retrieveStatementForReservationByReservationNumber(tfEReservationNumber.getText());
							if(Rt.reservations.isEmpty()){
								infoBox("Reservation Number is not in the Database !!!", "ERROR");
							}else{
							Do.DeleteReservation(tfEReservationNumber.getText());
							tfEReservationNumber.setText("");
							cardLayout.show(MainGui, "GNewBooking1");
							}
						}
					}
				});
				btnEdit.setBounds(872, 473, 89, 23);
				GEditBooking.add(btnEdit);
				
				JLabel lblReservationNumber = new JLabel("Reservation Number:");
				lblReservationNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblReservationNumber.setBounds(167, 11, 157, 14);
				GEditBooking.add(lblReservationNumber);
		
		//---------------------------------------------------------------------------
		//---------------------------------------------------------------------------		
				JPanel GCancelBooking = new JPanel();
				GCancelBooking.setLayout(null);
				MainGui.add(GCancelBooking, "GCancelBooking");
				
				JPanel panel_900 = new JPanel();
				panel_900.setLayout(null);
				panel_900.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_900.setBounds(0, 0, 157, 507);
				GCancelBooking.add(panel_900);
				
				JButton btnNewBookingGC = new JButton("New Booking");
				btnNewBookingGC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GNewBooking1");
					}
				});
				btnNewBookingGC.setBounds(0, 0, 157, 47);
				panel_900.add(btnNewBookingGC);
				
				JButton btnEditBookingGC = new JButton("Edit Booking");
				btnEditBookingGC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GEditBooking");
					}
				});
				btnEditBookingGC.setBounds(0, 45, 157, 47);
				panel_900.add(btnEditBookingGC);
				
				JButton btnCancelBookingGC = new JButton("Cancel Booking");
				btnCancelBookingGC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "GCancelBooking");
					}
				});
				btnCancelBookingGC.setBounds(0, 90, 157, 47);
				panel_900.add(btnCancelBookingGC);
				
				JButton btnSignOutGC = new JButton("Sign Out");
				btnSignOutGC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutGC.setBounds(0, 135, 157, 47);
				panel_900.add(btnSignOutGC);
				
				JLabel lblCReservationNumber = new JLabel("Reservation Number:");
				lblCReservationNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblCReservationNumber.setBounds(167, 12, 157, 14);
				GCancelBooking.add(lblCReservationNumber);
				
				tfCReservationNumber = new JTextField();
				tfCReservationNumber.setColumns(10);
				tfCReservationNumber.setBounds(334, 11, 157, 20);
				GCancelBooking.add(tfCReservationNumber);
				
				JButton btnCDelete = new JButton("Delete");
				btnCDelete.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					if(!check.checkReservationNumber(tfCReservationNumber.getText())){
						infoBox("Reservation Number either empty or not in correct format !!!", "ERROR");
					}else {
						Rt.retrieveStatementForReservationByReservationNumber(tfCReservationNumber.getText());
						if(Rt.reservations.isEmpty()){
							infoBox("Reservation Number is not in the Database !!!", "ERROR");
						}else{
							Do.DeleteReservation(tfCReservationNumber.getText());
							tfCReservationNumber.setText("");
							infoBox(" Reservation is canceled !!!", "Canceled");
							
							}
						}
					}
				});
				btnCDelete.setBounds(872, 473, 89, 23);
				GCancelBooking.add(btnCDelete);
			
		//---------------------------------------------------------------------------Janbi
		//---------------------------------------------------------------------------		
				JPanel RS = new JPanel();
				RS.setLayout(null);
				MainGui.add(RS, "RS");
				
				JPanel panel_800 = new JPanel();
				panel_800.setLayout(null);
				panel_800.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_800.setBounds(0, 0, 157, 507);
				RS.add(panel_800);
				
				JButton btnRSSearchServeeRoom = new JButton("Search Servee Room");
				btnRSSearchServeeRoom.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServeeRoom");
					}
				});
				btnRSSearchServeeRoom.setBounds(0, 45, 157, 47);
				panel_800.add(btnRSSearchServeeRoom);
				
				JButton btnRSSearchServedRoom = new JButton("Search Served Room");
				btnRSSearchServedRoom.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServedRoom");
					}
				});
				btnRSSearchServedRoom.setBounds(0, 90, 157, 47);
				panel_800.add(btnRSSearchServedRoom);
				
				JButton btnSignoutRS = new JButton("Sign out");
				btnSignoutRS.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignoutRS.setBounds(0, 135, 157, 47);
				panel_800.add(btnSignoutRS);
				
				JButton btnProvideService = new JButton("Provide Service");
				btnProvideService.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cardLayout.show(MainGui, "RSSProvideService");
					}
				});
				btnProvideService.setBounds(0, 0, 157, 47);
				panel_800.add(btnProvideService);

		//---------------------------------------------------------------------------
				JPanel RSServeeRoom = new JPanel();
				RSServeeRoom.setLayout(null);
				MainGui.add(RSServeeRoom, "RSServeeRoom");
				
				JPanel panel_101 = new JPanel();
				panel_101.setLayout(null);
				panel_101.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_101.setBounds(0, 0, 157, 507);
				RSServeeRoom.add(panel_101);
				
				JButton btnSearchServeeRoom1 = new JButton("Search Servee Room");
				btnSearchServeeRoom1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServeeRoom");
					}
				});
				btnSearchServeeRoom1.setBounds(0, 45, 157, 47);
				panel_101.add(btnSearchServeeRoom1);
				
				JButton btnSearchServedRoom1 = new JButton("Search Served Room");
				btnSearchServedRoom1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServedRoom");
					}
				});
				btnSearchServedRoom1.setBounds(0, 90, 157, 47);
				panel_101.add(btnSearchServedRoom1);
				
				JButton btnSignOutRSServee1 = new JButton("Sign out");
				btnSignOutRSServee1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutRSServee1.setBounds(0, 134, 157, 47);
				panel_101.add(btnSignOutRSServee1);
				
				JButton btnProvideService1 = new JButton("Provide Service");
				btnProvideService1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSSProvideService");
					}
				});
				btnProvideService1.setBounds(0, 0, 157, 47);
				panel_101.add(btnProvideService1);
				
				JLabel lblRSRoomNumber = new JLabel("Room Number:");
				lblRSRoomNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblRSRoomNumber.setBounds(167, 11, 115, 14);
				RSServeeRoom.add(lblRSRoomNumber);
				
				tfRoomNumber = new JTextField();
				tfRoomNumber.setBounds(292, 10, 86, 20);
				RSServeeRoom.add(tfRoomNumber);
				tfRoomNumber.setColumns(10);
				
				JButton btnRSSearch1 = new JButton("Search");
				btnRSSearch1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkRoomNumber(tfRoomNumber.getText())){
							roomServiceList.removeAll();
							rop.retrieveStatementservicesOfroom(tfRoomNumber.getText());
							for(int i = 0; i<retrieveOperations.services.size();i++){
								roomServiceList.setFont( new Font("monospaced", Font.PLAIN, 20) );
								roomServiceList.add(retrieveOperations.services.get(i).toString());
							}
						}else{
							infoBox("room number is not in correct format !!!", "ERROR");
						}
					}
				});
				btnRSSearch1.setBounds(872, 473, 89, 23);
				RSServeeRoom.add(btnRSSearch1);
				
				roomServiceList = new List();
				roomServiceList.setBounds(169, 48, 790, 420);
				RSServeeRoom.add(roomServiceList);
				
				JLabel label_95 = new JLabel("Department#");
				label_95.setBounds(169, 30, 80, 16);
				RSServeeRoom.add(label_95);
				
				JLabel label_96 = new JLabel("Room#");
				label_96.setBounds(274, 30, 56, 16);
				RSServeeRoom.add(label_96);

		//---------------------------------------------------------------------------
				JPanel RSServedRoom = new JPanel();
				RSServedRoom.setLayout(null);
				MainGui.add(RSServedRoom, "RSServedRoom");
				
				JPanel panel_1101 = new JPanel();
				panel_1101.setLayout(null);
				panel_1101.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_1101.setBounds(0, 0, 157, 507);
				RSServedRoom.add(panel_1101);
				
				JButton btnSearchServeeRoom2 = new JButton("Search Servee Room");
				btnSearchServeeRoom2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServeeRoom");
					}
				});
				btnSearchServeeRoom2.setBounds(0, 44, 157, 47);
				panel_1101.add(btnSearchServeeRoom2);
				
				JButton btnSearchServedRoom2 = new JButton("Search Served Room");
				btnSearchServedRoom2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServedRoom");
					}
				});
				btnSearchServedRoom2.setBounds(0, 89, 157, 47);
				panel_1101.add(btnSearchServedRoom2);
				
				JButton btnSignOutRSServed = new JButton("Sign out");
				btnSignOutRSServed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutRSServed.setBounds(0, 133, 157, 47);
				panel_1101.add(btnSignOutRSServed);
				
				JButton btnProvideService2 = new JButton("Provide Service");
				btnProvideService2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSSProvideService");
					}
				});
				btnProvideService2.setBounds(0, 0, 157, 47);
				panel_1101.add(btnProvideService2);
				
				JLabel lblDepartmentNumber = new JLabel("Department Number:");
				lblDepartmentNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblDepartmentNumber.setBounds(167, 11, 157, 19);
				RSServedRoom.add(lblDepartmentNumber);
				
				tfDepartmentNumber = new JTextField();
				tfDepartmentNumber.setColumns(10);
				tfDepartmentNumber.setBounds(334, 10, 86, 20);
				RSServedRoom.add(tfDepartmentNumber);
				
				JButton btnRSSearch2 = new JButton("Search");
				btnRSSearch2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						retrieveOperations rop = new retrieveOperations();
						checker ck = new checker();
						if(ck.checkDepartmentNumber(tfDepartmentNumber.getText())){
							departmentServiceList.removeAll();
							rop.retrieveStatementservicesOfDepartment(tfDepartmentNumber.getText());
							for(int i = 0; i<retrieveOperations.services.size();i++){
								departmentServiceList.setFont( new Font("monospaced", Font.PLAIN, 20) );
								departmentServiceList.add(retrieveOperations.services.get(i).toString());
							}
						}else{
							infoBox("department number is not in correct format !!!", "ERROR");
						}	
						
					}
				});
				btnRSSearch2.setBounds(872, 473, 89, 23);
				RSServedRoom.add(btnRSSearch2);
				
				departmentServiceList = new List();
				departmentServiceList.setBounds(163, 48, 798, 409);
				RSServedRoom.add(departmentServiceList);
				
				JLabel lblDepartment_1 = new JLabel("Department#");
				lblDepartment_1.setBounds(163, 29, 80, 16);
				RSServedRoom.add(lblDepartment_1);
				
				JLabel lblRoom = new JLabel("Room#");
				lblRoom.setBounds(268, 29, 56, 16);
				RSServedRoom.add(lblRoom);
				
				JPanel RSSProvideService = new JPanel();
				RSSProvideService.setLayout(null);
				MainGui.add(RSSProvideService, "RSSProvideService");
				
				JPanel panel_33 = new JPanel();
				panel_33.setLayout(null);
				panel_33.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_33.setBounds(0, 0, 157, 507);
				RSSProvideService.add(panel_33);
				
				JButton btnSearchServeeRoom3 = new JButton("Search Servee Room");
				btnSearchServeeRoom3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServeeRoom");
					}
				});
				btnSearchServeeRoom3.setBounds(0, 45, 157, 47);
				panel_33.add(btnSearchServeeRoom3);
				
				JButton btnSearchServedRoom3 = new JButton("Search Served Room");
				btnSearchServedRoom3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "RSServedRoom");
					}
				});
				btnSearchServedRoom3.setBounds(0, 90, 157, 47);
				panel_33.add(btnSearchServedRoom3);
				
				JButton btnSignOutRSProvideService = new JButton("Sign out");
				btnSignOutRSProvideService.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cardLayout.show(MainGui, "LoginGUI");
					}
				});
				btnSignOutRSProvideService.setBounds(0, 135, 157, 47);
				panel_33.add(btnSignOutRSProvideService);
				
				JButton btnProvideService3 = new JButton("Provide Service");
				btnProvideService3.setBounds(0, 0, 157, 47);
				panel_33.add(btnProvideService3);
				
				JButton btnRequestService = new JButton("Request Service");
				btnRequestService.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
							
						if (!check.checkDepartmentNumber(tfDepartmentNumberRSP.getText())){ 
							    infoBox("Department Number is not in correct format !!!", "ERROR");
						}else if (!check.checkRoomNumber(tfRoomNumberRSP.getText())){ 
							     infoBox("Room Number is not in correct format !!!", "ERROR");
						}else{
							Rt.retrieveStatementForDerpartmentByNumber(tfDepartmentNumberRSP.getText());
							Rt.retrieveStatementForAvailableRoomByRoomNumber(tfRoomNumberRSP.getText());
							
							if(Rt.departments.isEmpty()){
								infoBox("Error inavalid Department Number or does not exist !!!","Error");
							}else if(Rt.rooms.isEmpty()){
								infoBox("Error inavalid Room Number or does not exist !!!","Error");
							}else{
								System.out.println("Done");
								In.insertionStatementForProvideService(tfDepartmentNumberRSP.getText(), tfRoomNumberRSP.getText());
							}
						}
						
						tfDepartmentNumberRSP.setText("");
						tfRoomNumberRSP.setText("");
						
					}
				});
				btnRequestService.setBounds(825, 469, 134, 25);
				RSSProvideService.add(btnRequestService);
				
				JLabel lblDepartmentNumberRSP = new JLabel("Department Number:");
				lblDepartmentNumberRSP.setFont(new Font("Tahoma", Font.PLAIN, 19));
				lblDepartmentNumberRSP.setBounds(169, 13, 193, 25);
				RSSProvideService.add(lblDepartmentNumberRSP);
				
				tfDepartmentNumberRSP = new JTextField();
				tfDepartmentNumberRSP.setBounds(364, 17, 116, 22);
				RSSProvideService.add(tfDepartmentNumberRSP);
				tfDepartmentNumberRSP.setColumns(10);
				
				JLabel lblRoomNumberRSP = new JLabel("Room Number:");
				lblRoomNumberRSP.setFont(new Font("Tahoma", Font.PLAIN, 19));
				lblRoomNumberRSP.setBounds(169, 51, 157, 25);
				RSSProvideService.add(lblRoomNumberRSP);
				
				tfRoomNumberRSP = new JTextField();
				tfRoomNumberRSP.setColumns(10);
				tfRoomNumberRSP.setBounds(307, 55, 116, 22);
				RSSProvideService.add(tfRoomNumberRSP);
				
				
				lblDreamHotel.setHorizontalAlignment(SwingConstants.CENTER);
				lblDreamHotel.setFont(new Font("Sitka Heading", Font.BOLD, 25));
				lblDreamHotel.setBounds(407, 24, 150, 30);
				contentPane.add(lblDreamHotel);
		//------------------------------------------------------------------------
		
				
				
		
		ReceptionistBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(MainGui, "RMain");
			}
		});
	}
	
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
