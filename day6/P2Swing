package lab;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class P2Swing{
	private static double loan, i, m, pf, emi, pf1, i1, amt;
	public static void main(String args[]) {
		JFrame Frame = new JFrame("EMI Calculator");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton B = new JButton("Calculate!");
		JPanel F = new JPanel();
		JTextField jtfLoan = new JTextField(20);
		JTextField jtfInt = new JTextField(20);
		JTextField jtfMonth = new JTextField(20);
		JTextField jtfPF = new JTextField(20);
		JLabel jlLoan = new JLabel("Enter loan amount: ");
		JLabel jlInt = new JLabel("Enter interest(per annum): ");
		JLabel jlMonth = new JLabel("Enter number of months: ");
		JLabel jlPF = new JLabel("Enter processing fee: ");
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				loan = Double.parseDouble(jtfLoan.getText());
				i = Double.parseDouble(jtfInt.getText());
				i = i/(12*100);
				pf = Double.parseDouble(jtfPF.getText());
				m = Double.parseDouble(jtfMonth.getText());
				emi = (loan * i * Math.pow(1+i, m))/(Math.pow(1+i,m)-1);
				pf1 = m*(pf*loan)/100;
				amt = emi*m;
				i1 = amt-loan;
				JLabel jlEMI = new JLabel("EMI is: " + emi);
				JLabel jlPrFee = new JLabel("Processing fee: " + pf1);
				JLabel jlInt1 = new JLabel("Interest :" + i1);
				JLabel jlAmt = new JLabel("Amount: " + amt);
				F.add(jlEMI);
				F.add(jlPrFee);
				F.add(jlInt1);
				F.add(jlAmt);
				Frame.add(F);
				Frame.setSize(500,500);
				Frame.setLayout(new FlowLayout());
				Frame.setVisible(true);
			}
		});
		F.setLayout(new BoxLayout(F, BoxLayout.PAGE_AXIS));
		F.add(jlLoan);
		F.add(jtfLoan);
		F.add(jlInt);
		F.add(jtfInt);
		F.add(jlMonth);
		F.add(jtfMonth);
		F.add(jlPF);
		F.add(jtfPF);
		F.add(B);
		Frame.add(F);
		Frame.setSize(500,500);
		Frame.setLayout(new FlowLayout());
		Frame.setVisible(true);
		
	}
}
