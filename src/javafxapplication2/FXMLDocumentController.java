
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author rkson
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField input;
    @FXML
    private TextArea triangle_area;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buildBtn(ActionEvent event) {
        
        try{
            long N = Integer.parseInt(input.getText());
            
            long res = 1;
            
            triangle_area.setText("");
            
            for(long i = 0; i < N; i++) {
                for(long j = 1; j < N - i; j++) {
                    triangle_area.setText(triangle_area.getText()+"   ");
                }

                for(int j = 0; j <= i; j++) {
                    if (j == 0 || i == 0){
                        res = 1;
                        triangle_area.setText(triangle_area.getText()+"  "+res+"  ");
                    }
                    else{
                        res = res * (i - j + 1) / j;
                        triangle_area.setText(triangle_area.getText()+"  "+res+"  ");
                    }
                }
                triangle_area.setText(triangle_area.getText()+"\n");
            }
        }
        catch(Exception e){
            triangle_area.setText("Invalid Number! Please Try Again...");
        } 
    }
      
    @FXML
    private void resetBtn(ActionEvent event) {
        input.setText("");
        triangle_area.setText("");
    }
    
}
