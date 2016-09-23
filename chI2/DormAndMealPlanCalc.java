/*
 * Adam Allard
 * Chapter 12 PC 3 Dorm and Meal Plan Calc
 * This program allows a user to select a dorm and meal plan from drop 
 * down menus and it will calculate the total charges for a semester
 */

package chI2;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class DormAndMealPlanCalc extends JFrame {

	private JPanel dormPanel;
	private JPanel mealPanel;
	private JPanel buttonPanel;
	
	private JButton calcCharge;
	private JButton exit;
	
	private JComboBox dormsBox;
	private JComboBox mealsBox;
	
	// i had to initialized them to the first options in case user does not
	// select an option first
	private double dormPrice = 1500.00; 
	private double mealPrice = 560.00;
	
	private String priceField;
	
	private DecimalFormat moneyFmt = new DecimalFormat( "$##0.00" );
	

	private String[] dorms = { "Allen Hall", 
							   "Pike Hall", 
							   "Farthing Hall", 
							   "University Suites" };
	
	private String[] meals = { "7 meals/week", 
							   "14 meals/week",
							   "Unlimited meals" };
	
	// constructor
	public DormAndMealPlanCalc()
	{
		super("Dorm and Meal Plan Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// build panels
		buildDormPanel();
		buildMealPanel();
		buildButtonPanel();
		
		// add panels to pane
		add(dormPanel, BorderLayout.NORTH);
		add(mealPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// pack and display
		pack();
		setVisible(true);
	}
	
	// dorm panel contains a combo box with the dorm options
	private void buildDormPanel()
	{
		dormPanel = new JPanel();
		dormPanel.add(new JLabel("Select a Dorm:"));
		dormsBox = new JComboBox(dorms);
		
		// register action listener
		dormsBox.addActionListener(new DormsBoxListener());
		
		dormPanel.add(dormsBox);
	}
	
	// meal panel contains a combo box with the meal plan options 
	private void buildMealPanel()
	{
		mealPanel = new JPanel();
		mealPanel.add(new JLabel("Select a Meal Plan:"));
		mealsBox = new JComboBox(meals);
		
		// register action listener
		mealsBox.addActionListener(new MealsBoxListener());
		
		mealPanel.add(mealsBox);
	}
	
	// button panel contains two buttons, one to calculate the charges 
	// and another to exit the program 
	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		calcCharge = new JButton("Calculate Charges");
		exit = new JButton("Exit");
		
		// register action listeners
		calcCharge.addActionListener(new ButtonListener());
		exit.addActionListener(new ButtonListener());
		
		buttonPanel.add(calcCharge);
		buttonPanel.add(exit);
	}
	
	// event handler that sets the dorm price for the selected dorm
	private class DormsBoxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String selection = (String) dormsBox.getSelectedItem();
			if (selection == "Allen Hall")
				dormPrice = 1500.00;
			else if (selection == "Pike Hall")
				dormPrice = 1600.00;
			else if (selection == "Farthing Hall")
				dormPrice = 1200.00;
			else 
				dormPrice = 1800.00;
		}
	}
	
	// event handler that sets the meal price for the selected meal plan
	private class MealsBoxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String selection = (String) mealsBox.getSelectedItem();
			if (selection == "7 meals/week")
				mealPrice = 560.00;
			else if (selection == "14 meals/week")
				mealPrice = 1095.00;
			else 
				mealPrice = 1500.00;
		}
	}
	
	// event handler that shows a message dialog box with the semester charges, 
	// or exits the program, respectively 
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Calculate Charges"))
			{
				priceField = calculatePrice();
				JOptionPane.showMessageDialog(null, priceField);
			}
			else 
			{
				System.exit(0);
			}
		}

		// this method is used to calculate the price and returns a string for 
		// the message dialog box in ButtonListener
		private String calculatePrice() {
			String priceMessage = "Total Charges per Semester: " + 
		moneyFmt.format(dormPrice + mealPrice);
			return priceMessage;
		}
	}
	
	// main method, displays the window 
	public static void main(String[] args)
	{
		new DormAndMealPlanCalc();
	}
}