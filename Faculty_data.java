package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Faculty_data {
    final private StringProperty Subject;
    final private StringProperty Class1;
    Faculty_data(String subject,String Class)
    {
        this.Subject=new SimpleStringProperty(subject);
        this.Class1=new SimpleStringProperty(Class);
    }

    public String getSubject()
    {
        return Subject.get();
    }
public String getClass1()
{
    return Class1.get();
}

}
