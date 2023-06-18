/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class DoctorTable {
    private final String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
    private final String user="HAGER";
    private final String password="HAGER";

    public DefaultTableModel getDoctorsData(){
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "doctor's user name", "doctor's name", "doctor's phone number", "doctor's address", "doctor's specialization", "doctor's gender"
            }
        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };

        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT * FROM HAGER.DOCTOR ";
            Statement st= con.createStatement();
            ResultSet rs= null;
            rs=st.executeQuery(s);
            while(rs.next()){
                String name =  rs.getString("DOCTORNAME");
                String username =  rs.getString("DOCTORUSERNAME");
                String phonenumber =  rs.getString("DOCTORPHONENUMBER");
                String address =  rs.getString("DOCTORADDRESS");
                String specialization =  rs.getString("DOCTORSPECIALIZATION");
                String gender =  rs.getString("DOCTORGENDER");
                String table[]={username,name,phonenumber,address,specialization,gender}; 
                model.addRow(table);
            }
            rs.close();
            st.close();
            con.close();
        }
        catch(SQLException e) {
            System.out.println("error");
        }
        return model;
    }
}
