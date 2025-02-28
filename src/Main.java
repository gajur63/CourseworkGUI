import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //FRAME
        JFrame frame = new JFrame("Gym Membership Management");
        frame.setVisible(true);
        frame.setBounds(100, 100, 700, 700);
        frame.setLayout(null);

        //ID
        JLabel idlabel = new JLabel("ID: ");
        idlabel.setBounds(20, 40, 100, 100);
        frame.add(idlabel);

        JTextField idfield = new JTextField();
        idfield.setBounds(170, 80, 100, 20);
        frame.add(idfield);

        //LOCATION
        JLabel locationlabel = new JLabel("Location: ");
        locationlabel.setBounds(20, 70, 100, 100);
        frame.add(locationlabel);

        JTextField locationfield = new JTextField();
        locationfield.setBounds(170, 110, 100, 20);
        frame.add(locationfield);

        //Email
        JLabel emaillabel =new JLabel("Email:");
        emaillabel.setBounds(20, 100, 100, 100);
        frame.add(emaillabel);

        JTextField emailfield =new JTextField();
        emailfield.setBounds(170, 140, 100,20);
        frame.add(emailfield);

        //Start Date
        JLabel startdatelabel = new JLabel("Start Date: ");
        startdatelabel.setBounds(20, 130, 150, 100);
        frame.add(startdatelabel);

        JTextField startdatefield = new JTextField();
        startdatefield.setBounds(170, 170, 100, 20);
        frame.add(startdatefield);

        //Referral Source
        JLabel referralsourcelabel = new JLabel("Referral Source: ");
        referralsourcelabel.setBounds(20, 160, 100, 100);
        frame.add(referralsourcelabel);

        JTextField referralsourcefield = new JTextField();
        referralsourcefield.setBounds(170, 200, 100, 20);
        frame.add(referralsourcefield);

        //Removal reason
        JLabel removalreasonlabel = new JLabel("Removal Reason:");
        removalreasonlabel.setBounds(20, 190, 100, 100);
        frame.add(removalreasonlabel);

        JTextField removalreasonfield = new JTextField();
        removalreasonfield.setBounds(170, 230, 100, 20);
        frame.add(removalreasonfield);

        //Plan
        JLabel planlabel = new JLabel("Plan: ");
        planlabel.setBounds(20, 220, 100, 100);
        frame.add(planlabel);

        JComboBox<String> planbox = new JComboBox<>();
        planbox.addItem("Basic");
        planbox.addItem("Standard");
        planbox.addItem("Deluxe");
        planbox.setBounds(170, 260, 100, 20);
        frame.add(planbox);

        //Premium plan charge
        JLabel premiumplanchargelabel = new JLabel("Premium Plan Charge: ");
        premiumplanchargelabel.setBounds(20, 260, 150, 100);
        frame.add(premiumplanchargelabel);

        JTextField premiumfield = new JTextField();
        premiumfield.setBounds(170, 300, 100, 20);
        frame.add(premiumfield);

        //NAME
        JLabel namelabel = new JLabel("Name: ");
        namelabel.setBounds(400, 35, 100, 100);
        frame.add(namelabel);

        JTextField namefield = new JTextField();
        namefield.setBounds(500, 75, 100, 20);
        frame.add(namefield);

        //Phone
        JLabel phonelabel = new JLabel("Phone:");
        phonelabel.setBounds(400, 65, 100, 100);
        frame.add(phonelabel);

        JTextField phonefield = new JTextField();
        phonefield.setBounds(500, 105, 100, 20);
        frame.add(phonefield);

        //DOB
        JLabel doblabel = new JLabel("DOB:");
        doblabel.setBounds(400, 95, 100, 100);
        frame.add(doblabel);

        JTextField dobfield = new JTextField();
        dobfield.setBounds(500, 135, 100, 20);
        frame.add(dobfield);

        //GENDER
        JLabel genderlabel = new JLabel("Gender:");
        genderlabel.setBounds(400, 125, 100, 100);
        frame.add(genderlabel);

        JComboBox<String> genderbox = new JComboBox<>();
        genderbox.addItem("Male");
        genderbox.addItem("Female");
        genderbox.addItem("Other");
        genderbox.setBounds(500, 165, 100, 20);
        frame.add(genderbox);

        //Paid Amount
        JLabel paidlabel = new JLabel("Paid Amount:");
        paidlabel.setBounds(400, 155, 100, 100);
        frame.add(paidlabel);

        JTextField paidfield = new JTextField();
        paidfield.setBounds(500, 195, 100, 20);
        frame.add(paidfield);

        //Trainer's Name
        JLabel trainerlabel = new JLabel("Trainer's Name:");
        trainerlabel.setBounds(395, 185, 100, 100);
        frame.add(trainerlabel);

        JTextField trainerfield = new JTextField();
        trainerfield.setBounds(500, 225, 100, 20);
        frame.add(trainerfield);

        //Regular Plan price
        JLabel regularlabel = new JLabel("Regular Plan Price:");
        regularlabel.setBounds(390, 215, 150, 100);
        frame.add(regularlabel);

        JTextField regularfield = new JTextField();
        regularfield.setBounds(500, 255, 100, 20);
        regularfield.disable();
        frame.add(regularfield);

        //Disocunt Amount
        JLabel discountlabel = new JLabel("Discount Amount:");
        discountlabel.setBounds(390, 245, 100, 100);
        frame.add(discountlabel);

        JTextField discountfield = new JTextField();
        discountfield.setBounds(500, 285, 100, 20);
        frame.add(discountfield);
        discountfield.disable();



        //BUTTON SECTION

        //Add regular member button
        JButton regularbutton = new JButton("Add Regular Button");
        regularbutton.setBounds(20, 370, 200, 30);
        frame.add(regularbutton);

        //Mark Attendence button
        JButton markbutton = new JButton("Mark Attendence");
        markbutton.setBounds(20, 420, 200, 30);
        frame.add(markbutton);

        //Revert Premium Member button
        JButton revertbutton = new JButton("Revert Premium Member");
        revertbutton.setBounds(20, 470, 200, 30);
        frame.add(revertbutton);

        //Display member button
        JButton displaybutton = new JButton("Display Members");
        displaybutton.setBounds(20, 520, 200, 30);
        frame.add(displaybutton);

        //Add premium member Button
        JButton premiumbutton = new JButton("Add Premium Member");
        premiumbutton.setBounds(20, 570, 200, 30);
        frame.add(premiumbutton);

        //Upgrade Plan button
        JButton upgradelabel = new JButton("Upgrade Plan");
        upgradelabel.setBounds(350, 370, 200, 30);
        frame.add(upgradelabel);

        //Pay due amount
        JButton paybutton = new JButton("Pay Due Amount");
        paybutton.setBounds(350, 420, 200, 30);
        frame.add(paybutton);

        //Activate Membership button
        JButton activatebutton = new JButton("Activate Membership");
        activatebutton.setBounds(350, 470, 200, 30);
        frame.add(activatebutton);

        //Calculate Discount Button
        JButton calculatebutton = new JButton("Calculate Discount");
        calculatebutton.setBounds(350, 520, 200, 30);
        frame.add(calculatebutton);

        //Save To file
        JButton savebutton = new JButton("Save To File");
        savebutton.setBounds(350, 570, 200, 30);
        frame.add(savebutton);

        //Deactivate Membership
        JButton deactivatebutton = new JButton("Deactivate Button");
        deactivatebutton.setBounds(680, 370, 200, 30);
        frame.add(deactivatebutton);

        //Revert Regular Member
        JButton revertregularbutton = new JButton("Revert Regular Member");
        revertregularbutton.setBounds(680, 420, 200, 30);
        frame.add(revertregularbutton);

        //Load From File
        JButton loadbutton = new JButton("Load From File");
        loadbutton.setBounds(680, 470, 200, 30);
        frame.add(loadbutton);




    }
}