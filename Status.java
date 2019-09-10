package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Status  implements Initializable {

@FXML
    Label class_taken;


    @FXML
    Label class_attend;

    @FXML
    Label average;

    @FXML
    Label nsar;

    @FXML
    Label usn;

    @FXML
    Label name;

    @FXML
    Label class_dis;

    @FXML
    Button exit;

String selected_usn;

    @FXML
    public void exit(ActionEvent e)
    {



    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
          //  String name;
          //  String class1;
            int no_of_class=0,no_of_class_attend=0;
            int average1=0;

            ArrayList<Integer> att=new ArrayList<>();
            this.selected_usn=EnterUsn.entered_usn;
            String class_sub=Selection.selected_class1+"_"+Selection.selected_sub1;
            System.out.println(class_sub);
            Connection con = GetConn.getcon();
            PreparedStatement ps = con.prepareStatement("select * from student where usn=?");
            ps.setString(1,selected_usn);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                name.setText(rs.getString("name"));
                class_dis.setText(rs.getString("class"));
            }
            usn.setText(selected_usn);
PreparedStatement ps1=con.prepareStatement("select * from "+class_sub+" ");
ResultSet rs1=ps1.executeQuery();
        while(rs1.next())
        {
            att.add(rs1.getInt(selected_usn));
        }

        no_of_class=att.size();
        for (int i=0; i<no_of_class;i++)
        {
            no_of_class_attend=no_of_class_attend+att.get(i);
        }
        class_taken.setText(String.valueOf(no_of_class));
        class_attend.setText(String.valueOf(no_of_class_attend));
        average1=no_of_class_attend*100/no_of_class;
        average.setText(String.valueOf(average1));
        if(average1<75)
        {
            nsar.setText("TRUE");
        }
        else
        {
            nsar.setText("FALSE");
        }

        }
        catch (Exception e)
        {

        }
    }
}