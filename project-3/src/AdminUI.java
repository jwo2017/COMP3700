
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {
    public JFrame view;

    public JButton btnSysConfig = new JButton("System Configuration");
    public JButton btnAddUser = new JButton("Add New User");
    public JButton btnDeleteUser = new JButton("Delete A User");
    public JButton btnChangeUserType = new JButton("Change User Type");
    public JButton btnChangeUserInfo = new JButton("Change User Info");

    UserModel user;


    public AdminUI(UserModel u) {
        this.view = new JFrame();
        user = u;


        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSysConfig);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnDeleteUser);
        panelButtons.add(btnChangeUserType);
        panelButtons.add(btnChangeUserInfo);

        view.getContentPane().add(panelButtons);


        btnSysConfig.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        /*ManageProductUI ui = new ManageProductUI();
                        ui.run();*/

                        //change to sys config
                    }
                });

        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddUserUI ui = new AddUserUI();
                ui.run();
            }
        } );

        btnChangeUserType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageUserTypeUI ui = new ManageUserTypeUI();
                ui.run();
            }
        } );

        btnChangeUserInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageUserInfoUI ui = new ManageUserInfoUI(user);
                ui.run();
            }
        } );
    }
}
