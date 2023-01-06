import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class ExtTextField extends JTextField implements DocumentListener {

  TextChangeListener txtChgListener;
  
  int id;

  public ExtTextField(int id){
    this.id = id;
    init();
  }

  void init(){
    getDocument().addDocumentListener(this);
  }

  public int getId(){
    return id;
  }

  public void addTextChangeListener(TextChangeListener txtChgListener){
    this.txtChgListener = txtChgListener;
  }

  public void changedUpdate(DocumentEvent documentEvent) { }
  public void insertUpdate(DocumentEvent documentEvent) {
    txtChgListener.onTextChanged(tfid, getText().toString());
  }
  public void removeUpdate(DocumentEvent documentEvent) {
    txtChgListener.onTextChanged(tfid, getText().toString());
  }
}
