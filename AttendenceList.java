package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AttendenceList implements Initializable {

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;


    @FXML
    private Button present;

    @FXML
    private Button absent;

    String sub = Selection.selected_sub;
    String Cla = Selection.selected_class;

    ArrayList<String> list=new ArrayList<>();
    int i=1;

    Connection con=GetConn.getcon();
    PreparedStatement ps2;
    String date=Selection.selected_date;
          int len;
            String class_sub;




    @FXML
    public void setdata(ActionEvent e) throws Exception {


        if (e.getSource().equals(present)) {
            len=list.size();


            ps2=con.prepareStatement("update "+class_sub+" set "+l3.getText()+"=? where date='"+date+"'");
              ps2.setInt(1,1);
                ps2.executeUpdate();
if(i<len) {
    if (i == 1) {
        l2.setText(list.get(i - 1));
        l3.setText(list.get(i));
        l4.setText(list.get(i + 1));
        l5.setText(list.get(i + 2));
        i++;
    } else if (i == len - 1) {
        l1.setText(list.get(i - 2));
        l2.setText(list.get(i - 1));
        l3.setText(list.get(i));
        l4.setText("");
        l5.setText("");
        i++;
    } else if (i == len - 2) {
        l1.setText(list.get(i - 2));
        l2.setText(list.get(i - 1));
        l3.setText(list.get(i));
        l4.setText(list.get(i + 1));
        l5.setText("");
        i++;
    }else {
        l1.setText(list.get(i - 2));
        l2.setText(list.get(i - 1));
        l3.setText(list.get(i));
        l4.setText(list.get(i + 1));
        l5.setText(list.get(i + 2));
        i++;
    }
}else
{
    l1.setText("");
    l2.setText("");
    l3.setText("");
    l4.setText("");
    l5.setText("");
    Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
    stage.hide();
}


        } else if (e.getSource().equals(absent)) {

            len=list.size();


            ps2=con.prepareStatement("update "+class_sub+" set "+l3.getText()+"=? where date='"+date+"'");

            ps2.setInt(1,0);
            ps2.executeUpdate();
            if(i<len) {
                if (i == 1) {
                    l2.setText(list.get(i - 1));
                    l3.setText(list.get(i));
                    l4.setText(list.get(i + 1));
                    l5.setText(list.get(i + 2));
                    i++;
                } else if (i == len - 1) {
                    l1.setText(list.get(i - 2));
                    l2.setText(list.get(i - 1));
                    l3.setText(list.get(i));
                    l4.setText("");
                    l5.setText("");
                    i++;
                } else if (i == len - 2) {
                    l1.setText(list.get(i - 2));
                    l2.setText(list.get(i - 1));
                    l3.setText(list.get(i));
                    l4.setText(list.get(i + 1));
                    l5.setText("");
                    i++;
                }else {
                    l1.setText(list.get(i - 2));
                    l2.setText(list.get(i - 1));
                    l3.setText(list.get(i));
                    l4.setText(list.get(i + 1));
                    l5.setText(list.get(i + 2));
                    i++;
                }
            }else
            {
                l1.setText("");
                l2.setText("");
                l3.setText("");
                l4.setText("");
                l5.setText("");
                Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                stage.hide();
            }


        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {

                  class_sub=Selection.selected_class+"_"+Selection.selected_sub;

           Connection con = GetConn.getcon();

            PreparedStatement  ps;
            ps=con.prepareStatement("select * from student where class=? ");
            ps.setString(1,Cla);
            ResultSet rs;
            rs=ps.executeQuery();
            String dd="date";

          PreparedStatement  ps1=con.prepareStatement("insert into "+class_sub+" ("+dd+") values (?)");
            String date=Selection.selected_date;

            ps1.setString(1,date);
           ps1.executeUpdate();

            while (rs.next()) {
                list.add(rs.getNString("usn"));


            }
l3.setText(list.get(0));
            l4.setText(list.get(1));
            l5.setText(list.get(2));

rs.close();

        } catch (Exception e) {

        }



}}
