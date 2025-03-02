package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label result;
     String operator="";
     long num1=0, num2=0;
     float answer=0;
     boolean start = true;
    Calculations calculations = new Calculations();


    public void processNumbers(ActionEvent event){
        if(start){
            result.setText("");
            start = false;
        }

    String value = ((Button)event.getSource()).getText();
    result.setText(result.getText()+value);
    }

    public void processOperators(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(value.equals("AC")){
            result.setText("");
            System.out.println("AC working");
            operator="";
            num1=0;
            num2=0;
            answer=0;
            start = true;
            return;
        }
        if(answer!= 0){
            num1 = (long) answer;
//            result.setText("");
//            return;
        }
    try{

        if(!value.equals("=")){
            if(!operator.isEmpty())return;

            operator = value;
            if (!result.getText().isEmpty()) {
                if(answer==0)num1 = Long.parseLong(result.getText());
            }
        result.setText("");
    }

    else{
        if(operator.isEmpty())return;
        num2=Long.parseLong(result.getText());
        float ans = calculations.calculate(num1, num2, operator);
        result.setText(String.valueOf(ans));
        answer=ans;
        operator="";
        start=true;
    }


}
    catch (Exception e){
        e.printStackTrace();
    }


    }
}
