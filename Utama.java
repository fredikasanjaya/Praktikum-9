import javax.swing.*;

class Utama {
	public static void main(String[] args) {
		JFrame myFrame;

		myFrame = new JFrame();
		myFrame.setSize(500,400);
		myFrame.setVisible(true);

		JOptionPane.showMessageDialog(myFrame, "Hi, Selamat Datang");

		String name = JOptionPane.showInputDialog(myFrame, "Siapa Namamu:");
		while (name.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput nama anda...");
			name = JOptionPane.showInputDialog(myFrame, "Siapa Namamu:");
		}

		String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir:");
		while (yearStr.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput nama anda...");
			yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir:");
		}
		int year = Integer.parseInt(yearStr);
		int age = 2022 - year;
		

		JOptionPane.showMessageDialog(myFrame, "Halo " + name + ", umur anda " + age + " tahun.");
		myFrame.dispose();
	}
}